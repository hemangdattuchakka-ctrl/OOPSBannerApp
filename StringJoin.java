public class OopsBannerUC3 {

    public static void main(String[] args) {

        printLine(
                "OOOOO",
                "   O",
                "OOOOO",
                "OOOOO"
        );

        printLine(
                "O   O",
                "   O",
                "O   O",
                "O   O"
        );

        printLine(
                "O   O",
                "   O",
                "O   O",
                "O   O"
        );

        printLine(
                "O   O",
                "   O",
                "O   O",
                "O   O"
        );

        printLine(
                "OOOOO",
                "   O",
                "OOOOO",
                "OOOOO"
        );
    }

    private static void printLine(String part1, String part2, String part3, String part4) {
        String line = String.join("   ", part1, part2, part3, part4);
        System.out.println(line);
    }
}
