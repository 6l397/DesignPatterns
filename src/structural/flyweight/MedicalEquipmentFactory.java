package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MedicalEquipmentFactory {
    private static final Map<String, MedicalEquipment> equipmentPool = new HashMap<>();

    static MedicalEquipment getMedicalEquipment(String type) {
        return equipmentPool.computeIfAbsent(type, t -> {
            switch (t) {
                case "XRay":
                    return new XRayMachine();
                default:
                    throw new IllegalArgumentException("Unknown medical equipment type: " + t);
            }
        });
    }
}
