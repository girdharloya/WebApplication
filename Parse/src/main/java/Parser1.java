import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Parser1 {
	static List<String> list = new ArrayList<String>();
	
	public void Parse(String data2){
//		data2 = getData2();
		String[] datarr = data2.split("\n");
		
		for (int i=0;i<datarr.length;i++) {
		      list.add(datarr[i]);
			}	
}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		Parser1.list = list;
	}
}
