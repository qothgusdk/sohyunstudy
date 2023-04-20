 class Calculator {
        static double pi = 3.14;
        static int base = 0;
        int left, right;

        public void setOprands(int l, int r) {
            left = l;
            right = r;
        }

        public void sum() {
            System.out.println(left + right + base);
        }

        public void avg() {
            System.out.println((left + right) / 2);
        }
    }

    public class study {
        public static void main(String[] args) {
            Calculator c1 = new Calculator();
            c1.setOprands(10, 20);
            c1.sum();

            Calculator c2 = new Calculator();
            c2.setOprands(20, 40);
            c2.sum();

            Calculator.base = 10; //base 0->10지정
            c1.sum();
            c2.sum();
            System.out.println(Calculator.pi);
        }
}
