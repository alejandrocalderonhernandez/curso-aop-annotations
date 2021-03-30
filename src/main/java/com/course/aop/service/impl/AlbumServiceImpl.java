package com.course.aop.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.aop.entity.AlbumEntity;
import com.course.aop.repository.AlbumRepository;
import com.course.aop.service.IAlbumService;

@Service
@Transactional
public class AlbumServiceImpl implements IAlbumService {
	
	@Autowired
	private AlbumRepository repository;

	@Override
	public Set<AlbumEntity> getAll() {
		Set<AlbumEntity> response = new HashSet<>();
		this.repository.findAll().forEach(response::add);
		return response;
	}

	@Override
	public AlbumEntity save(AlbumEntity entity) {
		if(entity.getName().equalsIgnoreCase("Exception")) {
			throw new IllegalArgumentException("Te name of album cant be  " + entity.getName());
		}
		return this.repository.save(entity);
	}

}
