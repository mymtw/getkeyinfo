package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.bugsnag.android.ErrorType;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.i2 */
public final class C5759i2 implements C5748g1.C5749a {

    /* renamed from: b */
    public String f12297b;

    /* renamed from: c */
    public String f12298c;

    /* renamed from: d */
    public Number f12299d;

    /* renamed from: e */
    public Boolean f12300e;

    /* renamed from: f */
    public Map<String, String> f12301f;

    /* renamed from: g */
    public Number f12302g;

    /* renamed from: h */
    public Long f12303h;

    /* renamed from: i */
    public Long f12304i;

    /* renamed from: j */
    public Long f12305j;

    /* renamed from: k */
    public Boolean f12306k;

    /* renamed from: l */
    public ErrorType f12307l;

    public C5759i2() {
        throw null;
    }

    public C5759i2(String str, String str2, Number number, Boolean bool, int i) {
        this.f12297b = str;
        this.f12298c = str2;
        this.f12299d = number;
        this.f12300e = bool;
        this.f12301f = null;
        this.f12302g = null;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        g1Var.mo16514B(ResponseConstants.METHOD);
        g1Var.mo16530k(this.f12297b);
        g1Var.mo16514B(ResponseConstants.FILE);
        g1Var.mo16530k(this.f12298c);
        g1Var.mo16514B("lineNumber");
        g1Var.mo16533t(this.f12299d);
        Boolean bool = this.f12300e;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            g1Var.mo16514B("inProject");
            g1Var.mo16534u(booleanValue);
        }
        g1Var.mo16514B("columnNumber");
        g1Var.mo16533t(this.f12302g);
        Long l = this.f12303h;
        if (l != null) {
            long longValue = l.longValue();
            g1Var.mo16514B("frameAddress");
            g1Var.mo16531n(longValue);
        }
        Long l2 = this.f12304i;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            g1Var.mo16514B("symbolAddress");
            g1Var.mo16531n(longValue2);
        }
        Long l3 = this.f12305j;
        if (l3 != null) {
            long longValue3 = l3.longValue();
            g1Var.mo16514B("loadAddress");
            g1Var.mo16531n(longValue3);
        }
        Boolean bool2 = this.f12306k;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            g1Var.mo16514B("isPC");
            g1Var.mo16534u(booleanValue2);
        }
        ErrorType errorType = this.f12307l;
        if (errorType != null) {
            g1Var.mo16514B("type");
            g1Var.mo16530k(errorType.getDesc$bugsnag_android_core_release());
        }
        Map<String, String> map = this.f12301f;
        if (map != null) {
            g1Var.mo16514B(ResponseConstants.CODE);
            for (Map.Entry next : map.entrySet()) {
                g1Var.mo16522d();
                g1Var.mo16514B((String) next.getKey());
                g1Var.mo16530k((String) next.getValue());
                g1Var.mo16526g();
            }
        }
        g1Var.mo16526g();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5759i2(NativeStackframe nativeStackframe) {
        this(nativeStackframe.getMethod(), nativeStackframe.getFile(), nativeStackframe.getLineNumber(), (Boolean) null, 32);
        C19383o.m32798h(nativeStackframe, "nativeFrame");
        this.f12303h = nativeStackframe.getFrameAddress();
        this.f12304i = nativeStackframe.getSymbolAddress();
        this.f12305j = nativeStackframe.getLoadAddress();
        this.f12306k = nativeStackframe.isPC();
        this.f12307l = nativeStackframe.getType();
    }

    public C5759i2(LinkedHashMap linkedHashMap) {
        Object obj = linkedHashMap.get(ResponseConstants.METHOD);
        ErrorType errorType = null;
        this.f12297b = (String) (!(obj instanceof String) ? null : obj);
        Object obj2 = linkedHashMap.get(ResponseConstants.FILE);
        this.f12298c = (String) (!(obj2 instanceof String) ? null : obj2);
        Object obj3 = linkedHashMap.get("lineNumber");
        this.f12299d = (Number) (!(obj3 instanceof Number) ? null : obj3);
        Object obj4 = linkedHashMap.get("inProject");
        this.f12300e = (Boolean) (!(obj4 instanceof Boolean) ? null : obj4);
        Object obj5 = linkedHashMap.get("columnNumber");
        this.f12302g = (Number) (!(obj5 instanceof Number) ? null : obj5);
        Object obj6 = linkedHashMap.get("frameAddress");
        Number number = (Number) (!(obj6 instanceof Number) ? null : obj6);
        this.f12303h = number != null ? Long.valueOf(number.longValue()) : null;
        Object obj7 = linkedHashMap.get("symbolAddress");
        Number number2 = (Number) (!(obj7 instanceof Number) ? null : obj7);
        this.f12304i = number2 != null ? Long.valueOf(number2.longValue()) : null;
        Object obj8 = linkedHashMap.get("loadAddress");
        Number number3 = (Number) (!(obj8 instanceof Number) ? null : obj8);
        this.f12305j = number3 != null ? Long.valueOf(number3.longValue()) : null;
        Object obj9 = linkedHashMap.get("isPC");
        this.f12306k = (Boolean) (!(obj9 instanceof Boolean) ? null : obj9);
        Object obj10 = linkedHashMap.get(ResponseConstants.CODE);
        this.f12301f = (Map) (!(obj10 instanceof Map) ? null : obj10);
        Object obj11 = linkedHashMap.get("type");
        String str = (String) (!(obj11 instanceof String) ? null : obj11);
        if (str != null) {
            ErrorType.Companion.getClass();
            errorType = ErrorType.C5707a.m11494a(str);
        }
        this.f12307l = errorType;
    }
}
