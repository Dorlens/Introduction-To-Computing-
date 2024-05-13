public class Chapter2Exercises1 
{
    public static void main(String [] args)
    {
        //greatestNum(5, 15);
        System.out.println("the greatest number is " + greatestNum(5,15));
    }

     static int greatestNum(int number5,int number15)
    {
        if(number15 > number5)
            return number15;
            else
            return number5;
            
        
        
    }
}
