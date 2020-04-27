/*
 * Copyright 2020, Yahoo Inc.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */

package com.yahoo.elide.spring.controllers;

import static com.yahoo.elide.core.EntityDictionary.NO_VERSION;
import java.util.Map;

public class Util {
    public static String getApiVersion(Map<String, String> requestHeaders) {
        return requestHeaders.getOrDefault("ApiVersion", NO_VERSION);
    }
}
