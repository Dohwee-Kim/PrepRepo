
/**
 * https://www.acmicpc.net/problem/1929
 */

import java.io.*;
import java.util.StringTokenizer;

public class SieveOfEratosthenes {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int numOfPrimes = 0;
            
            StringTokenizer tkn = new StringTokenizer(br.readLine());

            int startNumber = Integer.parseInt(tkn.nextToken());
            int endNumber = Integer.parseInt(tkn.nextToken());

            //int numOfCases = endNumber - startNumber;
            //int[] sieveArray = new int[numOfCases+1];
            //default = false
            boolean[] primeArray = new boolean[endNumber+1];
            primeArray[0] = true;
            primeArray[1] = true;
            StringBuilder builder = new StringBuilder();

            for (int i=2; i <= endNumber; i++ ) {
                for (int j=i ; i+j <= endNumber; j+=i) {
                    if (primeArray[i+j] == false) {
                        primeArray[i+j] = true;
                    }
                }
            }

            for (int x=startNumber; x <= endNumber ; x++) {
                if (primeArray[x] == false) {
                    builder.append(x);
                    builder.append('\n');
                }
            }
            bw.write(builder.toString());
            bw.flush();

        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

}

