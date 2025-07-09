package guru.springframework.sfg_di.repositories;

/**
 * Created on 07/08/2025 by Jesse H.
 */

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
