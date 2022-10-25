package com.example.ToDoappnew.Dao;

import com.example.ToDoappnew.Model.UserModel;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel,Integer> {

}
