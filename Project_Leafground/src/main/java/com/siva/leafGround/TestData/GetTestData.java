package com.siva.leafGround.TestData;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetTestData {

	
	public void readExcel() {
		try (FileInputStream fileInput = new FileInputStream("src/main/resources/Testdata.xlsx")){
			XSSFWorkbook workBook = new XSSFWorkbook(fileInput);
			XSSFSheet sheet = workBook.getSheetAt(0);

			


		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main (String[] args) {
		GetTestData getData = new GetTestData();
		getData.readExcel();
	}
}
