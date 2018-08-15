package exception;

public enum ArowanaRetCode implements ArowanaRetDefinition {

	//返回码类型---通用
    COM_SUCCESS("0000", "调用成功"),
    COM_FAIL("0001", "调用失败"),

    //返回码类型---通用-安全
    COM_SEC_SIGN_ERROR("1000", "验签失败"),

    //返回码类型--通用-用户
    COM_USER_OPERATION_FREQUENCY("2000", "操作过于频繁，请稍后重试"),
    COM_USER_ENTER_CAPTCHA("2001", "请输入图形验证码"),
    COM_USER_REGET_VALIDATECODE("2002", "验证码失败次数过多，请重新获取验证码"),
    COM_USER_VALIDCODE_ERROR("2003", "验证码输入错误，请重新输入"),
    COM_USER_PHONE_OR_PASS_ERROR("2004", "手机号或密码错误，请重新输入"),
    COM_USER_VALIDCODE_NOT_EXIST("2005", "短信验证码不存在"),
    COM_USER_CAPTCHA_NOT_EXIST("2006", "图片验证码不存在"),

    //返回码类型--参数校验
    VALID_CHANNELID_EMPTY("3000", "渠道号不能为空"),
    VALID_CLIENTID_EMPTY("3001", "设备号不能为空"),
    VALID_APPID_EMPTY("3002", "app标识不能为空"),
    VALID_REGISTRATION_EMPTY("3003", "极光注册标识不能为空"),
    VALID_ZUID_EMPTY("3004", "设备号不能为空"),
    VALID_PLATFORM_EMPTY("3005", "平台不能为空"),
    VALID_REH_EMPTY("3006", "屏幕高度不能为空"),
    VALID_REW_EMPTY("3007", "屏幕宽度不能为空"),
    VALID_PHONE_EMPTY("3008", "手机号不能为空"),
    VALID_PHONE_FORMAT("3009", "手机格式错误"),
    VALID_UID_EMPTY("3010", "用户标识不能为空"),
    VALID_PASS_EMPTY("3011", "密码不能为空"),
    VALID_IP_EMPTY("3012", "ip不能为空"),
    VALID_VALIDCODE_EMPTY("3013", "验证码不能为空"),
    VALID_NAME_EMPTY("3014", "姓名不能为空"),
    VALID_IDCARD_EMPTY("3015", "身份证不能为空"),
    VALID_PAGE_EMPTY("3016", "页面不能为空"),
    VALID_DEMARKID_EMPTY("3017", "去重标识不能为空"),
    VALID_WINDOWID_EMPTY("3018", "窗口标识不能为空"),
    VALID_GENRE_EMPTY("3019", "文章类别不能为空"),
    VALID_PAGE_ILLEGAL("3020", "页码不正确"),
    VALID_ARTICLEID_EMPTY("3021", "文章标识不能为空"),
    VALID_STARTTIME_EMPTY("3022", "开始时间不能为空"),
    VALID_ENDTIME_EMPTY("3023", "结束时间不能为空"),
    VALID_TASKNO_EMPTY("3024", "任务编码不能空"),
    VALID_TASKNO_FORMAT("3025", "任务编码格式错误"),
    VALID_INPUT_PARAMS_EMPTY("3026", "入参不能为空"),
    VALID_CLIENT_TYPE_EMPTY("3027", "客户端类型不能为空"),
    VALID_OPENID_EMPTY("3028", "【openId】不能为空"),
    VALID_PUBLICID_EMPTY("3029", "【publicId】不能为空"),
    VALID_LAT_LON_CITYCODE_EMPTY("3030", "经纬度和城市码不能都为空"),
    VALID_CITYCODE_EMPTY("3031", "城市码不能为空"),
    VALID_PRODUCTID_EMPTY("3032", "产品标识不能为空"),
    VALID_THEMEPICKID_EMPTY("3033", "主题精选产品标识不能为空"),
    VALID_PAGENAME_EMPTY("3034", "页面名称不能为空"),
    VALID_LISTNAME_EMPTY("3035", "【listName】不能为空"),
    VALID_PRODUCTID_MUST_GT_ZERO("3036", "产品标识必须大于0"),
    VALID_POSITION_MUST_GT_ZERO("3037", "产品位置必须大于0"),
    VALID_CLIENTID_AND_CHANNELID_EMPTY("3038", "渠道号和设备号都不能为空"),
    VALID_UIDS_EMPTY("3039", "用户标识不能为空"),

    //返回码类型--业务通用异常
    BIZ_COM_INFO_NOT_EXIST("6000", "未查到相关信息"),
    BIZ_COM_DECRYPT("6001", "解密失败"),
    BIZ_COM_INFO_GET("6002", "信息获取失败，请稍后再试"),

    //返回码类型--业务具体异常
    BIZ_JPUSH_BIND_FAIL("6500", "极光推送绑定失败"),
    BIZ_CHENNEL_NOT_EXIST("6501", "渠道不存在"),
    BIZ_MODEL_NOT_EXIST("6502", "模板不存在"),
    BIZ_MAINTENANCEINFO_NOT_EXIST("6003", "维护信息配置不存在"),
    BIZ_SEND_VALIDCODE("6504", "发送失败，请您稍后再试"),
    BIZ_USER_SOURCE_GET_FAIL("6505", "获取用户来源失败"),
    BIZ_PHONE_NOT_EXIST("6506", "手机号码不存在"),
    BIZ_PHONE_NOT_REGISTRATION("6507", "该手机号尚未注册，请前往注册"),
    BIZ_PHONE_NOT_SETPASS("6508", "该手机号尚未设置密码，请前往设置"),
    BIZ_USERINFO_DECRYPT_FAIL("6509", "用户敏感信息解密失败"),
    BIZ_UID_NOT_EXIST("6510", "用户标识不存在"),
    BIZ_MAX_QUERY_TIMES("6511", "今日已达最大查询次数"),
    BIZ_TASKNO_GET_FAIL("6512", "查询任务编码失败"),
    BIZ_LOCATE_FAIL("6513", "定位失败，请您手动定位"),
    BIZ_CITYCODE_GETBYIP_FAIL("6514", "通过IP获取城市码失败"),
    BIZ_PHONE_NOT_IN_WHITE("6515", "手机号码不在白名单里"),
    BIZ_USER_NOT_EXIST("6516", "用户不存在"),
    BIZ_PRODUCT_NOT_EXIST("6517", "产品信息不存在"),
    BIZ_SAVE_PASS_FAIL("6518", "保存密码失败");


    private String retCode;

    private String retMsg;

    ArowanaRetCode(String retCode, String retMsg) {
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    /**
     * 获取返回码
     */
    @Override
    public String getRetCode() {
        return retCode;
    }

    /**
     * 获取返回信息
     */
    @Override
    public String getRetMsg() {
        return retMsg;
    }
	
}
