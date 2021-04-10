import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GrupStudiu {
    JFrame frmGrupStudiu;
    private JTextField idActivitateTxt;
    private JTextField numeActivitateTxt;
    private JTextField participantiTxt;
    private JTextField dataTxt;
    private JTextField durataTxt;
    private JTextField mesajField;

    Connection connect;
    Statement statement;
    ResultSet resultSet;
    int idStudent;
    int idGrup;
    public GrupStudiu(Connection connection, Statement statement, int id) {
        this.connect = connection;
        this.statement = statement;
        this.idStudent = id;
        initialize();
    }
    private void initialize() {
        frmGrupStudiu = new JFrame();
        frmGrupStudiu.getContentPane().setBackground(SystemColor.inactiveCaption);
        frmGrupStudiu.getContentPane().setLayout(null);
        int nrInsc=3;
        String[] inscris=new String[nrInsc];
        inscris[0]="<alege grupu>";
        inscris[1]="1";
        inscris[2]="2";
        int nrRec=3;
        String[] recom=new String[nrRec];
        recom[0]="<selecteaza un grup>";
        recom[1]="4";
        recom[2]="5";

        JComboBox grupInscrisCombo = new JComboBox(inscris);
        grupInscrisCombo.setBounds(20, 32, 190, 21);

        frmGrupStudiu.getContentPane().add(grupInscrisCombo);

        JButton mesajButon = new JButton("Send");
        mesajButon.setBounds(299, 464, 71, 21);
        frmGrupStudiu.getContentPane().add(mesajButon);

        JButton inscrieteButon = new JButton("Inscrie-te");
        inscrieteButon.setBounds(331, 32, 95, 21);
        frmGrupStudiu.getContentPane().add(inscrieteButon);

        JComboBox grupRecomandatCombo = new JComboBox(recom);
        grupRecomandatCombo.setBounds(436, 32, 190, 21);
        grupRecomandatCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grupRecomandatCombo.getSelectedIndex()==0)inscrieteButon.setEnabled(false);
                else inscrieteButon.setEnabled(true);
            }
        });
        frmGrupStudiu.getContentPane().add(grupRecomandatCombo);

        JLabel inscrisLabel = new JLabel("  Inscris in grupurile");
        inscrisLabel.setBounds(20, 9, 190, 21);
        frmGrupStudiu.getContentPane().add(inscrisLabel);

        JLabel recomandateLabel = new JLabel("  Grupuri recomandate");
        recomandateLabel.setBounds(436, 9, 190, 21);
        frmGrupStudiu.getContentPane().add(recomandateLabel);

        JButton adaugaButon = new JButton("Adauga activitate");
        adaugaButon.setBounds(422, 327, 138, 21);
        frmGrupStudiu.getContentPane().add(adaugaButon);

        JButton participaButon = new JButton("Participa");
        participaButon.setBounds(316, 162, 138, 21);
        frmGrupStudiu.getContentPane().add(participaButon);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(464, 85, 162, 99);
        frmGrupStudiu.getContentPane().add(scrollPane);

        JTextArea activitatiTxt = new JTextArea();
        activitatiTxt.setEditable(false);
        scrollPane.setViewportView(activitatiTxt);

        idActivitateTxt = new JTextField();
        idActivitateTxt.setBounds(422, 133, 32, 19);
        frmGrupStudiu.getContentPane().add(idActivitateTxt);
        idActivitateTxt.setColumns(10);

        JLabel idActivitateLabel = new JLabel("ID activitate");
        idActivitateLabel.setBounds(341, 136, 71, 13);
        frmGrupStudiu.getContentPane().add(idActivitateLabel);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(20, 90, 220, 92);
        frmGrupStudiu.getContentPane().add(scrollPane_1);

        JTextArea membriTxt = new JTextArea();
        membriTxt.setEditable(false);
        scrollPane_1.setViewportView(membriTxt);

        JLabel lblNewLabel_2 = new JLabel("  Membri");
        lblNewLabel_2.setBounds(20, 71, 71, 21);
        frmGrupStudiu.getContentPane().add(lblNewLabel_2);

        numeActivitateTxt = new JTextField();
        numeActivitateTxt.setBounds(558, 355, 96, 19);
        frmGrupStudiu.getContentPane().add(numeActivitateTxt);
        numeActivitateTxt.setColumns(10);

        participantiTxt = new JTextField();
        participantiTxt.setBounds(558, 384, 49, 19);
        frmGrupStudiu.getContentPane().add(participantiTxt);
        participantiTxt.setColumns(10);

        dataTxt = new JTextField();
        dataTxt.setBounds(558, 413, 82, 19);
        frmGrupStudiu.getContentPane().add(dataTxt);
        dataTxt.setColumns(10);

        durataTxt = new JTextField();
        durataTxt.setBounds(556, 442, 84, 19);
        frmGrupStudiu.getContentPane().add(durataTxt);
        durataTxt.setColumns(10);

        JLabel numeActivitateLabel = new JLabel("Nume activitate");
        numeActivitateLabel.setBounds(420, 358, 131, 13);
        frmGrupStudiu.getContentPane().add(numeActivitateLabel);

        JLabel participantiLabel = new JLabel("Numar min. participanti");
        participantiLabel.setBounds(422, 387, 138, 13);
        frmGrupStudiu.getContentPane().add(participantiLabel);

        JLabel dataLabel = new JLabel("Data(YYYY-MM-DD)");
        dataLabel.setBounds(422, 416, 131, 13);
        frmGrupStudiu.getContentPane().add(dataLabel);

        JLabel durataLabel = new JLabel("Durata (hh:mm)");
        durataLabel.setBounds(423, 445, 123, 13);
        frmGrupStudiu.getContentPane().add(durataLabel);

        JLabel lblNewLabel = new JLabel("Activitatile grupului");
        lblNewLabel.setBounds(462, 63, 145, 21);
        frmGrupStudiu.getContentPane().add(lblNewLabel);

        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(20, 238, 269, 204);
        frmGrupStudiu.getContentPane().add(scrollPane_2);

        JTextArea chatTxt = new JTextArea();
        chatTxt.setEditable(false);
        scrollPane_2.setViewportView(chatTxt);

        mesajField = new JTextField();
        mesajField.setBounds(20, 464, 269, 21);
        frmGrupStudiu.getContentPane().add(mesajField);
        mesajField.setColumns(10);

        JLabel chatLabel = new JLabel("Group chat");
        chatLabel.setBounds(20, 217, 131, 21);
        frmGrupStudiu.getContentPane().add(chatLabel);

        JScrollPane scrollPane_3 = new JScrollPane();
        scrollPane_3.setBounds(464, 217, 162, 82);
        frmGrupStudiu.getContentPane().add(scrollPane_3);

        JTextArea acPartTxt = new JTextArea();
        acPartTxt.setEditable(false);
        scrollPane_3.setViewportView(acPartTxt);

        JLabel actPartLabel = new JLabel("Activitati la care participi");
        actPartLabel.setBounds(464, 204, 162, 13);
        frmGrupStudiu.getContentPane().add(actPartLabel);
        frmGrupStudiu.setTitle("Grup studiu");
        frmGrupStudiu.setBounds(100, 100, 692, 548);
        frmGrupStudiu.setLocationRelativeTo(frmGrupStudiu);
    }
}
