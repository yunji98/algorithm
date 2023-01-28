import java.io.*;

public class Main11720 {
    public static void main(String[] args) throws Exception {
        // ver 1.
        /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 다음줄로 출력하거나 그런거 안필요하니까 그냥 String 으로 받아도 돼

        int total = Integer.parseInt(br.readLine());
        sb.append(br.readLine());

        int sum = 0;
        for(int i=0;i<total;i++) {
            sum += sb.charAt(i) - '0';
        }
        // String 에서 char 를 뽑아와도 되고, String.toCharArray 를 사용해서 그 char 배열만큼 반복문 돌아도 돼
        System.out.print(sum);
        br.close();
        */

        // ver 2.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tot = Integer.parseInt(br.readLine());

        char[] charArray = br.readLine().toCharArray();
        int sum = 0;

        for(int i=0;i<tot;i++) {
            sum += charArray[i] - '0';
        }

        System.out.print(sum);
        br.close();
    }
}
