public class User {
    private String name;
    private String groupName;

    public User(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
