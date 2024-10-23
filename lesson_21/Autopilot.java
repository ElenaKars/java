package lesson_21;

public class Autopilot {
    private String sofwareVersion;

    public Autopilot(String sofwareVersion) {
        this.sofwareVersion = sofwareVersion;
    }


    public String toString(){
        return "Autopilot: { SV" + sofwareVersion + "}";
    }

    public String getSofwareVersion() {
        return sofwareVersion;
    }

    public void setSofwareVersion(String sofwareVersion) {
        this.sofwareVersion = sofwareVersion;
    }
}
