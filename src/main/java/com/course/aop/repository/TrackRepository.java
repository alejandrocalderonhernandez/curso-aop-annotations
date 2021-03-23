package com.course.aop.repository;

import org.springframework.data.repository.CrudRepository;

import com.course.aop.entity.TrackEntity;

public interface TrackRepository extends CrudRepository<TrackEntity, Long>{

}
