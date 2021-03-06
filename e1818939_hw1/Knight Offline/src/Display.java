//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : @Knight Offline
//  @ File Name : Display.java
//  @ Date : @31.03.2015
//  @ Author : @Burak Araz
//
//

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.imageio.ImageIO;

import java.io.IOException;
import java.io.File;
import java.util.Random;

public class Display extends JFrame {

    public JPanel jPanel;
    //public JFrame frame;
    private JLabel lblElMorad;
    private JLabel lblKarus;
    private JLabel lblInfo;
    private JLabel lblScore;
    private JLabel lblKills;
    private JLabel lblTotalDamage;

    private JLabel lblScoreKarus;
    private JLabel lblScoreElMorad;

    private JLabel lblKillsKarus;
    private JLabel lblKillsElMorad;

    private JLabel lblTDamageKarus;
    private JLabel lblTDamageElMorad;
    
    private JLabel highestPlayer;
    private JLabel highestPlayerK;
    private JLabel highestPlayerE;

    private int minXOfFrame;
    private int minYOfFrame;
    private int widthXOfFrame;
    private int heightYOfFrame;

    private JLabel specSkill;
    private JLabel specSkillK;
    private JLabel specSkillE;

    private JLabel normSkill;
    private JLabel normSkillK;
    private JLabel normSkillE;

    public Display(JPanel jpanel) {
        this.jPanel = jpanel;
        initialize();
        minXOfFrame = 350;
        minYOfFrame = 0;
        widthXOfFrame = 1150;
        heightYOfFrame = 800;
    }

    public int getMinXOfFrame() {
        return minXOfFrame;
    }

    public void setMinXOfFrame(int minXOfFrame) {
        minXOfFrame = minXOfFrame;
    }

    public int getMinYOfFrame() {
        return minYOfFrame;
    }

    public void setMinYOfFrame(int minYOfFrame) {
        minYOfFrame = minYOfFrame;
    }

    public int getWidthXOfFrame() {
        return widthXOfFrame;
    }

    public void setWidthXOfFrame(int widthXOfFrame) {
        widthXOfFrame = widthXOfFrame;
    }

    public int getHeightYOfFrame() {
        return heightYOfFrame;
    }

    public void setHeightYOfFrame(int heightYOfFrame) {
        heightYOfFrame = heightYOfFrame;
    }

    private static Display instance;

    public static Display getInstance() {
        if (instance == null) {
            instance = new Display(null);
            instance.baslat();
        }
        return instance;
    }

    public static Display getInstance(JPanel jpanel) {

        instance = new Display(jpanel);
        instance.baslat();

        return instance;
    }

    public void baslat() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Display window = new Display();
                    setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void draw(Graphics g) {

    }

