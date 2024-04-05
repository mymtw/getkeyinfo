package com.google.common.cache;

import android.support.p013v4.media.session.C0087d;
import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import com.google.common.base.C15804s;
import com.google.common.base.C15806u;
import com.google.common.base.Equivalence;
import com.google.common.base.Suppliers;
import com.google.common.cache.LocalCache;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import p001a0.C0005b;

public final class CacheBuilder<K, V> {

    /* renamed from: q */
    public static final C15804s<? extends C15870b> f35591q = Suppliers.m25591a(new C15808a());

    /* renamed from: r */
    public static final C15872d f35592r = new C15872d(0, 0, 0, 0, 0, 0);

    /* renamed from: s */
    public static final C15809b f35593s = new C15809b();

    /* renamed from: t */
    public static final Logger f35594t = Logger.getLogger(CacheBuilder.class.getName());

    /* renamed from: a */
    public boolean f35595a = true;

    /* renamed from: b */
    public int f35596b = -1;

    /* renamed from: c */
    public int f35597c = -1;

    /* renamed from: d */
    public long f35598d = -1;

    /* renamed from: e */
    public long f35599e = -1;
    @MonotonicNonNullDecl

    /* renamed from: f */
    public C15878j<? super K, ? super V> f35600f;
    @MonotonicNonNullDecl

    /* renamed from: g */
    public LocalCache.Strength f35601g;
    @MonotonicNonNullDecl

    /* renamed from: h */
    public LocalCache.Strength f35602h;

    /* renamed from: i */
    public long f35603i = -1;

    /* renamed from: j */
    public long f35604j = -1;

    /* renamed from: k */
    public long f35605k = -1;
    @MonotonicNonNullDecl

    /* renamed from: l */
    public Equivalence<Object> f35606l;
    @MonotonicNonNullDecl

    /* renamed from: m */
    public Equivalence<Object> f35607m;
    @MonotonicNonNullDecl

    /* renamed from: n */
    public C15877i<? super K, ? super V> f35608n;
    @MonotonicNonNullDecl

    /* renamed from: o */
    public C15806u f35609o;

    /* renamed from: p */
    public C15804s<? extends C15870b> f35610p = f35591q;

    public enum NullListener implements C15877i<Object, Object> {
        INSTANCE;

        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    public enum OneWeigher implements C15878j<Object, Object> {
        INSTANCE;

        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$a */
    public static class C15808a implements C15870b {
        /* renamed from: a */
        public final void mo55792a(int i) {
        }

        /* renamed from: b */
        public final void mo55793b(int i) {
        }

        /* renamed from: c */
        public final void mo55794c() {
        }

        /* renamed from: d */
        public final void mo55795d(long j) {
        }

        /* renamed from: e */
        public final void mo55796e(long j) {
        }

        /* renamed from: f */
        public final C15872d mo55797f() {
            return CacheBuilder.f35592r;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$b */
    public static class C15809b extends C15806u {
        /* renamed from: a */
        public final long mo55787a() {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo55788a() {
        boolean z = true;
        if (this.f35600f == null) {
            if (this.f35599e != -1) {
                z = false;
            }
            C15794l.m25624r(z, "maximumWeight requires weigher");
        } else if (this.f35595a) {
            if (this.f35599e == -1) {
                z = false;
            }
            C15794l.m25624r(z, "weigher requires maximumWeight");
        } else if (this.f35599e == -1) {
            f35594t.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final String toString() {
        C15788i.C15789a b = C15788i.m25603b(this);
        int i = this.f35596b;
        if (i != -1) {
            b.mo55782b(String.valueOf(i), "initialCapacity");
        }
        int i2 = this.f35597c;
        if (i2 != -1) {
            b.mo55782b(String.valueOf(i2), "concurrencyLevel");
        }
        long j = this.f35598d;
        if (j != -1) {
            b.mo55781a(j, "maximumSize");
        }
        long j2 = this.f35599e;
        if (j2 != -1) {
            b.mo55781a(j2, "maximumWeight");
        }
        if (this.f35603i != -1) {
            b.mo55782b(C0087d.m236f(new StringBuilder(), this.f35603i, "ns"), "expireAfterWrite");
        }
        if (this.f35604j != -1) {
            b.mo55782b(C0087d.m236f(new StringBuilder(), this.f35604j, "ns"), "expireAfterAccess");
        }
        LocalCache.Strength strength = this.f35601g;
        if (strength != null) {
            b.mo55782b(C0005b.m56q0(strength.toString()), "keyStrength");
        }
        LocalCache.Strength strength2 = this.f35602h;
        if (strength2 != null) {
            b.mo55782b(C0005b.m56q0(strength2.toString()), "valueStrength");
        }
        if (this.f35606l != null) {
            C15788i.C15789a.C15790a aVar = new C15788i.C15789a.C15790a();
            b.f35570c.f35573c = aVar;
            b.f35570c = aVar;
            aVar.f35572b = "keyEquivalence";
        }
        if (this.f35607m != null) {
            C15788i.C15789a.C15790a aVar2 = new C15788i.C15789a.C15790a();
            b.f35570c.f35573c = aVar2;
            b.f35570c = aVar2;
            aVar2.f35572b = "valueEquivalence";
        }
        if (this.f35608n != null) {
            C15788i.C15789a.C15790a aVar3 = new C15788i.C15789a.C15790a();
            b.f35570c.f35573c = aVar3;
            b.f35570c = aVar3;
            aVar3.f35572b = "removalListener";
        }
        return b.toString();
    }
}
