package com.lab.arduino.dht.firebase.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import com.firebase.net.thegreshams.firebase4j.model.FirebaseResponse;
import com.firebase.net.thegreshams.firebase4j.service.Firebase;
import com.lab.arduino.dht.Callback;

public class Test1 {
    
    public static void main(String[] args) throws Throwable {
        String firebase_baseUrl = "https://allen-project-dht.firebaseio.com/dht";
        String token = "hjOUH4YmoqEjQ0T5wRzhq9qxgnQhvXzmvj1Kagbx";
        // create the firebase
        Firebase firebase = new Firebase(firebase_baseUrl, token);
        while (true) {
            Map<String, Object> dataMap = new LinkedHashMap<>();

            dataMap.put("random", new Random().nextInt(1000));
            
            FirebaseResponse response = firebase.patch(dataMap );
            System.out.println(firebase.get("random").getRawBody());
            
        }
    }
}
