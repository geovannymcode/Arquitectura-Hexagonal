package com.geovannycode.arquitectura.hexagonal.adapters.out.dbs.rdbms.util;

import static java.util.Objects.isNull;

public class QueryUtil {

    public static String getLike(String query) {
        if(isNull(query)){
            query="";
        }
        return "%".concat(query).concat("%");
    }
}
