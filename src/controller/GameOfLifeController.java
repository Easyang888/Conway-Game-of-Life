package controller;

import model.GameOfLifeModel;
import view.GameOfLifeView;

import javax.swing.*;

// 控制游戏的流程和用户交互
public class GameOfLifeController {
    private final GameOfLifeModel model;
    private final GameOfLifeView view;

    public GameOfLifeController(GameOfLifeModel model, GameOfLifeView view) {
        this.model = model;
        this.view = view;
        model.initialize(); // 初始化模型
        setupTimer();
        view.setVisible(true);
    }

    // 设置定时器，定时更新游戏状态
    private void setupTimer() {
        // 更新模型状态
        // 重新绘制视图
        Timer timer = new Timer(100, e -> {
            model.update(); // 更新模型状态
            view.repaint(); // 重新绘制视图
        });
        timer.start();
    }
}