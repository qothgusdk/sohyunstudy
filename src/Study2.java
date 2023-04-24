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
public class Study2 {
    public static void main(String[] args) {
        SubstractionableCalculator a = new SubstractionableCalculator();
        a.serOarands(10, 20);
        a.sum();
        a.avg();
        a.substract();
    }
}