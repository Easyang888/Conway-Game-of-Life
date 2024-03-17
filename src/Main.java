import controller.GameOfLifeController;
import model.GameOfLifeModel;
import view.GameOfLifeView;

// 程序入口
public class Main {
    public static void main(String[] args) {
        GameOfLifeModel model = new GameOfLifeModel(50, 50); // 创建模型
        GameOfLifeView view = new GameOfLifeView(model); // 创建视图
        new GameOfLifeController(model, view); // 创建控制器
    }
}