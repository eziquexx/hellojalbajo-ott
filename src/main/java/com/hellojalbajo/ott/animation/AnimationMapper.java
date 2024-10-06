package com.hellojalbajo.ott.animation;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hellojalbajo.ott.Genre;


@Mapper
public interface AnimationMapper {
	Genre getAnimationById(Integer id);
	List<Genre> getAnimationList();
}
