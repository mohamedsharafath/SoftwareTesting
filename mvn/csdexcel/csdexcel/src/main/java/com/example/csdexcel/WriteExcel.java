package com.example.csdexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.util.*;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String path="C:/Users/Fast/Downloads/HomePrices.xlsx";
        
        int rs=sc.nextInt();
        int re=sc.nextInt();
        int cs=sc.nextInt();
        int ce=sc.nextInt();
        sc.nextLine();
        for(int i=rs;i<=re;i++)
        {
            for(int j=cs;j<=ce;j++)
            {
                String word="user at "+i+" row and "+j+" column";
                WriteExcel ob=new WriteExcel();
                ob.write(path,i,j,word);
                
            }
        }
        for(int i=rs;i<=re;i++)
        {
            for(int j=cs;j<=ce;j++)
            {
                
                WriteExcel ob=new WriteExcel();
                ob.read(path,i,j);
                
            }
            System.out.println();
        }
    }

    private void write(String path, int rn, int cn,String word) throws IOException {
        FileInputStream inp=new FileInputStream(path);
        Workbook work=WorkbookFactory.create(inp);
        Sheet sheet=work.getSheetAt(0);

        Row row=sheet.getRow(rn);
        if(row==null)
        {
            row=sheet.createRow(rn);
        }
        Cell cell=row.getCell(cn);
        if(cell==null)
        {
            cell=row.createCell(cn);
        }
        cell.setCellValue(word);

        FileOutputStream out=new FileOutputStream(path);
        work.write(out);
        inp.close();
        work.close();
        out.close();


    }
    private void read(String path, int i2, int j2) throws IOException{
        FileInputStream inp=new FileInputStream(path);
        Workbook work=WorkbookFactory.create(inp);
        Sheet sheet=work.getSheetAt(0);
        
        System.out.print(sheet.getRow(i2).getCell(j2).getStringCellValue()+"\t");
        work.close();
        inp.close();
}
}
