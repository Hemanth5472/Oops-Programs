class methodOverloading
{
    public void parentsAre()
    {
      System.out.println("My mother name  is : leela");
    }
    public void parentsAre(String father)
    {
      System.out.println("Father name is :"+father);
    }
  }
class MethodOvload
  {
    public static void  main(String[] args)
    {
    	methodOverloading p1=new methodOverloading();
      p1.parentsAre();
      methodOverloading p2=new methodOverloading();
      p2.parentsAre("krishna");
    }
  }