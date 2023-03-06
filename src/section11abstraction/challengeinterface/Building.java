package section11abstraction.challengeinterface;

public class Building implements Mappable {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + " )";
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color.BLACK + " " + PointMarker.CIRCLE;
            case GOVERNMENT -> Color.BLUE + " " + PointMarker.PUSH_PIN;
            case RESIDENTIAL -> Color.GREEN + " " + PointMarker.START;
            case SPORTS -> Color.ORANGE + " " + PointMarker.SQUARE;
            default -> Color.RED + " " + PointMarker.TRIANGLE;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

}
