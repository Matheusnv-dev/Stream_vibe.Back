package com.streamvibe.api.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 @RequestMapping("/olamundo")   //request=Requisição 

public class OlaMundoController { 
    @GetMapping("/oi")     //
    
   public String olaMundo(){
    return "Olá Mundo";  //  return= novo system.out 
   }

   
   
}
