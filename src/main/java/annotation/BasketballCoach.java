package annotation;

public class BasketballCoach implements Coach {

    private EquipmentService equipmentService;

    public BasketballCoach(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @Override
    public String getWorkout() {
        return "basketball coach workout";
    }

    @Override
    public String getEquipment() {
        return equipmentService.getEquipment();
    }

}
