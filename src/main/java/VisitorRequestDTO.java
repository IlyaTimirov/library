import java.util.List;

public class VisitorRequestDTO {
    private List<String> visitedObjectIds;

    public VisitorRequestDTO(List<String> visitedObjectIds) {
        this.visitedObjectIds = visitedObjectIds;
    }

}
