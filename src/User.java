import java.util.Scanner;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof User)){
            return false;
        }
        User userCompare = (User) obj;
        if (name == null){
            if (userCompare.name != null){
                return false;
            }
        } else if (!(name.equals(userCompare.name))){
            return false;
        }
        if (age != userCompare.age){
            return false;
        }
        return true;
    }

    public static User addUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię i wiek:");
        return new User(sc.nextLine(), sc.nextInt());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