    private void initialize() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        setBounds(100, 100, 1500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setFont(new Font("System", Font.PLAIN, 14));
        //setLayout(null);

        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("Hello Center");
        int y = fm.stringWidth(" ");
        int z = getWidth() / 2 - (x / 2);
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        setTitle("Knight Offline");


        JPanel informationPanel = new JPanel() {
            public void paintComponent(Graphics g) {
                this.removeAll();

                lblInfo = new JLabel("Information");
                lblInfo.setBounds(50, 5, 190, 14);
                lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
                add(lblInfo);

                lblElMorad = new JLabel("El Morad");
                lblElMorad.setBounds(150, 35, 190, 14);
                add(lblElMorad);

                lblKarus = new JLabel("Karus");
                lblKarus.setBounds(250, 35, 190, 14);
                add(lblKarus);

                lblScoreKarus = new JLabel();
                lblScoreKarus.setText(Integer.toString(Simulation.getInstance().getTotalScoreK()));
                lblScoreKarus.setBounds(250, 65, 190, 14);
                lblScoreElMorad = new JLabel();
                lblScoreElMorad.setText(Integer.toString(Simulation.getInstance().getTotalScoreE()));
                lblScoreElMorad.setBounds(150, 65, 190, 14);
                lblScore = new JLabel("Score: ");
                lblScore.setBounds(10, 65, 190, 14);
                add(lblScore);
               add(lblScoreKarus);
                add(lblScoreElMorad);

                lblKillsKarus = new JLabel();
                lblKillsKarus.setText(Integer.toString(Simulation.getInstance().getKillsK()));
                lblKillsKarus.setBounds(250, 95, 190, 14);
                lblKillsElMorad = new JLabel();
                lblKillsElMorad.setText(Integer.toString(Simulation.getInstance().getKillsE()));
                lblKillsElMorad.setBounds(150, 95, 190, 14);
                lblKills = new JLabel("Kills: ");
                lblKills.setBounds(10, 95, 190, 14);
                add(lblKills);
                add(lblKillsKarus);
                add(lblKillsElMorad);

                lblTDamageKarus = new JLabel();
                lblTDamageKarus.setText(Integer.toString(Simulation.getInstance().getTotalDamageK()));
                lblTDamageKarus.setBounds(250, 125, 190, 14);
                lblTDamageElMorad = new JLabel();
                lblTDamageElMorad.setText(Integer.toString(Simulation.getInstance().getTotalDamageE()));
                lblTDamageElMorad.setBounds(150, 125, 190, 14);
                lblTotalDamage = new JLabel("T. Damage: ");
                lblTotalDamage.setBounds(10, 125, 190, 20);
                add(lblTotalDamage);
                add(lblTDamageKarus);
                add(lblTDamageElMorad);

                specSkillK = new JLabel();
                specSkillK.setText(Integer.toString(Simulation.getInstance().speckSkillK));
                specSkillK.setBounds(250, 155, 190, 14);
                specSkillE = new JLabel();
                specSkillE.setText(Integer.toString(Simulation.getInstance().speckSkillE));
                specSkillE.setBounds(150, 155, 190, 14);
                specSkill = new JLabel("S. Skills: ");
                specSkill.setBounds(10, 155, 190, 20);
                add(specSkillK);
                add(specSkillE);
                add(specSkill);

                normSkillK = new JLabel();
                normSkillK.setText(Integer.toString(Simulation.getInstance().normSkillK));
                normSkillK.setBounds(250, 185, 220, 14);
                normSkillE = new JLabel();
                normSkillE.setText(Integer.toString(Simulation.getInstance().normSkillE));
                normSkillE.setBounds(150, 185, 220, 14);
                normSkill = new JLabel("N. Skills: ");
                normSkill.setBounds(10, 185, 220, 20);
                add(normSkillK);
                add(normSkillE);
                add(normSkill);
                
                highestPlayerK = new JLabel();
                highestPlayerK.setText(Integer.toString(Simulation.getInstance().highestPlayerK));
                highestPlayerK.setBounds(250, 215, 220, 14);
                highestPlayerE = new JLabel();
                highestPlayerE.setText(Integer.toString(Simulation.getInstance().highestPlayerE));
                highestPlayerE.setBounds(150, 215, 220, 14);
                highestPlayer = new JLabel("Legendary Player(NP): ");
                highestPlayer.setBounds(10, 215, 220, 20);
                add(highestPlayerK);
                add(highestPlayerE);
                add(highestPlayer);

                //setContentPane(drawLogoImage());
                ImageIcon image = new ImageIcon("src/images/knigtlogo.jpeg");
                JLabel label = new JLabel("", image, JLabel.CENTER);
                label.setBounds(80, 450, 200, 200);
                add(label);

            }
        };
        informationPanel.setBackground(Color.white);
        informationPanel.setPreferredSize(new Dimension(350, 800));
        informationPanel.setMinimumSize(new Dimension(350, 800));
        informationPanel.setSize(350, 800);
        informationPanel.setLayout(null);
        cp.add(informationPanel);
        cp.add(jPanel);
        pack();
        //setVisible(true);
    }

