import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class OutOfMemoryTest {

	public static void main(String[] args) {
		Map<Integer, Object> map=new HashMap<Integer, Object>();  
        for (int i = 0; i < 600000000; i++) {  
        	map.put(i, new Date());
        }  
	}

}
