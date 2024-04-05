package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NativeStackframe implements C5748g1.C5749a {
    private String file;
    private Long frameAddress;
    private Boolean isPC;
    private Number lineNumber;
    private Long loadAddress;
    private String method;
    private Long symbolAddress;
    private ErrorType type;

    public NativeStackframe(String str, String str2, Number number, Long l, Long l2, Long l3, Boolean bool, ErrorType errorType) {
        this.method = str;
        this.file = str2;
        this.lineNumber = number;
        this.frameAddress = l;
        this.symbolAddress = l2;
        this.loadAddress = l3;
        this.isPC = bool;
        this.type = errorType;
    }

    public final String getFile() {
        return this.file;
    }

    public final Long getFrameAddress() {
        return this.frameAddress;
    }

    public final Number getLineNumber() {
        return this.lineNumber;
    }

    public final Long getLoadAddress() {
        return this.loadAddress;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Long getSymbolAddress() {
        return this.symbolAddress;
    }

    public final ErrorType getType() {
        return this.type;
    }

    public final Boolean isPC() {
        return this.isPC;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setFrameAddress(Long l) {
        this.frameAddress = l;
    }

    public final void setLineNumber(Number number) {
        this.lineNumber = number;
    }

    public final void setLoadAddress(Long l) {
        this.loadAddress = l;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setPC(Boolean bool) {
        this.isPC = bool;
    }

    public final void setSymbolAddress(Long l) {
        this.symbolAddress = l;
    }

    public final void setType(ErrorType errorType) {
        this.type = errorType;
    }

    public void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        g1Var.mo16514B(ResponseConstants.METHOD);
        g1Var.mo16530k(this.method);
        g1Var.mo16514B(ResponseConstants.FILE);
        g1Var.mo16530k(this.file);
        g1Var.mo16514B("lineNumber");
        g1Var.mo16533t(this.lineNumber);
        g1Var.mo16514B("frameAddress");
        g1Var.mo16533t(this.frameAddress);
        g1Var.mo16514B("symbolAddress");
        g1Var.mo16533t(this.symbolAddress);
        g1Var.mo16514B("loadAddress");
        g1Var.mo16533t(this.loadAddress);
        g1Var.mo16514B("isPC");
        g1Var.mo16532r(this.isPC);
        ErrorType errorType = this.type;
        if (errorType != null) {
            g1Var.mo16514B("type");
            g1Var.mo16530k(errorType.getDesc$bugsnag_android_core_release());
        }
        g1Var.mo16526g();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NativeStackframe(String str, String str2, Number number, Long l, Long l2, Long l3, Boolean bool, ErrorType errorType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, number, l, l2, l3, bool, (i & 128) != 0 ? null : errorType);
    }
}
