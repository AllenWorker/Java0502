/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day12;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB-study
 */
public class OpenWeatherDemo {
    private static String key ="19ea0f632a5ad657936c37bcb031ae40";
    private static String path="http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
    private static String path_icon="http://openweathermap.org/img/wn/%s@2x.png";
    public static void main(String[] args) {
        printWeather("taoyuan,tw");
    }
    
    public static void printWeather(String city) {
        try {
            path = String.format(path, city, key);
            //1. 建立URL物件
            URL url = new URL(path);
            //2. 取得InputStream 串流資料
            InputStream is = url.openStream();
            //3. 取得JSON文字資料
            String json = new Scanner(is).useDelimiter("\\A").next();
            System.out.println(json);
            //4. 利用Gson分析資料 -> root ->Json根物件
            JsonObject root = new JsonParser().parse(json).getAsJsonObject();
            JsonObject main = root.getAsJsonObject("main");
            JsonArray weatherArray = root.getAsJsonArray("weather");
            JsonObject weatherobj = weatherArray.get(0).getAsJsonObject();
            double temp = main.get("temp").getAsDouble() - 273.15;
            double feels_like = main.get("feels_like").getAsDouble() - 273.15;
            double humidity = main.get("humidity").getAsDouble();
            String des = weatherobj.get("description").getAsString();
            String icon = weatherobj.get("icon").getAsString();
            System.out.printf("溫度: %.1f 體感: %.1f 濕度: %.1f%% {%s}\n",temp,feels_like,humidity,des);
            path_icon = String.format(path_icon, icon);
            System.err.println(path_icon);
            //將icon圖片存檔
            InputStream is_icon = new URL(path_icon).openStream();
            byte[] bytes = new byte[is_icon.available()];
            is_icon.read(bytes);
            FileOutputStream fos = new FileOutputStream("src\\main\\java\\com\\lab\\ocp\\day12\\" +icon + ".png");
            fos.write(bytes);
            
            
        } catch (MalformedURLException ex) {
            System.out.println("網路路徑格式錯誤, 錯誤原因: " + ex);
        } catch (IOException ex) {
            System.out.println("串流資料擷取錯誤, 錯誤原因: " + ex);
        }
        
    }
}
