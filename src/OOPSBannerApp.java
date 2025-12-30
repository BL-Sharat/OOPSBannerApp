public class OOPSBannerApp {

    public static void main(String[] args) {
        BannerCharacter oops = new BannerCharacter(new String[] {
            " ***    ***   *****  **** ",
            "*   *  *   *  *      *   *",
            "*   *  *   *  *****  **** ",
            "*   *  *   *      *  *    ",
            " ***    ***   *****  *    "
        });

        printBanner(oops);
    }

    // Utility method to print banner
    static void printBanner(BannerCharacter banner) {
        for (String line : banner.getPattern()) {
            System.out.println(line);
        }
    }

    // 🔹 Inner class to store banner data
    static class BannerCharacter {
        private final String[] pattern;

        public BannerCharacter(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
