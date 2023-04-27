class Calculator{
    private int left, right;
    public void setOprands (int l, int r){
        left = l;
        right = r;
    }
    private int sum(){
        return left+right;
    }
    public void sumDecoPlus () {
        System.out.println("++++"+sum()+"++++");
    }
    public void sumDecoMinus () {
        System.out.println("----"+sum()+"----");
    }
}
public class Study2  {
    public static void main(String[] args) {
        Calculator x = new Calculator();
        x.setOprands(10, 20);
        x.sumDecoPlus();
        x.sumDecoMinus();
    }
}