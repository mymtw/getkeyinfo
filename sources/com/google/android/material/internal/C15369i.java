package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.internal.C15370j;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.internal.i */
public final class C15369i implements C15370j.C15372b {

    /* renamed from: a */
    public final /* synthetic */ boolean f34516a;

    /* renamed from: b */
    public final /* synthetic */ boolean f34517b;

    /* renamed from: c */
    public final /* synthetic */ boolean f34518c;

    /* renamed from: d */
    public final /* synthetic */ C15370j.C15372b f34519d;

    public C15369i(boolean z, boolean z2, boolean z3, BottomAppBar.C15202c cVar) {
        this.f34516a = z;
        this.f34517b = z2;
        this.f34518c = z3;
        this.f34519d = cVar;
    }

    /* renamed from: a */
    public final C2348w0 mo53146a(View view, C2348w0 w0Var, C15370j.C15373c cVar) {
        if (this.f34516a) {
            cVar.f34525d = w0Var.mo8944d() + cVar.f34525d;
        }
        boolean d = C15370j.m24963d(view);
        if (this.f34517b) {
            if (d) {
                cVar.f34524c = w0Var.mo8945e() + cVar.f34524c;
            } else {
                cVar.f34522a = w0Var.mo8945e() + cVar.f34522a;
            }
        }
        if (this.f34518c) {
            if (d) {
                cVar.f34522a = w0Var.mo8947f() + cVar.f34522a;
            } else {
                cVar.f34524c = w0Var.mo8947f() + cVar.f34524c;
            }
        }
        int i = cVar.f34522a;
        int i2 = cVar.f34523b;
        int i3 = cVar.f34524c;
        int i4 = cVar.f34525d;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2369e.m5240k(view, i, i2, i3, i4);
        C15370j.C15372b bVar = this.f34519d;
        return bVar != null ? bVar.mo53146a(view, w0Var, cVar) : w0Var;
    }
}
