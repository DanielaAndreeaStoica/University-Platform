import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class LogIn {

    JFrame frameLogIn;
    Connection connect;
    Statement statement;
    ResultSet resultSet;
    int id;

    public LogIn(Connection connection, Statement statement) {
        this.connect = connection;
        this.statement = statement;
        initialize();
    }

    private void initialize() {
        frameLogIn = new JFrame();
        frameLogIn.setResizable(false);
        frameLogIn.getContentPane().setBackground(SystemColor.activeCaption);
        frameLogIn.setBounds(100, 100, 450, 300);
        frameLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLogIn.getContentPane().setLayout(null);
        frameLogIn.setLocationRelativeTo(frameLogIn);

        TextField usernameText = new TextField();
        usernameText.setBounds(201, 96, 120, 21);
        frameLogIn.getContentPane().add(usernameText);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(201, 148, 120, 21);
        frameLogIn.getContentPane().add(passwordText);

        Button logButton = new Button("Log in");
        logButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String password;
                    String username = usernameText.getText();
                    statement = connect.createStatement();
                    resultSet = statement.executeQuery("select * from informatii_logare where username='" + username + "';");
                    resultSet.next();
                    password = resultSet.getString(3);

                    if (passwordText.getText().equals(password)) {
                        JOptionPane.showMessageDialog(logButton, "Logare reusita");
                        String query = "select u.tipUtilizator from informatii_logare il join utilizator u on il.idUtilizator=u.idUtilizator where il.username = '";
                        query = query + username + "';";
                        PreparedStatement preparedStmt = connect.prepareStatement(query);
                        preparedStmt.execute();
                        resultSet = statement.executeQuery(query);
                        resultSet.next();
                        String tipU = resultSet.getString(1);
                        if (tipU.equals("student")) {
                            query = "select s.idStudent from informatii_logare il join utilizator u on il.idUtilizator=u.idUtilizator join student s on u.idUtilizator=s.idUtilizator where il.username='";
                            query = query + username + "';";
                            resultSet = statement.executeQuery(query);
                            resultSet.next();
                            id = resultSet.getInt(1);
                            Student window = new Student(connect, statement, id);
                            window.frmStudent.setVisible(true);
                            frameLogIn.setVisible(false);
                        } else if (tipU.equals("profesor")) {
                            query = "select p.idProfesor from informatii_logare il join utilizator u on il.idUtilizator=u.idUtilizator join profesor p on u.idUtilizator=p.idUtilizator where il.username='";
                            query = query + username + "';";
                            resultSet = statement.executeQuery(query);
                            resultSet.next();
                            id = resultSet.getInt(1);
                            Profesor window = new Profesor(connect,statement,id);
                            window.frmProfesor.setVisible(true);
                            frameLogIn.setVisible(false);
                        } else {

                        }
                    } else {
                        JOptionPane.showMessageDialog(logButton, "Date de logare gresite!", "Error", 0);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(logButton, "Date de logare gresite!", "Error", 0);
                    System.out.println("SQLException: " + e.getMessage());
                    System.out.println("SQLState: " + ((SQLException) e).getSQLState());
                    System.out.println("VendorError: " + ((SQLException) e).getErrorCode());
                }
            }
        });
        logButton.setBounds(103, 198, 66, 21);
        frameLogIn.getContentPane().add(logButton);


        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        usernameLabel.setBounds(103, 96, 98, 21);
        frameLogIn.getContentPane().add(usernameLabel);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        passwordLabel.setBounds(103, 146, 88, 21);
        frameLogIn.getContentPane().add(passwordLabel);

        JLabel imageUTCN = new JLabel("");
        imageUTCN.setIcon(new ImageIcon("D:\\New folder\\workspace\\Proiect\\image.png"));
        imageUTCN.setBounds(105, -41, 192, 128);
        frameLogIn.getContentPane().add(imageUTCN);

        Button signButton = new Button("Sign in");
        signButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    SignIn window = new SignIn(connect, statement);
                    window.frameSignIn.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                frameLogIn.setVisible(false);
            }
        });
        signButton.setBounds(255, 198, 66, 21);
        frameLogIn.getContentPane().add(signButton);
    }
}
