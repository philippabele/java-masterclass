package section11abstraction.challengeinterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mappable> mappable = new ArrayList<>();

        mappable.add(new Building("Town Hall", UsageType.GOVERNMENT));
        mappable.add(new Building("Opera House", UsageType.ENTERTAINMENT));
        mappable.add(new Building("Stadium", UsageType.SPORTS));
        mappable.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappable.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

        for (var m : mappable) {
            Mappable.mapIT(m);
        }

    }
}
