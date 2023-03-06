package section11abstraction.challengeinterface;

public interface Mappable {

    String JSON_PROPERTIES = """
            properties: {%s}
            """;

    String getLabel();

    String getMarker();

    Geometry getShape();

    default String toJSON() {
        return """
                "type": "%s", "label": "%s", "marker": "%s"
                """.formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIT(Mappable mappable) {
        System.out.println(JSON_PROPERTIES.formatted(mappable.toJSON()));
    }

}
