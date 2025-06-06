package dio_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio_jpa.model.User;


    public interface UseerRepository extends JpaRepository<User, Integer> {
        
        // Métodos de consulta
        List<User> findByNameContaining(String name);
    
        User findByUsername(String username);
    
        @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
        List<User> filtrarPorNome(@Param("name") String name);
    }


