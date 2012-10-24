<%-- 
    Document   : home
    Created on : Oct 19, 2012, 10:50:50 AM
    Author     : uday
--%>
  <script language="javascript" type="text/javascript" src="./resources/js/calender/demo.js"></script>
<script type="text/javascript">
$(document).ready(function () {
           setupDashboardChart('chart1');
            setupLeftMenu();
	  		setSidebarHeight();
        });
    </script>

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