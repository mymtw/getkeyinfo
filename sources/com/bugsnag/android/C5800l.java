package com.bugsnag.android;

import androidx.appcompat.widget.C0326j;
import com.bugsnag.android.internal.C5760a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.l */
public final class C5800l {

    /* renamed from: a */
    public final C5801a f12408a = new C5801a();

    /* renamed from: b */
    public final C5816o1 f12409b;

    /* renamed from: com.bugsnag.android.l$a */
    public static final class C5801a extends ThreadLocal<DateFormat> {
        public final Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    public C5800l(C5816o1 o1Var) {
        C19383o.m32798h(o1Var, "logger");
        this.f12409b = o1Var;
    }

    /* renamed from: a */
    public static C5776j2 m11577a(List list) {
        C19383o.m32798h(list, "trace");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            C19383o.m32798h(map, "frame");
            LinkedHashMap A0 = C19294b0.m32558A0(map);
            Object obj = map.get("lineNumber");
            Boolean bool = null;
            if (!(obj instanceof Number)) {
                obj = null;
            }
            Number number = (Number) obj;
            A0.put("lineNumber", number != null ? Long.valueOf(number.longValue()) : null);
            Object obj2 = map.get("frameAddress");
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str = (String) obj2;
            if (str != null) {
                A0.put("frameAddress", Long.decode(str));
            }
            Object obj3 = map.get("symbolAddress");
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            String str2 = (String) obj3;
            if (str2 != null) {
                A0.put("symbolAddress", Long.decode(str2));
            }
            Object obj4 = map.get("loadAddress");
            if (!(obj4 instanceof String)) {
                obj4 = null;
            }
            String str3 = (String) obj4;
            if (str3 != null) {
                A0.put("loadAddress", Long.decode(str3));
            }
            Object obj5 = map.get("isPC");
            if (obj5 instanceof Boolean) {
                bool = obj5;
            }
            Boolean bool2 = bool;
            if (bool2 != null) {
                A0.put("isPC", Boolean.valueOf(bool2.booleanValue()));
            }
            arrayList.add(new C5759i2(A0));
        }
        return new C5776j2(arrayList);
    }

    /* renamed from: b */
    public final Date mo16566b(String str) {
        try {
            return C5760a.m11556a(str);
        } catch (IllegalArgumentException unused) {
            Object obj = this.f12408a.get();
            if (obj != null) {
                Date parse = ((DateFormat) obj).parse(str);
                if (parse != null) {
                    return parse;
                }
                throw new IllegalArgumentException(C0326j.m864i("cannot parse date ", str));
            }
            C19383o.m32803m();
            throw null;
        }
    }
}
