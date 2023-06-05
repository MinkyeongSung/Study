package src.Chap2;

//조건 연산자
// 반지름 20cm 피자2개, 30cm 피자 1개의 면적비교
public class P10 {
    public static void main(String[] args) {
        double area1 = 2 * 3.141592 * 20 * 20;
        double area2 = 3.141592 * 30 * 30;
        System.out.println("20cm 피자 면적=" + area1);
        System.out.println("30cm 피자 면적 ==" + area2);
        System.out.println((area1 > area2) ? "20cm 두개" : "30cm 한 개"); // ? 참:거짓
    }
}
