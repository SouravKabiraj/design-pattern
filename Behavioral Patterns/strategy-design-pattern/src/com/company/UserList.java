package com.company;

import java.util.ArrayList;

public class UserList {
    ArrayList<User> userList;
    private SortingStrategy<User> strategy;


    public UserList() {
        this.userList = new ArrayList<User>();
    }

    public void add(User user) {
        this.userList.add(user);
    }

    public void setSortingStrategy(SortingStrategy<User> strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        this.userList = strategy.sort(this.userList);
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
}
