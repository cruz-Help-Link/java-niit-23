public class UserNameOptional {

    private final List<User> opUsers = Arrays.asList(new User("1", "Munirat"), new User("2", "Joffery"),
            new User("3", "Stanley"));

    public Optional<User> findById(String id) {

        for (User u : dbUsers) {
            if (u.getId().equals(id)) {
                return Optional.of(u);
            }
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        User u = new User(4, "Mia");
        
    }
}