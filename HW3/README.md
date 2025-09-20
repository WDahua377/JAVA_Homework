## 程式目的
本題為 *Java How to Program* (Deitel & Deitel) 的題目，使用 interfaces 對不同 class 進行同一操作，計算並列出建築物、汽車與自行車在不同條件下的 Carbon Footprint。

### Carbon Footprints
Carbon Footprints 為二氧化碳一年的排放量，例如建築內的暖氣燃燒燃料以及交通工具所排放的二氧化碳。根據經濟部能源署網站提供的「產業範例計算公式」，建築物（class `Building`）的碳排放量= 能源使用量 x 溫室氣體排放係數，可根據不同電力、天然氣與汽油用量計算該建築的碳排放量；而汽車（class `Car`）與自行車（class `Bicycle`）的碳排放量則參考 Discerning Cyclist 的文章 *Is Cycling Really Green?*，汽車每英里產生 280 克二氧化碳，自行車則為每英里 33 克。

<p style="color: #CCC;">碳足跡計算方式參考資料：<br>
Vine, C. (2023, February 14). *Is cycling really green? [The Pros + Cons of bikes for the environment].* Discerning Cyclist. <a href="https://discerningcyclist.com/is-cycling-real-green-environment/">https://discerningcyclist.com/is-cycling-real-green-environment/</a>
碳排金好算 (工研院) <a href="https://pj.ftis.org.tw/CFCv2/CFC/Index">https://pj.ftis.org.tw/CFCv2/CFC/Index</a></p>

### 範例
<li>範例 main 函式</li>

```java
public static void main(String[] args){
   ArrayList<CarbonFootprint> list = new ArrayList<CarbonFootprint>();

   // Building(electric, natural_gas, gas);
   Building building1 = new Building(10,10,20);

   // Car(mile);
   Car car1 = new Car(100);

   // Bicycle(mile);
   Bicycle bicycle1 = new Bicycle(40);

   list.add(building1);
   list.add(car1);
   list.add(bicycle1);

   for (CarbonFootprint i : list){
      System.out.printf("The footprint is around %.2f kg of Co2.\n\n", i.getCarbonFootprint());
   }
}
```
<li>輸出</li>

```bash
The building uses 10.00 kWh for electricity, 10.00 m3 for natural gas, and 20.00 kL for gasoline.
The footprint is around 40322.40 kg of CO2.

The total mileage of driving is 100.00 mile.
The footprint is around 28.00 kg of CO2.

The total mileage of cycling is 40.00 mile.
The footprint is around 1.32 kg of CO2.
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
進入專案的父目錄並輸入以下指令：
```bash
javac HW3/*.java
```

## 執行
```bash
java -cp . HW3.app
```

## 清理環境
清理建置過程中所生成的檔案
```bash
rm -f HW3/*.class
```