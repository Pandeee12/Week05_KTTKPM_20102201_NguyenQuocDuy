package vn.edu.iuh.fit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.models.Singer;

public interface SingerRepository extends JpaRepository<Singer, Long> {

}
