/**
 * 
 */
package org.pjaygroup.springmvc.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

/**
 * @author Vijay
 *
 */
public class StudentInfo {
	private String studentName;
	// Use any Java Bean Validation api such as hibernate validation framework or apache bean validation framework which implement JSR-303/JSR-349
	@Size(message="Student Course value should have a size between 2 to 10", min=2, max=10)
	//@Size(min=2, max=10)
	private String studentCourse;
	private Long studentMobile;
	private Date studentDOB;
	private List<String> studentSkills;
	private Address studentAddress;
	
	/**
	 * @return the studentAddress
	 */
	public Address getStudentAddress() {
		return studentAddress;
	}
	/**
	 * @param studentAddress the studentAddress to set
	 */
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	/**
	 * @return the studentMobile
	 */
	public Long getStudentMobile() {
		return studentMobile;
	}
	/**
	 * @param studentMobile the studentMobile to set
	 */
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	/**
	 * @return the studentDOB
	 */
	public Date getStudentDOB() {
		return studentDOB;
	}
	/**
	 * @param studentDOB the studentDOB to set
	 */
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	/**
	 * @return the studentSkills
	 */
	public List<String> getStudentSkills() {
		return studentSkills;
	}
	/**
	 * @param studentSkills the studentSkills to set
	 */
	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentCourse
	 */
	public String getStudentCourse() {
		return studentCourse;
	}
	/**
	 * @param studentCourse the studentCourse to set
	 */
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
}
