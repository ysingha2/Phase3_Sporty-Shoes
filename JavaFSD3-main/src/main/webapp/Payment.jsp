<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sporty Shoes</title>
  <link rel="stylesheet" href="styles.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@600&family=Source+Sans+Pro:wght@200&display=swap"
    rel="stylesheet">
  <script src="https://kit.fontawesome.com/e276e47864.js" crossorigin="anonymous"></script>
</head>

<body>
  <div><span style="color:white;font-size:60px;font-family: 'Dancing Script', cursive;">Sporty</span><span
      style="color:rgb(247, 103, 0);font-size:60px;font-size:60px;font-family: 'Dancing Script', cursive;">Shoes</span><span
      style="color:white;font-size:30px;font-size:60px;font-family: 'Dancing Script', cursive;">.com</span></div>
  <div class="container">
    <form action="paymentDone" method="get">
      <h1 style="color:rgb(255, 189, 6)">MAKE PAYMENT for <%=request.getParameter("name")%>
      </h1>
      <div class="item"><input type="text" placeholder="Email id" class="tb" name="emailid" /></div>
      <div class="item"><input type="text" placeholder="Address" class="tb" name="address" /></div>
      <div class="item"><input type="text" placeholder="Name on Card" class="tb" name="nameoncard" /></div>
      <div class="item"><input type="text" placeholder="Card Number" class="tb" name="cardnumber" /></div>
      <div class="item"><input type="text" placeholder="CVV" class="tb" name="cvv" /></div>
      <div style="color:white; margin: 10px; text-align:center;">Card Expiry Date</div>
      <div class="item"><input type="date" class="tb" name="date" /></div>
      <% session.setAttribute("name",request.getParameter("name"));%>
        <div><input type="submit" value="Make Payment" class="btn" /></div>
    </form>
  </div>
</body>

</html>