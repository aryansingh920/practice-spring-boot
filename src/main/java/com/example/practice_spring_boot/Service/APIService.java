package com.example.practice_spring_boot.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;

import org.springframework.stereotype.Service;

import com.example.practice_spring_boot.Constants.APIServiceConstants;
import com.example.practice_spring_boot.Types.APIServicePostReq;
import com.fasterxml.jackson.databind.ObjectMapper;



@Service
public class APIService {
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper objectMapper;

    public APIService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    
    public String postMethodService(Long id,Boolean debug, APIServicePostReq requestBody)
    {

        String jsonBody;
        try {
            jsonBody = objectMapper.writeValueAsString(requestBody);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize request body to JSON", e);
        }

        HttpRequest httpRequest = HttpRequest.newBuilder()
        .uri(URI.create(String.format("%s%s", APIServiceConstants.URL,"/posts")))
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", APIServiceConstants.Authorization)
                .header("X-Debug", String.valueOf(debug))
                .POST(BodyPublishers.ofString(jsonBody))
                .build();

                // System.out.println("request done");
        
        return "halleluah";
    }
    
}
