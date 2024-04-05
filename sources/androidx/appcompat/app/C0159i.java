package androidx.appcompat.app;

import androidx.core.view.C2332t0;
import kotlin.jvm.internal.C19382n;

/* renamed from: androidx.appcompat.app.i */
public final class C0159i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AppCompatDelegateImpl f391b;

    /* renamed from: androidx.appcompat.app.i$a */
    public class C0160a extends C19382n {
        public C0160a() {
        }

        /* renamed from: b */
        public final void mo1391b() {
            C0159i.this.f391b.f333q.setVisibility(0);
        }

        public final void onAnimationEnd() {
            C0159i.this.f391b.f333q.setAlpha(1.0f);
            C0159i.this.f391b.f336t.mo8921d((C2332t0) null);
            C0159i.this.f391b.f336t = null;
        }
    }

    public C0159i(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f391b = appCompatDelegateImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f391b
            android.widget.PopupWindow r1 = r0.f334r
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f333q
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f391b
            androidx.core.view.s0 r0 = r0.f336t
            if (r0 == 0) goto L_0x0015
            r0.mo8919b()
        L_0x0015:
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f391b
            boolean r1 = r0.f338v
            if (r1 == 0) goto L_0x0029
            android.view.ViewGroup r0 = r0.f339w
            if (r0 == 0) goto L_0x0029
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r1 = androidx.core.view.C2364y.f5646a
            boolean r0 = androidx.core.view.C2364y.C2371g.m5246c(r0)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = r3
        L_0x002a:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0050
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f391b
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f333q
            r2 = 0
            r0.setAlpha(r2)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f391b
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f333q
            androidx.core.view.s0 r2 = androidx.core.view.C2364y.m5186a(r2)
            r2.mo8918a(r1)
            r0.f336t = r2
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f391b
            androidx.core.view.s0 r0 = r0.f336t
            androidx.appcompat.app.i$a r1 = new androidx.appcompat.app.i$a
            r1.<init>()
            r0.mo8921d(r1)
            goto L_0x005e
        L_0x0050:
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f391b
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f333q
            r0.setAlpha(r1)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f391b
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f333q
            r0.setVisibility(r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0159i.run():void");
    }
}
