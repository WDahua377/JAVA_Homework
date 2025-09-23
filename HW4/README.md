## 程式目的
本題為 *Java How to Program* (Deitel & Deitel) 的題目，建立一個能夠幫助學習打字的 GUI 程式，在螢幕上建立一個虛擬鍵盤與文字輸入框，並在真正的鍵盤被按下時顯示動畫，讓使用者不用低頭看著鍵盤就能夠知道自己按下的是什麼鍵。

### 範例
<li>實際介面截圖</li>

<!-- <div align = "center"> -->
<img src = "https://github.com/WDahua377/JAVA_Homework/blob/main/HW4/GUI_Image.png" width = 70%></div>


## 工具準備

安裝 JAVA JDK：

```bash
sudo apt update
sudo apt install default-jdk
```
查看是否已安裝：
```bash
javac -version
java -version
```

## 編譯
進入專案目錄並輸入以下指令：
```bash
javac TypingTutor.java
```

## 執行
```bash
java -cp . TypingTutor
```

## 清理環境
清理建置過程中所生成的檔案
```bash
rm -f *.class
```