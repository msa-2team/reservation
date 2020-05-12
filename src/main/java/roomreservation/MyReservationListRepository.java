package roomreservation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MyReservationListRepository extends CrudRepository<MyReservationList, Long> {
//    Optional<MyReservationList> findByReservationId(Long reservationId);
}