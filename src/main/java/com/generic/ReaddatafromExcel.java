package com.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromExcel {

	/**
	 * @author Dell
	 * this method is going to read the data from the excel
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readdata_excel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException 
	{

		FileInputStream fis=new FileInputStream("../SDET/excel/excel.xlsx");
		String value = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();

		return value;
	}

	/**
	 * @author Dell
	 * This method is going to get the last row number
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

public int getlastrow() throws EncryptedDocumentException, IOException
{
	FileInputStream filinput=new FileInputStream("../SDET/excel/excel.xlsx");
	int activerow = WorkbookFactory.create(filinput).getSheet("Sheet2").getLastRowNum();
	return activerow;
}
}
