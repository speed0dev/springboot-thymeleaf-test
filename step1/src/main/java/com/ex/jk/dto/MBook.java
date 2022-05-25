package com.ex.jk.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class MBook {
    String name;
    String title;
    String publisAt;
    int value;

    //@Builder
    public MBook(String name, String title, String at, int v){
        this.name = name;
        this.title = title;
        this.publisAt = at;
        this.value = v;
    }

}
