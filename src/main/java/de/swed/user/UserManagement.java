package de.swed.user;

import de.swed.rest.DBConnector;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

    private List<User> people = new ArrayList<>();
    private DBConnector dbConnector;

    public List<User> getAllUsers(Role role) {
        return people;
    }

    public User getUserById(Long id) {
        return people.get(id.intValue());
    }

    public String registerUser(User user) {
        return "User is added";
    }

    public String deleteAccount(User user) {
        return "User is deleted";
    }

    public void changeRole(User user, Role role) {
    }

    public String changePassword(User user) {
        return "Password is changed";
    }

    public List<Contractor> getStatusOfContractor(ContractorStatus status) {
        return new ArrayList<>();
    }

}
