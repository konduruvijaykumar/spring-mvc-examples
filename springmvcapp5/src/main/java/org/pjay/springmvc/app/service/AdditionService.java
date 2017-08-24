/**
 * 
 */
package org.pjay.springmvc.app.service;

import org.springframework.stereotype.Service;

/**
 * @author vijayk
 *
 */
//@Component
@Service
public class AdditionService {
	
	public int addParams(int param1, int param2) {
		return param1+param2;
	}

}
