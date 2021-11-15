package MoodAnalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            return "HAPPY";
        }
    }
}
