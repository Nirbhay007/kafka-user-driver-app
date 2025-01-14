package com.kafka_application.cab_booking_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka_application.cab_booking_user.constant.AppConstant;

@Service
public class CabLocation {

	@KafkaListener(topics = AppConstant.CAB_LOCATION, groupId = AppConstant.USER_GROUP_NAME)
	public void getLocation(String location) {

		System.out.println(location);
	}

}
