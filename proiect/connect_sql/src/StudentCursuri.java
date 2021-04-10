import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentCursuri {
    Connection connect;
    Statement statement;
    ResultSet resultSet;
    int idStudent;
    JFrame frmStudentCursuri;
    private JTextField cursTxt;
    private JTextField profTxt;

    public StudentCursuri(Connection connection,Statement statement,int id) {
        this.connect = connection;
        this.statement=statement;
        this.idStudent =id;
        initialize();
    }

    private void initialize() {
        frmStudentCursuri = new JFrame();
        frmStudentCursuri.setTitle("Student - cursuri");
        frmStudentCursuri.getContentPane().setBackground(SystemColor.inactiveCaption);
        frmStudentCursuri.setBounds(100, 100, 554, 413);
        frmStudentCursuri.getContentPane().setLayout(null);
        frmStudentCursuri.setLocationRelativeTo(frmStudentCursuri);

        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel.setBounds(25, 33, 110, 28);
        frmStudentCursuri.getContentPane().add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(222, 26, 272, 313);
        frmStudentCursuri.getContentPane().add(textArea);

        cursTxt = new JTextField();
        cursTxt.setBounds(84, 199, 96, 19);
        cursTxt.setVisible(false);
        frmStudentCursuri.getContentPane().add(cursTxt);
        cursTxt.setColumns(10);

        profTxt = new JTextField();
        profTxt.setBounds(84, 228, 96, 19);
        profTxt.setVisible(false);
        frmStudentCursuri.getContentPane().add(profTxt);
        profTxt.setColumns(10);

        final JLabel cursLabel = new JLabel("Curs");
        cursLabel.setBounds(25, 202, 45, 13);
        cursLabel.setVisible(false);
        frmStudentCursuri.getContentPane().add(cursLabel);

        final JLabel profLabel = new JLabel("Profesor");
        profLabel.setBounds(25, 231, 53, 13);
        profLabel.setVisible(false);
        frmStudentCursuri.getContentPane().add(profLabel);

        final JButton cancelButon = new JButton("Anuleaza");
        cancelButon.setBounds(115, 298, 85, 21);
        cancelButon.setVisible(false);
        frmStudentCursuri.getContentPane().add(cancelButon);

        final JButton doButon = new JButton("new button");
        doButon.setBounds(10, 298, 95, 21);
        doButon.setVisible(false);
        frmStudentCursuri.getContentPane().add(doButon);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel_1.setBounds(25, 71, 110, 28);
        frmStudentCursuri.getContentPane().add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        final JLabel noteLabel = new JLabel("  Vizualizare note");
        noteLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
        noteLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                cursLabel.setVisible(false);
                profLabel.setVisible(false);
                cursTxt.setVisible(false);
                profTxt.setVisible(false);
                doButon.setVisible(false);
                doButon.setText("Inscrie-te");
                cancelButon.setVisible(false);
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
                noteLabel.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent arg0) {
                noteLabel.setForeground(Color.black);
            }
            @Override
            public void mousePressed(MouseEvent arg0) {
            }
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
        panel.add(noteLabel, BorderLayout.CENTER);

        final JLabel inscriereLabel = new JLabel(" Inscriere la curs");
        inscriereLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
        inscriereLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                cursLabel.setVisible(true);
                profLabel.setVisible(true);
                cursTxt.setVisible(true);
                profTxt.setVisible(true);
                doButon.setVisible(true);
                doButon.setText("Inscrie-te");
                cancelButon.setVisible(true);
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
                inscriereLabel.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent arg0) {
                inscriereLabel.setForeground(Color.black);
            }
            @Override
            public void mousePressed(MouseEvent arg0) {
            }
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
        panel_1.add(inscriereLabel, BorderLayout.CENTER);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, null));
        panel_2.setBounds(25, 109, 110, 28);
        frmStudentCursuri.getContentPane().add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        final JLabel renuntareLabel = new JLabel(" Renuntare la curs");
        renuntareLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
        renuntareLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                cursLabel.setVisible(true);
                profLabel.setVisible(false);
                cursTxt.setVisible(true);
                profTxt.setVisible(false);
                doButon.setVisible(true);
                doButon.setText("Renunta");
                cancelButon.setVisible(true);
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
                renuntareLabel.setForeground(Color.red);
            }
            @Override
            public void mouseExited(MouseEvent arg0) {
                renuntareLabel.setForeground(Color.black);
            }
            @Override
            public void mousePressed(MouseEvent arg0) {
            }
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
        panel_2.add(renuntareLabel, BorderLayout.CENTER);
    }
}
