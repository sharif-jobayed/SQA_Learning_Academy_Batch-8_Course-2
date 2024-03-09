package ideaScale_0001.utils;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataProcessor {
    
    private static final Gson GSON=new Gson();
    private static final File COMMON_DATA=new File("./src/test/java/ideaScale_0001/data/commonData.json");


    public static ProcessedData getProcessedData(){
        try{
            return GSON.fromJson(new FileReader(COMMON_DATA),ProcessedData.class);
        }catch(Exception e){
            try {
                throw new FileNotFoundException(e.getLocalizedMessage());
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex.getLocalizedMessage());
            }
        }
    }
    
}
