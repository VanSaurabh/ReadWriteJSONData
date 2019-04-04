package main.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONData {

	public void readData(String path) throws ParseException {
		try {
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			Object obj = new JSONParser().parse(fileReader);
			JSONObject jsonObject = (JSONObject) obj;
			String accountType = (String) jsonObject.get("AccountType");
			String customerName = (String) jsonObject.get("CustomerName");
			int customerAge = Integer.parseInt((String) jsonObject.get("CustomerAge"));
			double balance = Double.parseDouble((String) jsonObject.get("balance"));
			
			System.out.println("Hello "+ customerName+ ", age "+ customerAge+ " opened "+accountType+ 
					" account and"+" has balance "+balance );
			
		}catch(IOException e) {
			System.out.println("File is not found in the specified location!!" + e);
		}
	}
}
