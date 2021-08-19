package com.generic;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReaddatafromJSON {

	/**
	 * @author Dell
	 * this method is going to read the data from the JSON file
	 * @param key
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	public String readdata_JSON(String key) throws IOException, ParseException
	{
		FileReader file=new FileReader("../SDET/commomdata.json");
		
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(file);
		
		HashMap jobj = (HashMap)obj;
		
		String value = jobj.get(key).toString();
		
		return value;
	}
}
