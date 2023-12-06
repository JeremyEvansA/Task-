public class Maths extends Calculator {
    public static void main (String [] args) {


         int a=2;
         int b=5;
         boolean Status = false;
         byte range = 125;
         short temperature = -200;
         float price = 42.24F;
         long bignumber = 45454545L;
         char test = '9';


        Calculator count= new Calculator();
        count.Add(a,b);
        count.Sub(a,b);
        count.Mul(a,b);
        count.Div(a,b);
        System.out.println();
        System.out.println("=============");
        System.out.println("boolean: "+Status);
        System.out.println("byte: "+range);
        System.out.println("short: "+temperature);
        System.out.println("float: " +price);
        System.out.println("long: "+bignumber);
        System.out.println("char: "+test);
    }

}
