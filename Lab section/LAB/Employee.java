class Employee
{
   String name;
   String email;
 

   static String company_name;
   static int salary;

   void displaydata()
   {
   System.out.println(name+ "    " + email);
   }
  
  

   public static void main(String [] args)
    {
      Employee e1=new Employee();
      Employee e2=new Employee();
      Employee e3=new Employee();

     e1.name="jyoti";
     e1.email="jyoti@gmail.com";
	
      e2.name="shruti ";
     e2.email="shruti@gmail.com";
 
     e3.name="prathmesh";
     e3.email="prathmesh@gmail.com";
 
     e1.displaydata();
      e2.displaydata();
      e3.displaydata();
   }
}
 