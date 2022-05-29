import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (!str.equals("#")) {
            boolean[] array = new boolean[26];
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    array[str.charAt(i) - 65] = true;
                } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    array[str.charAt(i) - 97] = true;
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i]) {
                    count++;
                }
            }
            stringBuilder.append(count).append("\n");
            str = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}
