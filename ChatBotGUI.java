import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class ChatBotGUI extends JFrame {

    JTextArea chatArea;
    JTextField inputField;
    JButton sendButton;

    public ChatBotGUI() {

        setTitle("Java AI ChatBot");
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 15));

        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();
        sendButton = new JButton("Send");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! Welcome to Java AI ChatBot.\n");
        chatArea.append("Bot: Type 'help' to see available commands.\n\n");

        sendButton.addActionListener(e -> reply());
        inputField.addActionListener(e -> reply());

        setVisible(true);
    }

    private void reply() {

        String msg = inputField.getText().trim().toLowerCase();

        if (msg.isEmpty())
            return;

        chatArea.append("You: " + msg + "\n");

        if (msg.equals("help")) {

            chatArea.append(
                "Bot: Available commands:\n" +
                "- hi\n" +
                "- hello\n" +
                "- how are you\n" +
                "- what is your name\n" +
                "- who created you\n" +
                "- what is java\n" +
                "- what is ai\n" +
                "- what is oops\n" +
                "- good morning\n" +
                "- good afternoon\n" +
                "- good evening\n" +
                "- thank you\n" +
                "- tell me a joke\n" +
                "- date\n" +
                "- time\n" +
                "- bye\n\n"
            );
        }

        else if (msg.contains("hi") || msg.contains("hello"))
            chatArea.append("Bot: Hello! How can I help you?\n");

        else if (msg.contains("how are you"))
            chatArea.append("Bot: I'm doing great! Thanks for asking.\n");

        else if (msg.contains("your name"))
            chatArea.append("Bot: My name is Java AI ChatBot.\n");

        else if (msg.contains("who created you"))
            chatArea.append("Bot: I was created using Java programming.\n");

        else if (msg.contains("java"))
            chatArea.append("Bot: Java is a powerful object-oriented programming language.\n");

        else if (msg.contains("ai"))
            chatArea.append("Bot: AI stands for Artificial Intelligence.\n");

        else if (msg.contains("oops"))
            chatArea.append("Bot: OOPS means Object-Oriented Programming System.\n");

        else if (msg.contains("good morning"))
            chatArea.append("Bot: Good Morning! Have a wonderful day.\n");

        else if (msg.contains("good afternoon"))
            chatArea.append("Bot: Good Afternoon!\n");

        else if (msg.contains("good evening"))
            chatArea.append("Bot: Good Evening!\n");

        else if (msg.contains("thank"))
            chatArea.append("Bot: You're welcome!\n");

        else if (msg.contains("date"))
            chatArea.append("Bot: Today's date is " + LocalDate.now() + "\n");

        else if (msg.contains("time"))
            chatArea.append("Bot: Current time is " + LocalTime.now().withNano(0) + "\n");

        else if (msg.contains("joke")) {
            chatArea.append("Bot: Why do Java developers wear glasses?\n");
            chatArea.append("Bot: Because they don't C#!\n");
        }

        else if (msg.contains("bye")) {
            chatArea.append("Bot: Goodbye! Have a nice day.\n");
        }

        else {
            chatArea.append("Bot: Sorry! I don't understand that.\n");
            chatArea.append("Bot: Type 'help' to see available commands.\n");
        }

        chatArea.append("\n");
        inputField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChatBotGUI());
    }
}