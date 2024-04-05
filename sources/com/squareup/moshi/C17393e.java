package com.squareup.moshi;

import com.squareup.moshi.C17384a;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: com.squareup.moshi.e */
public final class C17393e extends C17384a.C17386b {

    /* renamed from: h */
    public JsonAdapter<Object> f37958h;

    /* renamed from: i */
    public final /* synthetic */ Type[] f37959i;

    /* renamed from: j */
    public final /* synthetic */ Type f37960j;

    /* renamed from: k */
    public final /* synthetic */ Set f37961k;

    /* renamed from: l */
    public final /* synthetic */ Set f37962l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17393e(Type type, Set set, Object obj, Method method, int i, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i, 1, z);
        this.f37959i = typeArr;
        this.f37960j = type2;
        this.f37961k = set2;
        this.f37962l = set3;
    }

    /* renamed from: a */
    public final void mo68481a(C17414y yVar, JsonAdapter.C17360e eVar) {
        super.mo68481a(yVar, eVar);
        this.f37958h = (!C17387a0.m29124b(this.f37959i[0], this.f37960j) || !this.f37961k.equals(this.f37962l)) ? yVar.mo68558c(this.f37959i[0], this.f37961k, (String) null) : yVar.mo68559d(eVar, this.f37959i[0], this.f37961k);
    }

    /* renamed from: b */
    public final Object mo68482b(JsonReader jsonReader) throws IOException, InvocationTargetException {
        return mo68483c(this.f37958h.fromJson(jsonReader));
    }
}
