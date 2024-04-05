package p718yi;

import com.google.android.exoplayer2.trackselection.C14386b;
import com.google.android.exoplayer2.trackselection.C14389c;
import p513bj.C14049b0;
import p594jh.C17911f1;

/* renamed from: yi.g */
public final class C18890g {

    /* renamed from: a */
    public final int f42068a;

    /* renamed from: b */
    public final C17911f1[] f42069b;

    /* renamed from: c */
    public final C14386b[] f42070c;

    /* renamed from: d */
    public final Object f42071d;

    public C18890g(C17911f1[] f1VarArr, C14386b[] bVarArr, C14389c.C14390a aVar) {
        this.f42069b = f1VarArr;
        this.f42070c = (C14386b[]) bVarArr.clone();
        this.f42071d = aVar;
        this.f42068a = f1VarArr.length;
    }

    /* renamed from: a */
    public final boolean mo70323a(C18890g gVar, int i) {
        return gVar != null && C14049b0.m21628a(this.f42069b[i], gVar.f42069b[i]) && C14049b0.m21628a(this.f42070c[i], gVar.f42070c[i]);
    }

    /* renamed from: b */
    public final boolean mo70324b(int i) {
        return this.f42069b[i] != null;
    }
}
