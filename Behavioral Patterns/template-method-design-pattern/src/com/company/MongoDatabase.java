package com.company;

public class MongoDatabase extends Database<User> {
    @Override
    public User get() {
        return new User();
    }

    @Override
    public void set(User user) {
        System.out.println("SETTING MONGODB...");
    }
}
