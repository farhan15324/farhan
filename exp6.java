public class Main {
    public static void main(String[] args) {
        String[][] data = {
            {"Sunny", "Warm", "Yes"},
            {"Sunny", "Cold", "Yes"},
            {"Rainy", "Cold", "No"}
        };

        String[] h = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i][2].equals("Yes")) {
                for (int j = 0; j < h.length - 1; j++) {
                    if (!h[j].equals(data[i][j]))
                        h[j] = "?";
                }
            }
        }

        System.out.println("Hypothesis:");
        for (int j = 0; j < h.length - 1; j++)
            System.out.print(h[j] + " ");
    }
}