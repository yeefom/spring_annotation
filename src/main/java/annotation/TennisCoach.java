package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private EquipmentService equipmentService;

    // @Autowired
    // public TennisCoach(EquipmentService equipmentService) {
    //     this.equipmentService = equipmentService;
    // }

    @Override
    public String getWorkout() {
        return "tennis coach workout";
    }

    @Override
    public String getEquipment() {
        return equipmentService.getEquipment();
    }

    @Autowired
    public void setEquipmentService(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }
}
