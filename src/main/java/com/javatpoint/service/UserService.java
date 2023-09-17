package com.javatpoint.service;


import com.javatpoint.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list=new ArrayList<>();

    public UserService() {
        list.add(new User("abc","abc","rainilesh19382@gmail.com"));
        list.add(new User("xyz","abcxyz","raishahab2023@gamil.com"));

    }

    //get all Users

    public List<User> getAllUsers(){

        return  this.list;
    }
    //get single users


    public User getUser(String username){
      return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);

    }


    //add new user
    public User addUser(User user){

        this.list.add(user);
        return user;



    }


}
