public class Definitions {
    private String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVEXYZ0123456789@£$%&!?";
    private int defaultLength = 12;

    public String getAllowedChars() {
        return allowedChars;
    }
    
    public int getDefaultLength() {
        return defaultLength;
    }

    public void changeAllowedChars(newChars) {
        allowedChars = newChars;
    }

    public void changeDefaultLength(newLength) {
        defaultLength = newLength;
    }
}
