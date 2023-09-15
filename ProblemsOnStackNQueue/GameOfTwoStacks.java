import java.util.Arrays;
public class GameOfTwoStacks {
    // https://www.hackerrank.com/challenges/game-of-two-stacks/problem
    public static void main(String args[]){
        int  a[] ={4,2,4,6,1};
        int b[] ={2,1,8,5};
        int x=10;
        System.out.println(twoStacks(x,a,b));
    }
    public static int twoStacks(int x,int[] a,int[] b){
       return twoStacks(x,a,b,0,0)-1;
    }
    public static int twoStacks(int x,int[] a,int[] b,int sumSoFar,int count){
        if(sumSoFar>x){
            return count;
        }
        if(a.length==0 || b.length==0){
            return count;
        }
        int ans1=twoStacks(x,a,Arrays.copyOfRange(b,1,b.length),sumSoFar+b[0],count++);
        int ans2=twoStacks(x,b,Arrays.copyOfRange(a,1,a.length),sumSoFar+a[0],count++);
        return Math.max(ans1,ans2);
    }

}
