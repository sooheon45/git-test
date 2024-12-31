package personalschedulemanagementservice.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import personalschedulemanagementservice.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "gggs", path = "gggs")
public interface GggRepository extends PagingAndSortingRepository<Ggg, Long> {}
