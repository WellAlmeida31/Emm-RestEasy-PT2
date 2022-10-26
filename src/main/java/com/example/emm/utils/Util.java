package com.example.emm.utils;

import com.example.emm.domain.dto.ConnectionDto;
import com.google.gson.Gson;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class Util {
    public ConnectionDto toObject(String json){
        return new Gson().fromJson(json, ConnectionDto.class);
    }

    public static <T> List<T> stringToArray(String s, Class<T[]> clazz) {
        T[] arr = new Gson().fromJson(s, clazz);
        return Arrays.asList(arr);
    }
}
