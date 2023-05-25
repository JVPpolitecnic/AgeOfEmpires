import javax.swing.*;
import java.awt.*;

public class panelMain {
    private JPanel panelMain;
    private JPanel gameBoard; 
    private int[][] mapDataGrass;


    public panelMain() {
        panelMain.setPreferredSize(new Dimension(1200, 600));
        panelMain.setLayout(null);
        panelMain.setFocusable(true);
        System.out.println("width: "+panelMain.getWidth()+ " height: "+ panelMain.getHeight());
        mapDataGrass = Map.getMapDataGrass(panelMain);
        Map.fillPanelWithJLabels(mapDataGrass, "src/visualResources/grassTile.png", panelMain);
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


}
