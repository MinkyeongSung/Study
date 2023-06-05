package src.Chap4;

/*
가솔린 8.896L를 충전한 A 자동차는 총 182.736Km를 운행할 수 있다고 한다. 
이자의 연비를 계산하고, 출력 예와 같은 결과를 얻으시오.
출력 예) 연비: 20.62km/L
 */
public class Gasoline {

    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double efficiency = calcEffiency(gasoline, distance);
        System.out.printf("연비 : %.2f km/L", efficiency);
    }

    public static double calcEffiency(double fuel, double distance) {
        /* 해당 메소드를 구현 하세요 */

        return distance / fuel;
    }
}
