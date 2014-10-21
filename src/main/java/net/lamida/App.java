package net.lamida;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 * 
 */
public class App extends Application<PhonebookConfiguration> {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");
		new App().run(args);
	}

	@Override
	public void initialize(Bootstrap<PhonebookConfiguration> b) {
	}

	@Override
	public void run(PhonebookConfiguration c, Environment e) throws Exception {
		LOGGER.info("Method App#run() called");
		for (int i = 0; i < c.getMessageRepetitions(); i++) {
			System.out.println(c.getMessage());
		}
		System.out.println("Extra message: " + c.getAdditionalMessage());
		e.jersey().register(new ContactResource());
	}
}
