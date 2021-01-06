package top.lenconda.design_pattern.task3.task3_1;

public class Conference extends Leader {
    public Conference(String name) {
        super(name);
    }

    public void handleApprovalRequest(ApprovalRequest request) {
        if (request.getMoney() > 200000) {
            System.out.println("Amount from conference" + name + "'s approval " + request.getApproveOrder() + " is: RMB " + request.getMoney());
        } else {
            if (this.successor != null) {
                this.successor.handleApprovalRequest(request);
            }
        }
    }
}
