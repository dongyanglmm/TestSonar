package repayment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class TestRepaymentPlan {

	public static QueryRepayPlanOutputBean buildQueryRepayPlanParam() {
		QueryRepayPlanOutputBean queryRepayPlanOutputBean = new QueryRepayPlanOutputBean();

		queryRepayPlanOutputBean.setOrder_id("201703291453093760");
		queryRepayPlanOutputBean.setTotal_amount(4.65F);
		queryRepayPlanOutputBean.setCharge(0.15F);
		queryRepayPlanOutputBean.setAlpaid(1.55F);
		queryRepayPlanOutputBean.setBepaid(3.1F);
		queryRepayPlanOutputBean.setTotal_period(3);
		queryRepayPlanOutputBean.setFinish_period(1);

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

		queryRepayPlanOutputBean.setList(list);

		return queryRepayPlanOutputBean;
	}

	// 将json字符串转换为java对象  
	public static QueryRepayPlanOutputBean JSON2Object(String jsonStr) {
		JSONObject obj = JSONObject.fromObject(jsonStr);
		QueryRepayPlanOutputBean bean = (QueryRepayPlanOutputBean) JSONObject.toBean(obj,
				QueryRepayPlanOutputBean.class);
		return bean;
	}

	public static void main(String[] args) {
		QueryRepayPlanOutputBean bean = TestRepaymentPlan.buildQueryRepayPlanParam();
		JSONObject json = JSONObject.fromObject(bean);//
		System.out.println("the jsonStr = " + json.toString());
		// 将json转类
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", json.toString());

		String retMap = map.get("data").toString();
		QueryRepayPlanOutputBean retBean = TestRepaymentPlan.JSON2Object(retMap);
		System.out.println(retBean);

		// QueryRepayPlanOutputBean queryRepayPlanOutputBean =
		// (QueryRepayPlanOutputBean)map.get("data");

	}

}
