package Recursion;

import java.util.Stack;

public class ReverseStack {
    private static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }

    private static void insertAtBottom(Stack<Integer> st, int top) {
        if(st.isEmpty()){
            st.push(top);
            return;
        }

        int value = st.pop();
        insertAtBottom(st, top);
        st.push(value);

    }

    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {4, 1, 3, 2};
        for(int i = 0; i < arr.length; i++){
            st.push(arr[i]);
        }

        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
        for(int i = 0; i < arr.length; i++){
            st.push(arr[i]);
        }

        reverseStack(st);
        System.out.println();
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
}
