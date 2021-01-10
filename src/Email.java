import java.util.Scanner;

public class Email {
    // Create objects of private
    // Создаем приватные объекты
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // Constructor to receive the first name and last name
    // Конструктор чтобы получать фамулию и имю
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();

        // Call a method that returns a random password
        // Вызов метода который возвращает случайные числа пароля
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        // Комбинируем элементов чтобы генерировать эл.почту
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    // Ask for the department
    // Запрос для отделения
    private String setDepartment() {
        System.out.print("New worker: " + firstName + ". \nDepartment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Generate a random password
    // Генерируем случайных чисел пароля
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIGKLMNOPRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    // Устанавливаем объем эл.ящика
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    // Устанавливаем алтернативную почту
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    // изменяем пароль
    public void changePassword(String password) {
        this.password = password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "Mb";
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
}