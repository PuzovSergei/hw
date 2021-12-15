package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BattleField extends JPanel {
    private GameWindow gameWindow;

    private int size;
    private int winningLenght;

    private boolean isInit;

    private int cellWight;
    private int cellHeight;


    public BattleField(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWight;
                int cellY = e.getY() / cellHeight;

                if (!Logic.gameFinished) {
                    Logic.humanTurn(cellX, cellY);
                }
            }
        });
    }

    void startNewGame(int size, int winningLenght) {
        this.size = size;
        this.winningLenght = winningLenght;

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!isInit) {
            return;
        }

        cellWight = getWidth()/size;
        cellHeight = getHeight()/size;

        g.setColor(Color.DARK_GRAY);
        ((Graphics2D)g).setStroke(new BasicStroke(3f));

        for (int i = 0; i < size; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, getWidth(), y);
        }

        for (int i = 0; i < size; i++) {
            int x = i * cellWight;
            g.drawLine(x, 0, x, getHeight());
        }

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[j][i] == Logic.DOT_X) {
                    drawX(g,i, j );
                }
            }
        }
        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[j][i] == Logic.DOT_O) {
                    drawO(g,i, j );
                }
            }
        }
        repaint();

    }
    private void  drawX(Graphics g, int cellX, int cellY) {
        g.setColor(Color.BLUE);
        ((Graphics2D)g).setStroke(new BasicStroke(5f));

        g.drawLine(cellX * cellWight, cellY * cellHeight,
                cellX * cellWight + cellWight, cellY * cellHeight + cellHeight );
        g.drawLine(cellX * cellWight, cellY * cellHeight +cellHeight,
                cellX * cellWight + cellWight, cellY * cellHeight);
    }

    private void  drawO(Graphics g, int cellX, int cellY) {
        g.setColor(Color.MAGENTA);
        ((Graphics2D)g).setStroke(new BasicStroke(5f));

        g.drawOval(cellX * cellWight, cellY * cellHeight,
                cellWight, cellHeight );
    }
}
