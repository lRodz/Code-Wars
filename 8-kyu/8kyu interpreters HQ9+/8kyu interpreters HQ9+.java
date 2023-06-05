public class HQ {

    public static String HQ9(char code) {

        StringBuilder string = new StringBuilder();

        for (int i = 99; i >= 3; i--) {
            string.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n")
                    .append("Take one down and pass it around, ").append(i - 1).append(" bottles of beer on the wall.\n")
                    .toString().trim();
        }

        switch (code) {
            case 'H':
                return "Hello World!";
            case 'Q':
                return "Q";
            case '9':
                return string
                        + "2 bottles of beer on the wall, 2 bottles of beer.\n"
                        + "Take one down and pass it around, 1 bottle of beer on the wall.\n"
                        + "1 bottle of beer on the wall, 1 bottle of beer.\n"
                        + "Take one down and pass it around, no more bottles of beer on the wall.\n"
                        + "No more bottles of beer on the wall, no more bottles of beer.\n"
                        + "Go to the store and buy some more, 99 bottles of beer on the wall.";

        }
        return null;
    }
}