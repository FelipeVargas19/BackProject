package com.example.project.controller;


import com.example.project.dtos.UserDto;
import com.example.project.entity.User;
import com.example.project.entity.UserServices;
import com.example.project.service.ServiceUser;
import com.example.project.service.ServiceUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user/")
@CrossOrigin({"*"})
@Slf4j
public class ControllerUser {

    @Autowired
    private ServiceUser serviceUser;

    @Autowired
    private ServiceUserService serviceUserService;

    @GetMapping
    private ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(serviceUser.findAll());
    }

    @PostMapping(value = "/save")
    private ResponseEntity<User> saveUser(@RequestBody UserDto userDto){
        try {
            User user = User.builder()
                    .USER_ID(userDto.getUSER_ID())
                    .FIRTS_NAME(userDto.getFIRTS_NAME())
                    .LAST_NAME(userDto.getLAST_NAME())
                    .TYPE_ID(userDto.getTYPE_ID())
                    .PHONE_NUMBER(userDto.getPHONE_NUMBER())
                    .ADDRESS(userDto.getADDRESS())
                    .AGE(userDto.getAGE())
                    .build();
            User userGuardado = serviceUser.save(user);
            if(userDto.getSERVICE_ID() != null) {
                Optional<UserServices> userHasService = serviceUserService.findByServiceIdAndUserId(userDto.getSERVICE_ID(), userGuardado.getUSER_ID());
                if(userHasService.isEmpty()) {
                    UserServices service = UserServices.builder()
                            .userId(userGuardado.getUSER_ID())
                            .serviceId(userDto.getSERVICE_ID().intValue())
                            .fechaAdquisicion(LocalDate.now())
                            .build();
                    serviceUserService.save(service);
                }
            }
            return new ResponseEntity<User>(userGuardado, HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "/delete/{USER_ID}")
    private ResponseEntity<Boolean> deleteUser (@PathVariable("USER_ID") String USER_ID ){
        serviceUser.deleteById(USER_ID);
        return ResponseEntity.ok(serviceUser.findById(USER_ID)!=null);
    }


}
