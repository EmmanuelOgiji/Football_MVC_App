package org.ECSDigital.EmmanuelOgiji.Model;

import com.mongodb.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DBAccessor {
    static Properties prop = new Properties();
    {
        try {
            FileInputStream fis = new FileInputStream("src/Files/env.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("env.properties not found");
        } catch (IOException e){
            System.out.println("Properties file IO Exception");
        }
    }

    public static DB connecttoDB(){
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB database = mongoClient.getDB("Football_WebApp");
        return database;
    }

    public static DBObject getCompetitionsCollection() {
        DB database = connecttoDB();
        DBCollection collection = database.getCollection("Competitions");
        DBObject query = new BasicDBObject("_id", "competitions");
        DBCursor cursor = collection.find(query);
        DBObject jo = cursor.one();
        return jo;
    }

    public static DBObject getTeamsinCompetition(String CompCode, String id) {
        DB database = connecttoDB();
        DBCollection collection = database.getCollection(CompCode+"_Teams");
        DBObject query = new BasicDBObject("_id", id);
        DBCursor cursor = collection.find(query);
        DBObject jo = cursor.one();
        return jo;
    }

    public static DBObject getTeamProfile(String teamID) {
        DB database = connecttoDB();
        DBCollection collection = database.getCollection("Teams");
        DBObject query = new BasicDBObject("_id", teamID);
        DBObject jo = collection.findOne(query);
        return jo;
    }
}

