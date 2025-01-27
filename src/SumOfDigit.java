public class SumOfDigit {
    public static void main(String[] args) {
        int[] num= {123,456,789};
        for (int n:num) {
            int sum = 0;
            int original = n;
            while(n>0){
                sum +=n%10;
                n /= 10;
            }
            System.out.println("The sum of digits in " + original + " is: " + sum);
        }
    }
}
