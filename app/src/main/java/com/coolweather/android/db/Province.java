package com.coolweather.android.db;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;
import org.litepal.exceptions.DataSupportException;

public class Province extends LitePalSupport {
    @Column(unique = false,defaultValue = "unknown")
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
