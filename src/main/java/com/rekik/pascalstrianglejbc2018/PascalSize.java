package com.rekik.pascalstrianglejbc2018;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PascalSize {

    @NotNull
    @Min(value = 1)
    private int size;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size=size;
    }
}
