import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.sql.*;

public class SignIn {
    Connection connect;
    Statement statement;
    ResultSet resultSet;

    JFrame frameSignIn;
    private JTextField numeText;
    private JTextField prenumeText;
    private JTextField userText;
    private JTextField passText;
    private JTextField cnpText;
    private JTextField telefonText;
    private JTextField ibanText;
    private JTextField contractText;
    private JPasswordField passText1;
    private JButton createButton;
    private JTextArea adresaText;
    private JTextField emailText;
    private JRadioButton studentRB = new JRadioButton("");
    private JRadioButton profesorRB = new JRadioButton("");
    private JTextField date1Text;
    private JTextField date2Text;

    public SignIn(Connection connection,Statement statement) {
        this.connect = connection;
        this.statement=statement;
        initialize();
    }

    @SuppressWarnings("deprecation")
    private void initialize() {
        frameSignIn = new JFrame();
        frameSignIn.getContentPane().setBackground(SystemColor.inactiveCaption);
        frameSignIn.setBounds(100, 100, 504, 552);
        frameSignIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameSignIn.getContentPane().setLayout(null);
        frameSignIn.setLocationRelativeTo(frameSignIn);

        numeText = new JTextField();
        numeText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        numeText.setBounds(181, 37, 187, 21);
        frameSignIn.getContentPane().add(numeText);
        numeText.setColumns(10);

        JLabel numeLabel = new JLabel("Nume");
        numeLabel.setBounds(51, 40, 103, 19);
        frameSignIn.getContentPane().add(numeLabel);

        JLabel prenumeLabel = new JLabel("Prenume");
        prenumeLabel.setBounds(51, 69, 103, 19);
        frameSignIn.getContentPane().add(prenumeLabel);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(51, 98, 103, 19);
        frameSignIn.getContentPane().add(userLabel);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(51, 127, 103, 19);
        frameSignIn.getContentPane().add(passLabel);

        JLabel cnpLabel = new JLabel("CNP");
        cnpLabel.setBounds(51, 156, 103, 19);
        frameSignIn.getContentPane().add(cnpLabel);

        JLabel adresaLabel = new JLabel("Adresa");
        adresaLabel.setBounds(51, 188, 103, 19);
        frameSignIn.getContentPane().add(adresaLabel);

        JLabel telefonLabel = new JLabel("Numar de telefon");
        telefonLabel.setBounds(51, 265, 103, 19);
        frameSignIn.getContentPane().add(telefonLabel);

        adresaText = new JTextArea();
        adresaText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        adresaText.setBounds(181, 190, 187, 62);
        frameSignIn.getContentPane().add(adresaText);

        JLabel ibanLabel = new JLabel("Cont IBAN");
        ibanLabel.setBounds(51, 298, 103, 19);
        frameSignIn.getContentPane().add(ibanLabel);

        JLabel contractLabel = new JLabel("Numar de contract");
        contractLabel.setBounds(51, 327, 119, 19);
        frameSignIn.getContentPane().add(contractLabel);

        final JLabel atentie = new JLabel("Toate campurile sunt obligatorii!");
        atentie.setFont(new Font("Tahoma", Font.PLAIN, 16));
        atentie.setForeground(Color.RED);
        atentie.setBounds(130, 453, 238, 29);
        atentie.setVisible(false);
        frameSignIn.getContentPane().add(atentie);

        passText1 = new JPasswordField();
        passText1.setBounds(181, 127, 187, 19);
        frameSignIn.getContentPane().add(passText1);

        emailText = new JTextField();
        emailText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        emailText.setColumns(10);
        emailText.setBounds(181, 10, 187, 21);
        frameSignIn.getContentPane().add(emailText);

        JLabel emailLabel = new JLabel("E-mail");
        emailLabel.setBounds(51, 15, 103, 19);
        frameSignIn.getContentPane().add(emailLabel);

        final JRadioButton seePassRadioButton = new JRadioButton("");
        seePassRadioButton.setBackground(SystemColor.inactiveCaption);
        seePassRadioButton.setBounds(374, 127, 21, 21);
        seePassRadioButton.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent arg0) {
                if (seePassRadioButton.isSelected()) {
                    passText.setVisible(true);
                    passText.setText(passText1.getText());
                    passText1.setVisible(false);
                } else {
                    passText1.setVisible(true);
                    passText1.setText(passText.getText());
                    passText.setVisible(false);
                }
            }
        });
        frameSignIn.getContentPane().add(seePassRadioButton);

        date1Text = new JTextField();
        date1Text.setBounds(376, 356, 38, 19);
        date1Text.setVisible(false);
        frameSignIn.getContentPane().add(date1Text);
        date1Text.setColumns(10);

        date2Text = new JTextField();
        date2Text.setBounds(376, 379, 38, 19);
        date2Text.setVisible(false);
        frameSignIn.getContentPane().add(date2Text);
        date2Text.setColumns(10);

        JLabel date1Label = new JLabel("New label");
        date1Label.setBounds(281, 359, 85, 13);
        date1Label.setVisible(false);
        frameSignIn.getContentPane().add(date1Label);

        JLabel date2Label = new JLabel("New label");
        date2Label.setBounds(281, 382, 85, 13);
        date2Label.setVisible(false);
        frameSignIn.getContentPane().add(date2Label);


        createButton = new JButton("Create");
        createButton.addActionListener(new ActionListener() {
            @SuppressWarnings("static-access")
            public void actionPerformed(ActionEvent arg0) {
                if (createProcess()==false) {
                    atentie.setVisible(true);
                } else {
                    try {
                        int tipUser=0;
                        String query = "INSERT INTO `proiect`.`utilizator` (`tipUtilizator`, `CNP`, `nume`, `prenume`, `adresa`, `numarTelefon`, `email`, `IBAN`, `nrContract`) VALUES (";
                        if(studentRB.isSelected()) {
                            tipUser=1;
                            query = query + "'student',";
                        }
                        else if(profesorRB.isSelected()) {
                            tipUser=2;
                            query = query + "'profesor',";
                        }
                        query=query+"'"+cnpText.getText()+"',";
                        query=query+"'"+numeText.getText()+"',";
                        query=query+"'"+prenumeText.getText()+"',";
                        query=query+"'"+adresaText.getText()+"',";
                        query=query+"'"+telefonText.getText()+"',";
                        query=query+"'"+emailText.getText()+"',";
                        query=query+"'"+ibanText.getText()+"',";
                        query=query+"'"+contractText.getText()+"');";

                        PreparedStatement preparedStmt = connect.prepareStatement(query);
                        preparedStmt.execute();

                        statement = connect.createStatement();
                        resultSet = statement.executeQuery("select max(idUtilizator) from utilizator;");
                        resultSet.next();
                        int id = resultSet.getInt(1);

                        query="insert into informatii_logare(idUtilizator,username,password) values('"+String.valueOf(id)+"','";
                        query=query+userText.getText()+"','";
                        if(seePassRadioButton.isSelected())query=query+passText.getText()+"');";
                        else query=query+passText1.getText()+"');";
                        PreparedStatement preparedStmt2 = connect.prepareStatement(query);
                        preparedStmt2.execute();

                        if(tipUser==1){
                            query="insert into student(idUtilizator,oreSustinute,an) values('"+String.valueOf(id)+"','"
                                    +date2Text.getText()+"','"+date1Text.getText()+"');";
                        }else{
                            query="insert into profesor(idUtilizator,minim_ore,maxim_ore) values('"+String.valueOf(id)+"','"
                                    +date1Text.getText()+"','"+date2Text.getText()+"');";
                        }
                        PreparedStatement preparedStmt3 = connect.prepareStatement(query);
                        preparedStmt3.execute();

                    } catch (Exception e) {
                        System.out.println("SQLException: " + e.getMessage());
                        System.out.println("SQLState: " + ((SQLException) e).getSQLState());
                        System.out.println("VendorError: " + ((SQLException) e).getErrorCode());
                    }
                    JOptionPane created = new JOptionPane();
                    created.showMessageDialog(createButton, "Contul a fost creat!", "Message", 1);
                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            LogIn window = new LogIn(connect,statement);
                            window.frameLogIn.setVisible(true);
                        }
                    });
                    frameSignIn.setVisible(false);
                }
            }

        });
        createButton.setBounds(197, 422, 85, 21);
        frameSignIn.getContentPane().add(createButton);

        prenumeText = new JTextField();
        prenumeText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        prenumeText.setColumns(10);
        prenumeText.setBounds(181, 69, 187, 21);
        frameSignIn.getContentPane().add(prenumeText);

        userText = new JTextField();
        userText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        userText.setColumns(10);
        userText.setBounds(181, 98, 187, 21);
        frameSignIn.getContentPane().add(userText);

        passText = new JTextField();
        passText.setText("1");
        passText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        passText.setColumns(10);
        passText.setVisible(false);
        passText.setBounds(181, 127, 187, 19);
        frameSignIn.getContentPane().add(passText);

        cnpText = new JTextField();
        cnpText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        cnpText.setColumns(10);
        cnpText.setBounds(181, 156, 187, 21);
        frameSignIn.getContentPane().add(cnpText);

        telefonText = new JTextField();
        telefonText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        telefonText.setColumns(10);
        telefonText.setBounds(181, 262, 187, 21);
        frameSignIn.getContentPane().add(telefonText);

        ibanText = new JTextField();
        ibanText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        ibanText.setColumns(10);
        ibanText.setBounds(181, 293, 187, 21);
        frameSignIn.getContentPane().add(ibanText);

        contractText = new JTextField();
        contractText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        contractText.setColumns(10);
        contractText.setBounds(181, 324, 187, 21);
        frameSignIn.getContentPane().add(contractText);

        JLabel lblUtilizator = new JLabel("Utilizator");
        lblUtilizator.setBounds(51, 356, 85, 19);
        frameSignIn.getContentPane().add(lblUtilizator);

        studentRB.setBackground(SystemColor.inactiveCaption);
        studentRB.setBounds(167, 354, 21, 21);
        studentRB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (studentRB.isSelected()) {
                    profesorRB.setSelected(false);
                    date1Label.setVisible(true);
                    date1Label.setText("Ore sustinute:");
                    date2Label.setVisible(true);
                    date2Label.setText("An:");
                    date1Text.setVisible(true);
                    date1Text.setText("30");
                    date2Text.setVisible(true);
                    date2Text.setText("1");
                }
            }
        });
        frameSignIn.getContentPane().add(studentRB);

        profesorRB.setBackground(SystemColor.inactiveCaption);
        profesorRB.setBounds(228, 354, 21, 21);
        profesorRB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (profesorRB.isSelected()) {
                    studentRB.setSelected(false);
                    date1Label.setVisible(true);
                    date1Label.setText("Minim ore:");
                    date2Label.setVisible(true);
                    date2Label.setText("Maxim ore:");
                    date1Text.setVisible(true);
                    date2Text.setVisible(true);
                    date2Text.setText("30");
                    date1Text.setText("20");
                }
            }
        });
        frameSignIn.getContentPane().add(profesorRB);

        JLabel lblNewLabel = new JLabel("student");
        lblNewLabel.setBounds(163, 382, 45, 13);
        frameSignIn.getContentPane().add(lblNewLabel);

        JLabel lblProfesor = new JLabel("profesor");
        lblProfesor.setBounds(218, 382, 63, 13);
        frameSignIn.getContentPane().add(lblProfesor);


        JMenuBar menuBar = new JMenuBar();
        frameSignIn.setJMenuBar(menuBar);

        JButton btnNewButton = new JButton("back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            LogIn window = new LogIn(connect,statement);
                            window.frameLogIn.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                frameSignIn.setVisible(false);
            }
        });
        menuBar.add(btnNewButton);


    }

    boolean radioButtonsSelected() {
        if (studentRB.isSelected()) return true;
        else if (profesorRB.isSelected()) return true;
        else return false;
    }

    boolean createProcess() {
        if (emailText.getText().equals("") || numeText.getText().equals("") || prenumeText.getText().equals("") || cnpText.getText().equals("") || ibanText.getText().equals("") || userText.getText().equals("") || (passText.getText().equals("") || passText1.getText().equals("")) || telefonText.getText().equals("") || !radioButtonsSelected())
            return false;
        return true;

    }
}
