package guru.springframework.sfg_di.services;

import guru.springframework.sfg_di.repositories.EnglishGreetingRepository;

/**
 * Created on 06/30/2025 by Jesse H.
 */

public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
