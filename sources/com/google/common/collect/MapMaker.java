package com.google.common.collect;

import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import p001a0.C0005b;

public final class MapMaker {

    /* renamed from: a */
    public boolean f36039a;

    /* renamed from: b */
    public int f36040b = -1;

    /* renamed from: c */
    public int f36041c = -1;
    @MonotonicNonNullDecl

    /* renamed from: d */
    public MapMakerInternalMap.Strength f36042d;
    @MonotonicNonNullDecl

    /* renamed from: e */
    public MapMakerInternalMap.Strength f36043e;
    @MonotonicNonNullDecl

    /* renamed from: f */
    public Equivalence<Object> f36044f;

    public enum Dummy {
        VALUE
    }

    /* renamed from: a */
    public final MapMakerInternalMap.Strength mo56932a() {
        return (MapMakerInternalMap.Strength) C15788i.m25602a(this.f36042d, MapMakerInternalMap.Strength.STRONG);
    }

    /* renamed from: b */
    public final MapMakerInternalMap.Strength mo56933b() {
        return (MapMakerInternalMap.Strength) C15788i.m25602a(this.f36043e, MapMakerInternalMap.Strength.STRONG);
    }

    /* renamed from: c */
    public final <K, V> ConcurrentMap<K, V> mo56934c() {
        if (this.f36039a) {
            return MapMakerInternalMap.create(this);
        }
        int i = this.f36040b;
        if (i == -1) {
            i = 16;
        }
        int i2 = this.f36041c;
        if (i2 == -1) {
            i2 = 4;
        }
        return new ConcurrentHashMap(i, 0.75f, i2);
    }

    /* renamed from: d */
    public final void mo56935d(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f36042d;
        C15794l.m25622p(strength2, "Key strength was already set to %s", strength2 == null);
        strength.getClass();
        this.f36042d = strength;
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f36039a = true;
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: e */
    public final void mo56936e() {
        mo56935d(MapMakerInternalMap.Strength.WEAK);
    }

    public final String toString() {
        C15788i.C15789a b = C15788i.m25603b(this);
        int i = this.f36040b;
        if (i != -1) {
            b.mo55782b(String.valueOf(i), "initialCapacity");
        }
        int i2 = this.f36041c;
        if (i2 != -1) {
            b.mo55782b(String.valueOf(i2), "concurrencyLevel");
        }
        MapMakerInternalMap.Strength strength = this.f36042d;
        if (strength != null) {
            b.mo55782b(C0005b.m56q0(strength.toString()), "keyStrength");
        }
        MapMakerInternalMap.Strength strength2 = this.f36043e;
        if (strength2 != null) {
            b.mo55782b(C0005b.m56q0(strength2.toString()), "valueStrength");
        }
        if (this.f36044f != null) {
            C15788i.C15789a.C15790a aVar = new C15788i.C15789a.C15790a();
            b.f35570c.f35573c = aVar;
            b.f35570c = aVar;
            aVar.f35572b = "keyEquivalence";
        }
        return b.toString();
    }
}
