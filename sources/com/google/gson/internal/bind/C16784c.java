package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import p675sn.C18541a;

/* renamed from: com.google.gson.internal.bind.c */
public final class C16784c extends ReflectiveTypeAdapterFactory.C16737b {

    /* renamed from: d */
    public final /* synthetic */ Field f37095d;

    /* renamed from: e */
    public final /* synthetic */ boolean f37096e;

    /* renamed from: f */
    public final /* synthetic */ C16807t f37097f;

    /* renamed from: g */
    public final /* synthetic */ C16708i f37098g;

    /* renamed from: h */
    public final /* synthetic */ C18541a f37099h;

    /* renamed from: i */
    public final /* synthetic */ boolean f37100i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16784c(String str, boolean z, boolean z2, Field field, boolean z3, C16807t tVar, C16708i iVar, C18541a aVar, boolean z4) {
        super(str, z, z2);
        this.f37095d = field;
        this.f37096e = z3;
        this.f37097f = tVar;
        this.f37098g = iVar;
        this.f37099h = aVar;
        this.f37100i = z4;
    }

    /* renamed from: a */
    public final void mo59576a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
        Object a = this.f37097f.mo59449a(jsonReader);
        if (a != null || !this.f37100i) {
            this.f37095d.set(obj, a);
        }
    }

    /* renamed from: b */
    public final void mo59577b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
        (this.f37096e ? this.f37097f : new C16785d(this.f37098g, this.f37097f, this.f37099h.getType())).mo59450b(jsonWriter, this.f37095d.get(obj));
    }

    /* renamed from: c */
    public final boolean mo59578c(Object obj) throws IOException, IllegalAccessException {
        return this.f37020b && this.f37095d.get(obj) != obj;
    }
}
