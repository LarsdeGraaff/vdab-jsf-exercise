package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by jeansmits on 30/06/15.
 */
@Named
public class FormController {
    @Inject
    private UserRepository userRepository;

    public void save(User user){
        userRepository.createUser(user);
    }
}
