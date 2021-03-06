<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <%@taglib  prefix="s" uri="/struts-tags"%>
    <%@taglib prefix="sj" uri="/struts-jquery-tags"%>

    <sj:head  />
    <%@include file="header.jsp"%>


<script type="text/javascript">
$(document).ready(function () {
            setupDashboardChart('chart1');
            setupLeftMenu();
			setSidebarHeight();
        });
    </script>
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
                <li class="ic-home"><a href="#"><span>Home</span></a> </li>
                <li class="ic-form-style"><a href="javascript:"><span>Accounts</span></a></li>
                <li class="ic-typography"><a href="#"><span>Calender</span></a></li>
	        <li class="ic-charts"><a href="#"><span>Contacts</span></a></li>
                <li class="ic-gallery dd"><a href="javascript:"><span>Leads</span></a></li>
                <li class="ic-grid-tables"><a href="#"><span>Opportunity</span></a></li>
                <li class="ic-form-style"><a href="#">Order Booking Memo</a> </li>
                <li class="ic-notifications"><a href="#"><span>Reports</span></a></li>
                <li class="ic-dashboard"><a href="#"><span>Dashboard</span></a></li>
                <li><a href="#"><span>Expenses</span></a></li>
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
        <div class="grid_10">

            <div class="box round">
                <h2>
                    Figures</h2>
                <div class="block">
                    <div class="stat-col">
                        <span>Target</span>
                        <p class="purple">
                            70,000</p>
                    </div>
                    <div class="stat-col">
                        <span>Last Month Sales</span>
                        <p class="yellow">
                            32,729</p>
                    </div>
                    <div class="stat-col">
                        <span>Current Month Sales</span>
                        <p class="green">
                            63,829</p>
                    </div>

                    <div class="stat-col">
                        <span>Difference</span>
                        <p class="red">
                            693.00</p>
                    </div>
                    <div class="stat-col">
                        <span>Stats with Icon</span>
                        <p class="purple">
                            <img src="./resources/img/icon-direction.png" alt="" />&nbsp;65,000</p>
                    </div>
                    <div class="stat-col last">
                        <span>Total</span>
                        <p class="darkblue">
                            70,000</p>
                    </div>
                    <div class="clear">
                    </div>
                </div>
            </div>
			   <div class="box round first">
                <h2>
                    Product Sales</h2>
                <div class="block">
                    <div id="chart1">
                    </div>

                </div>
            </div>
        </div>
        <div class="grid_10">
            <div class="box round">
                <h2>
                   Calendar</h2>
                  <div class="block">
                    <div id="calendar"></div>
                </div>
				<div id="event_edit_container">
		<form>
			<input type="hidden" />
			<ul>
				<li>
					<span>Date: </span><span class="date_holder"></span>
				</li>
				<li>
					<label for="start">Start Time: </label><select name="start"><option value="">Select Start Time</option></select>
				</li>
				<li>
					<label for="end">End Time: </label><select name="end"><option value="">Select End Time</option></select>
				</li>
				<li>
					<label for="title">Title: </label><input type="text" name="title" />
				</li>
				<li>
					<label for="body">Body: </label><textarea name="body"></textarea>
				</li>
			</ul>
		</form>
	</div>
            </div>
        </div>

        <div class="clear">
        </div>
    </div>
    <div class="clear">
    </div>

    <%@include file="footer.jsp"%>
</body>
</html>