//package com.validate.hiber.Validation.Using.Hibernate.controllerTest;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.validate.hiber.Validation.Using.Hibernate.controller.UserController;
//import com.validate.hiber.Validation.Using.Hibernate.Repo.UserRepository;
//import com.validate.hiber.Validation.Using.Hibernate.entity.User;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class UserControllerTest {
//
//    @Mock
//    private UserRepository userRepository;
//
//    private UserController userController;
//
//    @BeforeEach
//    public void setUp() {
//        userController = new UserController(userRepository);
//    }
//
//    @Test
//    public void testCreateUser() {
//        User user = new User();
//        user.setUsername("test");
//        user.setPassword("password");
//
//        when(userRepository.save(user)).thenReturn(user);
//
//        User createdUser = userController.createUser(user);
//
//        assertEquals(user, createdUser);
//    }
//
//    @Test
//    public void testGetAllUsers() {
//        List<User> users = new ArrayList<>();
//        users.add(new User());
//        users.add(new User());
//
//        when(userRepository.findAll()).thenReturn(users);
//
//        List<User> allUsers = userController.getAllUsers();
//
//        assertEquals(users, allUsers);
//    }
//
//    @Test
//    public void testGetUserById() {
//        User user = new User();
//        user.setId(1L);
//
//        when(userRepository.findById(1L)).thenReturn(user);
//
//        User foundUser = userController.getUser(1L);
//
//        assertEquals(user, foundUser);
//    }
//}
//
