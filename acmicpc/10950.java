/*
 * https://www.acmicpc.net/problem/10950
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bkj {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numOfcases = Integer.parseInt(br.readLine());

            for (int i=0; i<=numOfcases; i++){
                if (i == 0) {
                    continue;
                }
                else {
                    StringTokenizer tkn = new StringTokenizer(br.readLine());

                    int a = Integer.parseInt(tkn.nextToken());
                    int b = Integer.parseInt(tkn.nextToken());

                    StringBuilder builder = new StringBuilder();
                    builder.append(a + b);

                    String outputString = builder.toString();
                    System.out.println(outputString);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

