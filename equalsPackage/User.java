package equalsPackage;

import java.util.Objects;

public class User {
    String name;
    Address address;

    public User() {
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(address, user.address);
    }

    public static void main(String[] args) {
        User user1 = new User("小王",new Address("重庆","观音桥"));
        User user2 = new User("小王",new Address("重庆","观音桥"));
        System.out.println(user1.equals(user2));

    }

}
