package top.lenconda.design_pattern.market.activity;

import top.lenconda.design_pattern.market.department.*;

import java.util.ArrayList;

public class PromotionActivity extends Activity {
    public PromotionActivity() {
        this.setDepartmentGroup(new ArrayList<DepartmentGroup>() {{
            add(new OperationDepartment());
            add(new SalesDepartment());
        }});
    }

    @Override
    public void begin() {
        for (DepartmentGroup departmentGroup : departmentGroups) {
            departmentGroup.join();
        }
    }
}
