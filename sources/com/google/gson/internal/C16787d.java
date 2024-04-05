package com.google.gson.internal;

import android.support.p013v4.media.C0072d;
import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* renamed from: com.google.gson.internal.d */
public final class C16787d implements C16790g<Object> {

    /* renamed from: b */
    public final /* synthetic */ Type f37105b;

    public C16787d(Type type) {
        this.f37105b = type;
    }

    /* renamed from: i */
    public final Object mo1134i() {
        Type type = this.f37105b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder h = C0072d.m201h("Invalid EnumSet type: ");
            h.append(this.f37105b.toString());
            throw new JsonIOException(h.toString());
        }
        StringBuilder h2 = C0072d.m201h("Invalid EnumSet type: ");
        h2.append(this.f37105b.toString());
        throw new JsonIOException(h2.toString());
    }
}
