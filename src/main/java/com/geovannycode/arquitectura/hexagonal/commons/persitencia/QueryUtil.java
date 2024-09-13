package com.geovannycode.arquitectura.hexagonal.commons.persitencia;

import static java.util.Objects.isNull;

public class QueryUtil {

    public static String getLike(String query) {
        if(isNull(query)){
            query="";
        }
        return "%".concat(query).concat("%");
    }
}
