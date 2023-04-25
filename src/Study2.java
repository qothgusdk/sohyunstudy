class Calculator{
    int left, right;
    int third = 0;
    public void setOprands(int l, int r){
        left = l;
        right = r;
    }
    public void setOprands(int l, int r, int t){
        this.setOprands(left, right);
        third = t;
    }
    public void sum(){
        System.out.println(left+right+third);
    }
    public void avg(){
        System.out.println((left+right+third)/3);
    }
}
public class Study2 {
    public static void main(String[] args) {
        Calculator a = new Calculator();
        a.setOprands(10, 20);
        a.sum();
        a.avg();
        a.setOprands(10,20, 30);
        a.sum();
        a.avg();
    }
}