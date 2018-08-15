package repayment;

public class OwnPublicParam {
	
	/**我方的应用ID*/
	private String app_id;
	
	/**接口版本*/
	private String version;
	
	/**签名类型 类型：RSA*/
	private String sign_type;

	/**签名时间*/
	private String timestamp;
	
	/**是否压缩 默认值：0*/
	private String is_compress;
	
	/**是否加密 默认值：0*/
	private String is_encrypt;
	
	/**加密类型 默认值：空*/
	private String encrypt_type;
	
	/**签名串*/
	private String sign;

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSign_type() {
		return sign_type;
	}

	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getIs_compress() {
		return is_compress;
	}

	public void setIs_compress(String is_compress) {
		this.is_compress = is_compress;
	}

	public String getIs_encrypt() {
		return is_encrypt;
	}

	public void setIs_encrypt(String is_encrypt) {
		this.is_encrypt = is_encrypt;
	}

	public String getEncrypt_type() {
		return encrypt_type;
	}

	public void setEncrypt_type(String encrypt_type) {
		this.encrypt_type = encrypt_type;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
