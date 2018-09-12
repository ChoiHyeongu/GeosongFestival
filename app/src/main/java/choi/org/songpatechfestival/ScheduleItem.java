package choi.org.songpatechfestival;

public class ScheduleItem {

    private String event;
    private String detail;

    public ScheduleItem(String date, String event, String who) {
        this.event = event;
        this.detail = who;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String who) {
        this.detail = detail;
    }
}
