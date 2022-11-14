import java.util.Scanner;
import java.util.Stack;

//MAX ELEMENT
// 1 x  -Push the element x into the stack.
// 2    -Delete the element present at the top of the stack.
// 3    -Print the maximum element in the stack.

public class MaxElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Stack<Integer> mainstack= new Stack<>();
        Stack<Integer> maxstack = new Stack<>();
        maxstack.push(Integer.MIN_VALUE);

        for(int i =0;i<N;i++){
            int op = sc.nextInt();
            switch(op){
                case 1:
                    int item = sc.nextInt();
                    mainstack.push(item);
                    if(item > maxstack.peek())  maxstack.push(item);
                    else maxstack.push(maxstack.peek());
                    break;
                case 2:
                    mainstack.pop();
                    maxstack.pop();
                    break;
                case 3:
                    System.out.println(maxstack.peek());
                    break;
            }
        }
        sc.close();
    }
}