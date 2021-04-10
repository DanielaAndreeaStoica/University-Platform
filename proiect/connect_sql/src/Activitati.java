import javax.swing.*;
import java.awt.SystemColor;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Activitati {
    Connection connect;
    Statement statement;
    ResultSet resultSet;
    String tipUtilizator;
    int id;
    JFrame frmActivitati;

    public Activitati(Connection connection, Statement statement, int id,String tipU) {
        this.connect = connection;
        this.statement = statement;
        this.id = id;
        tipUtilizator=tipU;
        initialize();
    }

    private void initialize() {
        frmActivitati = new JFrame();
        frmActivitati.getContentPane().setBackground(SystemColor.inactiveCaption);
        frmActivitati.getContentPane().setLayout(null);

        JButton downloadActv = new JButton("descarca activitati");
        downloadActv.setBounds(21, 298, 141, 21);
        frmActivitati.getContentPane().add(downloadActv);

        JRadioButton toateRadioButon = new JRadioButton("Toate activitatile");
        toateRadioButon.setBackground(SystemColor.activeCaption);
        toateRadioButon.setBounds(21, 6, 129, 21);
        frmActivitati.getContentPane().add(toateRadioButon);

        JRadioButton todayRadioButon = new JRadioButton("Activitatile de azi");
        todayRadioButon.setBackground(SystemColor.activeCaption);
        todayRadioButon.setBounds(152, 6, 129, 21);
        frmActivitati.getContentPane().add(todayRadioButon);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(22, 41, 453, 247);
        frmActivitati.getContentPane().add(scrollPane);

        JTextPane activitatiTxt = new JTextPane();
        activitatiTxt.setFont(new Font("Verdana", Font.PLAIN, 12));
        activitatiTxt.setEditable(false);
        scrollPane.setViewportView(activitatiTxt);
        frmActivitati.setTitle("Activitati");
        frmActivitati.setBounds(100, 100, 522, 372);
        frmActivitati.setLocationRelativeTo(frmActivitati);
    }
}

