public class Chapter1Exercies1 
{
    public static void main(String [] args)
    {
        int count = 0;

        for(int i = 0; count < 20;  i++)
        {
            if(i % 5 == 0)
            {
                System.out.println(i);
                count++;
            }
        }
    }
}