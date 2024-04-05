package com.bugsnag.android;

/* renamed from: com.bugsnag.android.m1 */
public final class C5808m1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f12421b;

    /* renamed from: c */
    public final /* synthetic */ C5917u f12422c;

    /* renamed from: d */
    public final /* synthetic */ C5934x1 f12423d;

    /* renamed from: e */
    public final /* synthetic */ C5812n1 f12424e;

    public C5808m1(C5812n1 n1Var, String str, C5917u uVar, C5934x1 x1Var) {
        this.f12424e = n1Var;
        this.f12421b = str;
        this.f12422c = uVar;
        this.f12423d = x1Var;
    }

    public final void run() {
        C5812n1 n1Var = this.f12424e;
        String str = this.f12421b;
        C5917u uVar = this.f12422c;
        C5934x1 x1Var = this.f12423d;
        if (!n1Var.f12431a.getAndSet(true)) {
            try {
                System.loadLibrary(str);
                n1Var.f12432b = true;
            } catch (UnsatisfiedLinkError e) {
                uVar.mo16685d(e, x1Var);
            }
        }
    }
}
