package com.lazyallen.demo.openfeignplayer.config;

import com.lazyallen.demo.openfeignplayer.exception.BadRequestException;
import com.lazyallen.demo.openfeignplayer.exception.NotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

/**
 * @author allen
 * @Date 2020/8/3
 */
public class CustomErrorDecoder implements ErrorDecoder {
	@Override
	public Exception decode(String methodKey, Response response) {

		switch (response.status()){
			case 400:
				return new BadRequestException();
			case 404:
				return new NotFoundException();
			default:
				return new Exception("Generic error");
		}
	}
}
