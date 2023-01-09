public class Driver extends User{

   public Driver(String name, String profession, int userID){
       super(name,profession,userID);
   }
   public Driver(){
       super();
   }

   public void service(){
       System.out.println("Drives from point A to point B");
   }

}
