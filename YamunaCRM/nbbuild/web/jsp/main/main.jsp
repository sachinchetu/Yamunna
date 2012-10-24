<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <%@taglib  prefix="s" uri="/struts-tags"%>
    <%@taglib prefix="sj" uri="/struts-jquery-tags"%>

      <sj:head jquerytheme="cupertino" jqueryui="true" loadAtOnce="true" />
    <%@include file="header.jsp"%>
<%
response.setHeader("Pragma", "no-cache");
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Expires", "0");
%>

<body>
   

    <div class="container_12">
        <div class="grid_12 header-repeat">
            <div id="branding">
                <div class="floatleft">
                    <img src="./resources/img/sample.png" alt="Logo" /></div>
                <div class="floatright">
                    <div class="floatleft">
                        <img src="./resources/img/img-profile.jpg" alt="Profile Pic" /></div>
                    <div class="floatleft marginleft10">
                        <ul class="inline-ul floatleft">
                            <li>Hello Admin</li>
                            <li><a href="#">Config</a></li>
                            <li><a href="#">Logout</a></li>
                        </ul>
                        <br />
                        <span class="small grey">Last Login: 3 hours ago</span>
                    </div>
                </div>
                <div class="clear">
                </div>
            </div>
        </div>
        <div class="clear">
        </div>
        <div class="grid_12">
            <ul class="nav main">
                <li class="ic-home"><sj:a id="ajaxlink" href="homeUrl" targets="middle" ><span>Home</span></sj:a></li>
                 <li class="ic-form-style"><sj:a id="accountsLink" href="accountUrl" targets="middle" ><span>Accounts</span></sj:a></li>
                 <li class="ic-typography"><sj:a href="calenderUrl" targets="middle"><span>Calender</span></sj:a></li>
                 <li class="ic-charts"><sj:a href="contactUrl" targets="middle"><span>Contacts</span></sj:a></li>
                 <li class="ic-gallery dd"><sj:a href="leadUrl" targets="middle"><span>Leads</span></sj:a></li>
                 <li class="ic-grid-tables"><sj:a href="opportunityUrl" targets="middle"><span>Opportunity</span></sj:a></li>
                 <li class="ic-form-style"><sj:a href="obmUrl" targets="middle">Order Booking Memo</sj:a> </li>
                 <li class="ic-notifications"><sj:a href="reportUrl" targets="middle" ><span>Reports</span></sj:a></li>
                 <li class="ic-dashboard"><sj:a href="dashboard" targets="middle"><span>Dashboard</span></sj:a></li>
                 <li><sj:a targets="middle" href="expensesUrl"><span>Expenses</span></sj:a></li>
            </ul>
        </div>
        <div class="clear">
        </div>
        <div class="grid_2">
            <div class="box sidemenu">
                <div class="block" id="section-menu">
                    <ul class="section menu">
                        <li><a class="menuitem">Create</a>
                            <ul class="submenu">
                                <li><a>Account</a> </li>
                                <li><a>Appointment</a> </li>
                                <li><a>Contact</a></li>
                                <li><a>Expense</a></li>
                                <li><a>Lead</a></li>
                                <li><a>Opportunity</a></li>
                                <li><a>Order</a></li>
                                <li><a>Service Request</a> </li>
                                <li><a>Solution</a></li>
                                <li><a>Task</a> </li>
                            </ul>
                        </li>
                        <li><a class="menuitem">Recently Viewed</a>
                            <ul class="submenu">
                                <li><a>Contact</a></li>
                                <li><a>Expense</a></li>
                                <li><a>Lead</a></li>
                                <li><a>Opportunity</a></li>
                            </ul>
                        </li>
                        <li><a class="menuitem">Favourite Records</a>
                            <ul class="submenu">
                            </ul>
                        </li>
                        <li><a class="menuitem">Favourite List</a>
                            <ul class="submenu">
                            
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
       <div id="middle">
                </div>
                
        <div class="clear">
        </div>
    </div>
    <div class="clear">
    </div>

    <%@include file="footer.jsp"%>
</body>
</html>