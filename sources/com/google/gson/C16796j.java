package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import p675sn.C18541a;

/* renamed from: com.google.gson.j */
public final class C16796j {

    /* renamed from: a */
    public Excluder f37112a = Excluder.f36940g;

    /* renamed from: b */
    public LongSerializationPolicy f37113b = LongSerializationPolicy.DEFAULT;

    /* renamed from: c */
    public FieldNamingPolicy f37114c = FieldNamingPolicy.IDENTITY;

    /* renamed from: d */
    public final HashMap f37115d = new HashMap();

    /* renamed from: e */
    public final ArrayList f37116e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f37117f = new ArrayList();

    /* renamed from: g */
    public int f37118g = 2;

    /* renamed from: h */
    public int f37119h = 2;

    /* renamed from: i */
    public boolean f37120i = true;

    /* renamed from: a */
    public final C16708i mo59627a() {
        ArrayList arrayList = new ArrayList(this.f37117f.size() + this.f37116e.size() + 3);
        arrayList.addAll(this.f37116e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f37117f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i = this.f37118g;
        int i2 = this.f37119h;
        if (!(i == 2 || i2 == 2)) {
            C16700a aVar = new C16700a(i, i2, Date.class);
            C16700a aVar2 = new C16700a(i, i2, Timestamp.class);
            C16700a aVar3 = new C16700a(i, i2, java.sql.Date.class);
            arrayList.add(TypeAdapters.m27761a(Date.class, aVar));
            arrayList.add(TypeAdapters.m27761a(Timestamp.class, aVar2));
            arrayList.add(TypeAdapters.m27761a(java.sql.Date.class, aVar3));
        }
        return new C16708i(this.f37112a, this.f37114c, this.f37115d, this.f37120i, this.f37113b, this.f37116e, this.f37117f, arrayList);
    }

    /* renamed from: b */
    public final void mo59628b(C16799m mVar, Class cls) {
        boolean z = mVar instanceof C16804r;
        if (mVar instanceof C16797k) {
            this.f37115d.put(cls, (C16797k) mVar);
        }
        this.f37116e.add(TreeTypeAdapter.m27757c(C18541a.get((Type) cls), mVar));
        if (mVar instanceof C16807t) {
            this.f37116e.add(TypeAdapters.m27763c(C18541a.get((Type) cls), (C16807t) mVar));
        }
    }
}
