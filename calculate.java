
/**
 * ABC수족관 입장료를 계산하는 메소드
 * 
 * @author (2018315034 정철우, 2018315038 이혜인, 2018315040 김선민 ) 
 * @version (2020.05.29)
 */
public class calculate
{
    Double age;
    int fee;
    public void calculator(){
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
        System.out.println(fee +"원");
    }
}
