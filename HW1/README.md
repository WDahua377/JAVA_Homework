## 程式目的
本題為 *Java How to Program* (Deitel & Deitel) 的題目，實作模擬一簡單的電腦系統 Simpletron，該系統支援 Simpletron Machine Language (SML)，在啟動時會顯示 Simpletron 的使用說明，指示使用者輸入想要執行的 SML program，輸入 -99999 則結束 SML program 的輸入並開始執行 SML program，結束後將展示此時所有暫存器（`accumulator`、`instructionCounter`、`instructionRegister`、`operationCode`、`operand`）與記憶體內的內容。

### Simpletron
Simpletron 以 words 處理所有資訊，一個 word 定義為一個 4 位數的十進位有號數（-9999～+9999），包含一個特殊的累加器（accumulator）與大小為 100 words 的記憶體，以數字（00, 01, ..., 99）存取記憶體位址。`accumulator`為 Simpletron 中的一個特殊暫存器，欲處理的資料會先存入該暫存器中，計算結果也將保留在內；`instructionCounter`紀錄下一條指令的位址；`instructionRegister`儲存當前執行的指令。

### Simpletron Machine Language (SML)
SML program 的指令格式為 4 位數的十進位有號數（-9999～+9999），包含兩個數字`operationCode`與`operand`，前兩位數`operationCode`決定該指令的行為，後兩位數`operand`為指令所應用於的記憶體位址，在執行 SML Program 前，需要將 program 載入記憶體中，一個記憶體位址儲存的可以是一條指令或是一個變數，每個 SML program 皆從記憶體位址 00 開始，並連續執行。

Operation Code 的功能說明如下表：
|Operation Code|Operation|Meaning|
|:---|:---|:---|
|10|READ|讀取鍵盤的輸入並寫入指定的記憶體位址|
|11|WRITE|將指定記憶體位址中的資料寫入螢幕|
|20|LOAD|自指定記憶體位址讀取資料並載入累加器中|
|21|STORE|將累加器中的資料寫入指定記憶體位址|
|30|ADD|將累加器中的資料與指定記憶體位址的資料相加（結果仍存於累加器中）|
|31|SUBTRACT|將累加器中的資料與指定記憶體位址的資料相減（結果仍存於累加器中）|
|32|DIVIDE|將累加器中的資料除以指定記憶體位址的資料（結果仍存於累加器中）|
|33|MULTIPLY|將累加器中的資料與指定記憶體位址的資料相乘（結果仍存於累加器中）|
|40|BRANCH|跳轉執行指定記憶體位址中的指令|
|41|BRANCHNEG|若累加器中的值為負，則跳轉執行指定記憶體位址中的指令|
|42|BRANCHZERO|若累加器中的值為零，則跳轉執行指定記憶體位址中的指令|
|43|HALT|程式結束執行|

### 範例
<li>輸入</li>

```bash
00 ? 1009
01 ? 1010
02 ? 2009
03 ? 3110
04 ? 4107
05 ? 1109
06 ? 4300
07 ? 1110
08 ? 4300
09 ? 0000
10 ? 0000
```
<li>輸出</li>

```bash
REGISTERS:
accumulator         0004
instructionCounter  0006
instructionRegister 4300
operationCode       43
operand             00

MEMORY:
 0 1009 1010 2009 3110 4107 1109 4300 1110 4300 0007
10 0003 -99999 0000 0000 0000 0000 0000 0000 0000 0000
20 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
30 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
40 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
50 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
60 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
70 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
80 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
90 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
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
javac Simpletron.java
```

## 清理環境
清理建置過程中所生成的檔案
```bash
rm -f *.class
```

## 執行
```bash
java -cp . Simpletron
```