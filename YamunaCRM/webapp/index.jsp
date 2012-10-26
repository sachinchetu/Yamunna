<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="./resources/css/reset.css"/>
        <link rel="stylesheet" type="text/css" href="./resources/css/structure.css"/>

    </head>

    <sj:head jquerytheme="cupertino" jqueryui="true" loadAtOnce="true" />
<script language="JavaScript" src="${pageContext.request.contextPath}/struts/utils.js" type="text/javascript"></script>
        <script language="JavaScript" src="${pageContext.request.contextPath}/struts/xhtml/validation.js" type="text/javascript"></script>
 
    <script type="text/javascript">
 
$.subscribe('removeErrors', function(event,data) {
         $('.error').html('').removeClass('error');

        });
  $.subscribe('forgetPasswordAfter',function(event,data){
      $('#myclickdialog').dialog('open');
  })  ;

        function removeCss()
        {
            $('.errorLabel').html('').removeClass('errorLabel');
            $('.error').html('').removeClass('error');
        }
        function customeValidation(form, errors) {

            //List for errors
            var list = $('#formerrors');

            //Handle non field errors
            if (errors.errors) {
                $.each(errors.errors, function(index, value) {
                    list.append(''+value+'\n');
                });
            }

            //Handle field errors
            if (errors.fieldErrors) {
                $.each(errors.fieldErrors, function(index, value) {
                    var elem = $('#'+index+'Error');
                    if(elem)
                    {
                        elem.html(value[0]);
                        elem.addClass('errorLabel');
                    }
                    var el=$('#'+index);
                    if(el)
                    {
                        el.addClass('error');
                    }
                });
            }
        }



        function okButton(){
            $('#myclickdialog').dialog('close');
        };
    </script>
    <body>

        
        <s:form name="loginForm" id="loginForm" cssClass="box login" action="logAction" theme="simple"   validate="true" >
            <fieldset class="boxBody">
                <s:actionerror theme="simple" theme="jquery" />
                <label>Username <span id="userNameError"></span></label>
                <s:textfield name="userName" theme="simple" id="userName" tabindex="1" required="true"/>
               
                <s:url action="forgetPassword" id="fp">
                    <s:param name="userName" value="%{userName}"/>
                </s:url>
                <label><sj:a id="forgetPassLink" targets="myclickdialog"  href="%{fp}" validate="true" onCompleteTopics="forgetPasswordAfter" formIds="loginForm" cssClass="rLink" >Forget your password?</sj:a>Password <span id="passwordError"></span></label>
                <span class="error" ><s:fielderror fieldName="password" name="password"  /></span>
                <s:password name="password" id="password" tabindex="2" required="true"/>
            </fieldset>
        <footer>
            <label><a href="signup.jsp"> Sign up</a></label>
            <sj:submit  button="true" value="Login" cssStyle="float:right" tabindex="4"
                        validate="true"   validateFunction="customeValidation" onClickTopics="removeErrors" onSuccessTopics="removeErrors" onclick="removeCss()" />
        </footer>
    </s:form>

    <sj:dialog
            id="myclickdialog"
            autoOpen="false"
            modal="true"
            openTopics="dialogopentopic"
            resizable="false"
            title="Forget Password"
            buttons="{
    		'Ok':function() { okButton(); },
     		}"

            >
            
        </sj:dialog>

</body>
</html> 