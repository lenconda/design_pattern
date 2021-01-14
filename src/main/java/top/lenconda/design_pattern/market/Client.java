package top.lenconda.design_pattern.market;

import top.lenconda.design_pattern.market.auth.Login;
import top.lenconda.design_pattern.market.department.*;
import top.lenconda.design_pattern.market.user.CEO;
import top.lenconda.design_pattern.market.user.ITManager;
import top.lenconda.design_pattern.market.user.User;
import top.lenconda.design_pattern.market.user.UserFactory;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        System.out.println("创建用户");

        // 创建部门
        Department ceoDepartment = new CEODepartment();
        Department hrDepartment = new HRDepartment();
        Department itDepartment = new ITDepartment();
        Department officeDepartment = new OfficeDepartment();
        Department operationDepartment = new OperationDepartment();
        Department salesDepartment = new SalesDepartment();

        // 工厂方法
        UserFactory userFactory = new UserFactory();
        ArrayList<User> users = new ArrayList<>() {{
            // 总经理
            add(userFactory.createUser("Liam Joseph", "liam", "qwerty", "manager", ceoDepartment));

            // 各部门主管
            add(userFactory.createUser("Page Lincoln", "page", "qwe123as", "manager", hrDepartment));
            add(userFactory.createUser("Larry Johnson", "larry", "osiqw9e", "manager", itDepartment));
            add(userFactory.createUser("Susana Jesmine", "susana", "oi309eiw", "manager", officeDepartment));
            add(userFactory.createUser("Bill Abramov", "bill", "8quq9w", "manager", operationDepartment));
            add(userFactory.createUser("Ancheng Yan", "ancheng", "q8u98w", "manager", salesDepartment));

            // 主管下属员工
            add(userFactory.createUser("Katsuki Honda", "katsuki", "82998", "stuff", hrDepartment));
            add(userFactory.createUser("Urana Pushkin", "urana", "989892", "stuff", itDepartment));
            add(userFactory.createUser("Sara Banker", "sara", "192831", "stuff", officeDepartment));
            add(userFactory.createUser("Dan Ivanov", "dan", "190459", "stuff", operationDepartment));
            add(userFactory.createUser("Echo Tim", "echo", "90091231", "stuff", salesDepartment));
        }};

        System.out.println("用户创建完成");
        System.out.println();

        System.out.println("分配部门");

        // 分配各部门，添加总经理下属
        User ceo = (CEO) users.get(0);
        ceo.setDepartment(ceoDepartment);
        User itManager = (ITManager) users.get(2);
        ceoDepartment.addMember(ceo, itManager);

        for (int i = 0; i < 5; i += 1) {
            User currentManager = users.get(i + 1);

            currentManager.getDepartment().addMember(currentManager, itManager);
            ceo.addStuff(currentManager);

            // 添加当前主管下属员工
            User currentManagerStuff = users.get(i + 6);
            currentManager.addStuff(currentManagerStuff);
            currentManager.getDepartment().addMember(currentManagerStuff, itManager);
        }

        System.out.println("分配部门完成");
        System.out.println();

        System.out.println("用户登录模拟");

        // 用户登录
        Login login = new Login(users);
        // 成功
        User loginUser = login.login("liam", "qwerty");
        System.out.println(loginUser.toString());
        // 失败
        login.login("liam", "qwertyy");

        System.out.println("查看员工信息");
        System.out.println("bill 查看 echo");
        // bill 查看 echo 的员工信息
        System.out.println(users.get(4).getInfo(users.get(10)));
        System.out.println("echo 查看自己");
        // echo 查看自己的信息
        System.out.println(users.get(10).getInfo());
    }
}
