package util;

import java.util.Map;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GJsonTest {

	public static void main(String[] args) throws Exception {
		
		String resultData = "{\"retCode\": \"0000\",\"retMsg\": \"success\",\"retObject\": {\"access_token\": \"d594123cf9c946a59a4beb1e29f1010d8\",\"expires_in\": 2530832,\"token_time\": 1471571455454}}";
		Gson gson = new GsonBuilder().serializeNulls().create();
//		Map<String, Object> resultMap = gson.fromJson(resultData, Map.class);
//		Map<String, Object> retObjectMap = (Map<String, Object>) resultMap.get("retObject");
//		System.out.println("access_token = " + String.valueOf(retObjectMap.get("access_token")));
		
		RetInfo retInfo = gson.fromJson(resultData, RetInfo.class);
		System.out.println("access_token = " + retInfo.getRetObject().getAccess_token());
	}
	
}
