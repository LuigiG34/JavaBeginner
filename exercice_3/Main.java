package exercice_3;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

import exercice_3.models.User;


public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create 5 users
        User user1 = new User(1L, "johndoe@example.com");
        User user2 = new User(2L, "janesmith@example.com");
        User user3 = new User(3L, "bobwilson@example.com");
        User user4 = new User(4L, "alicebrown@example.com");
        User user5 = new User(5L, "charliejones@example.com");

        // Store users in a List
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        // Create a Map where the key is the user ID and the value is the user
        Map<Long, User> userMap = new HashMap<>();
        for (User user : users) {
            userMap.put(user.getId(), user);
        }

        // Store emails in a Set to ensure uniqueness
        Set<String> emailSet = new HashSet<>();
        for (User user : users) {
            emailSet.add(user.getEmail());
        }

        // Add same email twice to make sure the Set only keeps unique emails
        emailSet.add("johndoe@example.com");

        // Print the results
        System.out.println("Users:");
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("\nUser Map:");
        for (Map.Entry<Long, User> entry : userMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", User: " + entry.getValue());
        }

        System.out.println("\nUnique Emails:");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }

}
