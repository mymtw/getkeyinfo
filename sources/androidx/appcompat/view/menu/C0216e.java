package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0218f;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.WeakHashMap;
import p109g.C6825b;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0216e {

    /* renamed from: a */
    public final Context f612a;

    /* renamed from: b */
    public final MenuBuilder f613b;

    /* renamed from: c */
    public final boolean f614c;

    /* renamed from: d */
    public final int f615d;

    /* renamed from: e */
    public final int f616e;

    /* renamed from: f */
    public View f617f;

    /* renamed from: g */
    public int f618g;

    /* renamed from: h */
    public boolean f619h;

    /* renamed from: i */
    public C0218f.C0219a f620i;

    /* renamed from: j */
    public C6825b f621j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f622k;

    /* renamed from: l */
    public final C0217a f623l;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    public class C0217a implements PopupWindow.OnDismissListener {
        public C0217a() {
        }

        public final void onDismiss() {
            C0216e.this.mo2029c();
        }
    }

    public C0216e(Context context, MenuBuilder menuBuilder, View view, boolean z) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, menuBuilder, z);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [androidx.appcompat.view.menu.f, g.b] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.h] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p109g.C6825b mo2027a() {
        /*
            r14 = this;
            g.b r0 = r14.f621j
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r14.f612a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f612a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0047
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f612a
            android.view.View r3 = r14.f617f
            int r4 = r14.f615d
            int r5 = r14.f616e
            boolean r6 = r14.f614c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0059
        L_0x0047:
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r10 = r14.f612a
            androidx.appcompat.view.menu.MenuBuilder r12 = r14.f613b
            android.view.View r11 = r14.f617f
            int r8 = r14.f615d
            int r9 = r14.f616e
            boolean r13 = r14.f614c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0059:
            androidx.appcompat.view.menu.MenuBuilder r1 = r14.f613b
            r0.mo2005c(r1)
            androidx.appcompat.view.menu.e$a r1 = r14.f623l
            r0.mo2011i(r1)
            android.view.View r1 = r14.f617f
            r0.mo2007e(r1)
            androidx.appcompat.view.menu.f$a r1 = r14.f620i
            r0.setCallback(r1)
            boolean r1 = r14.f619h
            r0.mo2008f(r1)
            int r1 = r14.f618g
            r0.mo2009g(r1)
            r14.f621j = r0
        L_0x0079:
            g.b r0 = r14.f621j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0216e.mo2027a():g.b");
    }

    /* renamed from: b */
    public final boolean mo2028b() {
        C6825b bVar = this.f621j;
        return bVar != null && bVar.mo2004b();
    }

    /* renamed from: c */
    public void mo2029c() {
        this.f621j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f622k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public final void mo2030d(int i, int i2, boolean z, boolean z2) {
        C6825b a = mo2027a();
        a.mo2012j(z2);
        if (z) {
            int i3 = this.f618g;
            View view = this.f617f;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if ((Gravity.getAbsoluteGravity(i3, C2364y.C2369e.m5233d(view)) & 7) == 5) {
                i -= this.f617f.getWidth();
            }
            a.mo2010h(i);
            a.mo2013k(i2);
            int i4 = (int) ((this.f612a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f15026b = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a.mo2003a();
    }

    public C0216e(int i, int i2, Context context, View view, MenuBuilder menuBuilder, boolean z) {
        this.f618g = 8388611;
        this.f623l = new C0217a();
        this.f612a = context;
        this.f613b = menuBuilder;
        this.f617f = view;
        this.f614c = z;
        this.f615d = i;
        this.f616e = i2;
    }
}
