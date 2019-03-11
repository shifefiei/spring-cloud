package com.sff.spring.cloud.api.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Accessors(chain = true)
public class Dept implements Serializable {

    private long deptId;
    private String deptName;

}
