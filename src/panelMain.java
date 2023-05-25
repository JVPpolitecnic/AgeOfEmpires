import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class panelMain {
    private JPanel panelMain;
    private JPanel gameBoard;
    private int[][] mapDataGrass;
    private int tileSize;


    public panelMain() {
        panelMain.setPreferredSize(new Dimension(1200, 600));
        panelMain.setLayout(null);
        panelMain.setFocusable(true);
        System.out.println("width: " + panelMain.getWidth() + " height: " + panelMain.getHeight());
        mapDataGrass = Map.getMapDataGrass(panelMain);
        tileSize = 20;
        Map.fillPanelWithJLabels(mapDataGrass, "src/visualResources/grassTile.png", panelMain, tileSize);
        panelMain.addKeyListener(new panelKeyListener());
        panelMain.setFocusable(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("panelMain");
        frame.setContentPane(new panelMain().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocation(300, 200);


    }
private class panelKeyListener extends KeyAdapter {
    public void keyPressed(KeyEvent e){
        int KeyCode = e.getKeyCode();
        if(KeyCode == KeyEvent.VK_UP){
            tileSize+= 10;
            panelMain.removeAll();
            Map.fillPanelWithJLabels(mapDataGrass, "src/visualResources/grassTile.png", panelMain, tileSize);
            panelMain.revalidate();
            panelMain.repaint();
            System.out.println("MAS");
        }
        if(KeyCode == KeyEvent.VK_DOWN){
            tileSize-=10;
        }
    }
}

}
