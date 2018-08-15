package repayment;

import java.util.List;

/**
 * 查询还款计划和还款记录 返回参数
 *
 * @author dongyang
 * @create 2017-11-13 11:14
 **/
public class QueryRepayPlanOutputBean {
	
    /**订单编号*/
    private String order_id;

    /**还款总额*/
    private Float total_amount;

    /**总服务费*/
    private Float charge;

    /**已还金额*/
    private Float alpaid;

    /**待还金额*/
    private Float bepaid;

    /**总期数*/
    private int total_period;

    /**已还期数*/
    private int finish_period;

    List<RepayPlanBean> list;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Float total_amount) {
        this.total_amount = total_amount;
    }

    public Float getCharge() {
        return charge;
    }

    public void setCharge(Float charge) {
        this.charge = charge;
    }

    public Float getAlpaid() {
        return alpaid;
    }

    public void setAlpaid(Float alpaid) {
        this.alpaid = alpaid;
    }

    public Float getBepaid() {
        return bepaid;
    }

    public void setBepaid(Float bepaid) {
        this.bepaid = bepaid;
    }

    public int getTotal_period() {
        return total_period;
    }

    public void setTotal_period(int total_period) {
        this.total_period = total_period;
    }

    public int getFinish_period() {
        return finish_period;
    }

    public void setFinish_period(int finish_period) {
        this.finish_period = finish_period;
    }

    public List<RepayPlanBean> getList() {
        return list;
    }

    public void setList(List<RepayPlanBean> list) {
        this.list = list;
    }
}
