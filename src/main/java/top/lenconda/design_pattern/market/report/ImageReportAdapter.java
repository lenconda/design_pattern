package top.lenconda.design_pattern.market.report;

public class ImageReportAdapter extends ImageReport implements Report {
    @Override
    public void queryDailyReport() {
        super.queryDailyImageReport();
    }

    @Override
    public void queryMonthlyReport() {
        super.queryMonthlyImageReport();
    }

    @Override
    public void printDailyReport() {
        super.printDailyImageReport();
    }

    @Override
    public void printMonthlyReport() {
        super.printMonthlyImageReport();
    }
}
