package main.java;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONData {

	@SuppressWarnings("unchecked")
	public void writeData(String path) {
		try {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("CustomerName", "Sunny");
			jsonObject.put("AccountType", "Savings");
			jsonObject.put("CustomerAge", "25");
			jsonObject.put("balance", "1000");

			Map<String, String> addressMap = new HashMap<>();
			addressMap.put("AddressLine1", "House number: 2, Street-D");
			addressMap.put("AddressLine2", "Manhattan, NewYork");
			addressMap.put("postalCode", "454644");
			
			jsonObject.put("CustomerAddress", addressMap);
			
			JSONArray jsonArray =  new JSONArray();
			Map<String, String> phoneMap = new HashMap<>();
			phoneMap.put("Mobile", "76475327453248");
			phoneMap.put("LandLine", "9027148");
			jsonArray.add(phoneMap);
			Map<String, String> emailMap = new HashMap<>();
			emailMap.put("PrimaryEmail", "Sunny@dhj.com");
			jsonArray.add(emailMap);
			jsonObject.put("Contacts", jsonArray);
			File file = new File(path);
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.write(jsonObject.toJSONString());
			System.out.println("Data entered in JSON file!");
			printWriter.flush();
			printWriter.close();
			
		}catch(Exception e) {
			System.out.println("Wo!!! exception caught!"+ e);
		}
	}
}