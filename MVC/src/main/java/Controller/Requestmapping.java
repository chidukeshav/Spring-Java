package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Requestmapping {
	
	@RequestMapping(value = "/get", method=RequestMethod.GET)
	@ResponseBody
	public String getStudent1() {
		return "Getting all the student";
	}
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	@ResponseBody
	public String setStudent() {
		return "Adding the student";
	}
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ResponseBody
	public String updateStudent11() {
		return "Updating";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteStudent() {
		return "Deleting";
	}

}
