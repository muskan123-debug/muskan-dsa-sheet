import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Stacks {
    

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
    static ArrayList<Integer> calNLR(int[] arr){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[i]>=stack.peek()){
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
        ArrayList<Integer> res1=calNLR(input);
        System.out.println(input);
        Collections.reverse(res);
        Collections.reverse(res1);
        System.out.println("NSR+"+res); // Nearest smallest right
        System.out.println("NLR+"+res1);    //nearest largest right
    }
}
