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
import com.yamunacrm.dto.SignUpDTO;
import com.yamunacrm.service.LoginService;
import com.yamunacrm.service.SignUpService;
import java.util.Date;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author uday
 */
@ParentPackage("struts-alternate")
@InterceptorRefs({
    @InterceptorRef("jsonValidationWorkflowStack"),
    @InterceptorRef("closeHibernateInterceptor")
})

@Validations(requiredStrings = {
    @RequiredStringValidator(fieldName = "userName", type = ValidatorType.FIELD, message = "User Name is required."),
    @RequiredStringValidator(fieldName = "firstName", type = ValidatorType.FIELD, message = "First Name is required."),
    @RequiredStringValidator(fieldName = "lastName", type = ValidatorType.FIELD, message = "Last Name is required."),
    @RequiredStringValidator(fieldName = "mobileNumber", type = ValidatorType.FIELD, message = "Mobile # is required."),
    @RequiredStringValidator(fieldName = "address", type = ValidatorType.FIELD, message = "Address is required."),
    @RequiredStringValidator(fieldName = "email", type = ValidatorType.FIELD, message = "Email is Required."),
    @RequiredStringValidator(fieldName = "panCard", type = ValidatorType.FIELD, message = "Pan # is Required."),
    @RequiredStringValidator(fieldName = "reportedTo", type = ValidatorType.FIELD, message = "Report To is Required."),
    @RequiredStringValidator(fieldName = "supervisorName", type = ValidatorType.FIELD, message = "Supervisor is Required."),
    @RequiredStringValidator(fieldName = "officialEmail", type = ValidatorType.FIELD, message = "Official Email is Required."),
    @RequiredStringValidator(fieldName = "fatherName", type = ValidatorType.FIELD, message = "Father Name is Required."),
    @RequiredStringValidator(fieldName = "empCode", type = ValidatorType.FIELD, message = "Employee is Required.")
   
},
emails = {
    @EmailValidator(fieldName = "email", type = ValidatorType.FIELD, message = "Invalid email.")
},
regexFields = {
    @RegexFieldValidator(fieldName = "mobileNumber", type = ValidatorType.FIELD, message = "Mobile number is invalid.", expression = "^[0-9]{10}$"),
    @RegexFieldValidator(fieldName = "officialMobileNumber", type = ValidatorType.FIELD, message = "Official Mobile number is invalid.", expression = "^[0-9]{10}$")},
expressions = {
    @ExpressionValidator(expression = "password==confirmPassword", message = "Password and Confirm password must be same")})
public class SignUpAction extends ActionSupport {

    private static final Logger log = Logger.getLogger(SignUpAction.class);
    private String firstName;
    private String lastName;
    private String userName;
    private String fatherName;
    private String empCode;
    private String reportedTo;
    private String supervisorName;
    private String panCard;
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

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getReportedTo() {
        return reportedTo;
    }

    public void setReportedTo(String reportedTo) {
        this.reportedTo = reportedTo;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
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

 
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Action(value = "/SignupAction", results = {
        @Result(name = "success", location = "/jsp/main/main.jsp"),
        @Result(name = "error", location = "/signup.jsp"),
        @Result(name = "input", location = "/signup.jsp")})
    public String execute() {
        SignUpDTO signUpDto = new SignUpDTO();
           LoginService loginService=new LoginService();
         if(loginService.checkAvaility(userName))
         {
          addActionError("User name already exist.");
                return ERROR;
          }

        signUpDto.setUserName(userName);
        signUpDto.setFirstName(firstName);
        signUpDto.setLastName(lastName);
        signUpDto.setFatherName(fatherName);
        signUpDto.setPanNo(panCard);
        signUpDto.setEmployeeCode(empCode);
        signUpDto.setReportTo(Integer.parseInt(reportedTo));
        signUpDto.setSupervisor(Integer.parseInt(supervisorName));

            signUpDto.setMobileNo(Long.parseLong(mobileNumber));
            signUpDto.setOfficialMobileNo(Long.parseLong(officialMobileNumber));
       
        signUpDto.setLandlineNo(code+"-"+landLineNumber);
        signUpDto.setAddress(address);
        signUpDto.setEmail(email);
        signUpDto.setOfficialEmail(officialEmail);
        signUpDto.setCreatedOn(new Date());
        signUpDto.setIsActive('Y');
        signUpDto.setPassword("India");
        signUpDto.setRoleId(3);
        SignUpService signUpService=new SignUpService();
        try{
            signUpService.userSignUp(signUpDto);
        }catch(Exception e)
        {
        addActionError("Unable to save user");
        log.error(e.getMessage());
        }
        return SUCCESS;
    }
}
