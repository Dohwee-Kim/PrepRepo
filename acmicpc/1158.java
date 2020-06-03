
/**
 * https://www.acmicpc.net/problem/1158
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus {
    public static void main (String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder builder = new StringBuilder();
            String input = br.readLine();

            StringTokenizer tkn = new StringTokenizer(input);
            int N = Integer.parseInt(tkn.nextToken());
            int K = Integer.parseInt(tkn.nextToken());
            int count = K-1;
            bw.append("<");

            Queue<Integer> josephusQueue = new LinkedList<>();
            for (int i = 1; i <= N ; i++) {
                josephusQueue.add(i);
            }

            while (!josephusQueue.isEmpty()) {
                int tmp = josephusQueue.peek();
                if (count == 0) {
                    josephusQueue.remove();
                    builder.append(tmp+", ");
                    count=K-1;
                }
                else {
                    josephusQueue.remove();
                    josephusQueue.add(tmp);
                    count--;
                }
            }
            //SetLength() method simply alters the count and overwrites the unwanted value in the array with zero
            builder.setLength(builder.length()-2);
            builder.append(">");
            bw.write(builder.toString());
            bw.flush();

        }catch (IOException e) {
            System.out.println(e);
        }

    }
}

