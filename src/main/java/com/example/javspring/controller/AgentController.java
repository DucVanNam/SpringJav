package com.example.javspring.controller;

import com.example.javspring.model.Agent;
import com.example.javspring.model.requestDTO.AgentRequest;
import com.example.javspring.service.AgentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AgentController {
    private final AgentService agentService;

    @GetMapping("/getlist")
    public List<Agent> getlist() {
       return agentService.getlist();
    }

    @GetMapping("/seach")
    public List<Agent> finname(AgentRequest input) {
        return agentService.search(input);
    }
}
