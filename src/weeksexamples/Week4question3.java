package weeksexamples;

public class Week4question3 {
    public static void main(String[] args) {
        System.out.println(EnBuyukSayiDondur(123, 124));
    }

    public static int EnBuyukSayiDondur(int a, int b) {
        // 123 -- 45
        // 45 --- 123  --> 45 -> 4*10 + 5*1 = 9
        int basamak = 0;
        int result = 0;
        while (a != 0 && b != 0) { // düşük basamağa göre işlem yapmak için (&&)
            if (a % 10 > b % 10) { // a ve b den basamağı büyük olanı almak için
                result += a % 10 * (int) Math.pow(10, basamak);
            } else {
                result += b % 10 * (int) Math.pow(10, basamak);
            }
            a /= 10;
            b /= 10;
            basamak++;
        }

        return result;
    }
}
