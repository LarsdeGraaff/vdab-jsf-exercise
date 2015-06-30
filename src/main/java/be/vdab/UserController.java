package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by jeansmits on 30/06/15.
 */
@Named
public class UserController {
   @Inject
    private UserRepository userRepository;

    public String findUser(){
        User users = userRepository.findById();
        return users.toString();
    }


    }
