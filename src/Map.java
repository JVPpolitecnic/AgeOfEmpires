import javax.swing.*;
import java.awt.*;

public class Map {


    public static int[][] getMapDataGrass(JPanel placing_panel) {
        int[][] map = {{1, 1, 1},
                {1, 1, 1}};
        return map;
    }

    public static void fillPanelWithJLabels(int[][] mapData, String icon_filePath, JPanel panel) {

        int x = 0;
        int y = 0;




            for (int row = 0; row < mapData.length; row++) {
                for (int col = 0; col < mapData[row].length; col++) {
                    if (mapData[row][col] == 1) {

                        JLabel labelToPlace = new JLabel();
                        labelToPlace.setSize(new Dimension(20, 20));
                        ImageIcon imageCoin = new ImageIcon(icon_filePath);
                        Icon icon_coin = new ImageIcon(imageCoin.getImage().getScaledInstance(labelToPlace.getWidth(), labelToPlace.getHeight(), Image.SCALE_DEFAULT));
                        labelToPlace.setIcon(icon_coin);
                        labelToPlace.setLocation(x, y);

                        y= y+ 20;
                        panel.add(labelToPlace);
                    }
                    x= x+20;

                }
            }





        }
    }




