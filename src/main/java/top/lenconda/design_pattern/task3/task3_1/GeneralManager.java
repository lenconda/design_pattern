package top.lenconda.design_pattern.task3.task3_1;

public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    public void handleApprovalRequest(ApprovalRequest request) {
        if (request.getMoney() < 200000) {
            System.out.println("Amount from general manager" + name + "'s approval " + request.getApproveOrder() + " is: RMB " + request.getMoney());
        } else {
            if (this.successor != null) {
                this.successor.handleApprovalRequest(request);
            }
        }
    }
}
