import java.util.Stack;

public class test {
     static int[] nsr(int arr[]){
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[arr.length];
        for(int  i =arr.length-1;i>=0;i++){
            while(stk.isEmpty() && arr[i]<=stk.peek()){
                stk.pop();
            }

            if(!stk.isEmpty()){
                res[i]=stk.peek();
            }
            else{
                res[i]=-1;
            }
            stk.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println("Hi");
        int[] arr = {3, 0, 1, 0, 4, 0 ,2};
        int[] res = nsr(arr);
        System.out.print("nsr+"+res);
    }
}
