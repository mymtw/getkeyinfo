package com.google.android.play.core.internal;

import com.google.android.play.core.assetpacks.C15665v2;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.s */
public final class C15707s extends C15665v2 {
    public C15707s(Object obj, Class cls, Field field) {
        super(obj, field, Array.newInstance(cls, 0).getClass());
    }

    /* renamed from: c */
    public final void mo55531c(List list) {
        Object[] objArr = (Object[]) mo55494a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f35379c).getType().getComponentType(), list.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : list) {
            objArr2[length] = obj;
            length++;
        }
        mo55495b(objArr2);
    }

    /* renamed from: d */
    public final void mo55532d(Collection collection) {
        Object[] objArr = (Object[]) mo55494a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f35379c).getType().getComponentType(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        mo55495b(objArr2);
    }
}
