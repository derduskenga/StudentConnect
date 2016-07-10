package models.web.utility;

/**
 * Created by derdus on 6/21/16.
 */
public class Utility {
    //all static variable here
    public static String UNIVERSITY_LOGO_FOLDER = "";
    public static String SITE_IMAGES_FOLDER = "";
    public static double KES_US_DOLLAR_EXCHANGE_RATE = 97.00;
    public static Long FILE_UPLOAD_SIZE_LIMIT = 25* 1024L * 1024L;
    public static int COURSE_FILE_EXCEL_FILE_LIMIT = 3;
    public static String COURSE_EXCEL_SHEET_NAME = "Sample course file";
    public static String INSTITUTION_EXCEL_SHEET_NAME = "Sample institution file";
    public static String COURSE_BLOG_URL = "http://blog.ourdomain.com";
    public static String JOB_PLACEMENT_BLOG_URL = "http://blog.ourdomain.com";
    public static String COURSE_SPECIALIZATION_BLOG_URL = "http://blog.ourdomain.com";

    public enum SampleFileType {
        //ordinal- 0,1
        COURSE, INSTITUTION
    }
}