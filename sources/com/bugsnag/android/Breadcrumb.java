package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.bugsnag.android.internal.C5760a;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public class Breadcrumb implements C5748g1.C5749a {
    public final C5772j impl;
    private final C5816o1 logger;

    public Breadcrumb(C5772j jVar, C5816o1 o1Var) {
        this.impl = jVar;
        this.logger = o1Var;
    }

    private void logNull(String str) {
        C5816o1 o1Var = this.logger;
        o1Var.mo16605e("Invalid null value supplied to breadcrumb." + str + ", ignoring");
    }

    public String getMessage() {
        return this.impl.f12345b;
    }

    public Map<String, Object> getMetadata() {
        return this.impl.f12347d;
    }

    public String getStringTimestamp() {
        return C5760a.m11557b(this.impl.f12348e);
    }

    public Date getTimestamp() {
        return this.impl.f12348e;
    }

    public BreadcrumbType getType() {
        return this.impl.f12346c;
    }

    public void setMessage(String str) {
        if (str != null) {
            this.impl.f12345b = str;
        } else {
            logNull("message");
        }
    }

    public void setMetadata(Map<String, Object> map) {
        this.impl.f12347d = map;
    }

    public void setType(BreadcrumbType breadcrumbType) {
        if (breadcrumbType != null) {
            this.impl.f12346c = breadcrumbType;
        } else {
            logNull("type");
        }
    }

    public void toStream(C5748g1 g1Var) throws IOException {
        this.impl.toStream(g1Var);
    }

    public Breadcrumb(String str, C5816o1 o1Var) {
        C19383o.m32798h(str, "message");
        this.impl = new C5772j(str, BreadcrumbType.MANUAL, new LinkedHashMap(), new Date());
        this.logger = o1Var;
    }

    public Breadcrumb(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date, C5816o1 o1Var) {
        this.impl = new C5772j(str, breadcrumbType, map, date);
        this.logger = o1Var;
    }
}
