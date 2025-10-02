### 中正大學資工系選修課程 JAVA Programming: Enterprise and Embedded SystemsJava 的六次作業
本課程著重於介紹物件導向設計的概念，並使用 C++ 實作簡易程式。

1. Simpletron：模擬實作簡化的電腦，有記憶體、暫存器、指令擷取-解碼-執行循環
   * 模擬電腦基本結構運作，識別 instructions 與 operands
   * 操作虛擬 memory，包含 loading program、branch 等 

2. TicTacToe：實作一款可供兩名玩家參與的 Tic-Tac-Toe 遊戲
   HugeInteger：建立一個 class 作為儲存 40 位元的整數的資料結構，支援基本運算
   * 模組化程式碼，`HugeInteger`的基本運算與`TicTacToe`的遊戲各功能皆使用 function 連接
   * 使用`emum`紀錄 Tic-Tac-Toe 棋盤中的元素

3. CarbonFootprint：計算建築物、汽車與自行車在不同條件下的碳排放量
   * 定義`CarbonFootprint` interface，於`Bicycle`、`Car`、`Building` class 中實作 inplement
   * 將相同專案的 class 與 interface 使用 package 管理

4. TypingTutor：建立虛擬鍵盤並即時高亮對應按鍵、顯示輸入內容
   * 事件驅動：使用`KeyListener`監聽鍵盤事件，顯示即時回饋
   * 實作 GUI
   * 使用`Map`對應字元／按鈕