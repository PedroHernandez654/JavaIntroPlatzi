package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//Definimos a la extension de CrudRepository, la clase de Entity y el tipo de dato es la clave primaria
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true) Si tenemos este Query podemos llamar como sea el método
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
