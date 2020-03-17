package com.samsung.myspring.sample;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class Restaurant {

    @Autowired
    @Setter
    private Chef chef;

}
