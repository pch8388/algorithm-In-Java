package quiz.dataStructure;

import java.util.Scanner;

class Stack {
    int[] stack;
    int top;

    public Stack() {
        this.stack = new int[10];
        top = -1;
    }

    public void push(int data) {
        if (top == stack.length - 1) {
            int[] tmp = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                tmp[i] = stack[i];
            }
            this.stack = tmp;
        }
        top++;
        stack[top] = data;
    }

    public void pop() {
        if (top < 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(stack[top]);
        top--;
    }

    public void size() {
        System.out.println(top + 1);
    }

    public void empty() {
        if (top == -1) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
        return;
    }

    public void top() {
        if (top == -1) {
            System.out.println(-1);
            return;
        }
        System.out.println(stack[top]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.valueOf(sc.nextLine());
        Stack s = new Stack();
        for (int i = 0; i < count; i++) {
            String[] str = sc.nextLine().split(" ");
            switch (str[0]) {
                case "push" :
                    s.push(Integer.valueOf(str[1]));
                    break;
                case "pop" :
                    s.pop();
                    break;
                case "size" :
                    s.size();
                    break;
                case "empty" :
                    s.empty();
                    break;
                case "top" :
                    s.top();
                    break;
            }
        }
        sc.close();
    }
}