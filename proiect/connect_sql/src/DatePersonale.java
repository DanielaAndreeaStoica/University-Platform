import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatePersonale {
    Connection connect;
    Statement statement;
    ResultSet resultSet;
    int idUtilizator;
    JFrame frmDatePersonale;
    private JTextField numeTxt;
    private JTextField cnpTxt;
    private JTextField telTxt;
    private JTextField mailTxt;
    private JTextField ibanTxt;
    private JTextField contractTxt;


    public DatePersonale(Connection connection, Statement statement, int id) {
        this.idUtilizator = id;
        try {
            String query = "select * from utilizator u where u.idUtilizator=";
            query = query + String.valueOf(id) + ";";
            resultSet = statement.executeQuery(query);
            resultSet.next();
        } catch (SQLException e) {
            e.getMessage();
        }
        this.connect = connection;
        this.statement = statement;
        try {
            initialize();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    private void initialize() throws SQLException {
        frmDatePersonale = new JFrame();
        frmDatePersonale.getContentPane().setBackground(SystemColor.inactiveCaption);
        frmDatePersonale.setTitle("Date personale");
        frmDatePersonale.setBounds(100, 100, 450, 474);
        frmDatePersonale.setLocationRelativeTo(frmDatePersonale);
        frmDatePersonale.getContentPane().setLayout(null);

        JLabel numeLabel = new JLabel("Nume Prenume");
        numeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        numeLabel.setBounds(37, 33, 90, 24);
        frmDatePersonale.getContentPane().add(numeLabel);

        numeTxt = new JTextField();
        numeTxt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        numeTxt.setBackground(Color.WHITE);
        numeTxt.setEditable(false);
        numeTxt.setText("" + resultSet.getString(4) + " " + resultSet.getString(5));
        numeTxt.setBounds(176, 31, 200, 26);
        frmDatePersonale.getContentPane().add(numeTxt);
        numeTxt.setColumns(10);

        cnpTxt = new JTextField();
        cnpTxt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        cnpTxt.setEditable(false);
        cnpTxt.setText("" + resultSet.getString(3));
        cnpTxt.setColumns(10);
        cnpTxt.setBackground(Color.WHITE);
        cnpTxt.setBounds(176, 77, 200, 26);
        frmDatePersonale.getContentPane().add(cnpTxt);

        telTxt = new JTextField();
        telTxt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        telTxt.setEditable(false);
        telTxt.setText("" + resultSet.getString(7));
        telTxt.setColumns(10);
        telTxt.setBackground(Color.WHITE);
        telTxt.setBounds(176, 193, 200, 26);
        frmDatePersonale.getContentPane().add(telTxt);

        mailTxt = new JTextField();
        mailTxt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        mailTxt.setEditable(false);
        mailTxt.setText("" + resultSet.getString(8));
        mailTxt.setColumns(10);
        mailTxt.setBackground(Color.WHITE);
        mailTxt.setBounds(176, 239, 200, 26);
        frmDatePersonale.getContentPane().add(mailTxt);

        ibanTxt = new JTextField();
        ibanTxt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        ibanTxt.setEditable(false);
        ibanTxt.setColumns(10);
        ibanTxt.setBackground(Color.WHITE);
        ibanTxt.setText("" + resultSet.getString(9));
        ibanTxt.setBounds(176, 287, 200, 26);
        frmDatePersonale.getContentPane().add(ibanTxt);

        contractTxt = new JTextField();
        contractTxt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        contractTxt.setEditable(false);
        contractTxt.setText("" + String.valueOf(resultSet.getInt(10)));
        contractTxt.setColumns(10);
        contractTxt.setBackground(Color.WHITE);
        contractTxt.setBounds(176, 331, 200, 26);
        frmDatePersonale.getContentPane().add(contractTxt);

        JLabel cnpLabel = new JLabel("CNP");
        cnpLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        cnpLabel.setBounds(37, 78, 90, 24);
        frmDatePersonale.getContentPane().add(cnpLabel);

        JLabel adresaLabel = new JLabel("Adresa");
        adresaLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        adresaLabel.setBounds(37, 125, 90, 24);
        frmDatePersonale.getContentPane().add(adresaLabel);

        JLabel telLabel = new JLabel("Numar telefon");
        telLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        telLabel.setBounds(37, 194, 90, 24);
        frmDatePersonale.getContentPane().add(telLabel);

        JLabel mailLabel = new JLabel("E-mail");
        mailLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        mailLabel.setBounds(37, 240, 90, 24);
        frmDatePersonale.getContentPane().add(mailLabel);

        JLabel ibanLabel = new JLabel("Cont IBAN");
        ibanLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        ibanLabel.setBounds(37, 288, 90, 24);
        frmDatePersonale.getContentPane().add(ibanLabel);

        JLabel contractLabel = new JLabel("Numar contract");
        contractLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        contractLabel.setBounds(37, 332, 90, 24);
        frmDatePersonale.getContentPane().add(contractLabel);

        JTextArea adresaTxt = new JTextArea();
        adresaTxt.setEditable(false);
        adresaTxt.setBounds(176, 125, 200, 51);
        adresaTxt.setText("" + resultSet.getString(6));
        frmDatePersonale.getContentPane().add(adresaTxt);
    }

}
