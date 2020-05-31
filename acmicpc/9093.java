//This is for Stack practice
package com.company;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWords {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int numOfCases = Integer.parseInt(br.readLine());
            StringBuilder builder = new StringBuilder();
            Stack<Character> reverseStack = new Stack<>();

            for (int i =1; i <= numOfCases ; i++){
                String input = br.readLine() + "\n";
                for(char ch : input.toCharArray()) {
                    if (ch == ' ' || ch == '\n') {
                        while(!reverseStack.isEmpty()) {
                            bw.write(reverseStack.pop());
                        }
                        bw.write(ch);
                    }
                    else {
                        reverseStack.push(ch);
                    }
                }
                bw.flush();
                /*
                StringTokenizer tkn = new StringTokenizer(br.readLine());
                while (tkn.hasMoreTokens()) {
                    String word = tkn.nextToken();
                    if (word.length() == 1) {
                        builder.append(word+" ");
                    }
                    else {
                        Stack<Character> reverseStack = new Stack<>();
                        String[] wordArray = word.split("");
                        for (int j=0; j < wordArray.length; j++) {
                            reverseStack.push(wordArray[j].charAt(0));
                        }
                        while ( !reverseStack.isEmpty()) {
                            builder.append(reverseStack.pop());
                        }
                        builder.append(" ");
                    }
                }
                //Trim last char
                builder.setLength(builder.length()-1);
                System.out.println(builder.toString());
                builder.delete(0, builder.length());

                 */
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
