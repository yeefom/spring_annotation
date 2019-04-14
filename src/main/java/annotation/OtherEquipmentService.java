package annotation;

import org.springframework.stereotype.Component;

@Component
public class OtherEquipmentService implements EquipmentService {

    @Override
    public String getEquipment() {
        return "other equipmenet";
    }

}
