public class EmailApp {
    public static void main(String[] args) {
        Email em = new Email("John", "Smith");

        System.out.println(em.showInfo());

        em.setAlternateEmail("js@gmail.com");
        System.out.println("Your alternate email is: " + em.getAlternateEmail());
    }
}