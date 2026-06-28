import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("          JAVA AI CHATBOT");
        System.out.println("==========================================");

        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        System.out.println("Hello " + userName + "! Welcome.");
        System.out.println("Type 'help' to see available commands.");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String message = sc.nextLine().trim().toLowerCase();

            if (message.equals("help")) {
                System.out.println("\nAvailable Commands:");
                System.out.println("hello");
                System.out.println("hi");
                System.out.println("how are you");
                System.out.println("what is your name");
                System.out.println("who created you");
                System.out.println("what is java");
                System.out.println("what is ai");
                System.out.println("what is oops");
                System.out.println("good morning");
                System.out.println("good afternoon");
                System.out.println("good evening");
                System.out.println("thank you");
                System.out.println("tell me a joke");
                System.out.println("date");
                System.out.println("time");
                System.out.println("calculator");
                System.out.println("bye");
            }

            else if (message.equals("hello") || message.equals("hi")) {
                System.out.println("Bot: Hello " + userName + "! How can I help you?");
            }

            else if (message.equals("how are you")) {
                System.out.println("Bot: I am doing great! Thanks for asking.");
            }

            else if (message.equals("what is your name")) {
                System.out.println("Bot: My name is Java AI ChatBot.");
            }

            else if (message.equals("who created you")) {
                System.out.println("Bot: I was created using Java programming.");
            }

            else if (message.equals("what is java")) {
                System.out.println("Bot: Java is a popular object-oriented programming language.");
            }

            else if (message.equals("what is ai")) {
                System.out.println("Bot: AI stands for Artificial Intelligence.");
            }

            else if (message.equals("what is oops")) {
                System.out.println("Bot: OOPS stands for Object-Oriented Programming System.");
            }

            else if (message.equals("good morning")) {
                System.out.println("Bot: Good Morning " + userName + "!");
            }

            else if (message.equals("good afternoon")) {
                System.out.println("Bot: Good Afternoon!");
            }

            else if (message.equals("good evening")) {
                System.out.println("Bot: Good Evening!");
            }

            else if (message.equals("thank you") || message.equals("thanks")) {
                System.out.println("Bot: You're welcome!");
            }

            else if (message.equals("tell me a joke")) {
                System.out.println("Bot: Why do Java developers wear glasses?");
                System.out.println("Bot: Because they don't C#!");
            }

            else if (message.equals("date")) {
                System.out.println("Bot: Today's Date is " + LocalDate.now());
            }

            else if (message.equals("time")) {
                System.out.println("Bot: Current Time is " + LocalTime.now().withNano(0));
            }

            else if (message.equals("calculator")) {

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                sc.nextLine();

                System.out.print("Enter operator (+ - * /): ");
                String op = sc.nextLine();

                switch (op) {

                    case "+":
                        System.out.println("Answer = " + (a + b));
                        break;

                    case "-":
                        System.out.println("Answer = " + (a - b));
                        break;

                    case "*":
                        System.out.println("Answer = " + (a * b));
                        break;

                    case "/":
                        if (b != 0)
                            System.out.println("Answer = " + (a / b));
                        else
                            System.out.println("Cannot divide by zero.");
                        break;

                    default:
                        System.out.println("Invalid operator.");
                }
            }

            else if (message.equals("bye")) {
                System.out.println("Bot: Goodbye " + userName + "! Have a wonderful day.");
                break;
            }

            else {
                System.out.println("Bot: Sorry! I don't understand that question.");
                System.out.println("Bot: Type 'help' to see all available commands.");
            }
        }

        sc.close();
    }
}