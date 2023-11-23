package bg.smg.frame;

import javax.swing.*;

public class SignUpFrame extends JFrame {

    private JButton signUpButton;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JLabel register;
    private JTextField usernameTxF;
    private JPasswordField passwordFieldPwdF;

    SignUpFrame () {
        this.setTitle ("Banking app");
        this.setSize(400,300);
        this.setLayout(null);
        usernameLbl = new JLabel("Username:");
        usernameTxF = new JTextField();
        passwordLbl = new JLabel("Password:");
        passwordFieldPwdF = new JPasswordField();
        signUpButton = new JButton("Sign up");

        usernameLbl.setBounds(40,20,100,20);
        usernameTxF.setBounds(140,20,100,20);
        passwordLbl.setBounds(40,60,100,20);
        passwordFieldPwdF.setBounds(140,60,100,20);
        signUpButton.setBounds(180,160,180,20);

        this.add(usernameLbl);
        this.add(usernameTxF);
        this.add(passwordLbl);
        this.add(passwordFieldPwdF);
        this.add(signUpButton);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
