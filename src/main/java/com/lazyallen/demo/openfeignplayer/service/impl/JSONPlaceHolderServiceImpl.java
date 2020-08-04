package com.lazyallen.demo.openfeignplayer.service.impl;

import com.lazyallen.demo.openfeignplayer.client.JSONPlaceHolderClient;
import com.lazyallen.demo.openfeignplayer.model.Post;
import com.lazyallen.demo.openfeignplayer.service.JSONPlaceHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author allen
 * @Date 2020/8/3
 */
@Service
public class JSONPlaceHolderServiceImpl implements JSONPlaceHolderService {

	@Autowired
	private JSONPlaceHolderClient jsonPlaceHolderClient;

	@Override
	public List<Post> getPosts() {
		return jsonPlaceHolderClient.getPosts();
	}

	@Override
	public Post getPostById(Long id) {
		return jsonPlaceHolderClient.getPostById(id);
	}
}
