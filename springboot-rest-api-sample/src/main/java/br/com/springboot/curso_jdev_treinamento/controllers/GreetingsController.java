package br.com.springboot.curso_jdev_treinamento.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.curso_jdev_treinamento.model.Usuario;
import br.com.springboot.curso_jdev_treinamento.repository.UsuarioRepository;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
	
	private static final long Null = 0;
	@Autowired
	private UsuarioRepository usuarioRepository;
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    
    @RequestMapping(value = "olamundo/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText1(@PathVariable String name) {
    	
    	Usuario usuario = new Usuario();
    	usuario.setNome(name);
    	
    	usuarioRepository.save(usuario);
        return "Hello " + name + "!";
    	
    }
    
    @GetMapping(value = "listartodos")
    @ResponseBody
    public ResponseEntity<List<Usuario>> listarusario(){
		List<Usuario> usuarios = usuarioRepository.findAll();
		return new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
		}
    
    @PostMapping(value = "salvar")
    @ResponseBody
    public ResponseEntity<Usuario> salva(@RequestBody Usuario usuario){
    	
    	Usuario user = usuarioRepository.save(usuario);
    	
    	return new ResponseEntity<Usuario>(user, HttpStatus.OK);
    	
    	
    }
    
    
    @PutMapping(value = "atualizar")
    @ResponseBody
    public ResponseEntity<?> atualizar(@RequestBody Usuario usuario){
    	
    	if (usuario.getId() == Null) {
    		return new ResponseEntity<String>("id não foi informado", HttpStatus.OK);
    	}
    	
    	Usuario user = usuarioRepository.saveAndFlush(usuario);
    	
    	return new ResponseEntity<Usuario>(user, HttpStatus.OK);
    	
    	
    }
    
    @DeleteMapping(value = "delete")
    @ResponseBody 
    public ResponseEntity<String> delete(@RequestParam Long Iduser){
    	
    	usuarioRepository.deleteById(Iduser);
    	
    	return new ResponseEntity<String>("Deletado com sucesso", HttpStatus.OK);
    }
    
    @GetMapping(value = "buscaruserId")
    @ResponseBody 
    public ResponseEntity<Usuario> buscaruserId(@RequestParam(name = "Iduser") Long Iduser){
    	
    	Usuario usuario = usuarioRepository.findById(Iduser).get();
    	
    	return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }
    
    @GetMapping(value = "buscarPorNome")
    @ResponseBody 
    public ResponseEntity<List<Usuario>> buscarPorNome(@RequestParam(name = "name") String name){
    	
    	List<Usuario> usuario = usuarioRepository.buscarPorNome(name);
    	
    	return new ResponseEntity<List<Usuario>>(usuario, HttpStatus.OK);
    }
}

