public class Diamond {
    public String drawDiamond(char letter) {
        if (letter < 'A' || letter > 'Z')
            throw new IllegalArgumentException("letter must be a letter between A and Z");
        return "";
    }
}
