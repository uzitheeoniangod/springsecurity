package com.example.springsecuritytest.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("menu")
public class Menu {
   private Long id;
   private String name;
   private String url;
   private Long parentId;
   private String permission;

}
