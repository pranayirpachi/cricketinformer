package com.cricket.apis.FullStack.Exceptio;

public class UserNotFoundException extends RuntimeException{
    public  UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);

    }
}
