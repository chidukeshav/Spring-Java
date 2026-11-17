package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTable {
	@GetMapping("/student")
	@ResponseBody
	public String getStudent() {
		String name="chidu";
		String email="chidu@gmail.com";
		String pwd="Chidu@2004";
		return
				"<h2>Student Details</h2>"+"<table border='1' cellpadding='10'>"+
				"<tr>"+
				"<th>Name</th>"+"<th>Email<th>"+"<th>Password</th>"+
				"</tr>"+
				"</tr>"+
				"<td>"+name+"</td>"+
				"<td>"+email+"</td>"+
				"<td>"+pwd+"</td>"+
				"</tr>"+
				"</table>";			
	}

}
