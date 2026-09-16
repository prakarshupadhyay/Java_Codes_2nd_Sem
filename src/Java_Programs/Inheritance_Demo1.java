package Java_Programs;
public class Inheritance_Demo1 {
    class A {
        int money;
        int pocketMoney;
        void fill(int money, int pocketMoney) {
            this.money = money;
            this.pocketMoney = pocketMoney;
        }
        int getpocketMoney() {
            return pocketMoney;
        }
    }
    class B extends A {
        int total;
        int getMoney() {
            return money;
        }
        void sum() {
            total = money + getpocketMoney();
        }
    }
    public static void main(String[] args) {
        Inheritance_Demo1 obj = new Inheritance_Demo1();
        B b = obj.new B();
        b.fill(1000, 500);
        b.sum();
        System.out.println("Total money: " + b.total);
    }
}
