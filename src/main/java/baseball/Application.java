package baseball;

import camp.nextstep.edu.missionutils.Console;
import play.BaseBallGameController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BaseBallGameController baseballGame = new BaseBallGameController();
        int startNumber = 0;
        do{
            startNumber = baseballGame.start();
        }while (startNumber==1);
    }
}
