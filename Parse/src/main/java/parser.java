import java.util.HashMap;

public class parser {
	static HashMap<String,String> hmap = new HashMap<String,String>();
	static String data2;	
	
	public static HashMap<String, String> getHmap() {
		return hmap;
	}

	public static String getData2() {
		return data2;
	}

	public static void setData2(String data2) {
		parser.data2 = data2;
	}

	public static void main(String args[]){
//		parser.Parse("Version:2 \n TaxiStation:6072 \n TaxiLicense:EM9543 \n System_ID:910 \n");
	}
	
	public static void Parse(){
//		data2 = getData2();
		String[] datarr = data2.split("\n");
		
		for (int i=0;i<datarr.length;i++) {
		      String arr[] = datarr[i].split(":");
		      hmap.put(arr[0], arr[1]);
			}	
}
}
