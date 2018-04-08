<?php

DEFINE ('DB_USER', 'root');
DEFINE ('DB_PASSWORD', '');
DEFINE ('DB_HOST', 'localhost');
DEFINE ('DB_NAME', 'webdesign');

// Make the connection.
$dbc = @mysql_connect (DB_HOST, DB_USER, DB_PASSWORD) OR die ('Could not connect to MySQL: ' . mysql_error() );

// Select the database.
@mysql_select_db (DB_NAME) OR die ('Could not select the database: ' . mysql_error() );

$pickup = $_POST['location'];
$special = $_POST['specialization'];

//echo $pickup;

//$sql = 'SELECT * from findingdoctor where City = $pickup';

$retval = mysql_query( "SELECT * FROM findingdoctor WHERE City LIKE '$pickup' OR Specialization LIKE '$special' ", $dbc );

if (!$retval) { // add this check.
    die('Invalid query: ' . mysql_error());
}



while($row = mysql_fetch_array($retval, MYSQL_ASSOC))
{
	
	//echo "EMP ID :{$row['Doctor_Id']}  <br> ". "EMP NAME : {$row['Doctor_Name']} <br> ".  "EMP SALARY : {$row['City']} <br> ". "--------------------------------<br>";
   
	echo "<table border = '1'>";
	
	echo "<tr>
		  
		  <th>Doctor Name</th>
		  <th>City</th>
		  <th>Specialization</th>
		  <th>Clinic Address</th>
		  <th>Email ID</th>
		   
		  </tr>";
	
	echo "<tr><td>".$row["Doctor_Name"]."</td><td>".$row["City"]."</td><td> ".$row["Specialization"]."</td><td>".$row["Clinic_Address"]."</td><td>".$row["Email_Id"]."</td></tr>";
	
	
	
	
	
	echo "</table>";
	
	
}

mysql_close($dbc);

?>
