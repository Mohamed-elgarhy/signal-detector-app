package com.server.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TrackingWebController {
	/*
	 * @Autowired private CustomerRepository customerRepository;
	 */
	@GetMapping("/data")
	public List<TrackingBean> retrieveVechileBeanList() {

		ResponseEntity<TrackingBean[]> responseEntity = new RestTemplate()
				.getForEntity("http://localhost:8000/vechiles", TrackingBean[].class, new HashMap());
		TrackingBean[] beans = responseEntity.getBody();
		List<TrackingBean> beans2 = new ArrayList<>(); 
		for (int i = 0; i < beans.length; i++) {
			System.out.println(beans[i].getCustomerName());
			beans2.add(beans[i]);
		}
		//return new ArrayList<>();
        return beans2 ;
	}

}