package si.restmongodb.service;

import si.restmongodb.entity.User;

public interface UserServiceEventHandler {

    void updateUser(User user);
}
