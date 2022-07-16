package ExAmple;

public class User extends Object {
    protected String name;
    protected int age;

    public User(String  name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){

        return "Hello: " + name + ". Your age: " + age ;

        s
    }
}


