public class UserTest {
    public static void main(String[] args) {

        User[] users = new User[3];

        for(int i=0; i<users.length; i++){

            User tempUser = null;
            do {
                tempUser = UsersSet.inputUser();
            } while (UsersSet.contains(users, tempUser));

            users[i] = tempUser;
        }

        for(User usersObj : users){
            System.out.println(usersObj.toString());
        }
    }
}
