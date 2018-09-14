package com.server.services;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private List<String> vechileList = Arrays.asList(new String [] {"10001","10002","10003","10004","10005","10006","10007"});
   
    private List<String> statusList = Arrays.asList(new String [] {"Disconnected","Active","Error in Battery","Error in Breaks","Need Oil Change"});
    //private enum status = 
    
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        
        for (Iterator iterator = vechileList.iterator(); iterator.hasNext();) {
			String vechileId = (String) iterator.next();
			
			Random rand = new Random();
		    String randomStatus = statusList.get(rand.nextInt(statusList.size()));
		    
		    VechileDTO request = new VechileDTO();
	        request.setStatus(randomStatus);
	        request.setVechileId(vechileId);
	        
	        new RestTemplate().postForEntity( "http://localhost:8000/updateVechile", request , VechileDTO.class );
		    
		}
        
        
        System.out.println();
        
        /*ResponseEntity<TrackingBean[]> responseEntity = new RestTemplate()
				.getForEntity("http://localhost:8000/vechiles", TrackingBean[].class, new HashMap());
		TrackingBean[] beans = responseEntity.getBody();
		List<TrackingBean> beans2 = new ArrayList<>(); 
		for (int i = 0; i < beans.length; i++) {
			System.out.println(beans[i].getCustomerName());
			beans2.add(beans[i]);
		}*/
    }
}
