package com.lazyallen.demo.openfeignplayer.hystrix;

import com.lazyallen.demo.openfeignplayer.client.JSONPlaceHolderClient;
import com.lazyallen.demo.openfeignplayer.model.Post;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @author allen
 * @Date 2020/8/3
 */
@Component
public class JSONPlaceHolderFallback implements JSONPlaceHolderClient {
	@Override
	public List<Post> getPosts() {
		return Collections.emptyList();
	}

	@Override
	public Post getPostById(Long postId) {
		return null;
	}
}
