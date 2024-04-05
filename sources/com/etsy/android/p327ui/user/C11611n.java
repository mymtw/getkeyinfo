package com.etsy.android.p327ui.user;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.jvm.internal.C19383o;
import p389lc.C13011b;
import p496za.C13943a;

/* renamed from: com.etsy.android.ui.user.n */
public final class C11611n {

    /* renamed from: a */
    public final PopupWindow f25713a;

    /* renamed from: b */
    public final Activity f25714b;

    /* renamed from: com.etsy.android.ui.user.n$a */
    public static final class C11612a {
        /* renamed from: a */
        public static C11611n m19358a(FragmentActivity fragmentActivity, C13943a aVar, C13011b bVar) {
            C19383o.m32797g(aVar, "prefsProvider");
            C19383o.m32797g(bVar, "darkModeTracker");
            View inflate = fragmentActivity.getLayoutInflater().inflate(R.layout.dark_mode_tooltip, (ViewGroup) null, false);
            PopupWindow popupWindow = new PopupWindow(inflate, -1, -2, true);
            popupWindow.setAnimationStyle(R.style.PopupAnimation);
            SharedPreferences a = aVar.mo46761a();
            popupWindow.setOnDismissListener(new C11591l(a));
            View findViewById = inflate.findViewById(R.id.dark_mode_alert_dismiss);
            C19383o.m32796f(findViewById, "alert.findViewById<Butto….dark_mode_alert_dismiss)");
            ViewExtensions.m12866j(findViewById, new DarkModeAlert$Companion$make$2(popupWindow));
            SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.dark_mode_switch);
            switchCompat.setChecked(a.getBoolean("dark_mode_preference", false));
            switchCompat.setOnCheckedChangeListener(new C11610m(a, bVar));
            return new C11611n(popupWindow, fragmentActivity);
        }
    }

    public C11611n(PopupWindow popupWindow, FragmentActivity fragmentActivity) {
        this.f25713a = popupWindow;
        this.f25714b = fragmentActivity;
    }
}
