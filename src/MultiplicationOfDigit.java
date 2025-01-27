public class MultiplicationOfDigit {
    public static void main(String[] args) {
        int[] num={12,34,56};
        for (int n : num) {
            int product=1;
            int original=n;
            while(n>0){
                product *= n%10;
                n /= 10;
            }
            System.out.println("The product of digits in " + original + " is: " + product);
        }
    }
}
