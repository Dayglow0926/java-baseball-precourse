package error;

import java.util.List;

public class ExceptionUtil {

    public static void lengthErrorException(String str, int len) throws IllegalArgumentException{
        if(str.length() != len ) throw new IllegalArgumentException();
    }

    public static void IntegerTypeErrorException(String str) throws IllegalArgumentException{
        boolean isNum = str.matches("[+-]?\\d*(\\.\\d+)?");
        if(!isNum) throw new IllegalArgumentException();
    }

    public static void IntegerOverErrorExcpetion(int i,int max) throws IllegalArgumentException{
        if(i>max) throw new IllegalArgumentException();
    }

}
