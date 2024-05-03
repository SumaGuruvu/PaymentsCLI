<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#btn {
	display: flex;
	flex-direction: row;
	padding: 350px;
	justify-content: center;
}

.a {
	height: 50px;
	width: 150px;
}
button{
      margin-right:16px;
     

}

</style>
</head>
<body>
	<h2 style="text-align: center;">Welcome to paymentsCLI</h2>
	
	<% String s=(String)session.getAttribute("name"); %>
         <h2>Welcome <%=s %></h2> 
         
	<div id="btn">
		<a href="Bankaccount.jsp">
			<button class="a">Add bank account</button>
		</a> 
		<a href="SendMoney.jsp">
			<button class="a">Send Money</button>
		</a> 
		<a href="editBankAccount.jsp">
			<button class="a">edit BankAccount</button>
		</a> 
		<a href="statementRequest.jsp">
			<button class="a">Check Balance</button>
		</a> 
		<a href="WalletBalance.jsp">
			<button class="a">Wallet Balance</button>
		</a>
		<a href="http://localhost:8081/PaymentsCli/LogoutServlet">
			<button class="a">Logout</button>
		</a>
	</div>
</body>
</html>