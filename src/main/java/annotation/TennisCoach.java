package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("otherEquipmentService")
    private EquipmentService equipmentService;

    // @Autowired
    // public TennisCoach(EquipmentService equipmentService) {
    //     this.equipmentService = equipmentService;
    // }

    // @Autowired
    // public void setEquipmentService(EquipmentService equipmentService) {
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

}
