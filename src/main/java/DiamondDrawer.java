public class DiamondDrawer {
    private static final char FIRST_LETTER = 'A';
    private static final char LAST_LETTER = 'Z';

    public String drawDiamond(char letter) {
        if (letter < FIRST_LETTER || letter > LAST_LETTER)
            throw new IllegalArgumentException("letter must be a letter between A and Z");

        StringBuilder diamond = new StringBuilder(FIRST_LETTER + "\n");
        int spacesCount = 1;
        for (char currentLetter = FIRST_LETTER + 1; currentLetter <= letter; currentLetter++) {
            diamond.append(currentLetter);
            for (int spaceIndex = 0; spaceIndex < spacesCount; spaceIndex++) {
                diamond.append(" ");
            }
            diamond.append(currentLetter + "\n");
            spacesCount += 2;
        }
        diamond.append(FIRST_LETTER);
        return diamond.toString();
    }
}
