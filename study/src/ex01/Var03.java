package ex01;

public class Var03 {
    public static void main(String[] args) {
        // 업 캐스팅, 묵시적 형 변환
        int n1 = 10;
        double d1 = n1; 
        //(double이 더 큰 박스이기 때문에 가능. **묵시적 형변환**
        // 작음 -> 큼 : 업캐스팅.
        System.out.println(d1);

        // 다운 캐스팅, 명시적 형변환
        double d2 = 10.5;
        int n2 = (int)d2; 
        // double이 int보다 커서 불가능. 
        // (int)붙여서 가능하게 한다. 
        // 큼 -> 작음 : 다운캐스팅
        // 0.5의 데이터는 유실.
        System.out.println(n2);

        // 문자 형변환 (아스키코드)
        // 010101111011
        char ch = 65;
        char data = (char)ch; 
        //int가 4바이트인데 ch가 2바이트라 강제로 형변환을 해야한다.
        //byte와 char는 크기와 상관없이 타입자체가 다르기 때문에 형변환
        //byte ch = 65; char data = (char)ch;
        System.out.println(data);
    }
}