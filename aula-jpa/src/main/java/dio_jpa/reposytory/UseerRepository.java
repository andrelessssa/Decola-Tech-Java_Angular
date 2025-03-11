package dio_jpa.reposytory;

import org.springframework.data.jpa.repository.JpaRepository;

import dio_jpa.model.User;

public interface UseerRepository extends JpaRepository <User, Integer> {
    
}
