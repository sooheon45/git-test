package personalschedulemanagementservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import personalschedulemanagementservice.domain.*;
import personalschedulemanagementservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Domain extends AbstractEvent {

    private Long id;

    public Domain(Ggg aggregate) {
        super(aggregate);
    }

    public Domain() {
        super();
    }
}
//>>> DDD / Domain Event
