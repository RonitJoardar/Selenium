package com.ill.admin;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel {
	
	public static org.apache.poi.ss.usermodel.Workbook ExcelWBook;
	public static org.apache.poi.ss.usermodel.Sheet ExcelWsheet;
	public String filePath;
	public static org.apache.poi.ss.usermodel.Cell Cell;
	public org.apache.poi.ss.usermodel.Row row;
	public static TestExcel reader;

	public static void setExcelFile(String Path) throws IOException, Exception{
        File file = new File(Path);
        
        System.out.println(Path);
        
        FileInputStream ExcelFile = new FileInputStream(file);
        
        ExcelWBook = WorkbookFactory.create(ExcelFile);
        
        
        
}
    // To read the test data from the cell, in this we are passing parameters as Row num and Col num
    
    public static String getCellData(String SheetName,int RowNum, int ColNum) throws IOException{
        
        
        ExcelWsheet = ExcelWBook.getSheetAt(0);
        System.out.println(ExcelWsheet);
        Cell = ExcelWsheet.getRow(RowNum).getCell(ColNum);
        
        String CellData = Cell.getStringCellValue();
         return CellData;
        
}
    // to write in the Excel cell, Row num and Col num are the parameters
    
    public static void setCellData(String Result, int RowNum, int ColNum) throws IOException{
        
        Row Row = ExcelWsheet.getRow(RowNum);
        
        Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
        
        if (Cell == null){
            
            Cell = Row.createCell(ColNum);
            
            Cell.setCellValue(Result);
        }else{
            
        Cell.setCellValue(Result);    
    
        }
        
}
public static void main(String args[]) throws Exception {
		
		reader = new TestExcel();
		setExcelFile("/Users/ronit.joardar/Documents/ILoveLondonAdmin/src/test/resources/ExcelSheets/TestData.xlsx");
		//String filePath = System.getProperty("user.dir") + reader.excel_path;
		//System.out.println("filepath" + filePath);
		//getCellData("LogIn",0,0);
		System.out.println(getCellData("LogIn", 1, 1));
		
	}
}
