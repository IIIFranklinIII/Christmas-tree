package sketches.christmasTree;

public class ChristmasTree {
    public static final int segments = 4;
    public static final int height = 4;

    public static void main(String[] args) {
        makeTree();
    }

    public static void makeTree() {
        int maxStars = 2 * height + 2 * segments - 3;
        StringBuilder maxStr = new StringBuilder();
        maxStr.append(" ".repeat(maxStars));

        for (int i = 1; i < segments; i++) {
            for(int line = 1; line <= height; line++) {
                StringBuilder starStr = new StringBuilder();
                starStr.append("*".repeat(Math.max(0, 2 * line + 2 * i - 3)));

                for(int space = 0; space <= maxStars - (height + line + i); space++) {
                    starStr.insert(0, " ");
                }
                System.out.println(starStr);
            }
        }

        for(int i = 0; i <= maxStars / 2; i++) {
            System.out.print(" ");
        }
        System.out.println(" " + "**" + " ");

        for(int i = 0; i < maxStars / 2; i++) {
            System.out.print(" ");
        }
        System.out.println(" " + "***" + " ");

        for(int i = 0; i < maxStars / 2 - 2; i++) {
            System.out.print(" ");
        }
        System.out.println(" " + "********");
    }
}
