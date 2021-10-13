package com.springbootdemo.home_task7.services;

import com.springbootdemo.home_task7.entities.Comments;
import com.springbootdemo.home_task7.entities.Roles;
import com.springbootdemo.home_task7.entities.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {

    Users getUserByEmail(String email);
    Users addUser(Users user);
    List<Users> getAllUser();
    Users getUser(Long id);
    Users SaveUser(Users users);

    List<Roles> getAllRoles();
    Roles getRoles(Long id);
    Roles saveRoles(Roles role);
    Roles addRoles(Roles role);

    List<Comments> getAllComments();
    Comments getComment(Long id);
    Comments saveComment(Comments comment);
    Comments addComment(Comments comment);
    void deleteComment(Long id);

}
