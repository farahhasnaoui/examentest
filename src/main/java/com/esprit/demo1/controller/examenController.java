package com.esprit.demo1.controller;

import com.esprit.demo1.entities.Project;
import com.esprit.demo1.entities.User;
import com.esprit.demo1.service.UserServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class examenController {
    UserServiceImp userServiceImp;
    @PostMapping("/ajouterUser")
    public User addUser(@RequestBody User user){

        return userServiceImp.adduser(user);
    }
    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project project){
        return userServiceImp.addProject(project);
    }
    @PostMapping("/assignProjectToDeveloper")
    public void assignProjectToDeveloper(int projectId, int devId){
        userServiceImp.assignProjectToDeveloper(projectId, devId);
    }
}
