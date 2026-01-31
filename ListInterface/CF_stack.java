package ListInterface;

import java.util.Stack;

public class CF_stack {
    static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        System.out.println(st.isEmpty());
        st.push(4);
        st.push(7);
        st.push(9);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
