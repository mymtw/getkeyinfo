package p749ir;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.collections.C19294b0;
import okhttp3.C20009t;
import p737cr.C18985d;
import p743fr.C19026c;

/* renamed from: ir.c */
public final class C19265c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet<Logger> f43129a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    public static final Map<String, String> f43130b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = C20009t.class.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C20009t.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(C19026c.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C18985d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f43130b = C19294b0.m32568y0(linkedHashMap);
    }
}
