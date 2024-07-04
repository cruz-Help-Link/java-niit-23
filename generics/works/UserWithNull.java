public class UserWithNull{

    private final List<User> dbUsers = Arrays.asList(new User("1", "John"), new User("2", "Maria"), new User("3", "Daniel"));

    public User findById(String id) {

        for (User u : dbUsers) {
            if (u.getId().equals(id)) {
                return u;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        UserWithNull uw = new UserWithNull();
        User u = new User();
        u.getId();
        // uw.findById(null);
    }
}