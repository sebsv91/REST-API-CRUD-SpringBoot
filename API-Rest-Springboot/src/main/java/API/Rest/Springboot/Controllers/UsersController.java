package API.Rest.Springboot.Controllers;

import API.Rest.Springboot.Model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    List<User> users = new ArrayList<User>();

    @GetMapping("/users")
    public List<User> getUsers(){
        return users;
    }

    @GetMapping("/users/{username}")
    public User getUser(@PathVariable String username){
        for(User user : users){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        users.add(user);
        return user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        for(User u : users){
            if(u.getId() == user.getId()){
                u.setUsername(user.getUsername());
                u.setAge(user.getAge());
                u.setId(user.getId());

                return u;
            }
        }

        return null;
    }

    @DeleteMapping("/users/{id}")
    public List<User> deleteUser(@PathVariable int id){
        for (User user : users){
            if (user.getId() == id){
                users.remove(user);
                return users;
            }
        }
        return null;
    }

}
