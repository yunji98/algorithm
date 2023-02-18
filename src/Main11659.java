import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11659 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

//        int[] arr = new int[n];
//        int[] s = new int[n];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//            if (i != 0) {
//                s[i] = s[i - 1] + arr[i];
//            } else {
//                s[i] = arr[i];
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken()) - 1;
//            int b = Integer.parseInt(st.nextToken()) - 1;
//
//            if (a == 0) {
//                System.out.println(s[b]);
//            } else {
//                System.out.println(s[b] - s[a - 1]);
//            }
//        }

        st = new StringTokenizer(br.readLine());
        long[] S = new long[n+1];
        for (int i = 1; i <= n; i++) {
            S[i] = Integer.parseInt(st.nextToken()) + S[i - 1];
        }

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());

            int firstIdx = Integer.parseInt(st.nextToken());
            int lastIdx = Integer.parseInt(st.nextToken());

            System.out.println(S[lastIdx] - S[firstIdx - 1]);
        }

        br.close();

    }
}
