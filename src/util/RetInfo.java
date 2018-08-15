package util;

public class RetInfo {
	
	private String retCode;
	
	private String retMsg;
	
	private RetObject retObject;
	
	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetMsg() {
		return retMsg;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}

	public RetObject getRetObject() {
		return retObject;
	}

	public void setRetObject(RetObject retObject) {
		this.retObject = retObject;
	}

	@Override
	public String toString() {
		return "RetInfo [retCode=" + retCode + ", retMsg=" + retMsg + ", retObject=" + retObject + "]";
	}
	
}
