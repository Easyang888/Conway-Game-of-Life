# 康威生命游戏 (Conway's Game of Life)

康威生命游戏是一个零玩家游戏，由英国数学家约翰·霍顿·康威在1970年发明。这个游戏在一个无限的二维网格上进行，通过简单的规则模拟细胞的生死变化。

## 开始使用

### 环境要求

- Java 8 或更高版本

### 项目结构

```
src/
│
├── model/
│   └── GameOfLifeModel.java
│
├── view/
│   └── GameOfLifeView.java
│
├── controller/
│   └── GameOfLifeController.java
│
└── Main.java
```
### 安装与运行

1. 克隆仓库到本地：

   ```
   git clone https://gitee.com/Snake-Konginchrist/Conway-Game-of-Life.git
   ```

2. 在项目目录中编译 Java 程序：

   ```
   javac src/Main.java
   ```

3. 运行游戏：

   ```
   java src/Main
   ```

## 特性

- 图形用户界面展示游戏进程。
- 支持自定义初始状态。
- 可调节游戏进程速度。

## 游戏规则

1. **生存**：每个生细胞周围有2或3个生细胞，则该位置生细胞存活到下一代。
2. **死亡**：每个生细胞周围充斥着过多或过少的生细胞，则该位置生细胞死亡。
3. **繁殖**：每个死细胞周围正好有3个生细胞，则该位置死细胞复活。

## 贡献

欢迎通过 Pull Requests 或 Issues 来贡献代码、报告错误或提出新功能建议。

## 许可证

本项目采用 [MIT 许可证](LICENSE)。
