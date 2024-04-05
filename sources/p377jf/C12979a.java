package p377jf;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.etsy.android.R;
import com.etsy.android.p327ui.favorites.add.C9789x;
import com.etsy.android.stylekit.views.C9058i;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: jf.a */
public final class C12979a {

    /* renamed from: a */
    public final PopupWindow f28587a;

    /* renamed from: b */
    public final CollageAlert f28588b;

    /* renamed from: c */
    public final Activity f28589c;

    /* renamed from: d */
    public boolean f28590d = true;

    /* renamed from: e */
    public long f28591e = 3000;

    /* renamed from: jf.a$a */
    public static final class C12980a {
        /* renamed from: a */
        public static C12979a m20683a(Activity activity) {
            C19383o.m32797g(activity, "activity");
            View inflate = activity.getLayoutInflater().inflate(R.layout.popup_alert, (ViewGroup) null, false);
            CollageAlert collageAlert = (CollageAlert) inflate.findViewById(R.id.alert);
            PopupWindow popupWindow = new PopupWindow(inflate, -1, -2, false);
            popupWindow.setAnimationStyle(R.style.PopupAnimation);
            collageAlert.setFloating(true);
            collageAlert.setDismissButtonClickListener(new C9058i(popupWindow, 2));
            return new C12979a(popupWindow, collageAlert, activity);
        }
    }

    public C12979a(PopupWindow popupWindow, CollageAlert collageAlert, Activity activity) {
        this.f28587a = popupWindow;
        this.f28588b = collageAlert;
        this.f28589c = activity;
    }

    /* renamed from: a */
    public final void mo45781a(CollageAlert.AlertType alertType) {
        C19383o.m32797g(alertType, "alertType");
        this.f28588b.setAlertType(alertType);
    }

    /* renamed from: b */
    public final void mo45782b(String str, Drawable drawable) {
        this.f28588b.setBodyText(str, drawable);
    }

    /* renamed from: c */
    public final void mo45783c(int i) {
        this.f28588b.setIconDrawableRes(i);
    }

    /* renamed from: d */
    public final void mo45784d(C19857l lVar) {
        this.f28588b.setOnClickListener(lVar != null ? new C9789x(lVar, 1) : null);
    }

    /* renamed from: e */
    public final void mo45785e(String str) {
        this.f28588b.setTitleText(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r1.getDecorView();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45786f() {
        /*
            r7 = this;
            android.widget.PopupWindow r0 = r7.f28587a
            android.app.Activity r1 = r7.f28589c
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L_0x0015
            android.view.View r1 = r1.getDecorView()
            if (r1 == 0) goto L_0x0015
            android.view.View r1 = r1.getRootView()
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            r2 = 49
            r3 = 0
            android.app.Activity r4 = r7.f28589c
            int r4 = com.etsy.android.lib.util.C8914m.m17343a(r4)
            android.app.Activity r5 = r7.f28589c
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131165392(0x7f0700d0, float:1.7945E38)
            int r5 = r5.getDimensionPixelOffset(r6)
            int r5 = r5 + r4
            r0.showAtLocation(r1, r2, r3, r5)
            com.etsy.android.stylekit.views.CollageAlert r0 = r7.f28588b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.etsy.android.stylekit.views.CollageAlert r2 = r7.f28588b
            java.lang.CharSequence r2 = r2.getTitleText()
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            com.etsy.android.stylekit.views.CollageAlert r2 = r7.f28588b
            java.lang.CharSequence r2 = r2.getBodyText()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 500(0x1f4, double:2.47E-321)
            com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt.m17422a(r0, r1, r2)
            boolean r0 = r7.f28590d
            if (r0 == 0) goto L_0x006f
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            androidx.compose.ui.platform.q r1 = new androidx.compose.ui.platform.q
            r2 = 5
            r1.<init>(r7, r2)
            long r2 = r7.f28591e
            r0.postDelayed(r1, r2)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p377jf.C12979a.mo45786f():void");
    }
}
