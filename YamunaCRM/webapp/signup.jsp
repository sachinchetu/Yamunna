<%-- 
    Document   : signup
    Created on : Oct 7, 2012, 10:16:34 AM
    Author     : uday
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
        <link rel="stylesheet" type="text/css" href="./resources/css/reset.css"/>
        <link rel="stylesheet" type="text/css" href="./resources/css/layout.css"/>
        <link rel="stylesheet" type="text/css" href="./resources/css/text.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="./resources/css/grid.css" media="screen" />

        <link rel="stylesheet" type="text/css" href="./resources/css/nav.css" media="screen" />
       
        <sj:head jquerytheme="cupertino" jqueryui="true"/>
    </head>
    <script type="text/javascript">
        $(document).ready(function(){
           $.subscribe('beforeForm', function(event,data) {
     var fData = event.originalEvent.formData;
	 alert('About to submit: \n\n' + fData[0].value + ' to target '+event.originalEvent.options.target+' with timeout '+event.originalEvent.options.timeout );
     var form = event.originalEvent.form[0];
     if (form.echo.value.length  < 2) {
         alert('Please enter a value with min 2 characters');
         event.originalEvent.options.submit = false;
     }
    });
        });


function customeValidation(form, errors) {
if (errors.fieldErrors) {
		$.each(errors.fieldErrors, function(index, value) {
			var elem = $('#'+index+'Error');
			if(elem)
			{
				elem.html(value[0]);
				elem.addClass('error');
			}
                        var el=$('#'+index);
                        if(el)
                            {
                                el.addClass('error');

                            }
		});
	}

}

    </script>
    <body style="background-color: #2E5E79">
        <div class="container_12">
            <div class="grid_12 header-repeat">
                <div id="branding">
                    <div class="floatleft">
                        <img src="resources/img/logo.png" alt="Logo" /></div>
                    <div class="floatright">

                    </div>
                    <div class="clear">
                    </div>
                </div>
            </div>
            <div class="grid_12">
                <div class="box round first fullpage">
                    <h2>
                        Signup forms</h2>
                    <div class="block ">
                        <s:form theme="simple" method="post" name="signupfrm" action="SignupAction" validate="true">
                            <table class="form" >
                                <tr>
                                    <td class="col1">
                                        <label>
                                            User Name 
                                        </label>
                                    </td>
                                    <td class="col2">
                                        <s:textfield name="userName" required="true" maxLength="32" theme="simple" id="userName"  />
                                        <span id="userNameError"></span>
                                    </td>
                                     
                                </tr>
                                <tr>
                                    <td class="col1">
                                        <label>
                                            Employee Code
                                        </label>
                                    </td>
                                    <td class="col2">
                                        <s:textfield name="empCode" required="true" theme="simple" id="empCode" />
                                         <span id="empCodeError"></span>
                                    </td>
                                </tr>
                            
                                <tr>
                                    <td class="col1">
                                        <label>
                                            First Name</label>
                                    </td>
                                    <td class="col2">
                                        <s:textfield name="firstName" id="firstName" required="true"  />
                                        <span id="firstNameError"></span>
                                    </td>

                                </tr>
                                <tr>
                                    <td class="col1">
                                        <label>
                                            Last Name</label>
                                    </td>
                                    <td class="col2">
                                        <s:textfield name="lastName" id="lastName" required="true"  />
                                        <span id="lastNameError"></span>

                                    </td>

                                </tr>
                                    <tr>
                                    <td class="col1">
                                        <label>
                                            Father's Name</label>
                                    </td>
                                    <td class="col2">
                                        <s:textfield name="fatherName" id="fatherName" required="true"  />
                                        <span id="fatherNameError"></span>

                                    </td>

                                </tr>
                                <tr>
                                    <td class="col1">
                                        <label>
                                            Mobile #</label>
                                    </td>
                                    <td class="col2">
                                        <s:textfield name="mobileNumber" id="mobileNumber" required="true" maxLength="10"/>
                                        <span id="mobileNumberError"></span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="col1">
                                        <label>
                                            Official Mobile #</label>
                                    </td>
                                    <td class="col2">
                                        <s:textfield name="officialMobileNumber" id="officialMobileNumber" required="true" maxLength="10"  />
                                        <span id="officialMobileNumberError"></span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="col1">
                                        <label>
                                            Landline #</label>
                                    </td>
                                    <td >
                                        <input type="text" style="width: 3%" maxlength="4" name="code"  />
                                        <input type="text" style="width:9.5%" name="landLineNumber" maxlength="7" />
                                    </td>


                                </tr>
                                <tr>
                                    <td>
                                        <label>
                                            Address</label>
                                    </td>
                                    <td>
                                        <s:textarea cols="16" rows="5" id="address"  name="address" theme="simple"></s:textarea>
                                        <span id="addressError"></span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label>
                                            Email</label>
                                    </td>
                                    <td>
                                        <s:textfield name="email" id="email" required="true" theme="simple" />
                                        <span id="emailError"></span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label>
                                            Official Email</label>
                                    </td>
                                    <td>
                                        <s:textfield name="officialEmail" id="officialEmail" required="true" theme="simple"  />
                                        <span id="officialEmailError"></span>
                                    </td>
                                </tr>
                                 <tr>
                                    <td>
                                        <label>
                                            Reported to</label>
                                    </td>
                                    <td>
                                        <s:select list="#{'':'Select','1':'Sachin', '2':'Jaideep', '3':'Uday'}" name="reportedTo" id="reportedTo" headerKey="0" required="true" theme="simple"  />
                                        <span id="reportedToError"></span>
                                    </td>
                                </tr>
                                 <tr>
                                    <td>
                                        <label>
                                            Supervisor Name</label>
                                    </td>
                                    <td>
                                        <s:select list="#{'':'Select','1':'Sachin', '2':'Jaideep', '3':'Uday'}" name="supervisorName" id="supervisorName" required="true" theme="simple"  />
                                        <span id="supervisorNameError"></span>
                                    </td>
                                </tr>
                                    <tr>
                                    <td class="col1">
                                        <label>
                                            Pan Card #</label>
                                    </td>
                                    <td class="col2">
                                            <s:textfield  theme="simple"  required="true" id="panCard" name="panCard"/>
                                        <span id="panCardError"></span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="col1">
                                        &nbsp;
                                    </td>
                                    <td class="col2">
                                        <sj:submit button="true" value="Submit" validate="true" validateFunction="customeValidation" onBeforeTopics="beforeForm" />

                                    </td>
                                </tr>
                            </table>
                        </s:form>
                    </div>
                </div>
            </div>

        </div>
        <%@include  file="jsp/main/footer.jsp" %>
    </body>
</html>
