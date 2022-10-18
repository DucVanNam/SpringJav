package com.example.javspring.service.impl;

import com.example.javspring.model.Agent;
import com.example.javspring.model.requestDTO.AgentRequest;
import com.example.javspring.repository.AgentRepository;
import com.example.javspring.service.AgentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AgentServiceImpl implements AgentService {
    private final AgentRepository agentRepository;
    @Override
    public List<Agent> getlist() {
        return agentRepository.getlist();
    }

    @Override
    public List<Agent> search(AgentRequest input) {
        return agentRepository.search(input);
    }
}
