package com.esprit.demo1.service;

import com.esprit.demo1.entities.Project;
import com.esprit.demo1.entities.User;

public interface Userservice {
    public User adduser (User user);
    public Project addProject (Project project);
    public void assignProjectToDeveloper (int projectId, int devId);

}
