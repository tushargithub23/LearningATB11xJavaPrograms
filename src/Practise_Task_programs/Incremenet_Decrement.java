package Practise_Task_programs;

public class Incremenet_Decrement
{
    public static void main(String[] args) {
        int a=10;
        int b=20;
//       System.out.println(a);
//       System.out.println(--a);
//       System.out.println(a+b);
       System.out.println(a++ + b++);
        //exp a-> a++ 10
        //exp b-> b++ 20 result 30  // post increment retrun the value first then increment
        System.out.println(a-- + b--);
        //exp a-> 11
        // exp b->21  reult is 32 here incremented

        int c=40, d=40;
        System.out.println(++c);//41
        System.out.println(++d);//41 // pre increment retrun the value first then increment
        System.out.println(++c + ++d ); //42+42

    }

}
