package com.quaint.spring.beans.primary;

import org.springframework.stereotype.Component;

/**
 * <p>
 * desc:
 * </p>
 *
 * @author quaint
 * @since 23 June 2020
 */
@Component
public class NormalBean implements PrimaryTest{

    @Override
    public void sayHello(){
        System.out.println("NormalBean say hello");
    }

}
