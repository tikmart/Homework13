public class Developer extends User{

    public Developer(){
        super();
    }

    public Developer(String name, String profession, int userID){
        super(name, profession, userID);
    }

    public void service(){
        System.out.println("Writes code");
    }

}
