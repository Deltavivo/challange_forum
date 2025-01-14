package com.deltavivo.forum.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.deltavivo.forum.dtos.RequestTopicDTO;
import com.deltavivo.forum.dtos.ResponseTopicDTO;
import com.deltavivo.forum.mappers.TopicMapper;
import com.deltavivo.forum.models.Topic;
import com.deltavivo.forum.repositories.TopicsRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TopicServices {
    
    @Autowired
    private TopicsRepository repository;

    public ResponseTopicDTO saveTopic(RequestTopicDTO requestTopicDTO){
        Topic topic = repository.save(TopicMapper.fromDTO(requestTopicDTO));
        return TopicMapper.toDTO(topic);
    }

    public void deleteTopic(Long id){
        Topic topic = getTopicModel(id);
        repository.delete(topic);
    }

    public ResponseTopicDTO updateTopic(Long id, RequestTopicDTO requestTopicDTO){
        Topic topic = getTopicModel(id);
        topic.setTitle(requestTopicDTO.title());
        topic.setCourse(requestTopicDTO.course());
        topic.setMessage(requestTopicDTO.message());
        return TopicMapper.toDTO(repository.save(topic));
    }

    public ResponseTopicDTO getTopic(Long id){
        Topic topic = getTopicModel(id);
        return TopicMapper.toDTO(topic);
    }

    public Page<ResponseTopicDTO> getTopicList(Pageable pageable){
        return TopicMapper.toDTO(repository.findAll(pageable));
    }

    private Topic getTopicModel(Long id){
        Optional<Topic> topic = repository.findById(id);
        if(!topic.isPresent()) throw new EntityNotFoundException("Unable to find Topic with id " + id);
        return topic.get();
    }
}
