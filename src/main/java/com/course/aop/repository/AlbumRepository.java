package com.course.aop.repository;

import org.springframework.data.repository.CrudRepository;

import com.course.aop.entity.AlbumEntity;

public interface  AlbumRepository extends CrudRepository<AlbumEntity, Long>{

}
