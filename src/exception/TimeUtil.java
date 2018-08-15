package exception;

import java.sql.Timestamp;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class TimeUtil {
	
	

	public static void main(String[] args) {
		
//		long timeStamp = System.currentTimeMillis();
//		System.out.println(timeStamp);
		
		ZoneId zoneId = ZoneId.of("UTC");
		ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
		//Instant instant = zonedDateTime.toInstant();
		Instant instant2 = Instant.now();
		ZonedDateTime zonedDateTime2 = instant2.atZone(ZoneId.of("UTC"));
		System.out.println(zonedDateTime.toEpochSecond());
//		System.out.println(instant.toEpochMilli());
		System.out.println(zonedDateTime.toInstant().toEpochMilli());
		System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
		
		
//		Clock clock = Clock.systemUTC();
//		Clock clock2 = Clock.system(zoneId);
//		System.out.println(clock.millis());
//		System.out.println(clock2.millis());
		
//		System.out.println(ZonedDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), ZoneId.of("UTC")).toString());
//		System.out.println(ZonedDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), ZoneId.of("Asia/Shanghai")).toString());
		ZonedDateTime zonedDateTime3 = ZonedDateTime.now(zoneId);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(zonedDateTime3.getZone());
		System.out.println(zonedDateTime3.format(formatter));
		
		Instant instant = Instant.now();

        System.out.println("Instant : " + instant.getNano());
        
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println(Timestamp.valueOf(localDateTime).getTime());
	}

}
