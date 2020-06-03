
/**
 * https://www.acmicpc.net/problem/17413
 */

import java.io.*;
import java.util.Stack;

public class ReverseWords2 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder builder = new StringBuilder();
            Stack<Character> reverseStack = new Stack<>();
            boolean inTag = false;
            String inputString = br.readLine();
            //In the loop
            for(char ch : inputString.toCharArray()) {
                if (ch == '<') {
                    inTag = true;
                    while (!reverseStack.isEmpty()) {
                        builder.append(reverseStack.pop());
                    }
                    builder.append('<');
                }
                else if (ch == '>') {
                    inTag = false;
                    builder.append('>');
                }

                //if meet space or end of the string
                else if (ch == ' ') {
                    if (inTag) {
                        builder.append(' ');
                    }
                    else {
                        while (!reverseStack.isEmpty()) {
                            builder.append(reverseStack.pop());
                        }
                        builder.append(' ');
                    }
                }
                else {
                    //String in tag
                    if (!inTag) {
                        reverseStack.push(ch);
                    }
                    else {
                        builder.append(ch);
                    }
                }
            }
            while(!reverseStack.isEmpty()){
                builder.append(reverseStack.pop());
            }
            bw.write(builder.toString());
            bw.flush();

        } catch (IOException e) {
            System.out.println(e);
        }


    }

}

