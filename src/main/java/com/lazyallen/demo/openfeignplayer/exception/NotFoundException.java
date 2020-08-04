package com.lazyallen.demo.openfeignplayer.exception;

/**
 * @author allen
 * @Date 2020/8/3
 */
public class NotFoundException extends Exception {
	public NotFoundException() {
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return "NotFoundException: "+getMessage();
	}
}
