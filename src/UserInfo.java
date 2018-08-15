import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInfo {
	
	private Integer userId;  
    private String username;  
    private Date birthDate;  
    private Integer age;  
    private float fRate;  
    private char ch;
    
    public String getBirthDatestr() {  
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");  
        return formater.format(getBirthDate());  
    } 
    
    public UserInfo(Integer userId, String username, Date birthDate, Integer age, float fRate, char ch) {  
        super();  
        this.userId = userId;  
        this.username = username;  
        this.birthDate = birthDate;  
        this.age = age;  
        this.fRate = fRate;  
        this.ch = ch;  
    } 
    
    @Override  
    public String toString() {  
        return "UserInfo [userId=" + userId + ", \tusername=" + username + ", \tbirthDate=" + getBirthDatestr()  
                + ", \tage=" + age + ", fRate=" + fRate + ", ch=" + ch + "]";  
    }  
    
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public float getfRate() {
		return fRate;
	}
	public void setfRate(float fRate) {
		this.fRate = fRate;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}  
    
    

}
