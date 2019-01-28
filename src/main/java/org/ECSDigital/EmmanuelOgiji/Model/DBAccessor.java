package org.ECSDigital.EmmanuelOgiji.Model;

import com.mongodb.*;

public class DBAccessor {
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

