package Ann.com;

public class ScoringNG {
    public static void main(String[] args) {
        int[] math = {95, 84, 60, 75, 89};
        int[] english = {88, 77, 75, 94, 86};
        String[] name = {"Ann", "Jerry", "Tiffany", "Laura", "Mia"};
        for (int i = 0; i < 5; i++) {
            if (i != 1) {
                System.out.println(name[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (math[i] + english[i]) / 2);
            }
        }
    }
}
