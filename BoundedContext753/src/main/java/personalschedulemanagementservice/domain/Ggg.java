package personalschedulemanagementservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import personalschedulemanagementservice.BoundedContext753Application;

@Entity
@Table(name = "Ggg_table")
@Data
//<<< DDD / Aggregate Root
public class Ggg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static GggRepository repository() {
        GggRepository gggRepository = BoundedContext753Application.applicationContext.getBean(
            GggRepository.class
        );
        return gggRepository;
    }
}
//>>> DDD / Aggregate Root
