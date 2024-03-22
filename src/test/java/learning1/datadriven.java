package learning1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException {
		
 FileInputStream file=new FileInputStream("https://docs.google.com/spreadsheets/d/1-pHkpdG9UyoKTkKbwzjCk7OkfCysBpAZmQOSBHdF85w/edit#gid=0");
       
 XSSFWorkbook workbook=new XSSFWorkbook(file);
 
 XSSFSheet sheet=workbook.getSheet("Sheet1");
 
     int rowcount=sheet.getLastRowNum();
     int columncount=sheet.getRow(0).getLastCellNum();
     
     for (int i=0;i<=rowcount;i++) {
    	 
    	 XSSFRow current=sheet.getRow(i);
    	   
    	   for(int j=0;i<=columncount;i++) {
    		    
    		   String value=current.getCell(j).toString();
    		   
    		   System.out.print(" "+value);
    	   }
     }
	}

}
