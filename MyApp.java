import java.util.Scanner;
/**
 * Main Method
 * 
 * @author (2018315034 정철우, 2018315038 이혜인, 2018315040 김선민) 
 * @version (2020.05.29)
 */
public class MyApp
{
    /**
     * 나이를 입력받고 입장료를 출력하는 메소드
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요: ");
        Double age = sc.nextDouble();
        new Calculate();
        Calculate ca = new Calculate();
        ca.calculator(age);
        System.out.println(ca.fee + "원입니다.");
    }
}
