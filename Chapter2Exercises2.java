public class Chapter2Exercises2 
{
    public static void main(String[] args) 
    {
        System.out.println(whoIsBigger(1,3,5));
    }
    static int whoIsBigger(int num1, int num2, int num3)
    {
        if(num1 > num2 && num1 > num3)
        return num1;
        else if(num2 > num1 && num2 >num3)
        return num2;
        else
        return num3;

    }
}
