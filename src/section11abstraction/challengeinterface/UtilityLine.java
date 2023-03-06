package section11abstraction.challengeinterface;

public class UtilityLine implements Mappable {

    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + " )";
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color.BLACK + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> Color.BLUE + " " + LineMarker.DOTTED;
            case GAS -> Color.GREEN + " " + LineMarker.SOLID;
            default -> Color.ORANGE + " " + LineMarker.DASHED;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

}
