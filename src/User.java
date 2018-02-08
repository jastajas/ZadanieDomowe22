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

    public int getAge() {
        return age;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
