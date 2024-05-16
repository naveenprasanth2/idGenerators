package com.bharath.springdata.idgenerators.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @TableGenerator(name = "employee_gen", table = "id_gen",
            pkColumnName = "gen_name", valueColumnName = "gen_val",
            allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @NotNull
    private String name;
}
