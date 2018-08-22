package choi.org.songpatechfestival;

public class BoothItem {

    private int boothImage;
    private String boothName;
    private String boothEvent;

    public BoothItem(int boothImage, String boothName, String boothEvent) {
        this.boothImage = boothImage;
        this.boothName = boothName;
        this.boothEvent = boothEvent;
    }

    public int getBoothImage() {
        return boothImage;
    }

    public void setBoothImage(int boothImage) {
        this.boothImage = boothImage;
    }

    public String getBoothName() {
        return boothName;

    }

    public void setBoothName(String boothName) {
        this.boothName = boothName;
    }

    public String getBoothEvent() {
        return boothEvent;
    }

    public void setBoothEvent(String boothEvent) {
        this.boothEvent = boothEvent;
    }
}
