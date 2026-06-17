import javax.swing.*;
import java.awt.*;


public class LaceAndLoomLogin extends JFrame {


    public LaceAndLoomLogin() {


        setTitle("Lace & Loom Login");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(
            Toolkit.getDefaultToolkit()
            .getScreenSize()
        );


        setLocationRelativeTo(null);


        add(new LoginPanel());

    }



    class LoginPanel extends JPanel {


        JTextField email;
        JPasswordField password;


        Color purple =
                new Color(170,140,220);

        Color lightPurple =
                new Color(235,225,250);

        Color textPurple =
                new Color(90,60,130);



        public LoginPanel(){

            setLayout(null);

            setBackground(
                new Color(245,245,245)
            );


            addComponentListener(
            new java.awt.event.ComponentAdapter(){


                public void componentResized(
                    java.awt.event.ComponentEvent e){


                    resizeComponents();

                }

            });


            createUI();

        }





        void createUI(){



            email =
                new JTextField();


            password =
                new JPasswordField();

        }





        void resizeComponents(){


            removeAll();


            int w = getWidth();
            int h = getHeight();



            // laptop size

            int cardWidth =
                    Math.min(
                        450,
                        w-60
                    );


            int cardHeight =
                    560;



            int x =
                (w-cardWidth)/2;


            int y =
                (h-cardHeight)/2;



            JPanel card =
                    new JPanel();


            card.setLayout(null);


            card.setBackground(
                    Color.WHITE
            );


            card.setBounds(
                    x,
                    y,
                    cardWidth,
                    cardHeight
            );


            add(card);






            JLabel title =
                    new JLabel(
                    "Lace & Loom"
                    );


            title.setFont(
                    new Font(
                        "Serif",
                        Font.BOLD,
                        w < 600 ? 28 : 36
                    )
            );


            title.setForeground(
                    textPurple
            );


            title.setHorizontalAlignment(
                    SwingConstants.CENTER
            );


            title.setBounds(
                20,
                70,
                cardWidth-40,
                50
            );


            card.add(title);







            JPanel login =
                    new JPanel();


            login.setLayout(null);


            login.setBackground(
                    lightPurple
            );


            login.setBounds(
                    30,
                    220,
                    cardWidth-60,
                    260
            );


            card.add(login);







            JLabel emailText =
                    new JLabel("Email");


            emailText.setForeground(
                    textPurple
            );


            emailText.setBounds(
                35,30,100,25
            );


            login.add(emailText);






            email =
                new JTextField();


            email.setBounds(
                35,
                60,
                login.getWidth()-70,
                40
            );


            login.add(email);







            JLabel passText =
                    new JLabel(
                    "Password"
                    );


            passText.setForeground(
                    textPurple
            );


            passText.setBounds(
                    35,
                    120,
                    100,
                    25
            );


            login.add(passText);







            password =
                new JPasswordField();


            password.setBounds(
                35,
                150,
                login.getWidth()-70,
                40
            );


            login.add(password);







            JButton button =
                    new JButton(
                    "Submit"
                    );


            button.setBounds(
                login.getWidth()/2-60,
                210,
                120,
                35
            );


            button.setBackground(
                    purple
            );


            button.setForeground(
                    Color.WHITE
            );



            login.add(button);




            button.addActionListener(e -> {


                JOptionPane.showMessageDialog(
                        this,
                        "Welcome to Lace & Loom ✨"
                );


            });


            revalidate();

            repaint();

        }





        protected void paintComponent(Graphics g){

            super.paintComponent(g);


            Graphics2D g2 =
                    (Graphics2D)g;


            g2.setColor(
                new Color(220,205,240)
            );


            g2.fillRoundRect(
                    5,
                    5,
                    getWidth()-10,
                    getHeight()-10,
                    50,
                    50
            );

        }


    }





    public static void main(String[] args){


        SwingUtilities.invokeLater(
            () -> {

                new LaceAndLoomLogin()
                .setVisible(true);

            }
        );


    }

}