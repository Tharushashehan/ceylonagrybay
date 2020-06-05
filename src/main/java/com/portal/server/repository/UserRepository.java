package com.portal.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portal.server.model.User;

public interface UserRepository extends JpaRepository <User, Long> {

}