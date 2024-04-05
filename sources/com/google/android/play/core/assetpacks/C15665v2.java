package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.internal.C15684b0;
import com.google.android.play.core.internal.C15686c0;
import com.google.android.play.core.internal.C15714z;
import com.google.android.play.core.internal.zzbx;
import java.lang.reflect.Field;

/* renamed from: com.google.android.play.core.assetpacks.v2 */
public class C15665v2 implements C15686c0 {

    /* renamed from: b */
    public final Object f35378b;

    /* renamed from: c */
    public final Object f35379c;

    /* renamed from: d */
    public final Object f35380d;

    public /* synthetic */ C15665v2(Object obj, Object obj2, Object obj3) {
        this.f35378b = obj;
        this.f35379c = obj2;
        this.f35380d = obj3;
    }

    /* renamed from: a */
    public final Object mo55494a() {
        try {
            return ((Class) this.f35380d).cast(((Field) this.f35379c).get(this.f35378b));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{((Field) this.f35379c).getName(), this.f35378b.getClass().getName(), ((Class) this.f35380d).getName()}), e);
        }
    }

    /* renamed from: b */
    public final void mo55495b(Object obj) {
        try {
            ((Field) this.f35379c).set(this.f35378b, obj);
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[]{((Field) this.f35379c).getName(), this.f35378b.getClass().getName(), ((Class) this.f35380d).getName()}), e);
        }
    }

    public final Object zza() {
        Context a = ((C15669w2) ((C15686c0) this.f35378b)).mo55501a();
        C15714z a2 = C15684b0.m25502a((C15686c0) this.f35379c);
        C15714z a3 = C15684b0.m25502a((C15686c0) this.f35380d);
        String str = null;
        try {
            Bundle bundle = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128).metaData;
            if (bundle != null) {
                str = bundle.getString("local_testing_dir");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        C15677y2 y2Var = str == null ? (C15677y2) a2.zza() : (C15677y2) a3.zza();
        C15588c1.m25311V0(y2Var);
        return y2Var;
    }
}
