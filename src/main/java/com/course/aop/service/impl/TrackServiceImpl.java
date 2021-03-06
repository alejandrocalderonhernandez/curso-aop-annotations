package com.course.aop.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.aop.entity.TrackEntity;
import com.course.aop.repository.TrackRepository;
import com.course.aop.service.ITrackService;

@Service
@Transactional
public class TrackServiceImpl implements ITrackService {
	
	@Autowired
	private TrackRepository repository;

	@Override
	public Set<TrackEntity> getAll() {
		Set<TrackEntity> response = new HashSet<>();
		this.repository.findAll().forEach(response::add);
		return response;
	}

	@Override
	public TrackEntity save(TrackEntity entity) {
		return this.repository.save(entity);
	}

}
