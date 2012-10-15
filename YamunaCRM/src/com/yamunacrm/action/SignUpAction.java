/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yamunacrm.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.ExpressionValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author uday
 */
@ParentPackage("struts-alternate")
@InterceptorRef("jsonValidationWorkflowStack")
@Validations(requiredStrings = {
    @RequiredStringValidator(fieldName = "userName", type = ValidatorType.FIELD, message = "User Name is required."),
    @RequiredStringValidator(fieldName = "password", type = ValidatorType.FIELD, message = "Password is required."),
    @RequiredStringValidator(fieldName = "confirmPassword", type = ValidatorType.FIELD, message = "Confirm password is required."),
    @RequiredStringValidator(fieldName = "firstName", type = ValidatorType.FIELD, message = "First Name is required."),
    @RequiredStringValidator(fieldName = "lastName", type = ValidatorType.FIELD, message = "Last Name is required."),
    @RequiredStringValidator(fieldName = "mobileNumber", type = ValidatorType.FIELD, message = "Mobile # is required."),
    @RequiredStringValidator(fieldName = "address", type = ValidatorType.FIELD, message = "Address is required."),
    @RequiredStringValidator(fieldName = "email", type = ValidatorType.FIELD, message = "Email is Required.")
},
emails = {
    @EmailValidator(fieldName = "userName", type = ValidatorType.FIELD, message = "User name is invalid."),
    @EmailValidator(fieldName = "email", type = ValidatorType.FIELD, message = "Invalid email.")
        },
regexFields= {
    @RegexFieldValidator(fieldName="mobileNumber",type=ValidatorType.FIELD,message="Mobile number is invalid.",expression="^[0-9]{10}$"),
    @RegexFieldValidator(fieldName="officialMobileNumber",type=ValidatorType.FIELD,message="Official Mobile number is invalid.",expression="^[0-9]{10}$")},
    expressions= { @ExpressionValidator(expression="password==confirmPassword",message="Password and Confirm password must be same")})
public class SignUpAction extends ActionSupport {

    private static final Logger log=Logger.getLogger(SignUpAction.class);
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String confirmPassword;
    private String mobileNumber;
    private String officialMobileNumber;
    private String code;
    private String landLineNumber;
    private String address;
    private String email;
    private String officialEmail;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLandLineNumber() {
        return landLineNumber;
    }

    public void setLandLineNumber(String landLineNumber) {
        this.landLineNumber = landLineNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOfficialEmail() {
        return officialEmail;
    }

    public void setOfficialEmail(String officialEmail) {
        this.officialEmail = officialEmail;
    }

    public String getOfficialMobileNumber() {
        return officialMobileNumber;
    }

    public void setOfficialMobileNumber(String officialMobileNumber) {
        this.officialMobileNumber = officialMobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Action(value = "/SignupAction", results = {
        @Result(name = "success", location = "/success.jsp"),
        @Result(name = "error", location = "/signup.jsp"),
        @Result(name = "input", location = "/signup.jsp")})
    public String execute() {
        log.info(firstName+" "+lastName+" "+mobileNumber);

        return SUCCESS;
    }
}
