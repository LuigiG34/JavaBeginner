package exercice_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

import exercice_4.model.User;
import exercice_4.enums.Status;
import exercice_4.dto.UserDto;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create 10 users with different statuses and email providers
        User user1 = new User(1L, "johndoe@gmail.com", Status.ACTIVE);
        User user2 = new User(2L, "janesmith@example.com", Status.INACTIVE);
        User user3 = new User(3L, "bobwilson@example.com", Status.BANNED);
        User user4 = new User(4L, "alicebrown@gmail.com", Status.ACTIVE);
        User user5 = new User(5L, "charliejones@example.com", Status.INACTIVE);
        User user6 = new User(6L, "davidlee@gmail.com", Status.BANNED);
        User user7 = new User(7L, "emilydavis@example.com", Status.ACTIVE);
        User user8 = new User(8L, "frankmiller@gmail.com", Status.INACTIVE);
        User user9 = new User(9L, "gracewhite@example.com", Status.BANNED);
        User user10 = new User(10L, "johndoe@gmail.com", Status.ACTIVE);

        // Add users to a List
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        // Recuperate only the active users
        System.out.println("List of active users:");
        List<User> activeUsers = users.stream()
                .filter(user -> user.getStatus() == Status.ACTIVE)
                .toList();
        System.out.println(activeUsers);

        // Recuperate a list of all the users email adresses
        System.out.println("List of all users email addresses:");
        List<String> emails = users.stream()
                .map(user -> user.getEmail())
                .toList();
        System.out.println(emails);

        // Recuperate only the gmail users
        System.out.println("List of gmail users:");
        List<User> gmailUsers = users.stream()
                .filter(user -> user.getEmail().endsWith("@gmail.com"))
                .toList();
        System.out.println(gmailUsers);

        // Count number of inactive users
        System.out.println("Number of inactive users:");
        long inactiveUserCount = users.stream()
                .filter(user -> user.getStatus() == Status.INACTIVE)
                .count();
        System.out.println(inactiveUserCount);

        // Check if at least one user is banned
        System.out.println("Is there at least one banned user?");
        boolean hasBannedUsers = users.stream()
                .anyMatch(user -> user.getStatus() == Status.BANNED);
        System.out.println(hasBannedUsers);

        // Sort users by email address
        System.out.println("List of users sorted by email address:");
        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(user -> user.getEmail()))
                .toList();
        System.out.println(sortedUsers);

        // Transform all active users to UserDto
        System.out.println("List of active users transformed to UserDto:");
        List<UserDto> activeUserDtos = activeUsers.stream()
                .map(user -> new UserDto(user.getId(), user.getEmail()))
                .toList();
        System.out.println(activeUserDtos);

        // Recuperate the unique emails, without duplicates
        System.out.println("List of unique email addresses:");
        List<String> uniqueEmails = users.stream()
                .map(user -> user.getEmail())
                .distinct()
                .toList();
        System.out.println(uniqueEmails);
    }
    
}