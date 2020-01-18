public class Mmain extends Papa{
    void ww(){
        System.out.println("Mmmm");
        super.ww();
        System.out.println(x+"  "+super.x);
    }
    int x=8;
    public static void main(String[] args) {
        Mmain m=new Mmain();
        m.ww();


    }
}
