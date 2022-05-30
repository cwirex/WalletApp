package com.example.walletapp;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Expense {
    public String title;
    public String cost;
    public String category;
    public String description;
    public String date;
    public LocalDateTime dateTime;
    public String id;

    public Expense(Map<String, Object> data, String id) {
        this.title = (String) data.getOrDefault("title", "");
        this.cost = (String) data.getOrDefault("cost", "");
        this.category = (String) data.getOrDefault("category", "");
        this.description = (String) data.getOrDefault("desc", "");
        this.date = (String) data.getOrDefault("date", "");
        this.id = id;
        try {
            HashMap<String, Object> dt = (HashMap<String, Object>) data.get("datetime");
            this.dateTime = LocalDateTime.of(
                    Integer.parseInt(dt.get("year").toString()),
                    Integer.parseInt(dt.get("monthValue").toString()),
                    Integer.parseInt(dt.get("dayOfMonth").toString()),
                    Integer.parseInt(dt.get("hour").toString()),
                    Integer.parseInt(dt.get("minute").toString()),
                    Integer.parseInt(dt.get("second").toString())
            );
        } catch (Exception exception) {
            this.dateTime = LocalDateTime.MIN;
            try {
                this.dateTime = (LocalDateTime) data.getOrDefault("datetime", "default");
            } catch (ClassCastException e) {
                // handled
            }
        }
    }
}
