package util;

public class TuoMinUtil {

	public static void main(String[] args) {
		String mobile = "18795968966";
		System.out.println(mobile.replaceAll("(?<=^.{3}).*(?=.{4}$)", "****"));
		
		String bankCard = "6214850253743667";
		System.out.println(bankCard.substring(bankCard.length()-4, bankCard.length()));
	}

}
