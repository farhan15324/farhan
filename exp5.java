public class Main {
    public static void main(String[] args) {
        int x = 2, y = 2;

        int[][] c = {{0, 0}, {5, 5}};
        double min = Double.MAX_VALUE;
        int nearest = 0;

        for (int i = 0; i < c.length; i++) {
            double d = Math.sqrt(
                Math.pow(x - c[i][0], 2) +
                Math.pow(y - c[i][1], 2)
            );

            if (d < min) {
                min = d;
                nearest = i;
            }
        }

        System.out.println("Cluster: " + nearest);
    }
}