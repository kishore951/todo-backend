package com.example.ToDoappnew.Controller;

import com.example.ToDoappnew.Dao.UserDao;
import com.example.ToDoappnew.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private UserDao dao;

    @CrossOrigin("*")
    @PostMapping(path = "/signup",consumes = "application/json",produces = "application/json")
    public String signup(@RequestBody UserModel users){
        dao.save(users);
        return "{{status:'success}}";
    }

    @CrossOrigin("*")
    @GetMapping("/view")
    public List<UserModel> viewPost(){
        return (List<UserModel>) dao.findAll();
    }
}
