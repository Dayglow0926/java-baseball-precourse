package play;

import batter.BatterUserModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pitching.PitchingMachineModel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BaseballRuleUtilTest {

    private List<Integer> pitching = null;
    private List<Integer> batter = null;

    @BeforeEach
    void setUp(){
        PitchingMachineModel pitchingMachineModel = new PitchingMachineModel();
        BatterUserModel batterUserModel = new BatterUserModel("123");

        pitching = pitchingMachineModel.getRandomballs();
        batter = batterUserModel.getUserSwing();
    }

    @Test
    void 정상동작_확인_테스트() {
        BaseballRuleUtil.pitchingMachineBallvsBatter(pitching,batter);
    }
}