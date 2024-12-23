import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(name = "visitor-service", path = "/api/v1")
public interface VisitorClients {
    List<String> checkVisitObject(VisitorRequestDTO visitorRequest);
}
