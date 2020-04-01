package com.soft1851.spring.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ke
 * @ClassName foucs
 * @Description TOOD
 * @Date 2020/3/25
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Foucs {
    private String title;
    private String nickName;
    private String imgUrl;
}
