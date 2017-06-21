package com.sample.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by satish on 20/06/17.
 */
@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Java Language", "Core Java Description"),
            new Topic("cucumber", "Cucumber Framework", "Cucumber Framework Description")));

    public List<Topic> getAllTopics() {
        return topics;

    }

    public Topic getTopic(String id){

        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();

    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i=0;i<topics.size();i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
            }
            return;
        }
    }

    public void deleteTopic(String id) {

        topics.removeIf(t->t.getId().equals(id));
    }
}
