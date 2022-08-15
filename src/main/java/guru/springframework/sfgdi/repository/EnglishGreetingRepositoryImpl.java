package guru.springframework.sfgdi.repository;

import org.springframework.stereotype.Service;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository{

	@Override
	public String getGreeting() {
		return "Hello World - EN";
	}

}
