package top.lenconda.design_pattern.market;

import top.lenconda.design_pattern.market.activity.Activity;
import top.lenconda.design_pattern.market.activity.AnniversaryActivity;
import top.lenconda.design_pattern.market.activity.ProductActivity;
import top.lenconda.design_pattern.market.auth.Login;
import top.lenconda.design_pattern.market.department.*;
import top.lenconda.design_pattern.market.report.*;
import top.lenconda.design_pattern.market.statistic.CategoryStatistic;
import top.lenconda.design_pattern.market.statistic.InventoryStatistic;
import top.lenconda.design_pattern.market.statistic.StatisticHandler;
import top.lenconda.design_pattern.market.store.Goods;
import top.lenconda.design_pattern.market.store.Store;
import top.lenconda.design_pattern.market.transaction.*;
import top.lenconda.design_pattern.market.user.*;

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
        Department logisticsDepartment = new LogisticsDepartment();

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

            // 后勤
            add(userFactory.createUser("Fan Tang", "tang", "901293", "manager", logisticsDepartment));
            add(userFactory.createUser("Quolato Al Fernando", "quolato", "kj10928309", "stuff", logisticsDepartment));
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
        System.out.println();

        // 员工信息复制
        System.out.println("复制员工：dan");
        System.out.println("dan 初始信息：");
        System.out.println(users.get(9).toString());
        System.out.println("dan 复制信息：");
        System.out.println(users.get(9).clone().toString());
        System.out.println();

        // 商品进货，小于 10 自动报送
        // 拿到销售员
        System.out.println("商品进货模拟，当商品数量小于 10 时发起进货流程");
        User salesStuff = (SalesStuff) users.get(10);
        User salesManager = (SalesManager) users.get(5);
        User logisticsStuff = (LogisticsStuff) users.get(12);
        User logisticsManager = (LogisticsManager) users.get(11);
        Store store = new Store();
        Goods goods = new Goods();
        goods.addManager(salesManager, salesManager);
        goods.addStuff(salesStuff, salesManager);
        goods.setName("电视机", salesStuff);
        System.out.println("初始化 11 台电视机");
        goods.add(11, logisticsStuff);
        store.setGoods(new ArrayList<Goods>() {{
            add(goods);
        }});
        // 设置职责链
        salesStuff.setLogisticsSupportRequestSuccessor(logisticsStuff);
        salesManager.setLogisticsSupportRequestSuccessor(logisticsManager);
        logisticsStuff.setLogisticsSupportRequestSuccessor(logisticsManager);
        logisticsManager.setLogisticsSupportRequestSuccessor(null);
        // 销售 2 台电视机
        System.out.println("销售两台电视机");
        goods.sale(2, salesStuff);
        System.out.println();

        // 商品销售报表查询
        System.out.println("商品销售报表查询模拟");
        System.out.println("按日统计 Web 报告：");
        Report report1 = (Report) new WebReportAdapter();
        report1.printDailyReport();
        System.out.println("按月统计 Excel 报告：");
        Report report2 = (Report) new ExcelReportAdapter();
        report2.printMonthlyReport();
        System.out.println("按日统计图像报告：");
        Report report3 = (Report) new ImageReportAdapter();
        report3.printDailyReport();
        System.out.println();

        // 商品库存管理
        System.out.println("商品库存管理模拟");
        StatisticHandler statisticHandler = new StatisticHandler();
        System.out.println("商品库存查询：");
        statisticHandler.setStatistic(new InventoryStatistic());
        statisticHandler.printResult();
        System.out.println("分类查询：");
        statisticHandler.setStatistic(new CategoryStatistic());
        statisticHandler.printResult();
        System.out.println();

        // 事务请求
        System.out.println("事务请求模拟");
        User stuff = users.get(6);
        System.out.println("请假事务：");
        Transaction holidayTransaction = (HolidayTransaction) new HolidayTransaction(stuff);
        holidayTransaction.setReceivers(new ArrayList<User>() {{ add(users.get(6)); }});
        holidayTransaction.execute();
        System.out.println("召开会议事务：");
        Transaction holdMeetingTransaction = (HoldMeetingTransaction) new HoldMeetingTransaction(stuff);
        holdMeetingTransaction.setReceivers(new ArrayList<User>() {{ add(users.get(8)); }});
        holdMeetingTransaction.execute();
        System.out.println("会议室申请事务：");
        Transaction meetingRoomTransaction = (MeetingRoomTransaction) new MeetingRoomTransaction(stuff);
        meetingRoomTransaction.setReceivers(new ArrayList<User>() {{ add(users.get(8)); }});
        meetingRoomTransaction.execute();
        System.out.println("办公用品申请事务：");
        Transaction officeSuppliesTransaction = (OfficeSuppliesTransaction) new OfficeSuppliesTransaction(stuff);
        officeSuppliesTransaction.setReceivers(new ArrayList<User>() {{ add(users.get(8)); }});
        officeSuppliesTransaction.execute();
        System.out.println();

        // 特殊活动
        System.out.println("特殊活动模拟");
        System.out.println("周年庆：");
        Activity anniversaryActivity = new AnniversaryActivity();
        anniversaryActivity.begin();
        System.out.println("促销：");
        Activity promotionActivity = new ProductActivity();
        promotionActivity.begin();
        System.out.println("产品活动会：");
        Activity productActivity = new ProductActivity();
        productActivity.begin();
    }
}
