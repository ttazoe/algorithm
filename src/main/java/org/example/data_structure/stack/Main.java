package org.example.data_structure.stack;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(8);
        List<String> inputString = new ArrayList<>();

        inputString.add("1");
        inputString.add("2");
        inputString.add("+");
        inputString.add("3");
        inputString.add("4");
        inputString.add("-");
        inputString.add("*");

        for (String s : inputString) {
            if (s == "+") {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            }
            else if (s == "-") {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            }
            else if (s == "*") {
                int a = stack.pop();
                int b = stack.pop();
                stack.push (a * b);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }


        System.out.println(stack.pop());
    }

}
