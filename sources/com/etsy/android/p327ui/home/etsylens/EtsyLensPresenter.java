package com.etsy.android.p327ui.home.etsylens;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0120c;
import androidx.compose.p015ui.platform.ComposeView;
import androidx.core.widget.C2399d;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.p327ui.C9110b;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.stylekit.views.CollageImageView;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.util.C12060q;
import com.etsy.android.util.C12061r;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p019b.C3446c;
import p456ua.C13461f;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensPresenter */
public final class EtsyLensPresenter implements C2857f {

    /* renamed from: b */
    public final TrackingBaseFragment f21943b;

    /* renamed from: c */
    public final C9974e f21944c;

    /* renamed from: d */
    public final C8886e f21945d;

    /* renamed from: e */
    public final C13461f f21946e;

    /* renamed from: f */
    public CameraOrFileBottomSheetDialogFragment f21947f;

    /* renamed from: g */
    public AtomicReference f21948g;

    /* renamed from: h */
    public ComposeView f21949h;

    /* renamed from: i */
    public final C19285c f21950i = C19350d.m32677b(new EtsyLensPresenter$permissionsHelper$2(this));

    /* renamed from: j */
    public final C0120c<String[]> f21951j;

    /* renamed from: k */
    public final C0120c<String[]> f21952k;

    public EtsyLensPresenter(TrackingBaseFragment trackingBaseFragment, C9974e eVar, C8886e eVar2, C13461f fVar) {
        C19383o.m32797g(trackingBaseFragment, "fragment");
        C19383o.m32797g(eVar, "etsyLensViewModel");
        C19383o.m32797g(eVar2, "cameraHelper");
        C19383o.m32797g(fVar, "schedulers");
        this.f21943b = trackingBaseFragment;
        this.f21944c = eVar;
        this.f21945d = eVar2;
        this.f21946e = fVar;
        C0120c<String[]> registerForActivityResult = trackingBaseFragment.registerForActivityResult(new C3446c(), new C9110b(this, 1));
        C19383o.m32796f(registerForActivityResult, "fragment.registerForActi…,\n            )\n        }");
        this.f21951j = registerForActivityResult;
        C0120c<String[]> registerForActivityResult2 = trackingBaseFragment.registerForActivityResult(new C3446c(), new C9972c(this));
        C19383o.m32796f(registerForActivityResult2, "fragment.registerForActi…,\n            )\n        }");
        this.f21952k = registerForActivityResult2;
    }

    /* renamed from: a */
    public static final void m18162a(EtsyLensPresenter etsyLensPresenter, ComposeView composeView, C19846a aVar) {
        etsyLensPresenter.mo33154b(composeView, true);
        aVar.invoke();
        etsyLensPresenter.f21944c.f21961c.f21959b.mo46761a().edit().putBoolean("etsy_lens_onboarding_alert_pref_key", false).apply();
    }

    /* renamed from: b */
    public final void mo33154b(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.animate().setDuration(250).alpha(0.0f).withEndAction(new C2399d(new EtsyLensPresenter$removeFromDecorView$1$1(this, view), 1)).start();
            return;
        }
        View decorView = this.f21943b.requireActivity().getWindow().getDecorView();
        C19383o.m32795e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) decorView).removeView(view);
    }

    /* renamed from: c */
    public final void mo33155c(CollageImageView collageImageView, C19846a aVar) {
        Context context = collageImageView.getContext();
        C19383o.m32796f(context, "target.context");
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        EtsyLensPresenter$showEtsyLensAlert$1$1 etsyLensPresenter$showEtsyLensAlert$1$1 = new EtsyLensPresenter$showEtsyLensAlert$1$1(collageImageView, this, composeView, aVar);
        boolean z = true;
        composeView.setContent(C18263b.m30807B(etsyLensPresenter$showEtsyLensAlert$1$1, 287864549, true));
        ViewExtensions.m12863g(composeView);
        View decorView = this.f21943b.requireActivity().getWindow().getDecorView();
        C19383o.m32795e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        if (viewGroup.indexOfChild(composeView) == -1) {
            z = false;
        }
        if (!z) {
            viewGroup.addView(composeView);
            C12060q.m19871b(this.f21944c.f21962d, new C9974e.C9975a.C9976a("image_search_tooltip_seen"));
        }
        ViewExtensions.m12859c(composeView, 250);
        this.f21949h = composeView;
    }

    public final void onCreate(C2887s sVar) {
        this.f21944c.f21963e.observe(this.f21943b.getViewLifecycleOwner(), new C12061r(new EtsyLensPresenter$onCreate$1(this)));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [io.reactivex.disposables.Disposable, java.util.concurrent.atomic.AtomicReference] */
    public final void onDestroy(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        ? r2 = this.f21948g;
        if (r2 != 0) {
            r2.dispose();
        }
        this.f21948g = null;
        CameraOrFileBottomSheetDialogFragment cameraOrFileBottomSheetDialogFragment = this.f21947f;
        if (cameraOrFileBottomSheetDialogFragment != null) {
            cameraOrFileBottomSheetDialogFragment.dismiss();
        }
        this.f21947f = null;
        this.f21943b.getViewLifecycleOwner().getLifecycle().mo10735c(this);
    }

    public final void onStop(C2887s sVar) {
        mo33154b(this.f21949h, false);
    }
}
