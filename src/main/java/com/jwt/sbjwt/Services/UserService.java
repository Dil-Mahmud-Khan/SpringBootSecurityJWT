package com.jwt.sbjwt.Services;

import com.jwt.sbjwt.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class UserService {
    public List<User> store=new ArrayList<>();


    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"dil","dil@gmai.com"));
        store.add(new User(UUID.randomUUID().toString(),"Mahmud","Mahmud@gmai.com"));
        store.add(new User(UUID.randomUUID().toString(),"Khan","dila@gmai.com"));

    }

    public List<User> getUsers(){
        return  this.store;
    }
}

