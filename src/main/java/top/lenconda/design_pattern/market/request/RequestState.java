package top.lenconda.design_pattern.market.request;

public abstract class RequestState {
    protected Request request;
    protected String currentStateCode;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getCurrentStateCode() {
        return currentStateCode;
    }

    public void setCurrentStateCode(String currentStateCode) {
        this.currentStateCode = currentStateCode;
    }
}
