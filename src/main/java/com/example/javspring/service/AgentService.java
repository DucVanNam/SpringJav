package com.example.javspring.service;

import com.example.javspring.model.Agent;
import com.example.javspring.model.requestDTO.AgentRequest;

import java.util.List;

public interface AgentService {
    List<Agent> getlist();
    List<Agent> search(AgentRequest input);
}
