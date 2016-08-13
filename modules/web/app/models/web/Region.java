package models.web;

/**
 * Created by derdus on 6/22/16.
 */
/*For regions in Kenya: We use the provinces*/
import java.util.Map;
import java.util.HashMap;
public enum Region {
    Central,Coast,Eastern,Nairobi,North_Eastern,Nyanza,Rift_Valley,Western;

    private static Map<Integer, Region> map = new HashMap<Integer, Region>();
    private int regionNo;

    static {
        for (Region regionEnum : Region.values()) {
            map.put(regionEnum.regionNo, regionEnum);
        }
    }

    public static Region valueOf(int regionNo) {
        return map.get(regionNo);
    }
}
