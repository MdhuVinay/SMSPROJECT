package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import studentManagementSystemGenericUtils.IPathConstants;

public class FetchDataFromExcel 
{
	//pull conflict from local
	@Test(dataProvider = "data")
	public void getData(String firstName,String lastName,String phoneNum,String gender)
	{
		
		System.out.println(firstName+" "+lastName+" "+phoneNum+" "+gender);
		System.out.println(" ");
	}
	//pull request from eclisple

	public void abcd()
	{
		System.out.println(" ");
		System.out.println(" ");
	}

	
	public void simple()
	{
		System.out.println(" ");
		System.out.println(" ");
	}
}
