class Solution{
    public boolean lemonadeChange(int[] bills)
    {
        int[] wallet = {0,0};

        for(int i= 0; i < bills.length; i++ )
        {
            if(bills[i] == 5)
            wallet[0]++;
            if(bills[i] == 10)
            {
                wallet[1]++;   
                if(wallet[0] > 0)
                {
                    wallet[0]--;
                }else {return false;}
            }
            if(bills[i] == 20)
            {
                if(wallet[1] > 0 && wallet[0] > 0)
                {wallet[1]--;
                wallet[0]--;}
                else if(wallet[0] > 2)
                {
                    wallet[0]--;
                    wallet[0]--;
                    wallet[0]--;
                }
                else return false;

            }
        }return true;
    }
}