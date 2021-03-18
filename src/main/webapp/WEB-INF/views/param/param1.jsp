<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>!param test page!</h1>

	<form action="./param1" method="post">
		<p>
			p1<input type = "text" name="p1"">
		</p>
		
		<p>
			p2<input type = "date" name="p2">
		</p>
		<p>
			p3<input type = "color" name="p3">
		</p>
		<p>
			<select name="p4">
				<option value="k">kt</option>
				<option value="s">sk</option>
				<option value="l">lg</option>		
			</select>
		</p>
		
		<p>
			kt <input type="radio" name="p5" value="kt">
			lg<input type="radio" name="p5" value="lg">
			sk<input type="radio" name="p5" value="sk">
		</p>
			<p>
			kt <input type="checkbox" name="p6" value="kt">
			lg <input type="checkbox" name="p6" value="lg">
			sk <input type="checkbox" name="p6" value="sk">
		</p>
		
		
		
		<button>submit</button>
		
		
	</form>

</body>
</html>