package annotation;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getWorkout() {
        return "tennis coach workout";
    }
}
