package com.cardinalcommerce.dependencies.internal.minidev.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p305z7.C8459b;
import p305z7.C8461d;
import p305z7.C8462e;
import p305z7.C8465g;

public class JSONArray extends ArrayList<Object> implements C8459b, C8461d {
    private static final long serialVersionUID = 9106884089231309568L;

    public static String toJSONString(List<? extends Object> list) {
        return toJSONString(list, C8465g.f18488a);
    }

    public static String toJSONString(List<? extends Object> list, C8462e eVar) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSONString(list, sb, eVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void writeJSONString(Iterable<? extends Object> iterable, Appendable appendable, C8462e eVar) {
        if (iterable == null) {
            appendable.append("null");
            return;
        }
        eVar.getClass();
        appendable.append('[');
        boolean z = true;
        for (Object next : iterable) {
            if (z) {
                z = false;
            } else {
                appendable.append(',');
            }
            if (next == null) {
                appendable.append("null");
            } else {
                C8465g.m16900a(next, appendable, eVar);
            }
        }
        appendable.append(']');
    }

    public static void writeJSONString(List<? extends Object> list, Appendable appendable) {
        writeJSONString(list, appendable, C8465g.f18488a);
    }

    public JSONArray appendElement(Object obj) {
        add(obj);
        return this;
    }

    public void merge(Object obj) {
        JSONObject.m12446a(this, obj);
    }

    public String toJSONString() {
        return toJSONString(this, C8465g.f18488a);
    }

    public String toJSONString(C8462e eVar) {
        return toJSONString(this, eVar);
    }

    public String toString() {
        return toJSONString();
    }

    public String toString(C8462e eVar) {
        return toJSONString(eVar);
    }

    public void writeJSONString(Appendable appendable) {
        writeJSONString(this, appendable, C8465g.f18488a);
    }

    public void writeJSONString(Appendable appendable, C8462e eVar) {
        writeJSONString(this, appendable, eVar);
    }
}
