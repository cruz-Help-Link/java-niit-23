public class Playing {
    public static void main(String[] args) {
        // User user = null;
        // User user2 = new User("anna@gmail.com", "1234");
        // User result = Optional.ofNullable(user).orElse(user2);

        // assertEquals(user2.getEmail(), result.getEmail());

        String users = "john@gmail.com";
        Optional<String> opt = Optional.of(users);
        assertTrue(opt.isPresent());

    assertEquals(opt.get());

    User user = null;
    logger.debug("Using orElse");
    String result = Optional.ofNullable(user).orElse(createNewUser());
    logger.debug("Using orElseGet");
    User result2 = Optional.ofNullable(user).orElseGet(() -> createNewUser());
}

    private static String createNewUser() {
        logger.debug("Creating New User");
        return new User("extra@gmail.com", "1234");
    }
}
