package com.example.javspring.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AGENT")
@Data
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TAX_CODE")
    private String taxCode;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "REPRESENTATIVE")
    private String repResentative;

    @Column(name = "REPRESENTATIVE_POSITION")
    private String representativePosition;

    @Column(name = "CONTACT_NAME")
    private String contactName;

    @Column(name = "CONTACT_POSITION")
    private String contactPosition;

    @Column(name = "CONTACT_NUMBER")
    private int contactNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CONTRACT_NUMBER")
    private String contractNumber;

    @Column(name = "CONTRACT_START_DATE")
    private Date contractStartDate;

    @Column(name = "CONTRACT_END_DATE")
    private Date contractEndDate;

    @Column(name = "STATUS")
    private String status;


    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "NOTE")
    private String note;
}
