package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "Category"),
            @Mapping(source = "estados", target = "active"),
    })
    Category toCategory(Categoria categoria);

    @InheritConfiguration//De esta forma se realiza la inversa a la función de arriba del mappeo
    @Mapping(target = "productos", ignore = true)//Como Categoria tiene una propiedad de productos, esto hace que la ignore
    Categoria toCategoria(Category category);
}
