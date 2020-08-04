package com.lazyallen.demo.openfeignplayer.model;

import lombok.Data;

/**
 * @author allen
 * @Date 2020/8/3
 */
@Data
public class Post {
	private String userId;
	private Long id;
	private String title;
	private String body;
}
