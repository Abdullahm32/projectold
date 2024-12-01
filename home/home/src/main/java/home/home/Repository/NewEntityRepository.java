package home.home.Repository;

import home.home.Entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewEntityRepository extends JpaRepository<NewEntity, Long> {
}