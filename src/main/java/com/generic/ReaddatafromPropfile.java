package com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReaddatafromPropfile{
    
	/**
	 * @author Dell
	 * this method is going to read data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String readdata(String key) throws IOException {
		
		FileInputStream file=new FileInputStream(AutoContstants.propfilepath);
		Properties p=new Properties();
		p.load(file);
		 String value = p.getProperty(key);
		return  value;
	}
}
