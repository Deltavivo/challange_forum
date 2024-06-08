package com.deltavivo.forum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deltavivo.forum.models.Topic;

public interface TopicsRepository extends JpaRepository<Topic, Long>{
    
}
