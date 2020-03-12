package com.company;

public class Main {

    public static void main(String[] args) {
        Database database = new MongoDatabase();
        database.update(new User());
        database = new MySQLDatabase();
        database.update(new User());
    }
}
