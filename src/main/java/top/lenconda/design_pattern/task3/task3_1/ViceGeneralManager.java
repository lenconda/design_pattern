package top.lenconda.design_pattern.task3.task3_1;

public class ViceGeneralManager extends Leader {
    public ViceGeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleApprovalRequest(ApprovalRequest request) {
        if (request.getMoney() < 100000) {
            System.out.println("Amount from vice general manager" + name + "'s approval " + request.getApproveOrder() + " is: RMB " + request.getMoney());
        } else {
            if (this.successor != null) {
                this.successor.handleApprovalRequest(request);
            }
        }
    }
}
