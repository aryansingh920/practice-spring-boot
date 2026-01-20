package com.example.practice_spring_boot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice_spring_boot.Service.APIService;
import com.example.practice_spring_boot.Types.APIServicePostReq;



@RestController
@RequestMapping("/api")
public class APIController {

    // service instantiated
    private final APIService apiService;

    public APIController(APIService apiService) {
        this.apiService = apiService;
    }


    @PostMapping("/post/id/{id}")
    public String postMethodController(
        @PathVariable ("id") Long id,
        @RequestParam (name="debug",required=false) Boolean debug,
        @RequestBody APIServicePostReq requestBody
    ) {
        String serviceResponse = this.apiService.postMethodService(id, debug, requestBody);
        return serviceResponse;
    }
    

    // root called
    @GetMapping("")
    public String root() {
        return "Root Hit";
    }
    

}
