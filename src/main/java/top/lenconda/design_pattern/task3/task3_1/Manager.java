package top.lenconda.design_pattern.task3.task3_1;

public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    public void handleApprovalRequest(ApprovalRequest request) {
        if (request.getMoney() < 50000) {
            System.out.println("Amount from manager" + name + "'s approval " + request.getApproveOrder() + " is: RMB " + request.getMoney());
        } else {
            if (this.successor != null) {
                this.successor.handleApprovalRequest(request);
            }
        }
    }
}
