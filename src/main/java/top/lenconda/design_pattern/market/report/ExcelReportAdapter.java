package top.lenconda.design_pattern.market.report;

public class ExcelReportAdapter extends ExcelReport implements Report {
    @Override
    public void queryDailyReport() {
        super.queryDailyExcelReport();
    }

    @Override
    public void queryMonthlyReport() {
        super.queryMonthlyExcelReport();
    }

    @Override
    public void printDailyReport() {
        super.printDailyExcelReport();
    }

    @Override
    public void printMonthlyReport() {
        super.printMonthlyExcelReport();
    }
}
