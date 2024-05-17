package com.bharath.springdata.idgenerators.entity;

import com.bharath.springdata.idgenerators.CustomRandomIdGenerator;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

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
//    @TableGenerator(name = "employee_gen", table = "id_gen",
//            pkColumnName = "gen_name", valueColumnName = "gen_val",
//            allocationSize = 100)
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
    @GenericGenerator(name = "emp_id", type = CustomRandomIdGenerator.class)
    @GeneratedValue(generator = "emp_id")
    private Long id;
    @NotNull
    private String name;
}
