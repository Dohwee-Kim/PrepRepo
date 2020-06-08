import java.io.*;
import java.util.StringTokenizer;


/**
 * https://www.acmicpc.net/problem/17087
 */
public class HideAndSeek6 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer tkn1 = new StringTokenizer(br.readLine());

            //StringTokenizer tkn2 = new StringTokenizer(br.readLine());

            int numOfSiblings = Integer.parseInt(tkn1.nextToken());
            int location = Integer.parseInt(tkn1.nextToken());

            StringTokenizer tkn2 = new StringTokenizer(br.readLine());

            int[] siblingsArray = new int[numOfSiblings];

            int a = Math.abs(Integer.parseInt(tkn2.nextToken()) - location);

            while (tkn2.hasMoreTokens()) {
                //int a = Integer.parseInt(tkn2.nextToken()) - location;
                int b = Math.abs(Integer.parseInt(tkn2.nextToken()) - location);
                a = findingGCD(a, b);
            }
            System.out.println(a);


        }catch (IOException e){
            System.out.println(e);
        }

    }

    public static int findingGCD(int a, int b){
        if (b==0) {
            return a;
        }
        else {
            return findingGCD(b, a%b);
        }
    }

}

