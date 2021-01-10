package top.lenconda.design_pattern.market.request;

public class FinishedRequestState extends RequestState {
    public FinishedRequestState(RequestState requestState) {
        this.currentStateCode = requestState.getCurrentStateCode();
        this.request = requestState.getRequest();
    }

    public FinishedRequestState(Request request) {
        this.request = request;
        this.currentStateCode = "FINISHED";
    }
}
