 class Calculator {
    public static void sum(int l, int r){
        System.out.println(l + r);
    }

    public static void avg(int l, int r){
        System.out.println( (l+r) / 2);
    }
 }
    public class study {
        public static void main(String[] args) {
            Calculator.sum(10, 20);
            Calculator.avg(10, 20);

            Calculator.sum(20, 40);
            Calculator.avg(20, 40);
        }
}
