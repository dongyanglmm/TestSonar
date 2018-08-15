package repayment;

/**
 * 查询还款计划和还款记录 返回参数
 *
 * @author dongyang
 * @create 2017-11-13 11:22
 **/
public class RepayPlanBean {

    /**当前期数*/
    private int period_no;

    /**到期时间*/
    private String due_time;
    
    /**还款金额*/
    private Float amount;

    /**逾期费用*/
    private Float overdue_fee;

    /**账单状态*/
    private String bill_status;

    /**还款方式*/
    private String pay_type;

    /**本金*/
    private Float principle;

    /**利息*/
    private Float interest;

    /**还款成功时间*/
    private String success_time;

    public int getPeriod_no() {
        return period_no;
    }

    public void setPeriod_no(int period_no) {
        this.period_no = period_no;
    }

    public String getDue_time() {
        return due_time;
    }

    public void setDue_time(String due_time) {
        this.due_time = due_time;
    }

    public Float getOverdue_fee() {
        return overdue_fee;
    }

    public void setOverdue_fee(Float overdue_fee) {
        this.overdue_fee = overdue_fee;
    }

    public String getBill_status() {
        return bill_status;
    }

    public void setBill_status(String bill_status) {
        this.bill_status = bill_status;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public Float getPrinciple() {
        return principle;
    }

    public void setPrinciple(Float principle) {
        this.principle = principle;
    }

    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        this.interest = interest;
    }

    public String getSuccess_time() {
        return success_time;
    }

    public void setSuccess_time(String success_time) {
        this.success_time = success_time;
    }

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
    
    
    
}
