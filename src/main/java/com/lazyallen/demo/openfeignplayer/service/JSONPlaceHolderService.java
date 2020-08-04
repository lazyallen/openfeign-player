package com.lazyallen.demo.openfeignplayer.service;

import com.lazyallen.demo.openfeignplayer.model.Post;

import java.util.List;

/**
 * @author allen
 * @Date 2020/8/3
 */
public interface JSONPlaceHolderService {
	List<Post> getPosts();

	Post getPostById(Long id);
}
