package funcionalCloneBuilder;

public class Client {


    public static void main(String[] args) {

        User user = new User("Clone1", 25, new Address("ABC Street",1000));
        System.out.println(user);

        User cloneUser = user.cloneBuilder().withName("CloneX").now();
        System.out.println(cloneUser);

        User anotherUser = cloneUser.cloneBuilder()
                .withName("Clone X")
                .withAge(25)
                .withAddress(new Address("Back Street",7))
                .now();

        System.out.println(anotherUser);


    }
}
