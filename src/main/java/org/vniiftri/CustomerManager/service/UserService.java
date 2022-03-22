package org.vniiftri.CustomerManager.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.vniiftri.CustomerManager.repository.UserRepository;
import org.vniiftri.CustomerManager.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public List<User> listAllUser() {
        return userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(User user, Long id) {
        user.setId(id);
        userRepository.save(user);
    }
}
