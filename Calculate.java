
/**
 * ABC수족관 입장료를 계산하는 메소드
 * 
 * @author (2018315034 정철우, 2018315038 이혜인, 2018315040 김선민 ) 
 * @version (2020.05.29)
 */
public class Calculate
{
    Double age;
    int fee;
    /**
     * 입장료를 계산하여 반환하는 메소드
     * 
     * @param  age 파라미터로 나이를 입력받음 
     * @return 나이를 계산하여 요금을 반환 
     */
    public int calculator(Double age){
        if(age < 4){
            fee = 0;
        }
        else if(age >= 4 && age < 7){
            fee = 400;
        }
        else if(age >= 7 && age < 16){
            fee = 900;
        }
        else if(age >= 16){
            fee = 2000;
        }
        return fee;
    }
}
