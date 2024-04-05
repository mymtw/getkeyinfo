package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.json.JsonMapper;

/* renamed from: com.fasterxml.jackson.databind.node.a */
public final class C12565a {

    /* renamed from: a */
    public static final JsonMapper f27725a;

    /* renamed from: b */
    public static final ObjectWriter f27726b;

    /* renamed from: c */
    public static final ObjectWriter f27727c;

    /* renamed from: d */
    public static final ObjectReader f27728d;

    static {
        JsonMapper jsonMapper = new JsonMapper();
        f27725a = jsonMapper;
        f27726b = jsonMapper.writer();
        f27727c = jsonMapper.writer().withDefaultPrettyPrinter();
        f27728d = jsonMapper.readerFor((Class<?>) JsonNode.class);
    }
}
