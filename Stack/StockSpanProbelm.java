import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProbelm {
    
   static ArrayList<Integer> calcSpan(int[] arr){
   // Stacks obj = new Stacks();
        Stack<Integer> stk = new Stack();
        ArrayList<Integer> span = new ArrayList<>();
        //span.add(-1);

        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[i]>=arr[stk.peek()]){
                stk.pop();
            }

            if(stk.isEmpty()){
               span.add(i+1);
            }
            else{
                span.add(i-stk.peek());
            }
            stk.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] input =  {100, 80, 60, 70, 60, 75, 85};
        System.out.println("Hi");
        System.out.println(calcSpan(input));

    }   
}
