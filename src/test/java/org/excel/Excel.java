package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\ragavboom\\eclipse-workspace\\MavenUseTestNg\\excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(stream);
		Sheet s = wb.getSheet("Sheet1");
		int gpnr = s.getPhysicalNumberOfRows();
		for(int i=0;i<gpnr;i++) {
			Row r = s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();
				if(type==1) {
					String name = c.getStringCellValue();
					System.out.println(name);
				}
				else {
					if(DateUtil.isCellDateFormatted(c)) {
						Date d = c.getDateCellValue();
					
						SimpleDateFormat si=new SimpleDateFormat("dd/MM/yyyy");
						String name = si.format(d);
						System.out.println(name);
						
					}
					else {
						double nu = c.getNumericCellValue();
						long l=(long)nu;
						String name = String.valueOf(l);
						System.out.println(name);
					}
				}
			}
			
		}
		
	}
	
				
				
				
				
				
		
		
		
		
		
		
		
		
	

}
