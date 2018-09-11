package choi.org.songpatechfestival;

public class ScheduleItem {

    private String date;
    private String event;
    private String detail;

    public ScheduleItem(String date, String event, String who) {
        this.date = date;
        this.event = event;
        this.detail = who;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
