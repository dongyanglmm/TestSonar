package exception;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ZonedDateTimeTest {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println(Timestamp.valueOf(localDateTime).getTime());
        System.out.println(System.currentTimeMillis());
        
        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());
        
	}

}
