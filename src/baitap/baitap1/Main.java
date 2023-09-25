package baitap.baitap1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("hello");
        System.out.println("giá trị myString ban đầu là: " +myClass.getMyString());
        myClass.setMyString("hello word");
        System.out.println("giá trị myString sau thay dổi là: " + myClass.getMyString());
    }
}
