package dio.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.aula.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
