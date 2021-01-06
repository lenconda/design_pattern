package top.lenconda.design_pattern.task3.task3_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Leader director;
        Leader manager;
        Leader viceGeneralManager;
        Leader generalManager;
        Leader conference;

        director = new Director("主任1");
        manager = new Manager("经理1");
        viceGeneralManager = new ViceGeneralManager("副总经理1");
        generalManager = new GeneralManager("总经理");
        conference = new Conference("会议");

        director.setSuccessor(manager);
        manager.setSuccessor(viceGeneralManager);
        viceGeneralManager.setSuccessor(generalManager);
        generalManager.setSuccessor(conference);

        // 新建多个用于测试的审批单，分别设置不同金额
        ArrayList<ApprovalRequest> requests = new ArrayList<>() {{
            add(new ApprovalRequest("采购单1", 9841));
            add(new ApprovalRequest("采购单2", 14386));
            add(new ApprovalRequest("采购单3", 82001));
            add(new ApprovalRequest("采购单4", 169000));
            add(new ApprovalRequest("采购单5", 10001230));
        }};

        for (ApprovalRequest request : requests) {
            // 全部交给主任处理
            director.handleApprovalRequest(request);
        }
    }
}
