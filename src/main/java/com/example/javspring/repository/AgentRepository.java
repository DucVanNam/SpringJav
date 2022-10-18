package com.example.javspring.repository;

import com.example.javspring.model.Agent;
import com.example.javspring.model.requestDTO.AgentRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {
    @Query("select a from Agent a")   //test query
    List<Agent> getlist();

    @Query(value = """
        select * from Agent
        WHERE (:#{#input.taxCode} IS NULL OR TAX_CODE  like :#{#input.taxCode})
        AND (:#{#input.name} IS NULL OR NAME  like :#{#input.name})
        AND (:#{#input.address} IS NULL OR ADDRESS  like :#{#input.address})
        AND (:#{#input.code} IS NULL OR CODE  like :#{#input.code})
        """, nativeQuery = true
    )
    List<Agent> search(AgentRequest input);
}
