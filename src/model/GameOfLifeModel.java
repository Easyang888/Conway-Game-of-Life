package model;

public class GameOfLifeModel {
    private boolean[][] grid;
    private final int width;
    private final int height;

    public GameOfLifeModel(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new boolean[height][width];
    }

    // 初始化或随机生成初始状态
    public void initialize() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = Math.random() < 0.5;
            }
        }
    }

    // 更新游戏状态
    public void update() {
        boolean[][] newGrid = new boolean[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int liveNeighbors = countLiveNeighbors(i, j);
                if (grid[i][j]) {
                    newGrid[i][j] = liveNeighbors == 2 || liveNeighbors == 3;
                } else {
                    newGrid[i][j] = liveNeighbors == 3;
                }
            }
        }
        grid = newGrid;
    }

    // 计算给定位置周围活细胞的数量
    private int countLiveNeighbors(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int nx = x + i, ny = y + j;
                if (nx >= 0 && nx < height && ny >= 0 && ny < width) {
                    count += grid[nx][ny] ? 1 : 0;
                }
            }
        }
        return count;
    }

    // 获取当前游戏板状态
    public boolean[][] getGrid() {
        return grid;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
