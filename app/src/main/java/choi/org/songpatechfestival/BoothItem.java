package choi.org.songpatechfestival;

public class BoothItem {

    private int boothImage;
    private String boothName;
    private String circleName;
    private String place;

    public BoothItem(int boothImage, String boothName, String circleName, String place) {
        this.boothImage = boothImage;
        this.boothName = boothName;
        this.circleName = circleName;
        this.place = place;
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

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
