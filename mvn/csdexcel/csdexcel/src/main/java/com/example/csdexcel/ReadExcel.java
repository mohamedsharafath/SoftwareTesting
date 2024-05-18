package com.example.csdexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public  class ReadExcel {
   public static void main(String[] args) throws IOException {

            String path="C:/Users/Fast/Downloads/HomePrices.xlsx";
            ReadExcel ob=new ReadExcel();
            ob.read(path);

    }

    private void read(String path) throws IOException{
            FileInputStream inp=new FileInputStream(path);
            Workbook work=WorkbookFactory.create(inp);
            Sheet sheet=work.getSheetAt(0);
            for(int i=0;i<=sheet.getLastRowNum();i++)
            {
                for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
                {
                    if(sheet.getRow(i).getCell(j).getCellType()==CellType.FORMULA)
                    {
                        System.out.print(sheet.getRow(i).getCell(j).getCellFormula()+" = ");
                            
                    }
                    if(sheet.getRow(i).getCell(j).getCellType()==CellType.STRING)
                    {
                        System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"\t");
                    }
                    else{

                        System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue()+"\t");
                    }
                }
                // System.out.println(sheet.getRow(i).getLastCellNum());
                System.out.println();
            }
            work.close();
            inp.close();
    }
}
