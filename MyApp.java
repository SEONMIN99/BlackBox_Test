import java.util.Scanner;
/**
 * Main Method
 * 
 * @author (2018315034 정철우, 2018315038 이혜인, 2018315040 김선민) 
 * @version (2020.05.29)
 */
public class MyApp
{
    public static void main(String args[]) { // calculate에 대한 메인 메소드
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요: ");
        Double age = sc.nextDouble();
        new calculate();
    }
}
