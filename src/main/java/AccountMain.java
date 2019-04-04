package main.java;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class AccountMain {

	public static void main(String args[]) throws IOException, ParseException {
		
		WriteJSONData writeData = new WriteJSONData();
		writeData.writeData("F:/New folder/AccountData.json");
		
		ReadJSONData readData = new ReadJSONData();
		readData.readData("F:/New folder/AccountData.json");
		
	}
}
