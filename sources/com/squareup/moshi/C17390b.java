package com.squareup.moshi;

import com.squareup.moshi.C17384a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: com.squareup.moshi.b */
public final class C17390b extends C17384a.C17386b {
    public C17390b(Type type, Set set, Object obj, Method method, int i) {
        super(type, set, obj, method, i, 2, true);
    }

    /* renamed from: d */
    public final void mo68484d(C17412w wVar, Object obj) throws IOException, InvocationTargetException {
        JsonAdapter<?>[] jsonAdapterArr = this.f37943f;
        Object[] objArr = new Object[(jsonAdapterArr.length + 2)];
        objArr[0] = wVar;
        objArr[1] = obj;
        System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
        try {
            this.f37941d.invoke(this.f37940c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
