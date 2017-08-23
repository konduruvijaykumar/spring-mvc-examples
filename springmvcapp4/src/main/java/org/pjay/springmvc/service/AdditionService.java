/**
 * 
 */
package org.pjay.springmvc.service;

import org.springframework.stereotype.Component;

/**
 * @author vijayk
 *
 */
@Component
public class AdditionService {
	
	public int addParams(int param1, int param2) {
		return param1+param2;
	}

}
