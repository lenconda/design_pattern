package top.lenconda.design_pattern.market.statistic;

public class StatisticHandler {
    private Statistic statistic;

    public void getStatistic() {
        statistic.getStatistics();
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }
}
