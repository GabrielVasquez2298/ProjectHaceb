package com.Haceb.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
public class UserData {
    private  static ArrayList<Map<String, String>> data= new ArrayList<>();

    public static ArrayList<Map<String, String>> extractTo(){
        try {
            data= Doc.readData("src/main/resources/UserData/UserData.xlsx","Credentials");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
