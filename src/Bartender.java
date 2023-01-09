public class Bartender extends User{

    public Bartender(){
        super();
    }

    public Bartender(String name, String profession, int userID){
        super(name,profession,userID);
    }

    public void service(){
        System.out.println("Makes some good cocktails");
    }
}
