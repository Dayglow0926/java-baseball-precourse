package play;

import java.util.List;

public class BaseballRuleUtil {

    public static int ball,strike = 0;

    public static int pitchingMachineBallvsBatter(List<Integer> pitchingMachineBall, List<Integer> user){
        String result="";
        ball = 0;
        strike = 0;
        for(int i=0; pitchingMachineBall.size()>i; i++){
            swing(i,pitchingMachineBall.get(i),user);
        }
        System.out.println(setResult());
        return strike;
    }


    private static void swing(int pitchingNum,int pitchingValue, List<Integer> user){

        for(int i=0; user.size()>i; i++){
            setCount(pitchingValue == user.get(i),pitchingNum == i);
        }

    }

    private static void setCount(boolean ball_state, boolean seat_state){

        if(ball_state&&seat_state) {
            strike++;
            return;
        }
        if(ball_state) {
            ball++;
            return;
        }

    }

    private static String setResult(){
        String result="";

        if(ball==0&&strike==0) return "낫싱";

        if(ball>0) result += ball+"볼 ";
        if(strike>0) result += strike+"스트라이크";

        return result;
    }

}
