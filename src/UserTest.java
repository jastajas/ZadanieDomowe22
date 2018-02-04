public class UserTest {
    public static void main(String[] args) {

        User[] users = new User[6];
        users[0] = new User("Jacek",31);
        users[1] = new User("Karol",24);
        users[2] = new User("Alicja",43);

        boolean iSduplicate = false;

        User tempUser;

        do {
            tempUser = User.addUser();
            iSduplicate = false;
            for (int i = 0; i < users.length; i++) {
                if (tempUser.equals(users[i])) {
                    iSduplicate = true;
                    break;
                }
            }
        } while (iSduplicate == true);

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null){
                users[i] = tempUser;
                System.out.println(tempUser.toString());
                System.out.println(i);
                break;
            }
        }

    }
}
