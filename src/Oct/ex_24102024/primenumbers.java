package Oct.ex_24102024;
//import java.util.Scanner;
public class primenumbers {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
      int i=0,n=0;
      String p=" ";
      for(i=1;i<=100;i++){
          int c=0;
          for(n=i;n>=1;n--){
              if(i%n==0){
                  c=c+1;
              }
          }
          if(c==2){
              p=p+i+" ";
          }
      }
        System.out.println(p);
    }
}
