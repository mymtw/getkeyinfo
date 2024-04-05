package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shape.C15408d;
import java.util.ArrayList;
import java.util.List;
import p522cl.C14169a;

/* renamed from: com.google.android.material.shape.c */
public final class C15407c extends C15408d.C15414f {

    /* renamed from: b */
    public final /* synthetic */ List f34608b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f34609c;

    public C15407c(ArrayList arrayList, Matrix matrix) {
        this.f34608b = arrayList;
        this.f34609c = matrix;
    }

    /* renamed from: a */
    public final void mo54625a(Matrix matrix, C14169a aVar, int i, Canvas canvas) {
        for (C15408d.C15414f a : this.f34608b) {
            a.mo54625a(this.f34609c, aVar, i, canvas);
        }
    }
}
