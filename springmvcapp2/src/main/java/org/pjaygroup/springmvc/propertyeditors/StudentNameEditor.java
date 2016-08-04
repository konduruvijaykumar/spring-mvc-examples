/**
 * 
 */
package org.pjaygroup.springmvc.propertyeditors;

import java.beans.PropertyEditorSupport;

/**
 * @author Vijay
 *
 */
public class StudentNameEditor extends PropertyEditorSupport{

	/* (non-Javadoc)
	 * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
	 */
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		if(studentName.startsWith("Mr.") || studentName.startsWith("Ms.")){
			setValue(studentName);
		}else{
			setValue("Mr/Ms. "+studentName);
		}
	}

}
