package com.inci.onlineAcademy.core.utilities.results;

import lombok.Getter;

@Getter
public class DataResult<T> extends Result {

    private T data;

    public DataResult(T data, boolean success){
        super(success);
        this.data = data;
    }

    public DataResult(T data, boolean success, String message){
        super(success, message);
        this.data = data;
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof DataResult<?>)) return false;
        if(this.isSuccess() != ((DataResult<?>) object).isSuccess()) return false;
        if(this.getMessage() != ((DataResult<?>) object).getMessage()) return false;
        if(this.data.getClass() != ((DataResult<?>) object).getData().getClass()) return false;
        return true;
    }
}
