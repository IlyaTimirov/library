import java.util.List;
import java.util.function.Function;

public interface VisitorService {
    <R> List<String> checkVisitObject(List<R> entities, Function<R, String> mapper);

    void addVisitor(String type, String visitedObjectId, String projectId);

    void removeVisitor(String type, String visitedObjectId, String projectId);
}
