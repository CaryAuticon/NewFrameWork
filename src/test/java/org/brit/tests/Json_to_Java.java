package org.brit.tests;

import io.restassured.internal.mapping.Jackson1Mapper;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import org.testng.annotations.Test;


public class Json_to_Java {

    private int userId;
    private int id;
    private String title;
    private String body;

// -------------------- userId ------------------------

    public int getuserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

// -------------------- Id ----------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

// -------------------- title -------------------------

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

// -------------------- body --------------------------

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

// ----------------------------------------------------


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n ---- Test JSON to Java --------\n");
        sb.append("userId:" + getuserId() + "\n");
        sb.append("Id:" + getId()+ "\n");
        sb.append("title:"  + getTitle() + "\n");
        sb.append("body:" + getBody() + "\n");
        sb.append("************************************");
        return sb.toString();
    }
}


//        {
//            "userId": 1,
//                "id": 1,
//                "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
//                "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
//        },














