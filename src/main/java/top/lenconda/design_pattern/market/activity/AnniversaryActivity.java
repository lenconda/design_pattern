package top.lenconda.design_pattern.market.activity;

import top.lenconda.design_pattern.market.department.*;

import java.util.ArrayList;

public class AnniversaryActivity extends Activity {
    public AnniversaryActivity() {
        this.setDepartmentGroup(new ArrayList<DepartmentGroup>() {{
            new HRDepartment();
            new ITDepartment();
            new OfficeDepartment();
            new OperationDepartment();
            new SalesDepartment();
        }});
    }

    @Override
    public void begin() {
        for (DepartmentGroup departmentGroup : departmentGroups) {
            departmentGroup.join();
        }
    }
}
