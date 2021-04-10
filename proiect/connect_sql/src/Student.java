import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

    JFrame frmStudent;
    Connection connect;
    Statement statement;
    ResultSet resultSet;
    int idStudent;

    public Student(Connection connection,Statement statement, int id) {
        this.connect = connection;
        this.statement=statement;
        this.idStudent =id;
        initialize();
    }

    private void initialize() {
        frmStudent = new JFrame();
        frmStudent.getContentPane().setBackground(SystemColor.inactiveCaption);
        frmStudent.setTitle("Student");
        frmStudent.setBounds(100, 100, 657, 491);
        frmStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmStudent.setLocationRelativeTo(frmStudent);
        frmStudent.getContentPane().setLayout(null);


        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel.setBounds(39, 40, 142, 29);
        frmStudent.getContentPane().add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        final JLabel datePersonaleLabel = new JLabel("   Date personale");
        panel.add(datePersonaleLabel, BorderLayout.CENTER);
        datePersonaleLabel.setFont(new Font("Verdana", Font.PLAIN, 14));

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel_2.setBounds(39, 132, 142, 29);
        frmStudent.getContentPane().add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        final JLabel grupLabel = new JLabel("  Grupuri studiu");
        grupLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        panel_2.add(grupLabel, BorderLayout.CENTER);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel_1.setBounds(39, 83, 142, 29);
        frmStudent.getContentPane().add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        final JLabel cursuriLabel = new JLabel("   Cursuri");
        cursuriLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        panel_1.add(cursuriLabel, BorderLayout.CENTER);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel_3.setBounds(39, 182, 142, 29);
        frmStudent.getContentPane().add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        final JLabel activitatiLabel = new JLabel("   Activitati");
        activitatiLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        panel_3.add(activitatiLabel, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        frmStudent.setJMenuBar(menuBar);

        JMenu setariMenu = new JMenu("Setari");
        menuBar.add(setariMenu);

        JMenuItem logout = new JMenuItem("Log out");
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                LogIn window = new LogIn(connect,statement);
                window.frameLogIn.setVisible(true);
                frmStudent.setVisible(false);
            }
        });
        setariMenu.add(logout);
        datePersonaleLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int idUtilizator=1;
                DatePersonale window = null;
                String query="select idUtilizator from student where idStudent=";
                query=query+String.valueOf(idStudent)+";";
                try {
                    resultSet = statement.executeQuery(query);
                    resultSet.next();
                    idUtilizator=resultSet.getInt(1);
                    window = new DatePersonale(connect,statement,idUtilizator);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                window.frmDatePersonale.setVisible(true);
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
                datePersonaleLabel.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent arg0) {
                datePersonaleLabel.setForeground(Color.black);
            }
            @Override
            public void mousePressed(MouseEvent arg0) {
            }
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
        cursuriLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                StudentCursuri window = new StudentCursuri(connect,statement, idStudent);
                window.frmStudentCursuri.setVisible(true);
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
                cursuriLabel.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent arg0) {
                cursuriLabel.setForeground(Color.black);
            }
            @Override
            public void mousePressed(MouseEvent arg0) {
            }
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
        grupLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                GrupStudiu window = new GrupStudiu(connect,statement,idStudent);
                window.frmGrupStudiu.setVisible(true);
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
                grupLabel.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent arg0) {
                grupLabel.setForeground(Color.black);
            }
            @Override
            public void mousePressed(MouseEvent arg0) {
            }
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
        activitatiLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                Activitati window = new Activitati(connect,statement, idStudent,"student");
                window.frmActivitati.setVisible(true);
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
                activitatiLabel.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent arg0) {
                activitatiLabel.setForeground(Color.black);
            }
            @Override
            public void mousePressed(MouseEvent arg0) {
            }
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
    }
}
