package com.company;

public class Main {

    public static void main(String[] args) {
        UserList userList = new UserList();
        userList.add(new User());
        userList.add(new User());
        userList.add(new User());
        userList.add(new User());
        userList.add(new User());
        System.out.println(userList.getUserList());
        userList.setSortingStrategy(new BubbleSort<User>());
        userList.sort();
        System.out.println(userList.getUserList());
        userList.setSortingStrategy(new MargeSort<User>());
        userList.sort();
        System.out.println(userList.getUserList());
    }
}
