package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility implements FrameworkConstants{
	public static String getProperty(String key) {
		//Step 1: Get the Java representation of physical file
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(PROPERTIES_PATH);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//Step 2: Create the object of Properties class
		Properties pObj=new Properties();
		//Step 3: Load Key and values to the Properties object
		try {
			pObj.load(fis);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//Step 4: Get the property
		return pObj.getProperty(key);
	}
	
}
