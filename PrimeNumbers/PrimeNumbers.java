class PrimeNumbers
{
  public static void main (String[]args)
  {
    int n = 929;
    int flag = 0;
    for (int i = 1; i <= n; i++)
      {
	if (n % i == 0)
	  flag++;
      }
    if (flag==2)
        System.out.print ("Prime");
        else
        System.out.print ("Not a Prime");
}
}
