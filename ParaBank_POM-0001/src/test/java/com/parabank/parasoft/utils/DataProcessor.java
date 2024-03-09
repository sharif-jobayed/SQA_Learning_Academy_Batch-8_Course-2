package com.parabank.parasoft.utils;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataProcessor {
    
    private static final Gson GSON=new Gson();
    private static final File COMMON_DATA=new File("./src/test/java/com/parabank/parasoft/data/commonData.json");
    private static final File ENV_SETTINGS=new File("./src/test/java/com/parabank/parasoft/data/envSettings.json");


    public static ProcessedCommonData getCommonData(){
        try {
            return GSON.fromJson(new FileReader(COMMON_DATA),ProcessedCommonData.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }
    public static ProcessedEnvSettings getEnvSettings(){
        try {
            return GSON.fromJson(new FileReader(ENV_SETTINGS),ProcessedEnvSettings.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

}
