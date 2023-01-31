<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Sporty Shoes</title>
  <link rel="stylesheet" href="styles.css">
</head>

<body>
  <div><span style="color:white;font-size:60px;font-family: 'Dancing Script', cursive;">Sporty</span><span
      style="color:rgb(247, 103, 0);font-size:60px;font-size:60px;font-family: 'Dancing Script', cursive;">Shoes</span><span
      style="color:white;font-size:30px;font-size:60px;font-family: 'Dancing Script', cursive;">.com</span></div>
  <div class="container1">
    <form action="SearchPurchases" method="get">
      <div>
        <h1 class="item">Search</h1>
      </div>

      <div class="item"><input type="text" placeholder="search" class="tb" name="search" /></div>
      <div class="item">

        <div style="color:white; margin: 10px; text-align:center;">Search Purchase History</div>
        <select class="tb" name="searchoption">
          <option value="pid">Pid</option>
          <option value="pname">Product Name</option>
        </select>
      </div>
      <div><input type="submit" value="Search" class="btn" /></div>
    </form>
  </div>
</body>

</html>