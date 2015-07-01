package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by jeansmits on 30/06/15.
 */
@Named
@RequestScoped
public class UserController {
    private User user = new User();

    public User getUser() {
        return user;
    }

    @Inject
    private UserRepository userRepository;

    public String findUser(int id){
        User users = userRepository.findById(id);
        return users.toString();
    }

    public String save(){
        userRepository.createUser(user);
        return "userList.faces";
    }

    }
