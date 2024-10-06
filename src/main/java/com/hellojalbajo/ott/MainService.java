package com.hellojalbajo.ott;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
	@Autowired
	private MainMapper mainMapper;
	
	public void setMovieInfo(Genre movie) {
		mainMapper.setMovieInfo(movie);
	}

	public void deleteItem(Integer id) {
		mainMapper.deleteItemById(id);
	};
	
}
