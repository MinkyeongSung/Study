package ex13;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Pear");
        list.add("Grape");

        int index = list.indexOf("Mango"); // Arraylist에 저장된 문자열들을 검색한다.

        System.out.println("Mango의 위치:" + index);
    }
}
