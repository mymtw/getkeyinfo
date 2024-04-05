package com.google.gson.internal;

import com.google.gson.C16701b;
import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p650pn.C18418b;
import p650pn.C18419c;
import p675sn.C18541a;

public final class Excluder implements C16808u, Cloneable {

    /* renamed from: g */
    public static final Excluder f36940g = new Excluder();

    /* renamed from: b */
    public double f36941b = -1.0d;

    /* renamed from: c */
    public int f36942c = 136;

    /* renamed from: d */
    public boolean f36943d = true;

    /* renamed from: e */
    public List<C16701b> f36944e = Collections.emptyList();

    /* renamed from: f */
    public List<C16701b> f36945f = Collections.emptyList();

    /* renamed from: com.google.gson.internal.Excluder$a */
    public class C16710a extends C16807t<T> {

        /* renamed from: a */
        public C16807t<T> f36946a;

        /* renamed from: b */
        public final /* synthetic */ boolean f36947b;

        /* renamed from: c */
        public final /* synthetic */ boolean f36948c;

        /* renamed from: d */
        public final /* synthetic */ C16708i f36949d;

        /* renamed from: e */
        public final /* synthetic */ C18541a f36950e;

        public C16710a(boolean z, boolean z2, C16708i iVar, C18541a aVar) {
            this.f36947b = z;
            this.f36948c = z2;
            this.f36949d = iVar;
            this.f36950e = aVar;
        }

        /* renamed from: a */
        public final T mo59449a(JsonReader jsonReader) throws IOException {
            if (this.f36947b) {
                jsonReader.skipValue();
                return null;
            }
            C16807t<T> tVar = this.f36946a;
            if (tVar == null) {
                tVar = this.f36949d.mo59461h(Excluder.this, this.f36950e);
                this.f36946a = tVar;
            }
            return tVar.mo59449a(jsonReader);
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, T t) throws IOException {
            if (this.f36948c) {
                jsonWriter.nullValue();
                return;
            }
            C16807t<T> tVar = this.f36946a;
            if (tVar == null) {
                tVar = this.f36949d.mo59461h(Excluder.this, this.f36950e);
                this.f36946a = tVar;
            }
            tVar.mo59450b(jsonWriter, t);
        }
    }

    /* renamed from: a */
    public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean b = mo59483b(rawType);
        boolean z = b || mo59484c(rawType, true);
        boolean z2 = b || mo59484c(rawType, false);
        if (z || z2) {
            return new C16710a(z2, z, iVar, aVar);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59483b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            double r0 = r4.f36941b
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0020
            java.lang.Class<pn.b> r0 = p650pn.C18418b.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            pn.b r0 = (p650pn.C18418b) r0
            java.lang.Class<pn.c> r2 = p650pn.C18419c.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)
            pn.c r2 = (p650pn.C18419c) r2
            boolean r0 = r4.mo59486d(r0, r2)
            if (r0 != 0) goto L_0x0020
            return r1
        L_0x0020:
            boolean r0 = r4.f36943d
            r2 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r5.isMemberClass()
            if (r0 == 0) goto L_0x003a
            int r0 = r5.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0035
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 != 0) goto L_0x003a
            r0 = r1
            goto L_0x003b
        L_0x003a:
            r0 = r2
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            return r1
        L_0x003e:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 != 0) goto L_0x0054
            boolean r0 = r5.isAnonymousClass()
            if (r0 != 0) goto L_0x0052
            boolean r5 = r5.isLocalClass()
            if (r5 == 0) goto L_0x0054
        L_0x0052:
            r5 = r1
            goto L_0x0055
        L_0x0054:
            r5 = r2
        L_0x0055:
            if (r5 == 0) goto L_0x0058
            return r1
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.mo59483b(java.lang.Class):boolean");
    }

    /* renamed from: c */
    public final boolean mo59484c(Class<?> cls, boolean z) {
        for (C16701b a : z ? this.f36944e : this.f36945f) {
            if (a.mo59454a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final boolean mo59486d(C18418b bVar, C18419c cVar) {
        if (!(bVar == null || bVar.value() <= this.f36941b)) {
            return false;
        }
        return cVar == null || (cVar.value() > this.f36941b ? 1 : (cVar.value() == this.f36941b ? 0 : -1)) > 0;
    }
}
