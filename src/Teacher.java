public class Teacher extends User{

    public Teacher(){
        super();
    }

    public Teacher(String name, String profession, int userID){
        super(name,profession,userID);
    }

   public void service(){
       System.out.println("Teaches math");
   }

}
