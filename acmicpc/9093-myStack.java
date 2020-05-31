
//This is for Stack practice
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseWords {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numOfCases = Integer.parseInt(br.readLine());
            StringBuilder builder = new StringBuilder();

            for (int i =1; i <= numOfCases ; i++){
                StringTokenizer tkn = new StringTokenizer(br.readLine());
                while (tkn.hasMoreTokens()) {
                    String word = tkn.nextToken();
                    if (word.length() == 1) {
                        builder.append(word+" ");
                    }
                    else {
                        MyStackWithArrayForReverse myStackWithArrayForReverse = new MyStackWithArrayForReverse();

                        //String[] wordArray = word.split("");
                        for (int x=0 ; x < word.length(); x++) {
                            myStackWithArrayForReverse.push(word.charAt(x));
                        }
                        /*
                        for (int j=0; j < wordArray.length; j++) {
                            myStackWithArrayForReverse.push( wordArray[j].charAt(0) );
                        } */
                        while ( !myStackWithArrayForReverse.isEmpty()) {
                            builder.append(myStackWithArrayForReverse.pop());
                        }
                        builder.append(" ");
                    }
                }
                //Trim last char
                builder.setLength(builder.length()-1);
                System.out.println(builder.toString());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class MyStackWithArrayForReverse {
    public char stackArray[] = new char[20];
    public int size = 0;

    public void push(char data) {
        stackArray[size] = data;
        size++;
    }
    public char pop() {
        char returnData = stackArray[size-1];
        //stackArray[size] = null;
        size--;
        return returnData;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}

