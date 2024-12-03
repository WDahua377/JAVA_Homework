public class HugeInteger{

    int[] digitarray;

    // constructor
    HugeInteger(int n){
        String s = Integer.toString(n);
        parse(s);
    }

    HugeInteger(String s){
        this.parse(s);
    }

    // parse receive String, extract using method chatAt and place it into array
    public void parse(String s){
        digitarray = new int[40];
        for(int i = 1; i <= s.length(); i++)
            digitarray[40-i] = s.charAt(s.length() - i) - '0';
    }

    // toString
    public String toString(){
        String s = new String();
        for(int i = 40 - digitarray.length; i < 40; i++){
            s += Integer.toString(digitarray[i]);
        }
        return s;
    }

    // add
    public HugeInteger add(HugeInteger n){
        String s = new String();
        int sum = 0, carry = 0;

        for(int i = 39; i >= 0; i--){
            sum = digitarray[i] + n.digitarray[i] + carry;
            if(sum >= 10){
                carry = 1;
                sum -= 10;
            }
            else
                carry = 0;

            s = Integer.toString(sum) + s;
        }

        HugeInteger ans = new HugeInteger(s);

        return ans;
    }

    // subtract
    public HugeInteger subtract(HugeInteger n){
        String s = new String();
        int borrow = 0, difference = 0;

        for(int i = 39;i >= 0;i--){
            difference = digitarray[i] - borrow - n.digitarray[i];
            if(difference < 0){
                borrow = 1;
                difference += 10;
            }
            else
                borrow = 0;

            s = Integer.toString(difference) + s;
        }

        HugeInteger ans = new HugeInteger(s);

        return ans;
    }

    // isEqualTo
    public boolean isEqualTo(HugeInteger n){
        for(int i = 39; i >= 0; i--){
            if(digitarray[i] != n.digitarray[i])
                return false;
        }
        return true;
    }
    
    // isNotEqualTo
    public boolean isNotEqualTo(HugeInteger n){
        for(int i = 39; i >= 0; i--){
            if(digitarray[i] != n.digitarray[i])
                return true;
        }
        return false;
    }

    // isGreaterThan
    public boolean isGreaterThan(HugeInteger n){
        for(int i = 0; i < 40; i++){
            if(digitarray[i] > n.digitarray[i])
                return true;
        }
        return false;
    }

    // isLessThan
    public boolean isLessThan(HugeInteger n){
        if(!isGreaterThan(n) && isNotEqualTo(n))
            return true;
        return false;
    }

    // isGreaterThanOrEqualTo
    public boolean isGreaterThanOrEqualTo(HugeInteger n){
        if(this.isEqualTo(n) || this.isGreaterThan(n))
            return true;
        return false;
    }

    // isLessThanOrEqualTo
    public boolean isLessThanOrEqualTo(HugeInteger n){
        if(this.isEqualTo(n) || this.isLessThan(n))
            return true;
        return false;
    }

    // isZero
    public boolean isZero(){
        for(int i = 0; i < 40; i++){
            if(digitarray[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        HugeInteger a = new HugeInteger(123);
        HugeInteger b = new HugeInteger(4);
        HugeInteger c = new HugeInteger(123);
        HugeInteger d = new HugeInteger(0);

        HugeInteger sum = a.add(b);
        System.out.println(sum);
        HugeInteger difference = a.subtract(b);
        System.out.println(difference);

        System.out.println(a.isEqualTo(b));
        System.out.println(a.isEqualTo(c)); // same
        System.out.println(a.isNotEqualTo(b));
        System.out.println(a.isNotEqualTo(c)); // same

        System.out.println(a.isGreaterThan(b));
        System.out.println(a.isLessThan(b));
        System.out.println(a.isGreaterThanOrEqualTo(b));

        System.out.println(a.isLessThanOrEqualTo(b));
        System.out.println(a.isLessThanOrEqualTo(c));

        System.out.println(a.isZero());
        System.out.println(d.isZero());
    }

}