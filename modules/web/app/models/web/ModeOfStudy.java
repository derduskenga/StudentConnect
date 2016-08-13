package models.web;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by derdus on 6/21/16.
 */
public enum ModeOfStudy {
    Weekend_clasess,Full_time_clasess,Evening_clasess,Distance_learning,School_based,Modular,Part_time,Early_morning,Other;

    public static Map<String,Boolean> modeOfStudyMap(){
        Map<String,Boolean> modeOfStudyModeMap = new HashMap<String,Boolean>();
        for(ModeOfStudy mode: ModeOfStudy.values()){
            modeOfStudyModeMap.put(mode.toString(),false);
        }
        return modeOfStudyModeMap;
    }
}
