import org.w3c.dom.ls.LSOutput;

class Calculator {
    int left, right;
    public void serOarands(int l,int r){
        left = l;
        right = r;
    }
    public void sum(){
        System.out.println(left+right);
    }
    public void  avg(){
        System.out.println((left+right)/2);
    }
}
class SubstractionableCalculator extends Calculator{
    public void substract(){
        System.out.println(left-right);
    }
}
class MultiplicationableCalculator extends Calculator{
    public void multiplication(){
        System.out.println(left*right);
    }
}
class DivisionableCalculator extends MultiplicationableCalculator{
    public void division(){
        System.out.println(left/right);
    }
}
public class Study2 {
    public static void main(String[] args) {
        DivisionableCalculator a = new DivisionableCalculator();
        a.serOarands(20, 10);
        a.sum();
        a.avg();
        a.multiplication();
        a.division();
    }
}