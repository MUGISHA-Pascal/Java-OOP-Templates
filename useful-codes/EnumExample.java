enum Role {
    ADMIN, USER, GUEST
}

public class EnumExample {
    public static void main(String[] args) {
        Role role = Role.ADMIN;
        switch (role) {
            case ADMIN -> System.out.println("You are an admin.");
            case USER -> System.out.println("You are a user.");
            case GUEST -> System.out.println("You are a guest.");
        }
    }
}