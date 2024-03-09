package ideaScale_0001.utils;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataProcessor {

    private final static Gson GSON=new Gson();
    private final static File COMMON_DATA=new File("./src/test/java/ideaScale_0001/data/commonData.json");


    public static ProcessedData getProcessedData(){
        try {
            return GSON.fromJson(new FileReader(COMMON_DATA),ProcessedData.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

}
