package com.example.javaformpractice.collections;

import com.example.javaformpractice.BlackKnight;

import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        List<User> allUsers = new ArrayList<>(
                Arrays.asList(
                        new User("sam"),
                        new User("jelena"),
                        new User("sam"),
                        new User("judith"),
                        new User("jon"),
                        new User("jon")
                )
        );

        Map<String, List<User>> map = new HashMap<>();

        for (User user: allUsers) {
            String nameKey = user.getName();

            if(map.containsKey(nameKey)){
                List<User> nameUsers = map.get(nameKey);
                nameUsers.add(user);
                map.put(nameKey, nameUsers);
            } else{
                List<User> newNameUsers = new ArrayList<>();
                newNameUsers.add(user);
                map.put(nameKey, newNameUsers);
            }
        }

        for (Map.Entry entry: map.entrySet()) {
            System.out.print(entry.getKey()+"==>");

            for (User user: (List<User>)entry.getValue()) {
                System.out.print(user.toString()+ ", ");
            }
        }

    }
}