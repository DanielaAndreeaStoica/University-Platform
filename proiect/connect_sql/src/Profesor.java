import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Profesor {
    Connection connect;
    Statement statement;
    ResultSet resultSet;
    int idProfesor;
    JFrame frmProfesor;

    public Profesor(Connection connection, Statement statement, int id) {
        this.connect = connection;
        this.statement = statement;
        this.idProfesor = id;
        initialize();
    }

    private void initialize() {
        frmProfesor = new JFrame();
        frmProfesor.getContentPane().setBackground(SystemColor.inactiveCaption);
        frmProfesor.setTitle("Profesor");
        frmProfesor.setBounds(100, 100, 657, 491);
        frmProfesor.setLocationRelativeTo(frmProfesor);
        frmProfesor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmProfesor.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel.setBounds(24, 40, 142, 29);
        frmProfesor.getContentPane().add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        final JLabel datePersonaleLabel = new JLabel("   Date personale");
        datePersonaleLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        datePersonaleLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int idUtilizator = 1;
                DatePersonale window = null;
                String query = "select idUtilizator from profesor where idProfesor=";
                query = query + String.valueOf(idProfesor) + ";";
                try {
                    resultSet = statement.executeQuery(query);
                    resultSet.next();
                    idUtilizator = resultSet.getInt(1);
                    window = new DatePersonale(connect, statement, idUtilizator);
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
        panel.add(datePersonaleLabel, BorderLayout.CENTER);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel_1.setBounds(24, 90, 142, 29);
        frmProfesor.getContentPane().add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        final JLabel catalogLabel = new JLabel("    Catalog");
        catalogLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        catalogLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
                catalogLabel.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent arg0) {
                catalogLabel.setForeground(Color.black);
            }
            @Override
            public void mousePressed(MouseEvent arg0) {
            }
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
        panel_1.add(catalogLabel, BorderLayout.CENTER);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel_2.setBounds(24, 137, 142, 29);
        frmProfesor.getContentPane().add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        final JLabel asignareLabel = new JLabel("  Asignare la curs");
        asignareLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        asignareLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
                asignareLabel.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent arg0) {
                asignareLabel.setForeground(Color.black);
            }
            @Override
            public void mousePressed(MouseEvent arg0) {
            }
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
        panel_2.add(asignareLabel, BorderLayout.CENTER);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel_3.setBounds(24, 185, 142, 29);
        frmProfesor.getContentPane().add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        final JLabel activitatiLabel = new JLabel("   Activitati");
        activitatiLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        panel_3.add(activitatiLabel, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 643, 22);
        frmProfesor.getContentPane().add(menuBar);

        JMenu setariMenu = new JMenu("Setari");
        menuBar.add(setariMenu);

        JMenuItem logout = new JMenuItem("Log out");
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                LogIn window = new LogIn(connect,statement);
                window.frameLogIn.setVisible(true);
                frmProfesor.setVisible(false);
            }
        });
        setariMenu.add(logout);
        activitatiLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                Activitati window = new Activitati(connect,statement, idProfesor,"profesor");
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
