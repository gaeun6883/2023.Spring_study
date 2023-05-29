package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     * GET /mapping/users
     * POST /mapping/user
     * GET /mapping/users/{userId}
     * PATCH /mapping/users/{userId}
     * DELETE /mapping/users/{userId}
     */

    @GetMapping
    public String users(){
        return "get users";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get userId="+userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update userId="+userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId=" + userId;
    }
}
