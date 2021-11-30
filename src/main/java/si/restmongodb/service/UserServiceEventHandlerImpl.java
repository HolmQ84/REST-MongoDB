package si.restmongodb.service;

import org.springframework.transaction.annotation.Transactional;
import si.restmongodb.entity.User;

public class UserServiceEventHandlerImpl implements UserServiceEventHandler {

    @Transactional
    @Override
    public void updateUser(User user) {

    }
}
