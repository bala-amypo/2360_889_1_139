package com.example.demo.repository;
import org.springframework.data.Jpa.repository.JpaRepository;
import com.example.demo.entity.TransferRuleRepository;
public interface TransferRuleRepository extends JpaRepository<TransferRule, Long>{
    
} 