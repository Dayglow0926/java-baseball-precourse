package pitching;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

//투수의 모델을 정한다
public class PitchingMachineModel {

    private List<Integer> randomballs = new ArrayList<>();

    public PitchingMachineModel(){
        creatRandomballs();
        System.out.println(randomballs.toString());
    }

    private void creatRandomballs(){
        String ball = "";
        while(ball.length()!=3){
            ball = duplicationCheck(ball,Randoms.pickNumberInRange(1, 9)+"");
        }
        String[] tem_arry = ball.split("");
        for (int i = 0; i < tem_arry.length; i++) {
            randomballs.add(Integer.parseInt(tem_arry[i]));
        }
    }

    private String duplicationCheck(String ball, String randomNumber){
        if(ball.indexOf(randomNumber)<0) ball+=randomNumber;
        return ball;
    }

    public List<Integer> getRandomballs() {
        return randomballs;
    }
}
