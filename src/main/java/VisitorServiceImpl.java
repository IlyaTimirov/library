import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service

public class VisitorServiceImpl implements VisitorService {
    @Autowired
    private VisitorClients visitorClients;

    public VisitorServiceImpl(VisitorClients visitorClients) {
        this.visitorClients = visitorClients;
    }

    @Override
    public <R> List<String> checkVisitObject(List<R> entities, Function<R, String> mapper) {
        return visitorClients.checkVisitObject(new VisitorRequestDTO(entities.stream()
                .map(mapper)
                .collect(Collectors.toList())));
    }

    @Override
    public void addVisitor(String type, String visitedObjectId, String projectId) {

    }

    @Override
    public void removeVisitor(String type, String visitedObjectId, String projectId) {

    }
}
