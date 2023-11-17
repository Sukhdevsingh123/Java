public class fibnacciSeries{
    public static int  fibnoci(int n){
        if(n==0||n==1){
          return n;
}

        return fibnoci(n-1)+fibnoci(n-2);    
    }
public static void main(String args[]){
  int n=6;
  System.out.println(fibnoci(n));
}

}