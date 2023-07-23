package in.saffu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMsgRestcontroller {
	
	@GetMapping("/")
	public String indexMsg() {
		return "Dockerizing Spring Boot Application";
	}

}
