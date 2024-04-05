package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.C0218f;
import androidx.core.view.C2330s0;

/* renamed from: androidx.appcompat.widget.x */
public interface C0358x {
    /* renamed from: a */
    boolean mo3123a();

    /* renamed from: b */
    void mo3124b(int i);

    /* renamed from: c */
    void mo3125c(CharSequence charSequence);

    boolean canShowOverflowMenu();

    void collapseActionView();

    /* renamed from: d */
    void mo3128d(CharSequence charSequence);

    /* renamed from: e */
    void mo3129e();

    /* renamed from: f */
    C2330s0 mo3130f(int i, long j);

    /* renamed from: g */
    boolean mo3131g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    void mo3134h();

    boolean hideOverflowMenu();

    /* renamed from: i */
    void mo3136i(boolean z);

    boolean isOverflowMenuShowPending();

    boolean isOverflowMenuShowing();

    /* renamed from: j */
    void mo3139j();

    /* renamed from: k */
    View mo3140k();

    /* renamed from: l */
    void mo3141l();

    /* renamed from: m */
    void mo3142m();

    /* renamed from: n */
    void mo3143n(SparseArray<Parcelable> sparseArray);

    /* renamed from: o */
    void mo3144o(int i);

    /* renamed from: p */
    void mo3145p(int i);

    /* renamed from: q */
    void mo3146q(int i);

    /* renamed from: r */
    void mo3147r(SparseArray<Parcelable> sparseArray);

    /* renamed from: s */
    boolean mo3148s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setMenu(Menu menu, C0218f.C0219a aVar);

    void setMenuPrepared();

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean showOverflowMenu();

    /* renamed from: t */
    int mo3157t();

    /* renamed from: u */
    void mo3158u(View view);

    /* renamed from: v */
    void mo3159v();

    /* renamed from: w */
    void mo3160w(Drawable drawable);
}
