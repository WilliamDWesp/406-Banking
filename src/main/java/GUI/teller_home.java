package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class teller_home  extends JPanel{
    private JPanel teller_home_panel;
    private JButton create_checking_account;
    private JButton back_button;
    private JButton view_accounts_button;
    private JButton transfer_funds_button;
    private JButton create_savings_button;
    private JLabel fname_label;

    public static void main(String[] args) {
        new teller_home();
    }

    public teller_home(){
        JFrame frame = new JFrame("Teller");
        frame.setContentPane(teller_home_panel);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        create_checking_account.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                create_checking_page checking = new create_checking_page(2);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        transfer_funds_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                teller_verify_transfer_customer teller_verify_transfer_customer = new teller_verify_transfer_customer();
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                home_page home_page = new home_page();
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        view_accounts_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                teller_verify_accounts_customer teller_verify_accounts_customer = new teller_verify_accounts_customer();
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        create_savings_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                create_saving_page create_saving_page = new create_saving_page(1);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
    }
}
