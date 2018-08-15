package repayment;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

public class TestReceiveRepaymentPlan {

	public static OwnRepaymentInputBean buildQueryRepayPlanParam() {

		OwnRepaymentInputBean queryRepayPlanOutputBean = new OwnRepaymentInputBean();

		queryRepayPlanOutputBean.setApp_id("31000000");
		queryRepayPlanOutputBean.setVersion("1.0");
		queryRepayPlanOutputBean.setSign_type("RSA");
		queryRepayPlanOutputBean.setTimestamp("2017-07-13 17:17:02");
		queryRepayPlanOutputBean.setIs_compress("0");
		queryRepayPlanOutputBean.setIs_encrypt("0");
		queryRepayPlanOutputBean.setEncrypt_type("");

		QueryRepayPlanOutputBean bizData = new QueryRepayPlanOutputBean();

		bizData.setOrder_id("201703291453093760");
		bizData.setTotal_amount(4.65F);
		bizData.setCharge(0.15F);
		bizData.setAlpaid(1.55F);
		bizData.setBepaid(3.1F);
		bizData.setTotal_period(3);
		bizData.setFinish_period(1);

		List<RepayPlanBean> list = new ArrayList<RepayPlanBean>();
		RepayPlanBean repayPlanBean1 = new RepayPlanBean();
		repayPlanBean1.setPeriod_no(1);
		repayPlanBean1.setDue_time("2017-03-27");
		repayPlanBean1.setAmount(1.55F);
		repayPlanBean1.setOverdue_fee(0F);
		repayPlanBean1.setBill_status("已还款");
		repayPlanBean1.setPay_type("主动还款");
		repayPlanBean1.setPrinciple(1.50F);
		repayPlanBean1.setInterest(0.05F);
		repayPlanBean1.setSuccess_time("2017-03-26 09:58:28");
		list.add(repayPlanBean1);

		RepayPlanBean repayPlanBean2 = new RepayPlanBean();
		repayPlanBean2.setPeriod_no(2);
		repayPlanBean2.setDue_time("2017-04-27");
		repayPlanBean2.setAmount(1.55F);
		repayPlanBean2.setOverdue_fee(0F);
		repayPlanBean2.setBill_status("未还款");
		repayPlanBean2.setPay_type("主动还款");
		repayPlanBean2.setPrinciple(1.50F);
		repayPlanBean2.setInterest(0.05F);
		repayPlanBean2.setSuccess_time("");
		list.add(repayPlanBean2);

		RepayPlanBean repayPlanBean3 = new RepayPlanBean();
		repayPlanBean3.setPeriod_no(2);
		repayPlanBean3.setDue_time("2017-05-27");
		repayPlanBean3.setAmount(1.55F);
		repayPlanBean3.setOverdue_fee(0F);
		repayPlanBean3.setBill_status("未还款");
		repayPlanBean3.setPay_type("主动还款");
		repayPlanBean3.setPrinciple(1.50F);
		repayPlanBean3.setInterest(0.05F);
		repayPlanBean3.setSuccess_time("");
		list.add(repayPlanBean3);

		bizData.setList(list);

		queryRepayPlanOutputBean.setBiz_data(bizData);

		return queryRepayPlanOutputBean;
	}

	// 将json字符串转换为java对象  
	public static OwnRepaymentInputBean JSON2Object(String jsonStr) {
		JSONObject obj = JSONObject.fromObject(jsonStr);
		OwnRepaymentInputBean bean = (OwnRepaymentInputBean) JSONObject.toBean(obj, OwnRepaymentInputBean.class);
		return bean;
	}

	public static void main(String[] args) {
		OwnRepaymentInputBean bean = TestReceiveRepaymentPlan.buildQueryRepayPlanParam();
		JSONObject json = JSONObject.fromObject(bean);//
		System.out.println(json.toString());
		
		OwnRepaymentInputBean ownRepaymentInputBean = JSON2Object(json.toString());
		
		

	}

}
