package br.com.itihl.bdpedidos.sistemapedidos.repositorio;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.itihl.bdpedidos.sistemapedidos.modelo.Estado;

@Repository
public interface EstadoRepositorio extends CrudRepository<Estado, BigInteger>{

}
