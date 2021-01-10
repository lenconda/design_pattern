package top.lenconda.design_pattern.market.activity;

import top.lenconda.design_pattern.market.department.ITDepartment;
import top.lenconda.design_pattern.market.department.OfficeDepartment;
import top.lenconda.design_pattern.market.department.OperationDepartment;
import top.lenconda.design_pattern.market.department.SalesDepartment;

import java.util.ArrayList;

public class ProductActivity extends Activity {
    public ProductActivity() {
        this.setDepartmentGroup(new ArrayList<DepartmentGroup>() {{
            new OperationDepartment();
            new SalesDepartment();
            new ITDepartment();
            new OfficeDepartment();
        }});
    }

    @Override
    public void begin() {
        for (DepartmentGroup departmentGroup : departmentGroups) {
            departmentGroup.join();
        }
    }
}
