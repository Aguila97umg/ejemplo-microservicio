package com.umg.ejemplomicroservicio.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(value ="product")
@Getter
@Setter
@NoArgsConstructor

public class ProductEntity {
    @Id
    private String id;
    private String productoname;
    private String descripcion;
    private Double unitPrice;
}
