package B2_Loop_JAVA.baitap;

public class Cacsntnhohon100 {
    public static void main(String[] args) {
            int i =0;
            int num =0;
            //Empty String
            String  primeNumbers = "";
            for (i = 1; i <= 100; i++)
            {
                int counter=0;
                for(num = i; num >= 1; num--)
                {
                    if(i % num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Các số nguyên tố từ 1 đến 100 là:");
            System.out.println(primeNumbers);
        }
    }
