package top.lenconda.design_pattern.task3.task3_1;

public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    public void handleApprovalRequest(ApprovalRequest request) {
        if (request.getMoney() < 10000) {
            System.out.println("Amount from director" + name + "'s approval " + request.getApproveOrder() + " is: RMB " + request.getMoney());
        } else {
            if (this.successor != null) {
                this.successor.handleApprovalRequest(request);
            }
        }
    }
}
