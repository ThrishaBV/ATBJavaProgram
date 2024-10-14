package Oct.ex_14102024;

public class typecasting {
    public static void main(String[] args){
        //widening
        int a=10;
        byte b=(byte)a;//explicit
        System.out.println(b);
        short f=19;
        int x=f;//implicit
        System.out.println(x);
        int c=1000;
        float gst=18.56f;
        int m=(int)gst;
        int t=c+m;
        System.out.println(t);
        //narrowing
        double d1=18.98;
        double d2=10.9897;
        int avg=(int)(d1+d2)/2;
        System.out.println(avg);
        int m1=98; int m2=50;
        float per=(float)(m1+m2)/2;
        System.out.println(per);

    }
}
