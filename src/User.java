public class User implements UserService{

    private String name;
    private String profession;
    private int userID;


    public User(String name, String profession, int userID){
        this.name = name;
        this.profession = profession;
        this.userID = userID;
    }

    public User(){

    }


    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Profession: " + getProfession());
        System.out.println("ID: " + getUserID());
    }





    public void service(){
        System.out.println("The user does not provide any service");
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
