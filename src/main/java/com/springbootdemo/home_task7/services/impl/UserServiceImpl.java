package com.springbootdemo.home_task7.services.impl;

import com.springbootdemo.home_task7.entities.Comments;
import com.springbootdemo.home_task7.entities.Roles;
import com.springbootdemo.home_task7.entities.Users;
import com.springbootdemo.home_task7.repositories.CommentRepository;
import com.springbootdemo.home_task7.repositories.RoleRepository;
import com.springbootdemo.home_task7.repositories.UserRepository;
import com.springbootdemo.home_task7.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Users user = userRepository.findByEmail(s);

        if (user != null){

            User secUser = new User(user.getEmail(), user.getPassword(), user.getRoles());
            return secUser;

        }

        throw new UsernameNotFoundException("User Not Found");

    }

    @Override
    public Users getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public List<Users> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Users getUser(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Users SaveUser(Users users) {
        return userRepository.save(users);
    }

    @Override
    public List<Roles> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Roles getRoles(Long id) {
        return roleRepository.getOne(id);
    }

    @Override
    public Roles saveRoles(Roles role) {
        return roleRepository.save(role);
    }

    @Override
    public Roles addRoles(Roles role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Comments> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comments getComment(Long id) {
        return commentRepository.getOne(id);
    }

    @Override
    public Comments saveComment(Comments comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comments addComment(Comments comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Long id) { commentRepository.deleteById(id); }
}
