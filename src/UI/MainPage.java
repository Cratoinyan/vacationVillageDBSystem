package UI;

import DB.DbConnector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage {
    public DbConnector db = null;
    JFrame frame = new JFrame("Home");
    JButton connectBtn = new JButton("Connect");

    JLabel dbStatus = new JLabel();

    private boolean isConnect = true;
    public void view(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        connectBtn.setBounds(45,10,100,100);
        dbStatus.setBounds(10,110,200,20);

        connectBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    db.connect();
                    isConnect = false;
                    connectBtn.setText("Disconnect");
                    dbStatus.setText("Opened database successfully");
            }
        });


        frame.getContentPane().add(connectBtn);
        frame.getContentPane().add(dbStatus);
    }
}