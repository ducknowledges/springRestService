package com.github.kononovit.service.dao;

import org.springframework.stereotype.Component;
import com.github.kononovit.service.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private List<User> users;

    public UserDAO() {
        users = new ArrayList<>();

        users.add(new User(users.size() + 1, "Ivan", 18));
        users.add(new User(users.size() + 1, "Van", 18));
        users.add(new User(users.size() + 1, "Nav", 18));
        users.add(new User(users.size() + 1, "Navi", 18));
        users.add(new User(users.size() + 1, "Aravi", 18));
        users.add(new User(users.size() + 1, "Mavi", 18));
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUserBy(int id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findAny()
                .orElse(null);
    }

    public List<User> getUsersByAge(int form, int to) {
        return users;
    }

    public User crateUser(String name, int age) {
        users.add(new User(users.size() + 1, name, age));
        return users.get(users.size() - 1);
    }

    public void deleteUserBy(int id) {
        users.removeIf(u -> u.getId() == id);
    }
}
