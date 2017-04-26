/**
 * 
 */
package com.nanda.testtracker.dal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Nandakumar 22-Apr-2017
 *
 */
@Entity
public class TestCase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_case_id", unique = true, nullable = false)
    String id;
    String testCaseName;
    String testClass;
    String testMethod;
    String status;

    public TestCase() {

    }

    /* *//**
	  * @param id
	  * @param testCaseName
	  * @param testClass
	  * @param testMethod
	  * @param status
	  * @param testVersion
	  */
    public TestCase(String testCaseName, String testClass, String testMethod, String status) {

	this.testCaseName = testCaseName;
	this.testClass = testClass;
	this.testMethod = testMethod;
	this.status = status;

    }

    /**
     * @return the id
     */
    public String getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
	this.id = id;
    }

    /**
     * @return the testCaseName
     */
    public String getTestCaseName() {
	return testCaseName;
    }

    /**
     * @param testCaseName
     *            the testCaseName to set
     */
    public void setTestCaseName(String testCaseName) {
	this.testCaseName = testCaseName;
    }

    /**
     * @return the testClass
     */
    public String getTestClass() {
	return testClass;
    }

    /**
     * @param testClass
     *            the testClass to set
     */
    public void setTestClass(String testClass) {
	this.testClass = testClass;
    }

    /**
     * @return the testMethod
     */
    public String getTestMethod() {
	return testMethod;
    }

    /**
     * @param testMethod
     *            the testMethod to set
     */
    public void setTestMethod(String testMethod) {
	this.testMethod = testMethod;
    }

    /**
     * @return the status
     */
    public String getStatus() {
	return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(String status) {
	this.status = status;
    }

}
