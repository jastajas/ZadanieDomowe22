import java.util.Scanner;

public class UsersSet {

        private static Scanner sc;


        public static boolean contains(User[] users, User userToCheck){

            boolean isDuplicate = false;

            for (int i = 0; i < users.length; i++) {
                if (userToCheck.equals(users[i])) {
                    isDuplicate = true;
                    System.out.println("Duplikat.");
                    break;
                }
            }
            return isDuplicate;
        }


        public static User inputUser(){

            sc = new Scanner(System.in);

            System.out.println("Podaj imię:");
            String nameUser = sc.nextLine();
            System.out.println("Podaj wiek:");
            int ageUser = sc.nextInt();

            return new User(nameUser, ageUser);
        }

    }
