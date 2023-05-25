import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Map {
    public static int XofclickedLabel;
    public static int YofclickedLabel;

    public static int[][] getMapDataGrass(JPanel placing_panel) {
        int[][] map = new int[30][60];

        for (int col = 0; col < 60; col++) {
            for (int row = 0; row < 30; row++) {
                map[row][col] = 1;
            }
        }
        return map;
    }

    public static void fillPanelWithJLabels(int[][] mapData, String icon_filePath, JPanel panel, int Tilesize) {

        int x = 0;
        int y = 0;


        for (int row = 0; row < mapData.length; row++) {

            for (int col = 0; col < mapData[row].length; col++) {
                if (col == 59) {
                    y = y + Tilesize;
                    x = 0;
                }
                if (mapData[row][col] == 1 || mapData[row][col] == 2) {

                    JLabel labelToPlace = new JLabel();
                    labelToPlace.setSize(new Dimension(Tilesize, Tilesize));
                    ImageIcon imageCoin = new ImageIcon(icon_filePath);
                    Icon icon_coin = new ImageIcon(imageCoin.getImage().getScaledInstance(labelToPlace.getWidth(), labelToPlace.getHeight(), Image.SCALE_DEFAULT));
                    labelToPlace.setIcon(icon_coin);
                    labelToPlace.setLocation(x, y);
                    labelToPlace.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {

                         if(SwingUtilities.isRightMouseButton(e)) {
                             ImageIcon imageCoin = new ImageIcon("src/visualResources/grassTileClicked.png");
                             Icon icon_coin = new ImageIcon(imageCoin.getImage().getScaledInstance(labelToPlace.getWidth(), labelToPlace.getHeight(), Image.SCALE_DEFAULT));
                             labelToPlace.setIcon(icon_coin);
                             System.out.println(labelToPlace.getX());
                         }
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {

                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {

                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {

                        }

                        @Override
                        public void mouseExited(MouseEvent e) {

                        }
                    });

                    x = x + 20;
                    panel.add(labelToPlace);

                }

            }


        }

    }

    }





