package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by jeansmits on 30/06/15.
 */
@Named
public class Formbean {
    @Inject

    private UserRepository userRepository;
    private User user;

}
