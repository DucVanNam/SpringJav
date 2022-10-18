package com.example.javspring.model.requestDTO;

import lombok.Data;

import javax.persistence.Column;

@Data
public class AgentRequest {
    public String code;

    public String name;

    public String taxCode;

    public String address;
}
