package MoodAnalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    //Handle Customized Exception using try-catch block
    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter proper message!");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Please enter proper message!");
        }
    }
    }
