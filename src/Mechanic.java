public class Mechanic extends User{
    public Mechanic(){
        super();
    }
    public Mechanic(String name, String profession, int userID){
        super(name, profession, userID);
    }

    public void service(){
        System.out.println("Fixes Cars");
    }
}
