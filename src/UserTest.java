public class UserTest {
    public static void main(String[] args) {

        User[] users = new User[3];

        for(int i=0; i<users.length; i++){

            User tempUser = UsersSet.inputUser();

            if (!(UsersSet.contains(users, tempUser))){
                users[i] = tempUser;
            } else {
                i--;
            }
        }

        for(User usersObj : users){
            System.out.println(usersObj.toString());
        }
    }
}
