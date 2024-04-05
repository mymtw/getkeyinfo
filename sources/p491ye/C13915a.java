package p491ye;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.widget.PopupWindow;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.CollageAlert;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import kotlin.C19394m;
import p753kq.C19857l;

@SuppressLint({"ClickableViewAccessibility"})
/* renamed from: ye.a */
public final class C13915a {

    /* renamed from: a */
    public final PopupWindow f30575a;

    /* renamed from: b */
    public final Activity f30576b;

    /* renamed from: c */
    public C19857l<? super C13916b, C19394m> f30577c;

    /* renamed from: d */
    public String f30578d;

    public C13915a(PopupWindow popupWindow, CollageAlert collageAlert, BottomNavigationView bottomNavigationView, Activity activity) {
        this.f30575a = popupWindow;
        this.f30576b = activity;
        collageAlert.setDismissButtonClickListener(new C9053d(this, 4));
    }
}
