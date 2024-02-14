package App.Functional;


import App.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserFunctions {
    private List<User> users;

    public UserFunctions() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void printUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).getName() + " " + users.get(i).getEmail());
        }
    }

    public User getUser(int index) {
        if (index >= 0 && index < users.size()) {
            return users.get(index);
        }else{
            return null;
        }
    }

}
