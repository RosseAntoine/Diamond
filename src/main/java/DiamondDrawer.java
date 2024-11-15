public class DiamondDrawer {
    private static final char FIRST_LETTER = 'A';
    private static final char LAST_LETTER = 'Z';
    private static final int DIAMOND_SPACE_ENLARGEMENT = 2;

    public String drawDiamond(char letter) {
        if (letter < FIRST_LETTER || letter > LAST_LETTER)
            throw new IllegalArgumentException("letter must be a letter between A and Z");

        StringBuilder diamond = new StringBuilder(FIRST_LETTER + "\n");
        int spacesCount = -1;
        char currentLetter;
        for (currentLetter = FIRST_LETTER + 1; currentLetter <= letter; currentLetter++) {
            diamond.append(currentLetter);
            spacesCount += DIAMOND_SPACE_ENLARGEMENT;
            appendSpaces(diamond, spacesCount);
            diamond.append(currentLetter + "\n");
        }

        for (currentLetter = (char) (letter - 1); currentLetter > FIRST_LETTER; currentLetter--) {
            diamond.append(currentLetter);
            spacesCount -= DIAMOND_SPACE_ENLARGEMENT;
            appendSpaces(diamond, spacesCount);
            diamond.append(currentLetter + "\n");
        }

        diamond.append(FIRST_LETTER);
        return diamond.toString();
    }

    private static void appendSpaces(StringBuilder stringBuilder, int spacesCount) {
        for (int spaceIndex = 0; spaceIndex < spacesCount; spaceIndex++) {
            stringBuilder.append(" ");
        }
    }
}
