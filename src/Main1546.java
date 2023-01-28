import java.io.*;
import java.util.StringTokenizer;

public class Main1546 {
    public static void main(String[] args) throws Exception {
        // 정렬 알고리즘 모른다는 가정하에 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 과목의 개수
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] d = new double[N];
        double max = 0;
        for (int i = 0; i < N; i++) {
            d[i] = Double.parseDouble(st.nextToken());
            if (max < d[i]) {
                max = d[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (d[i] / max) * 100;
        }

        System.out.print(sum / N);
        br.close();
    }
}
