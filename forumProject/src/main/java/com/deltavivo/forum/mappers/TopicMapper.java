package com.deltavivo.forum.mappers;

import org.springframework.data.domain.Page;

import com.deltavivo.forum.dtos.RequestTopicDTO;
import com.deltavivo.forum.dtos.ResponseTopicDTO;
import com.deltavivo.forum.models.Topic;

public class TopicMapper {

    public static Topic fromDTO(RequestTopicDTO requestTopicDTO) {
        return new Topic(requestTopicDTO.title(), requestTopicDTO.course(), requestTopicDTO.message());
    }

    public static ResponseTopicDTO toDTO(Topic topic) {
        return new ResponseTopicDTO(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCreationDateTime());
    }

    public static Page<ResponseTopicDTO> toDTO(Page<Topic> topics) {
        return topics
                .map(topic -> toDTO(topic));
    }
}
