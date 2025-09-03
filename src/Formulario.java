import javax.swing.*;

public class Formulario extends JFrame {
    private JLabel lblTitulo;
    private JButton btnConfirmar;
    private JPanel contentPane;
    private JTextField txtNombre;
    private JLabel lblNombre;


    public static void main(String[] args) {
        Formulario frame = new Formulario();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(frame.contentPane);
    }
}
