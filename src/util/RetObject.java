package util;

import java.io.Serializable;

public class RetObject implements Serializable{
	
	private static final long serialVersionUID = -4400142618189956522L;

	private String access_token;
	
	private Long expires_in;
	
	private Long token_time;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Long getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(Long expires_in) {
		this.expires_in = expires_in;
	}

	public Long getToken_time() {
		return token_time;
	}

	public void setToken_time(Long token_time) {
		this.token_time = token_time;
	}

	@Override
	public String toString() {
		return "RetObject [access_token=" + access_token + ", expires_in=" + expires_in + ", token_time=" + token_time
				+ "]";
	}
	
}
