import javax.swing.*;
import java.awt.*;

public class Map {



    public static int[][] getMapDataGrass(JPanel placing_panel) {
        int[][] map = new int[placing_panel.getWidth()/20][placing_panel.getHeight()/20];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = 1;
            }
        }
        return map;
    }
    public static void fillPanelWithJLabels(int[][] mapData, String icon_filePath, JPanel panel) {

        int x = 0;
        int y = 0;



            x += 20;
            for (int i = 0; i < mapData.length; i++) {
                JLabel labelToPlace = new JLabel();
                labelToPlace.setSize(new Dimension(20, 20));
                ImageIcon imageCoin = new ImageIcon(icon_filePath);
                Icon icon_coin = new ImageIcon(imageCoin.getImage().getScaledInstance(labelToPlace.getWidth(), labelToPlace.getHeight(), Image.SCALE_DEFAULT));
                labelToPlace.setIcon(icon_coin);
                for (int j = 0; j < mapData[i].length; j++) {
                    if (mapData[i][j] == 1){
                        labelToPlace.setLocation(x,y);
                        panel.add(labelToPlace, 0);
                }
            }
            }
        }

    }


