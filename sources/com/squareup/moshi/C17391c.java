package com.squareup.moshi;

import com.squareup.moshi.C17384a;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: com.squareup.moshi.c */
public final class C17391c extends C17384a.C17386b {

    /* renamed from: h */
    public JsonAdapter<Object> f37953h;

    /* renamed from: i */
    public final /* synthetic */ Type[] f37954i;

    /* renamed from: j */
    public final /* synthetic */ Type f37955j;

    /* renamed from: k */
    public final /* synthetic */ Set f37956k;

    /* renamed from: l */
    public final /* synthetic */ Set f37957l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17391c(Type type, Set set, Object obj, Method method, int i, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i, 1, z);
        this.f37954i = typeArr;
        this.f37955j = type2;
        this.f37956k = set2;
        this.f37957l = set3;
    }

    /* renamed from: a */
    public final void mo68481a(C17414y yVar, JsonAdapter.C17360e eVar) {
        super.mo68481a(yVar, eVar);
        this.f37953h = (!C17387a0.m29124b(this.f37954i[0], this.f37955j) || !this.f37956k.equals(this.f37957l)) ? yVar.mo68558c(this.f37955j, this.f37957l, (String) null) : yVar.mo68559d(eVar, this.f37955j, this.f37957l);
    }

    /* renamed from: d */
    public final void mo68484d(C17412w wVar, Object obj) throws IOException, InvocationTargetException {
        this.f37953h.toJson(wVar, mo68483c(obj));
    }
}
