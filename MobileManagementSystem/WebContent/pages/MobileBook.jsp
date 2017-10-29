<%@include file="header.jsp"%>
	
<hr/>
<table id="mobile">
	<tr>
		<td>Mobile Id</td>
		<td>${mobDetails.mobileId}</td>
	</tr>
	
	<tr>
		<td>Mobile Name</td>
		<td>${mobDetails.mobName}</td>
	</tr>
	
	<tr>
		<td>Mobile Price</td>
		<td>${mobDetails.price}</td>
	</tr>
</table>

<hr/>

<sf:form action="addMobile.capg?mobId=${mobDetails.mobileId}" method="POST" modelAttribute="purchaseDetails" commandName="purchaseDetails">

			<table id="mobile">			
				<tr>
					<td>Customer Name :: </td>
					<td>
						<sf:input path="custName"/>
						<sf:errors path="custName"/>
					</td>
				</tr>
				
				<tr>
					<td>Customer Mail Id :: </td>
					<td><sf:input path="mailId"/>
						<sf:errors path="mailId"/>
					</td>
				</tr>
				<tr>
					<td>Customer Phone :: </td>
					<td><sf:input path="phoneNo" type="number"/>
						<sf:errors path="phoneNo"/>
					</td>
				</tr>
				<tr>
					<td>Customer Purchase Date :: </td>
					<td><sf:input path="purchaseDate" type="date"/>
						<sf:errors path="purchaseDate"/>
					</td>
				</tr>
				<%-- 
				<tr>
					<td>Mobile ID :: </td>
					<td><sf:input path="mobileId" type="number"/>
						<sf:errors path="mobileId"/>
					</td>
				</tr>
				 --%>
				 
				<tr>
					<td>Select Mobile Id : </td>
					<td>
						<sf:select path="mobileId" items="${mList}" />
					</td>
				</tr>

				<tr>
					<td>Number of Mobile to Book :: </td>
					<td><sf:input path="bookedQuan" type="number"/>
						<sf:errors path="bookedQuan"/>
					</td>
				</tr>
	 
				
				<tr>
					<td colspan="2">
						<button type="submit">Book Mobile</button>
					</td>
				</tr>
				
			</table>
						
		</sf:form>		
	
<%@include file="footer.jsp"%>