package util;

/**
 * @desc 16进制编解码
 * @author qijianhang
 */
public class HexUtils {
    private HexUtils() {}

    /**编码*/
    private static final String CHARSET_UTF8 = "UTF-8";

    /**空值*/
    private static final String ENPTY_STR = "";

    /**
     * byte转为hex字符串
     */
    public static String bytesToHexStr(byte[] byteArr) {
        if (null == byteArr || byteArr.length < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte t : byteArr) {
            if ((t & 0xF0) == 0) {
                sb.append("0");
            }
            //t & 0xFF 操作是为去除Integer高位多余的符号位（java数据是用补码表示）
            sb.append(Integer.toHexString(t & 0xFF));
        }
        return sb.toString();
    }

    /**
     * hex字符串转为byte
     */
    public static byte[] hexStrToBytes(String hexStr) {
        if (null == hexStr || hexStr.length() < 1) {
            return null;
        }

        int byteLen = hexStr.length() / 2;
        byte[] result = new byte[byteLen];
        char[] hexChar = hexStr.toCharArray();
        for(int i=0 ;i<byteLen;i++){
            result[i] = (byte)(Character.digit(hexChar[i*2],16)<<4 | Character.digit(hexChar[i*2+1],16));
        }
        return result;
    }

    /**
     * 字符串转16进制字符串
     */
    public static String strToHexStr(String inputStr) {
        try{
            return bytesToHexStr(inputStr.getBytes(CHARSET_UTF8));
        } catch (Exception e) {
            return ENPTY_STR;
        }

    }

    /**
     * 16进制字符串转字符串
     */
    public static String hexStrToStr(String inputHexStr) {
        try{
            return new String(hexStrToBytes(inputHexStr), CHARSET_UTF8);
        } catch (Exception e) {
            return ENPTY_STR;
        }
    }

    /*public static void main(String[] args) {
        System.out.println(strToHexStr("我去15345dhsjf大润发打扫房间"));
        System.out.println(hexStrToStr(strToHexStr("我去15345dhsjf大润发打扫房间")));
    }*/
}
