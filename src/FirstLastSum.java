import java.util.Arrays;

public class FirstLastSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] res= sum(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sum(int[] arr) {
        int n=arr.length;
        int[] res= new int[n/2];
        for (int i=0; i<n/2;i++) {
            res[i]=arr[i]+arr[n-1-i];
        }

        return res;
    }
}
