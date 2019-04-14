package annotation;

import org.springframework.stereotype.Component;

@Component
public class TennisEquipmentService implements EquipmentService {
    @Override
    public String getEquipment() {
        return "tennis equipment";
    }
}
