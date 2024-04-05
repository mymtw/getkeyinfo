package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.common.a */
public class C14461a<E> {

    /* renamed from: a */
    public Object[] f32591a = new Object[4];

    /* renamed from: b */
    public int f32592b = 0;

    /* renamed from: c */
    public boolean f32593c;

    /* renamed from: a */
    public final void mo49663a(Object obj) {
        obj.getClass();
        int i = this.f32592b + 1;
        Object[] objArr = this.f32591a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            this.f32591a = Arrays.copyOf(objArr, i2);
            this.f32593c = false;
        } else if (this.f32593c) {
            this.f32591a = (Object[]) objArr.clone();
            this.f32593c = false;
        }
        Object[] objArr2 = this.f32591a;
        int i3 = this.f32592b;
        this.f32592b = i3 + 1;
        objArr2[i3] = obj;
    }
}
