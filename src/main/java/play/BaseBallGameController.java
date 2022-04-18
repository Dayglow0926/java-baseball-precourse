package play;

import batter.BatterUserModel;
import camp.nextstep.edu.missionutils.Console;
import error.ExceptionUtil;
import pitching.PitchingMachineModel;

public class BaseBallGameController {

    private PitchingMachineModel randomballs;
    private BatterUserModel userSwing;

    public void ballSet(){
        randomballs = new PitchingMachineModel();
    }

    public int start(){
        ballSet();
        int gameSet = 0;
        while(gameSet!=3) {
            inputNumberMessage();
            String swing = Console.readLine();
            userSwing = new BatterUserModel(swing);
            gameSet = BaseballRuleUtil.pitchingMachineBallvsBatter(randomballs.getRandomballs(), userSwing.getUserSwing());
        }
        restartMessage();
        return restartCheck();
    }

    private void restartMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    private void inputNumberMessage(){
        System.out.print("숫자를 입력해주세요 : ");
    }

    private int restartCheck(){
        String check = Console.readLine();
        ExceptionUtil.lengthErrorException(check,1);
        ExceptionUtil.IntegerTypeErrorException(check);
        ExceptionUtil.IntegerOverErrorExcpetion(Integer.parseInt(check),2);
        return Integer.parseInt(check);
    }

}
