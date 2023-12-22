package vn.techmaster.lap2_sb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lap2SbApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Lap2SbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'run'");
	}

}
