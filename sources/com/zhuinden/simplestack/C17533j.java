package com.zhuinden.simplestack;

import android.os.Parcelable;
import android.util.SparseArray;
import com.zhuinden.statebundle.StateBundle;

/* renamed from: com.zhuinden.simplestack.j */
public final class C17533j {

    /* renamed from: a */
    public Object f38350a;

    /* renamed from: b */
    public SparseArray<Parcelable> f38351b;

    /* renamed from: c */
    public StateBundle f38352c;

    /* renamed from: d */
    public StateBundle f38353d;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C17533j)) {
            return ((C17533j) obj).f38350a.equals(this.f38350a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38350a.hashCode();
    }
}
