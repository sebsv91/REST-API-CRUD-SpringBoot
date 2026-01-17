package API.Rest.Springboot.Model;

public class User {
    private String username;
    private int age;
    private int id;

    public User(String username, int age, int id){
        this.username = username;
        this.age = age;
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
