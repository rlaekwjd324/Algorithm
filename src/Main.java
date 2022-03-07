import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        long N = Long.parseLong(stringTokenizer.nextToken());
        long M = Long.parseLong(stringTokenizer.nextToken());
        System.out.println(N == M ? 1 : 0);
    }
}
