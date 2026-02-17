public class Definitions {
    public String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVEXYZ0123456789@£$%&!?";
    public int defaultLength = 12;

    public void changeAllowedChars(String newChars) {
        allowedChars = newChars;
    }

    public void changeDefaultLength(int newLength) {
        defaultLength = newLength;
    }
}
