package bot.functions;

public class FunctionReply {
    private boolean isFinished = false;
    private Data data;

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinishedWork(boolean finished) {
        isFinished = finished;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
