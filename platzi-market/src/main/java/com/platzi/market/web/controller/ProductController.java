package com.platzi.market.web.controller;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.service.ProductService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController//Esto indica que esto es un Controller de mi API Rest
@RequestMapping("/products")//Que path o URL va a recibir la petición
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")/*Se usa el ResponseEntity para retornar el response los Status de Http*/
    @ApiOperation("Get all SuperMarket Products")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);//Se pueden tener 2 parametros para que se retorne el objeto y el status
    }

    @GetMapping("/{id}")
    //Con estas anotaciones hacemos que nuestra documentación en Swagger sea más precisa
    @ApiOperation("Search a Product with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Product Not Found")
    })
    public ResponseEntity<Product>  getProduct(@PathVariable("id") int productId){
        return productService.getProduct(productId)
                .map(product -> new ResponseEntity<>(product,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/category/{categoryId}")//Podemos ponerle @ApiParam para que al momento de pedir nuestro dato para realizar acciones sea requerido, descriptivo y si queremos un ejemplo
    public ResponseEntity<List<Product>> getByCategory(@ApiParam(value = "The Id of he product", required = true, example = "7") @PathVariable("categoryId") int categoryId){
        return productService.getByCategory(categoryId)
                .map(products -> new ResponseEntity<>(products,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product){
        return new ResponseEntity<>(productService.save(product),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int productId){
        if ( productService.delete(productId)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
