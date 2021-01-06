package top.lenconda.design_pattern.task3.task3_1;

public abstract class Leader {
    protected String name;
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleApprovalRequest(ApprovalRequest request);
}
