abstract class Calculator{
    int left, right;
    public void setOprands (int l, int r){
        left = l;
        right = r;
    }
    public abstract void sum ();
    public abstract void  avg ();
    public void run () {
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println(left+right);
    }
    public void avg(){
        System.out.println((left+right)/2);
    }
}
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+(left+right) );
    }
    public void avg(){
        System.out.println("- avg :"+((left+right)/2));
    }
}
public class Study2  {
    public static void main(String[] args) {
        CalculatorDecoPlus a = new CalculatorDecoPlus();
        a.setOprands(10, 20);
        a.run();

        CalculatorDecoMinus b = new CalculatorDecoMinus();
        b.setOprands(10, 20);
        b.run();
    }
}