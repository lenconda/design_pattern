package top.lenconda.design_pattern.task3.task3_1;

public class ApprovalRequest {
    private String approveOrder;
    private int money;

    public ApprovalRequest(String approveOrder, int money) {
        this.approveOrder = approveOrder;
        this.money = money;
    }

    public void setApproveOrder(String approveOrder) {
        this.approveOrder = approveOrder;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getApproveOrder() {
        return approveOrder;
    }

    public int getMoney() {
        return money;
    }
}
