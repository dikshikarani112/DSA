package Recursion;

import java.util.Stack;

public class SortStack {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {4, 1, 3, 2};
        for(int i = 0; i < arr.length; i++){
            st.push(arr[i]);
        }
        sortStack(st);

        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }

    private static void sortStack(Stack<Integer> st) {
        while(st.isEmpty()){
           return;
        }
        int temp = st.pop();
        sortStack(st);
        sortedInsert(st, temp);
    }

    private static void sortedInsert(Stack<Integer> st, int temp) {
        if(st.isEmpty() || st.peek() <= temp){
            st.push(temp);
            return;
        }

        int ele = st.pop();
        sortedInsert(st, temp);
        st.push(ele);
    }
}
