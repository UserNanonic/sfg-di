package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Autowired;

import guru.springframework.sfgdi.repository.EnglishGreetingRepository;

/**
 * Created by jt on 12/27/19.
 */
public class I18nEnglishGreetingService implements GreetingService {
	
	
	private final EnglishGreetingRepository englishGreetingRepository;
	
    public I18nEnglishGreetingService(EnglishGreetingRepository repository) {
		super();
		this.englishGreetingRepository = repository;
	}

	@Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
