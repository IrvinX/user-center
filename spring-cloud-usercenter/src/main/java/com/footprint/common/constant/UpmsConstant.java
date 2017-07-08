package com.footprint.common.constant;

/**
 * upms系统常量类
 */
public class UpmsConstant {

	public static final String UPMS_TYPE = "upms.type";


	/**
	 * 企业状态
	 */
	public static final short ENPT_STATUS_NORMAL = 0;   //正常
	public static final short ENPT_STATUS_PAUSE = 1;    //暂停
	public static final short ENPT_STATUS_FORBID = 2;   //禁止
	public static final short ENPT_STATUS_DELIST = 3;   //退市

	/**
	 * 认证方式
	 */
	public static final short USER_OAUTH_TYPE_EMAIL = 1;    //邮箱认证
	public static final short USER_OAUTH_TYPE_QQ = 2;       //QQ认证
	public static final short USER_OAUTH_TYPE_WECHET = 3;   //微信认证
	public static final short USER_OAUTH_TYPE_WEIBO = 4;    //微博认证
	public static final short USER_OAUTH_TYPE_ALIPAY = 5;   //支付宝认证
	public static final short USER_OAUTH_TYPE_CA = 6;       //CA认证
	public static final short USER_OAUTH_TYPE_TEL = 7;      //手机认证

	/**
	 * 用户类型
	 */
	public static final short USER_TYPE_DEALER = 1;     //交易商
	public static final short USER_TYPE_ENTP = 2;       //企业用户（非交易商）
	public static final short USER_TYPE_GC_SUPPLIER = 3;//绿卡棉供应商
	public static final short USER_TYPE_TRANS = 4;      //运输企业
	public static final short USER_TYPE_TEL = 11;       //手机注册用户
	public static final short USER_TYPE_API = 12;       //API用户
	public static final short USER_TYPE_PLATFORM = 90;  //平台用户

	/**
	 * 用户状态
	 */
	public static final short USER_STATUS_NORMAL = 1;   //正常
	public static final short USER_STATUS_BLOCK = 2;    //停用
	public static final short USER_STATUS_DELETE = 3;   //删除

	/**
	 * 企业人员类型
	 */
	public static final short ENTP_PERSON_TYPE_ENTPCONT = 1;    //企业联系人
	public static final short ENTP_PERSON_TYPE_FUNDCONT = 2;    //资金联系人
	public static final short ENTP_PERSON_TYPE_POSTCONT = 3;    //邮寄联系人
	public static final short ENTP_PERSON_TYPE_EMERCONT = 4;    //应急联系人
	public static final short ENTP_PERSON_TYPE_LOGICONT = 5;    //物流联系人
	public static final short ENTP_PERSON_TYPE_PRIMAGECONT = 6; //运费补贴联系人

	/**
	 * 审核阶段
	 */
	public static final short AUDIT_STAGE_FIRST = 1;    // 一审/办事处审核
	public static final short AUDIT_STAGE_SECOND = 2;   // 二审/总部终审

	/**
	 * 审核状态
	 */
	public static final short AUDIT_STATUS_PENDING = 1;//待审核
	public static final short AUDIT_STATUS_PASS = 2;   //审核通过
	public static final short AUDIT_STATUS_REJECT = 3; //审核驳回
	public static final short AUDIT_STATUS_REPLAY = 4; //驳回后修正

	/**
	 * 流程状态
	 */
	public static final short PROCESS_STATUS_ACTIVE = 1;//进行中
	public static final short PROCESS_STATUS_END = 2;   //结束

	/**
	 * 身份证件类型
	 */
	public static final short ID_TYPE_ID = 1;    //身份证
	public static final short ID_TYPE_OTHERS = 2;//其他

	/**
	 * 账户转换类型
	 */
	public static final short ACCOUNT_CHANGE_TYPE_TEL2ENTP = 1;     //手机用户->普通企业
	public static final short ACCOUNT_CHANGE_TYPE_TEL2DEALER = 2;   //手机用户->交易商
	public static final short ACCOUNT_CHANGE_TYPE_ENTP2ENTP = 3;    //普通企业->普通企业
	public static final short ACCOUNT_CHANGE_TYPE_ENTP2DEALER = 4;  //普通企业->交易商
	public static final short ACCOUNT_CHANGE_TYPE_DEALER2DEALER = 5;//交易商->交易商

	/**
	 * 组织类型
	 */
	public static final short ORG_TYPE_NORMAL = 1;   //普通企业
	public static final short ORG_TYPE_FINANCIAL = 2;//金融企业
	public static final short ORG_TYPE_GOV = 3;      //政府机关
	public static final short ORG_TYPE_WAR = 4;      //仓库
	public static final short ORG_TYPE_LOGI = 5;     //物流企业
	public static final short ORG_TYPE_OTHERS = 99;  //其他

	/**
	 * 组织虚拟标志
	 */
	public static final short ORG_VIRTUAL_FLAG_ENTITY = 1; //实体
	public static final short ORG_VIRTUAL_FLAG_VIRTUAL = 2;//虚拟

	/**
	 * 企业账户类型
	 */
	public static final short ENTP_ACCOUNT_TYPE_NORMAL = 1; //普通企业
	public static final short ENTP_ACCOUNT_TYPE_DEALER = 2; //交易商
	public static final short ENTP_ACCOUNT_TYPE_TEXTILE = 3;//服装企业
	public static final short ENTP_ACCOUNT_TYPE_GC = 4;     //绿卡棉

	/**
	 * 银行类型
	 */
	public static final short BANK_TYPE_DEPOSIT1 = 1;//开户银行1
	public static final short BANK_TYPE_DEPOSIT2 = 2;//开户银行2
	public static final short BANK_TYPE_DEPOSIT3 = 3;//开户银行3
	public static final short BANK_TYPE_PRIMAGE = 4; //运费补贴银行
	public static final short BANK_TYPE_TAX = 5;     //增值税票银行

}
