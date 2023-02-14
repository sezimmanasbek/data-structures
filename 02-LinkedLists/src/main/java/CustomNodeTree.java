public class CustomNodeTree {

    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    CustomNodeTree left;
    CustomNodeTree right;

    public CustomNodeTree(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
