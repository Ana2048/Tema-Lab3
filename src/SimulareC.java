public class SimulareC {

    public SimulareC() {
    }

    public long sim()
    {
        long nrExtrase=0L;
        int count=0;

        while(count<6)
        {
            int nr=(int)(Math.random()*49)+1;
            if((nrExtrase & (1L<<nr))==0)
            {
                nrExtrase |= (1L<<nr);
                count++;
            }
        }
        return nrExtrase;
    }

    public void afisezCrescator(long nrExtrase)
    {
        for(int i=1;i<=49;i++)
        {
            if((nrExtrase & (1L<<i))!=0)
                System.out.println(i+" ");

        }
        System.out.println();
    }

    public void afisezDescrescator( long nrExtrase)
    {
        for(int i=49;i>=1;i--)
        {
            if((nrExtrase & (1L<<i))!=0)
                System.out.println(i+" ");
        }
        System.out.println();
    }

}
