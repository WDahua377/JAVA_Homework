# Huge Integer
## 程式目的
本題為 *Java How to Program* (Deitel & Deitel) 的題目，建立一個 class `HugeInteger`，作為一個 40 個位元長的整數的資料結構，包含以下 methods：
|Method|Meaning|
|:---|:---|
|parse|將輸入字串轉換成數字儲存於物件|
|toString|將物件儲存的數值轉換為字串|
|add|回傳目前物件與指定物件的和|
|subtract|回傳目前物件減去指定物件的結果|
|isEqualTo|若兩物件相等，回傳`true`，否則回傳`false`|
|isNotEqualTo|若兩物件不相等，回傳`true`，否則回傳`false`|
|isGreaterThan|若目前物件的值大於指定物件的值，回傳`true`，否則回傳`false`|
|isLessThan|若目前物件的值小於指定物件的值，回傳`true`，否則回傳`false`|
|isGreaterThanOrEqualTo|若目前物件的值大於等於指定物件的值，回傳`true`，否則回傳`false`|
|isLessThanOrEqualTo|若目前物件的值小於等於指定物件的值，回傳`true`，否則回傳`false`|
|isZero|若物件的值等於零，回傳`true`，否則回傳`false`|

### 範例
<li>範例 main 函式</li>

```java
public static void main(String[] args) {
    HugeInteger a = new HugeInteger(123);
    HugeInteger b = new HugeInteger(4);
    HugeInteger c = new HugeInteger(123);
    HugeInteger d = new HugeInteger(0);

    HugeInteger sum = a.add(b); // 123 + 4 = 127
    System.out.println(sum);
    HugeInteger difference = a.subtract(b); // 123 - 4 = 119
    System.out.println(difference);

    System.out.println(a.isEqualTo(b));
    System.out.println(a.isEqualTo(c));
    System.out.println(a.isNotEqualTo(b));
    System.out.println(a.isNotEqualTo(c));

    System.out.println(a.isGreaterThan(b));
    System.out.println(a.isLessThan(b));
    System.out.println(a.isGreaterThanOrEqualTo(b));

    System.out.println(a.isLessThanOrEqualTo(b));
    System.out.println(a.isLessThanOrEqualTo(c));

    System.out.println(a.isZero());
    System.out.println(d.isZero());
}
```
<li>輸出</li>

```bash
0000000000000000000000000000000000000127
0000000000000000000000000000000000000119
false
true
true
false
true
false
true
false
true
false
true
```

# Tic-Tac-Toe
## 程式目的
本題為 *Java How to Program* (Deitel & Deitel) 的題目，建立一個 class `TicTacToe`，能夠讓兩個玩家玩 Tic-Tac-Toe 遊戲，遊戲會判斷輸贏並自動進行下一輪，直到玩家輸入 -1 結束遊戲。

### 範例
<li>範例 main 函式</li>

```java
public static void main(String[] args){
    TicTacToe game = new TicTacToe();
    game.run();
}
```
<li>Tic-Tac-Toe 遊玩範例</li>

```bash
        Tic Tac Toe

Player 1 (X) - Player 2 (O)

         1 | 2 | 3
        ---|---|---
         4 | 5 | 6
        ---|---|---
         7 | 8 | 9
Enter the number of position to fill in.
Enter -1 to end the game.

Player 1, Please choose a square:
5
   |   |
---|---|---
   | X |
---|---|---
   |   |
Player 2, Please choose a square:
2
   | O |
---|---|---
   | X |
---|---|---
   |   |
Player 1, Please choose a square:
7
   | O |
---|---|---
   | X |
---|---|---
 X |   |
Player 2, Please choose a square:
3
   | O | O
---|---|---
   | X |
---|---|---
 X |   |
Player 1, Please choose a square:
1
 X | O | O
---|---|---
   | X |
---|---|---
 X |   |
Player 2, Please choose a square:
9
 X | O | O
---|---|---
   | X |
---|---|---
 X |   | O
Player 1, Please choose a square:
4
 X | O | O
---|---|---
 X | X |
---|---|---
 X |   | O
Player 1 has won!
```

## 工具準備

<li>安裝 JAVA：</li>

```bash
sudo apt update
sudo apt install default-jre
```
查看是否已安裝： ```java -version```

<li>安裝 JDK：</li>

```bash
sudo apt update
sudo apt install default-jdk
```
查看是否已安裝： ```javac -version```

## 編譯
進入專案目錄並輸入以下指令：
```bash
javac HugeInteger.java TicTacToe.java
```

## 執行
```bash
java -cp . HugeInteger
java -cp . TicTacToe
```

## 清理環境
清理建置過程中所生成的檔案
```bash
rm -f *.class
```