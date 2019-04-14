package annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach, InitializingBean, DisposableBean {

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
    public void afterPropertiesSet() throws Exception {
        System.out.println("post construct tennis coach");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("before destroy tennis coach");
    }

    @Override
    public String getWorkout() {
        return "tennis coach workout";
    }

    @Override
    public String getEquipment() {
        return equipmentService.getEquipment();
    }

}
