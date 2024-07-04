/**
 * UserStream
 */
public class UserStream {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Desmond", "Mark"),
                new User("Nelson", "Bent"),
                new User("Joel", "Mark"),
                new User("Jude", "Bent")
        );

        List<User> filteredUsers = users.stream()
                .filter(user -> !user.getGroupName().equals("Mark"))
                .collect(Collectors.toList());
                //nelson bent
                //Jude bent

        filteredUsers.forEach(System.out::println);
    }
}