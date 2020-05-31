/*
 * https://www.acmicpc.net/problem/10828
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PracticeStack {
    public static void main (String[] args) throws IOException {
        MyStackWithArray myStackWithArray = new MyStackWithArray();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numOfCases = Integer.parseInt(br.readLine());

            for (int i = 0 ; i <= numOfCases ; i++) {
                if (i==0){
                    continue;
                }
                StringTokenizer tkn = new StringTokenizer(br.readLine());

                String order = tkn.nextToken();

                if (order.equals("push")) {
                    int data = Integer.parseInt(tkn.nextToken());
                    myStackWithArray.push(data);
                }

                else if (order.equals("pop")) {
                    System.out.println(myStackWithArray.pop());
                }

                else if (order.equals("empty")) {
                    System.out.println(myStackWithArray.empty());
                }

                else if (order.equals("size")) {
                    System.out.println(myStackWithArray.size());
                }

                else {
                    System.out.println(myStackWithArray.top());
                    //do top
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        
    }

}

class MyStackWithArray {
    public int stackArray[] = new int[10000];
    public int size = 0;

    public void push(int data) {
        stackArray[size] = data;
        size++;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        int returnData = stackArray[size-1];
        stackArray[size] = 0;
        size--;
        return returnData;
    }

    public int size() {
        return size;
    }

    public int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public int top() {
        if (size == 0) {
            return -1;
        } else {
            return stackArray[size-1];
        }
    }
}

