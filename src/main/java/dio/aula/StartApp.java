package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.Usuario;
import dio.aula.repository.UsuarioRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UsuarioRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setName("Guilherme");
        usuario.setUsuarioname("guisa");
        usuario.setPassword("123456");

        repository.save(usuario);

        for(Usuario u : repository.findAll()){
            System.out.println(u);
        } 
        
    }
    
}
