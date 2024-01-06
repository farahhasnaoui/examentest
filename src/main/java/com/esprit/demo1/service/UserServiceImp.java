package com.esprit.demo1.service;

import com.esprit.demo1.entities.Project;
import com.esprit.demo1.entities.Sprint;
import com.esprit.demo1.entities.User;
import com.esprit.demo1.repository.ProjetRepository;
import com.esprit.demo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImp implements Userservice {
    @Autowired
    private UserRepository userRepository;
    @Autowired
 private  ProjetRepository  projetRepository;
    @Override
    public User adduser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Project addProject(Project project) {
        Set<Sprint> sprints = project.getSprints();
        for ( Sprint sprint: sprints) {
            sprint.setProject(project);
        }
        return projetRepository.save(project);
    }

    @Override
    public void assignProjectToDeveloper(int projectId, int devId) {
        Project project = projetRepository.findById(projectId).orElse(null);
        User developers = userRepository.findById(devId).orElse(null);
        developers.getProjectsDev().add(project);
        userRepository.save(developers);
    }
}
