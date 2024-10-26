public class ProjectSekai {
    public static void main(String[] args) {
        Prosekai mynightcore = new Prosekai() {
            void miku() {
                System.out.println("This person is miku");
            }
        };
        Prosekai myvivid = new ProsekaiVivid("Kohane");
        Prosekai myleoneed = new ProsekaiLeoneed("Ichika");

        System.out.println();

        System.out.println("====================================================");

        mynightcore.miku();

        System.out.println();

        myvivid.miku();
        myvivid.lead();
        myvivid.band();

        System.out.println();

        myleoneed.miku();
        myleoneed.lead();
        myleoneed.band();
        System.out.println("====================================================");
    }
}