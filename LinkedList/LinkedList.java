import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;


public class LinkedList {

    static ArrayList<Integer> calNSR(int[] arr){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[i]<=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(-1);
            }
            else{
                res.add(stack.peek());
            }
            stack.push(arr[i]);
        }

        return res;
    }
    public static void main(String[] args) {
       // System.out.println("Hi!");

        int[] input =  {6, 8, 0, 1, 3 };
        ArrayList<Integer> res=calNSR(input);
        System.out.println(input);
        Collections.reverse(res);
        System.out.println("res+"+res);
    }

    
}