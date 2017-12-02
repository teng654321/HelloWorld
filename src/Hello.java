import java.util.Random;

public class Hello {
    public static void main(String[] args){
        //System.out.println("hello world");
        Random random=new Random();
        int n=random.nextInt(10);
        System.out.print(n);
    }
}
