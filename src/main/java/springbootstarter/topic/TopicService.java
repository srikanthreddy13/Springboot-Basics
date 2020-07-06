package springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring framework", "framework description"),
			new Topic("java", "Spring framework", "framework description")
			
			));
	
	public List<Topic> allTopics() {
		return topics;
	} 
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t-> t.getId().equals(id));
	}
}
