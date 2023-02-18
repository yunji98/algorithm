import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int sum = 1;
        int count = 1;
        int first = 1;
        int end = 1;

        while (end != n) {
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= first;
                first++;
            } else if (sum == n) {
                end++;
                sum += end;
                count++;
            }
        }
        System.out.print(count);
    }
}
