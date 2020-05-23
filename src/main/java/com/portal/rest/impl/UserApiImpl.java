package com.portal.rest.impl;

import com.portal.rest.api.UserApiDelegate;
import com.portal.rest.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserApiImpl implements UserApiDelegate {

    @Override
    public ResponseEntity<Void> createUser(User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return null;
    }

    @Override
    public ResponseEntity<String> loginUser(String username, String password) {
        return null;
    }

    @Override
    public ResponseEntity<Void> logoutUser() {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Void> updateUser(User body, String username) {
        return null;
    }
}
