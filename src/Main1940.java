import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1940 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int first = 0;
        int end = n - 1;
        int count = 0;

        Arrays.sort(arr);

        while (end > first) {
            if (arr[first] + arr[end] < m) {
                first++;
            } else if (arr[first] + arr[end] > m) {
                end--;
            } else if (arr[first] + arr[end] == m) {
                count++;
                first++;
                end--;
            }
        }
        System.out.print(count);
        br.close();
    }
}
