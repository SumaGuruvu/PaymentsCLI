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
	<div id="btn">
		<a href="Bank_account.jsp">
			<button class="a">Add bank account</button>
		</a> 
		<a href="transaction.jsp">
			<button class="a">Transaction</button>
		</a> 
		<a href="wallet.jsp">
			<button class="a">Wallet</button>
		</a> 
		<a href="checkBalance.jsp">
			<button class="a">Check Balance</button>
		</a> 
		<a href="BankaccountList.jsp">
			<button class="a">Bank Account List</button>
		</a>
		<a href="http://localhost:8080/PaymentsCli/logoutServlet">
			<button class="a">Logout</button>
		</a>
	</div>
</body>
</html>