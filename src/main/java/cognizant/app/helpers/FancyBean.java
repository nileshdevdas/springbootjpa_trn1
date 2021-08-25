package cognizant.app.helpers;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FancyBean {

	public FancyBean(@Autowired DataSource dataSource) {
		System.out.println(dataSource);
	}

	@PostConstruct
	public void init() {
		System.out.println("THe fancy Bean is callled.");
	}
}
