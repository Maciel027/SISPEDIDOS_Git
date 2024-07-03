package br.com.itihl.bdpedidos.sistemapedidos.controle;

import org.springframework.web.bind.annotation.RestController;
import br.com.itihl.bdpedidos.sistemapedidos.modelo.Estado;
import br.com.itihl.bdpedidos.sistemapedidos.repositorio.EstadoRepositorio;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EstadoControler {

    private final EstadoRepositorio repositorio;
    public EstadoControler(EstadoRepositorio repositorio){
        this.repositorio = repositorio;
    }

    @GetMapping("/estados")
    public List<Estado> getTodos() {
        return (List<Estado>) repositorio.findAll(); 
        //pedir para o repositorio trazer a lista de estado.
    }
    
    @PostMapping("/estado")
    public Estado postEstado(@RequestBody Estado entity){
        //Todo:     
        return repositorio.save(entity);
    }
    

}
