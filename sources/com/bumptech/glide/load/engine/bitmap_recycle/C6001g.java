package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.C6010l;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.g */
public final class C6001g<K extends C6010l, V> {

    /* renamed from: a */
    public final C6002a<K, V> f12848a = new C6002a<>();

    /* renamed from: b */
    public final HashMap f12849b = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.g$a */
    public static class C6002a<K, V> {

        /* renamed from: a */
        public final K f12850a;

        /* renamed from: b */
        public ArrayList f12851b;

        /* renamed from: c */
        public C6002a<K, V> f12852c;

        /* renamed from: d */
        public C6002a<K, V> f12853d;

        public C6002a() {
            this((Object) null);
        }

        public C6002a(K k) {
            this.f12853d = this;
            this.f12852c = this;
            this.f12850a = k;
        }
    }

    /* renamed from: a */
    public final V mo16927a(K k) {
        C6002a<K, V> aVar = (C6002a) this.f12849b.get(k);
        if (aVar == null) {
            aVar = new C6002a<>(k);
            this.f12849b.put(k, aVar);
        } else {
            k.mo16936a();
        }
        C6002a<K, V> aVar2 = aVar.f12853d;
        aVar2.f12852c = aVar.f12852c;
        aVar.f12852c.f12853d = aVar2;
        C6002a<K, V> aVar3 = this.f12848a;
        aVar.f12853d = aVar3;
        C6002a<K, V> aVar4 = aVar3.f12852c;
        aVar.f12852c = aVar4;
        aVar4.f12853d = aVar;
        aVar.f12853d.f12852c = aVar;
        ArrayList arrayList = aVar.f12851b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return aVar.f12851b.remove(size - 1);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo16928b(K k, V v) {
        C6002a<K, V> aVar = (C6002a) this.f12849b.get(k);
        if (aVar == null) {
            aVar = new C6002a<>(k);
            C6002a<K, V> aVar2 = aVar.f12853d;
            aVar2.f12852c = aVar.f12852c;
            aVar.f12852c.f12853d = aVar2;
            C6002a<K, V> aVar3 = this.f12848a;
            aVar.f12853d = aVar3.f12853d;
            aVar.f12852c = aVar3;
            aVar3.f12853d = aVar;
            aVar.f12853d.f12852c = aVar;
            this.f12849b.put(k, aVar);
        } else {
            k.mo16936a();
        }
        if (aVar.f12851b == null) {
            aVar.f12851b = new ArrayList();
        }
        aVar.f12851b.add(v);
    }

    /* renamed from: c */
    public final V mo16929c() {
        C6002a<K, V> aVar = this.f12848a.f12853d;
        while (true) {
            V v = null;
            if (aVar.equals(this.f12848a)) {
                return null;
            }
            ArrayList arrayList = aVar.f12851b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v = aVar.f12851b.remove(size - 1);
            }
            if (v != null) {
                return v;
            }
            C6002a<K, V> aVar2 = aVar.f12853d;
            aVar2.f12852c = aVar.f12852c;
            aVar.f12852c.f12853d = aVar2;
            this.f12849b.remove(aVar.f12850a);
            ((C6010l) aVar.f12850a).mo16936a();
            aVar = aVar.f12853d;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C6002a<K, V> aVar = this.f12848a.f12852c; !aVar.equals(this.f12848a); aVar = aVar.f12852c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f12850a);
            sb.append(':');
            ArrayList arrayList = aVar.f12851b;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
