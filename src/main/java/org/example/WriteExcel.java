package org.example;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class WriteExcel {




    public static void writeExcel(String fileName) throws IOException {
       // XSSFWorkbook workbook = new XSSFWorkbook();
       // XSSFSheet sheet = workbook.createSheet("Test");

       // XSSFRow row = sheet.createRow(0);
        FileInputStream inputStream = new FileInputStream(new File("domaci22.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");


        Faker faker = new Faker();

        for (int i = 0; i < 8; i++) {
            XSSFRow row = sheet.createRow(2 + i);
            XSSFCell cell1 = row.createCell(0);
            cell1.setCellValue(faker.name().firstName());
            XSSFCell cell2 = row.createCell(1);
            cell2.setCellValue(faker.name().lastName());
        }

    }
}


