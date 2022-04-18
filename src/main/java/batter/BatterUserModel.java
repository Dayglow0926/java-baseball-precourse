package batter;

import camp.nextstep.edu.missionutils.Console;
import error.ExceptionUtil;

import java.util.ArrayList;
import java.util.List;

public class BatterUserModel {

    private List<Integer> userSwing;

    public BatterUserModel(String swing){
        userSwing = new ArrayList<>();
        ExceptionUtil.lengthErrorException(swing,3);
        ExceptionUtil.IntegerTypeErrorException(swing);
        String[] tem_arry = swing.split("");
        for (int i = 0; i < tem_arry.length; i++) {
            userSwing.add(Integer.parseInt(tem_arry[i]));
        }
    }

    public List<Integer> getUserSwing() {
        return userSwing;
    }
}
