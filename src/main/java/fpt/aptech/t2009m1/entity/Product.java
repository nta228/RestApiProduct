package fpt.aptech.t2009m1.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString

public class Product {
    private int id;
    private String name; // dieu hoa nhiet do 2022
    private String slug; // dieu hoa nhiet do 2022 -> http://localhost.com/products/detail/dieu-hoa-nhiet-do-2022
    private String thumbnail;
    private String description;
    private int status;
}
