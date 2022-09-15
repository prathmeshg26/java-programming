class Shop
{
	String name;
	String location;	
	int contact;
	String type;
	
	
	void shopLocation(String m,String n)
	{
	name=m;
	location=n;
	System.out.println(name +"  " + "shop is in" + "  " +location);
	}

	void shopAddress(String a,String b)
	{
	name=a;
	location=b;
	
	System.out.println(name +"  " + "shop is in"+ "  " +location + "  " + "location" + "  " +"contact no. is" +" "+ contact);
	}

        void shopInfo(String x,String y)
	{
	name=x;
	type=y;
	System.out.println(y +" " + x + " " +"shop is located in" +"  "+location +"  " + " contact no. is" + "  " +contact);
	}
	
	

  public static void main(String[] args) 
  {
  Shop s1 = new  Shop();
  s1.shopLocation("prathmesh","hinjawadi it park");
  
  Shop s2 = new Shop();
  s2.contact=5864721;
  s2.shopAddress("neha","near  buchade  palza");
  
  Shop s3 = new Shop();
  s3.location="phase3";
  s3.shopInfo("sayli","Groecry");
  
  }
}
                                              