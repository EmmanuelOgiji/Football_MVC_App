package org.ECSDigital.EmmanuelOgiji;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReusableMethods {
    public static URL constructURL (String HOST, String Resource){
        String URL = HOST+Resource;
        URL url = null;
        try {
            url = new URL(URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static HttpURLConnection setupConnection(String Request, URL url){
        HttpURLConnection connect=null;
        try{
        connect = (HttpURLConnection)url.openConnection();
        connect.setRequestMethod(Request);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return connect;
    }

    public static String readIncomingData(URL url){
        Scanner sc = null;
        try {
            sc = new Scanner(url.openStream());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        //String IncomingData=Resources.backup();
        String IncomingData="";
        while(sc.hasNext())
        {
            IncomingData+=sc.nextLine();
        }
        sc.close();
        return IncomingData;
    }

    public static JSONArray parseJSONStringtoJSONArray(String JSONString, String key){
        JSONObject obj = new JSONObject(JSONString);
        JSONArray Array = obj.getJSONArray(key);
        return Array;
    }

    public static JSONObject parseJSONStringtoJSONObject(String JSONString) {
        JSONObject obj = new JSONObject(JSONString);
        return obj;
    }
}