    public void removeKnight(Knight knight) {

        if (knight.getTeam() == 0) {
            for (int i = 0; i < Simulation.getInstance().getKarusList().size(); i++) {
                if (Simulation.getInstance().getKarusList().get(i).getId() == knight.getId()) {
                    Simulation.getInstance().getKarusList().remove(i);
                    //getContentPane().remove(knight.getComponent());
                    Random rand = new Random();
                    int type = rand.nextInt(3);
                    if (type == 1) {
                        Simulation.getInstance().generateMage(0, Simulation.id);
                        Simulation.id++;
                    } else if (type == 0) {
                        Simulation.getInstance().generateRogue(0, Simulation.id);
                        Simulation.id++;
                    } else {
                        Simulation.getInstance().generatePriest(0, Simulation.id);
                        Simulation.id++;
                    }
                    break;
                }
            }
        } else if (knight.getTeam() == 1) {
            for (int i = 0; i < Simulation.getInstance().getElmoradList().size(); i++) {
                if (Simulation.getInstance().getElmoradList().get(i).getId() == knight.getId()) {
                    Simulation.getInstance().getElmoradList().remove(i);
                    //getContentPane().remove(knight.getComponent());
                    Random rand = new Random();
                    int type = rand.nextInt(3);
                    if (type == 1) {
                        Simulation.getInstance().generateMage(1, Simulation.id);
                        Simulation.id++;
                    } else if (type == 0) {
                        Simulation.getInstance().generateRogue(1, Simulation.id);
                        Simulation.id++;
                    } else {
                        Simulation.getInstance().generatePriest(1, Simulation.id);
                        Simulation.id++;
                    }
                    break;
                }
            }
        }
    }

    public JPanel drawLogoImage() {
        JPanel background = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image img = null;
                try {
                    img = ImageIO.read(new File("src/images/knigtlogo.jpeg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                g.drawImage(img, 10, 400, null);
            }
        };
        background.setLayout(null);

        return background;
    }

    /**
     * @return the lblScoreKarus
     */
    public JLabel getLblScoreKarus() {
        return lblScoreKarus;
    }

    /**
     * @param lblScoreKarus the lblScoreKarus to set
     */
    public void setLblScoreKarus(JLabel lblScoreKarus) {
        lblScoreKarus = lblScoreKarus;
    }

    /**
     * @return the lblScoreElMorad
     */
    public JLabel getLblScoreElMorad() {
        return lblScoreElMorad;
    }

    /**
     * @param lblScoreElMorad the lblScoreElMorad to set
     */
    public void setLblScoreElMorad(JLabel lblScoreElMorad) {
        lblScoreElMorad = lblScoreElMorad;
    }

    /**
     * @return the lblKillsKarus
     */
    public JLabel getLblKillsKarus() {
        return lblKillsKarus;
    }

    /**
     * @param lblKillsKarus the lblKillsKarus to set
     */
    public void setLblKillsKarus(JLabel lblKillsKarus) {
        lblKillsKarus = lblKillsKarus;
    }

    /**
     * @return the lblKillsElMorad
     */
    public JLabel getLblKillsElMorad() {
        return lblKillsElMorad;
    }

    /**
     * @param lblKillsElMorad the lblKillsElMorad to set
     */
    public void setLblKillsElMorad(JLabel lblKillsElMorad) {
        lblKillsElMorad = lblKillsElMorad;
    }

    /**
     * @return the lblTDamageKarus
     */
    public JLabel getLblTDamageKarus() {
        return lblTDamageKarus;
    }

    /**
     * @param lblTDamageKarus the lblTDamageKarus to set
     */
    public void setLblTDamageKarus(JLabel lblTDamageKarus) {
        lblTDamageKarus = lblTDamageKarus;
    }

    /**
     * @return the lblTDamageElMorad
     */
    public JLabel getLblTDamageElMorad() {
        return lblTDamageElMorad;
    }

    /**
     * @param lblTDamageElMorad the lblTDamageElMorad to set
     */
    public void setLblTDamageElMorad(JLabel lblTDamageElMorad) {
        lblTDamageElMorad = lblTDamageElMorad;
    }
}
