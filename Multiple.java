class Multiple
{ 
    public static void main(String args[])
    {
        int i=10,s=0;
        for(i=0;i<1000;i++)
        {
            if(i%3==0 || i%5==0)
            s+=i;
        }
        System.out.println(s);
    }
}
