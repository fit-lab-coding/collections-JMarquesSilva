package fit.core;

import java.util.LinkedHashMap;
import java.util.Map;

public class AttendanceHelper {

    public static Map<String, Boolean> random(int alunos, int percentual) {

        int result = (alunos + ((percentual/100) * alunos))/2;
        var presente = false;

        Map<String, Boolean> resultMap = new LinkedHashMap<String, Boolean>();

        for(int i = 0; i < alunos; i++) {
            if(i >= result) presente = true;
            resultMap.put("Key_"+i,  presente);
        }

        return resultMap;
    }

}
