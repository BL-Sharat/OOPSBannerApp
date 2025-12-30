public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] banner = buildBanner();
        printBanner(banner);
    }

    // Builds the OOPS banner
    static String[] buildBanner() {
        return new String[] {
            " ***    ***   *****  **** ",
            "*   *  *   *  *      *   *",
            "*   *  *   *  *****  **** ",
            "*   *  *   *      *  *    ",
            " ***    ***   *****  *    "
        };
    }

    // Prints the banner
    static void printBanner(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
