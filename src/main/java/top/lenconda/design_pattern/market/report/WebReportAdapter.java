package top.lenconda.design_pattern.market.report;

public class WebReportAdapter extends WebReport implements Report {
    @Override
    public void queryDailyReport() {
        super.queryDailyWebReport();
    }

    @Override
    public void queryMonthlyReport() {
        super.queryMonthlyWebReport();
    }

    @Override
    public void printDailyReport() {
        super.printDailyWebReport();
    }

    @Override
    public void printMonthlyReport() {
        super.printMonthlyWebReport();
    }
}
