package com.company;

/*
 *  https://www.acmicpc.net/problem/10845
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyQueue {
    public static void main (String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            MyQueueWithArray myQueueWithArray = new MyQueueWithArray();
            int numOfCases = Integer.parseInt(br.readLine());
            StringBuilder builder = new StringBuilder();

            for(int i=0; i< numOfCases; i++) {
                StringTokenizer tkn = new StringTokenizer(br.readLine());
                String order = tkn.nextToken();

                if (order.equals("push")) {
                    int data = Integer.parseInt(tkn.nextToken());
                    myQueueWithArray.push(data);
                }

                else if (order.equals("pop")) {
                    System.out.println(myQueueWithArray.pop());
                }

                else if (order.equals("size")) {
                    System.out.println(myQueueWithArray.size());
                }

                else if (order.equals("empty")) {
                    if(myQueueWithArray.empty()){
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                }
                else if (order.equals("front")) {
                    System.out.println(myQueueWithArray.front());
                }
                else {
                    //back
                    System.out.println(myQueueWithArray.back());
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}

class MyQueueWithArray {
    public int queueArray[] = new int[10000];
    public int begin = 0;
    public int end = 0;

    public void push(int data) {
        queueArray[end] = data;
        end++;
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        int returnData = queueArray[begin];
        queueArray[begin] = -1;
        begin++;
        return returnData;
    }

    public int size() {
        return end - begin;
    }

    public boolean empty() {
        if (begin == end) {
            return true;
        } else {
            return false;
        }
    }
    public int front() {
        if (empty()) {
            return -1;
        } else {
            return queueArray[begin];
        }
    }

    public int back() {
        if (empty()) {
            return -1;
        }
        else {
            return queueArray[end-1];
        }
    }
}
