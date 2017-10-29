<%@include file="header.jsp"%>
	
<hr/>

SuccessFully Registered

<hr/>

<table id="mobile">
	<tr>
		<td>Mobile Id</td>
		<td>${mobileDetails.mobileId}</td>
	</tr>
	
	<tr>
		<td>Mobile Name</td>
		<td>${mobileDetails.mobName}</td>
	</tr>
	
	<tr>
		<td>Mobile Price</td>
		<td>${mobileDetails.price}</td>
	</tr>
	
	<tr>
		<td>Mobile Quantity</td>
		<td>${mobileDetails.quantity}</td>
	</tr>
	
	
</table>

<hr/> Purchase Details<hr/>

<table id="mobile">
	<tr>
		<td>Purchase Id</td>
		<td>${purDetails.purchaseId}</td>
	</tr>
	
	<tr>
		<td>Customer Name</td>
		<td>${purDetails.custName}</td>
	</tr>
	
	<tr>
		<td>Purchase Mail - Id</td>
		<td>${purDetails.mailId}</td>
	</tr>
	
	<tr>
		<td>Purchase Phone Number</td>
		<td>${purDetails.phoneNo}</td>
	</tr>
	
	<tr>
		<td>Purchase Date</td>
		<td>${purDetails.purchaseDate}</td>
	</tr>
	
	<tr>
		<td>Mobile Id </td>
		<td>${purDetails.mobileId}</td>
	</tr>
	
	<tr>
		<td>Total Amount</td>
		<td>${purDetails.totalAmt}</td>
	</tr>
	
	<tr>
		<td>Booked Quantity</td>
		<td>${purDetails.bookedQuan}</td>
	</tr>
	
</table>


<%@include file="footer.jsp"%>