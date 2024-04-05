package p027b8;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p305z7.C8458a;
import p305z7.C8459b;
import p305z7.C8460c;
import p305z7.C8461d;
import p305z7.C8462e;
import p305z7.C8465g;

/* renamed from: b8.d */
public final class C3485d {

    /* renamed from: c */
    public static final C3493h f8106c = new C3493h();

    /* renamed from: d */
    public static final C3486a f8107d = new C3486a();

    /* renamed from: e */
    public static final C3487b f8108e = new C3487b();

    /* renamed from: f */
    public static final C3488c f8109f = new C3488c();

    /* renamed from: g */
    public static final C3489d f8110g = new C3489d();

    /* renamed from: h */
    public static final C3490e f8111h = new C3490e();

    /* renamed from: i */
    public static final C3491f f8112i = new C3491f();

    /* renamed from: j */
    public static final C3483b f8113j = new C3483b();

    /* renamed from: k */
    public static final C3482a f8114k = new C3482a();

    /* renamed from: l */
    public static final C3492g f8115l = new C3492g();

    /* renamed from: a */
    public ConcurrentHashMap<Class<?>, C3504n<?>> f8116a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public LinkedList<C3494i> f8117b = new LinkedList<>();

    /* renamed from: b8.d$a */
    public class C3486a implements C3504n<C8461d> {
        /* renamed from: a */
        public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
            ((C8461d) obj).writeJSONString(appendable, eVar);
        }
    }

    /* renamed from: b8.d$b */
    public class C3487b implements C3504n<C8459b> {
        /* renamed from: a */
        public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
            appendable.append(((C8459b) obj).toJSONString(eVar));
        }
    }

    /* renamed from: b8.d$c */
    public class C3488c implements C3504n<C8458a> {
        /* renamed from: a */
        public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
            appendable.append(((C8458a) obj).toJSONString());
        }
    }

    /* renamed from: b8.d$d */
    public class C3489d implements C3504n<Iterable<? extends Object>> {
        /* renamed from: a */
        public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
            eVar.getClass();
            appendable.append('[');
            boolean z = true;
            for (Object next : (Iterable) obj) {
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
    }

    /* renamed from: b8.d$e */
    public class C3490e implements C3504n<Enum<?>> {
        /* renamed from: a */
        public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
            eVar.mo21034b(appendable, ((Enum) obj).name());
        }
    }

    /* renamed from: b8.d$f */
    public class C3491f implements C3504n<Map<String, ? extends Object>> {
        /* renamed from: a */
        public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
            eVar.getClass();
            appendable.append('{');
            boolean z = true;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (value != null || !eVar.f18483a) {
                    if (z) {
                        z = false;
                    } else {
                        appendable.append(',');
                    }
                    C3485d.m8307b(entry.getKey().toString(), value, appendable, eVar);
                }
            }
            appendable.append('}');
        }
    }

    /* renamed from: b8.d$g */
    public class C3492g implements C3504n<Object> {
        /* renamed from: a */
        public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
            appendable.append(obj.toString());
        }
    }

    /* renamed from: b8.d$h */
    public class C3493h implements C3504n<C8461d> {
        /* renamed from: a */
        public final void mo12997a(Object obj, Appendable appendable, C8462e eVar) {
            ((C8461d) obj).writeJSONString(appendable);
        }
    }

    /* renamed from: b8.d$i */
    public static class C3494i {

        /* renamed from: a */
        public Class<?> f8118a;

        /* renamed from: b */
        public C3504n<?> f8119b;

        public C3494i(Class<?> cls, C3504n<?> nVar) {
            this.f8118a = cls;
            this.f8119b = nVar;
        }
    }

    public C3485d() {
        mo12998a(new C3495e(), String.class);
        mo12998a(new C3496f(), Double.class);
        mo12998a(new C3497g(), Date.class);
        mo12998a(new C3498h(), Float.class);
        C3492g gVar = f8115l;
        mo12998a(gVar, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        mo12998a(gVar, Boolean.class);
        mo12998a(new C3499i(), int[].class);
        mo12998a(new C3500j(), short[].class);
        mo12998a(new C3501k(), long[].class);
        mo12998a(new C3502l(), float[].class);
        mo12998a(new C3503m(), double[].class);
        mo12998a(new C3484c(), boolean[].class);
        mo12999c(C8461d.class, f8107d);
        mo12999c(C8460c.class, f8106c);
        mo12999c(C8459b.class, f8108e);
        mo12999c(C8458a.class, f8109f);
        mo12999c(Map.class, f8112i);
        mo12999c(Iterable.class, f8110g);
        mo12999c(Enum.class, f8111h);
        mo12999c(Number.class, gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8307b(java.lang.String r2, java.lang.Object r3, java.lang.Appendable r4, p305z7.C8462e r5) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "null"
            goto L_0x000d
        L_0x0005:
            z7.h$f r0 = r5.f18484b
            boolean r0 = r0.mo21036a(r2)
            if (r0 != 0) goto L_0x0011
        L_0x000d:
            r4.append(r2)
            goto L_0x0020
        L_0x0011:
            r0 = 34
            r4.append(r0)
            z7.e r1 = p305z7.C8465g.f18488a
            z7.h$g r1 = r5.f18486d
            r1.mo21035a(r4, r2)
            r4.append(r0)
        L_0x0020:
            r5.getClass()
            r2 = 58
            r4.append(r2)
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x0032
            java.lang.String r3 = (java.lang.String) r3
            r5.mo21034b(r4, r3)
            goto L_0x0035
        L_0x0032:
            p305z7.C8465g.m16900a(r3, r4, r5)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027b8.C3485d.m8307b(java.lang.String, java.lang.Object, java.lang.Appendable, z7.e):void");
    }

    /* renamed from: a */
    public final <T> void mo12998a(C3504n<T> nVar, Class<?>... clsArr) {
        for (Class<?> put : clsArr) {
            this.f8116a.put(put, nVar);
        }
    }

    /* renamed from: c */
    public final void mo12999c(Class<?> cls, C3504n<?> nVar) {
        this.f8117b.addLast(new C3494i(cls, nVar));
    }
}
