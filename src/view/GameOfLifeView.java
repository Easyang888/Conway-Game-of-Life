package view;

import model.GameOfLifeModel;

import javax.swing.*;
import java.awt.*;

// 游戏的图形界面
public class GameOfLifeView extends JFrame {
    private final GameOfLifeModel model;
    private final int size = 10; // 细胞的大小

    public GameOfLifeView(GameOfLifeModel model) {
        this.model = model;
        setTitle("康威生命游戏");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
        pack();
        setLocationRelativeTo(null); // 居中显示
    }

    private void initUI() {
        setLayout(new BorderLayout());
        JPanel drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);
    }

    private class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            boolean[][] grid = model.getGrid();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j]) {
                        g.fillRect(j * size, i * size, size, size);
                    }
                }
            }
        }

        @Override
        public Dimension getPreferredSize() {
            // 确保JPanel有足够的空间来绘制所有细胞
            return new Dimension(model.getWidth() * size, model.getHeight() * size);
        }
    }
}