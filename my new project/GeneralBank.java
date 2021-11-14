package GeneralBank;

public class GeneralBank extends ICICI
{
    static int getSavinginterestrate(int p) {
        return getSavinginterestrate();
    }

    static int getFixedInterestRate(int g) {
        return getFixedInterestRate();

    }

    public static void main(String[] args) {
        System.out.println(getSavinginterestrate());
        System.out.println(getFixedInterestRate());

    }
}

   class ICICI
   {
       static int getSavinginterestrate()
       {
           return 7;
       }
       static int getFixedInterestRate()
       {
           return 8;
       }


   }
   class KOTMBANK
   {
       static int getSavinginterestrate()
       {
           return 6;
       }
       static int getFixedInterestRate()
       {
           return 9;
       }


   }
