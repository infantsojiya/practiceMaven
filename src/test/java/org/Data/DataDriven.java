package org.Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\practiceMaven\\practisedatadriven\\Sojiya Excel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(1);
		
		Cell c = r.getCell(1);
		System.out.println(c);
		
	}
}
