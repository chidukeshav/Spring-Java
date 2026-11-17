package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentHttpMapping {
	@GetMapping("/fetch")
	@ResponseBody
	public String getStudent() {
		return "Studemt fitchet succeffuly";
	}
	@PostMapping("/add")
	@ResponseBody
	public String setStudent() {
		return "Student Added";
	}
	@PutMapping("/up")
	@ResponseBody
	public String updateStudent() {
		return "Student Updated";
	}
	@DeleteMapping("/del")
	@ResponseBody
	public String deleteStudent() {
		return "Student Delete";
	}
	
	@PatchMapping("/pat")
	@ResponseBody
	public String patchStudent() {
		return "Partial";
	}

}
