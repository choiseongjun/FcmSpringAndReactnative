package com.example.fcmserver.service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AndroidPushPeriodicNotifications {
    public static String PeriodicNotificationJson() throws JSONException {
        LocalDate localDate = LocalDate.now();

        String sampleData[] = {"fSbbdg3oRDS3qqaKbYkwCT:APA91bEOPQpRq5S25R3GAkMH40HDXvbHyl3kFwIjmkEsSuJnYgePAG4dhiOhC70c-avkFJQwcwGjnKFmj4eAkda8I8-K4kermSONVKyRY5UWYvxo0lry12oFs4sJO8XNfm30OV422p_v"
        };

        JSONObject body = new JSONObject();

        List<String> tokenlist = new ArrayList<String>();

        for(int i=0; i<sampleData.length; i++){
            tokenlist.add(sampleData[i]);
        }

        JSONArray array = new JSONArray();

        for(int i=0; i<tokenlist.size(); i++) {
            array.put(tokenlist.get(i));
        }

        body.put("registration_ids", array);

        JSONObject notification = new JSONObject();
        notification.put("title","hello world!");
        notification.put("body","Today is Good "+localDate.getDayOfWeek().name()+"!");

        body.put("notification", notification);

        System.out.println(body.toString());

        return body.toString();
    }
}