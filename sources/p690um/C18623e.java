package p690um;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p674sm.C18537d;
import p674sm.C18539f;
import p674sm.C18540g;
import p682tm.C18560a;

/* renamed from: um.e */
public final class C18623e implements C18560a<C18623e> {

    /* renamed from: e */
    public static final C18619a f41113e = new C18619a();

    /* renamed from: f */
    public static final C18620b f41114f = new C18620b();

    /* renamed from: g */
    public static final C18621c f41115g = new C18621c();

    /* renamed from: h */
    public static final C18624a f41116h = new C18624a();

    /* renamed from: a */
    public final HashMap f41117a;

    /* renamed from: b */
    public final HashMap f41118b;

    /* renamed from: c */
    public C18619a f41119c = f41113e;

    /* renamed from: d */
    public boolean f41120d = false;

    /* renamed from: um.e$a */
    public static final class C18624a implements C18539f<Date> {

        /* renamed from: a */
        public static final SimpleDateFormat f41121a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f41121a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        /* renamed from: a */
        public final void mo18639a(Object obj, Object obj2) throws IOException {
            ((C18540g) obj2).mo70052b(f41121a.format((Date) obj));
        }
    }

    public C18623e() {
        HashMap hashMap = new HashMap();
        this.f41117a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f41118b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f41114f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, f41115g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f41116h);
        hashMap.remove(cls3);
    }

    /* renamed from: a */
    public final C18560a mo70131a(Class cls, C18537d dVar) {
        this.f41117a.put(cls, dVar);
        this.f41118b.remove(cls);
        return this;
    }
}
