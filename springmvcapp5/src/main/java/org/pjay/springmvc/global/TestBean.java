/**
 * 
 */
package org.pjay.springmvc.global;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author vijayk
 *
 */
@Component
public class TestBean {

	@Value(value = "Vijay")
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TestBean [message=" + message + "]";
	}

}
