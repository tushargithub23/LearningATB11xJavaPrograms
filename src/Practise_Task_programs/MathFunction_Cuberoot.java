package Practise_Task_programs;

public class MathFunction_Cuberoot
{
    public static void main(String[] args)
    {
        System.out.println( "cuberoot of x2+y2-|z|");
        int x=10;
        int y=10;
        int z=10;
        double result;
        result = Math.cbrt((Math.pow(x,2))+Math.pow(y,2)-Math.abs(z));
        System.out.println("result of given equation is: "+result);
    }
}
