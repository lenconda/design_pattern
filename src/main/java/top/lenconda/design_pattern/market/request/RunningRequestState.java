package top.lenconda.design_pattern.market.request;

public class RunningRequestState extends RequestState {
    public RunningRequestState(RequestState requestState) {
        this.currentStateCode = requestState.getCurrentStateCode();
        this.request = requestState.getRequest();
    }

    public RunningRequestState(Request request) {
        this.request = request;
        this.currentStateCode = "RUNNING";
    }
}
