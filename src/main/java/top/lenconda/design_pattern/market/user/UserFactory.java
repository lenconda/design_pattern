package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;

import java.util.Date;

public class UserFactory {
    public User createUser(String name, String username, String password, String role, Department department) {
        User user = null;

        if (role.equals("stuff")) {
            switch (department.getId()) {
                case "hr":
                    user = new HRStuff(name, username, password, department);
                    break;
                case "it":
                    user = new ITStuff(name, username, password, department);
                    break;
                case "office":
                    user = new OfficeStuff(name, username, password, department);
                    break;
                case "operation":
                    user = new OperationStuff(name, username, password, department);
                    break;
                case "sales":
                    user = new SalesStuff(name, username, password, department);
                    break;
                case "logistics":
                    user = new LogisticsStuff(name, username, password, department);
                    break;
                default:
                    System.out.println("No department matched");
                    break;
            }
        } else if (role.equals("manager")) {
            switch (department.getId()) {
                case "hr":
                    user = new HRManager(name, username, password, department);
                    break;
                case "it":
                    user = new ITManager(name, username, password, department);
                    break;
                case "office":
                    user = new OfficeManager(name, username, password, department);
                    break;
                case "operation":
                    user = new OperationManager(name, username, password, department);
                    break;
                case "sales":
                    user = new SalesManager(name, username, password, department);
                    break;
                case "ceo":
                    user = new CEO(name, username, password, department);
                    break;
                case "logistics":
                    user = new LogisticsManager(name, username, password, department);
                    break;
                default:
                    System.out.println("No role matched");
                    break;
            }
        }

        if (user != null) {
            user.joinDate = new Date();
            return user;
        } else {
            return null;
        }
    }
}
