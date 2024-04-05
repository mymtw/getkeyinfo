package com.etsy.android.p327ui.home.etsylens;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LandingPageKey;
import com.etsy.android.p327ui.user.review.C11750u;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.BackpressureStrategy;
import p145io.reactivex.internal.operators.completable.C19089c;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p356ge.C12790b;
import p456ua.C13461f;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensPresenter$onCreate$1 */
public final class EtsyLensPresenter$onCreate$1 extends Lambda implements C19857l<C9974e.C9975a, C19394m> {
    public final /* synthetic */ EtsyLensPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLensPresenter$onCreate$1(EtsyLensPresenter etsyLensPresenter) {
        super(1);
        this.this$0 = etsyLensPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9974e.C9975a) obj);
        return C19394m.f43287a;
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [io.reactivex.disposables.Disposable, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r10v10, types: [io.reactivex.disposables.Disposable, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r10v18, types: [io.reactivex.disposables.Disposable, java.util.concurrent.atomic.AtomicReference] */
    public final void invoke(C9974e.C9975a aVar) {
        C19383o.m32797g(aVar, "event");
        EtsyLensPresenter etsyLensPresenter = this.this$0;
        etsyLensPresenter.getClass();
        if (C19383o.m32792b(aVar, C9974e.C9975a.C9982g.f21971a)) {
            CameraOrFileBottomSheetDialogFragment cameraOrFileBottomSheetDialogFragment = etsyLensPresenter.f21947f;
            if (cameraOrFileBottomSheetDialogFragment != null) {
                cameraOrFileBottomSheetDialogFragment.dismiss();
            }
            CameraOrFileBottomSheetDialogFragment cameraOrFileBottomSheetDialogFragment2 = new CameraOrFileBottomSheetDialogFragment();
            cameraOrFileBottomSheetDialogFragment2.setOnTakePictureClicked(new EtsyLensPresenter$handleEtsyLensEvent$1$1(etsyLensPresenter));
            cameraOrFileBottomSheetDialogFragment2.setOnSelectFileClicked(new EtsyLensPresenter$handleEtsyLensEvent$1$2(etsyLensPresenter));
            etsyLensPresenter.f21947f = cameraOrFileBottomSheetDialogFragment2;
            cameraOrFileBottomSheetDialogFragment2.show(etsyLensPresenter.f21943b.requireActivity().getSupportFragmentManager(), "CameraOrFileBottomSheetDialogFragment");
        } else if (C19383o.m32792b(aVar, C9974e.C9975a.C9978c.f21966a)) {
            if (C19382n.m32706E0()) {
                etsyLensPresenter.f21944c.mo33165c(true);
                return;
            }
            ((C11750u) etsyLensPresenter.f21950i.getValue()).mo37993b(C17782b.m29865e0("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"), etsyLensPresenter.f21951j);
        } else if (C19383o.m32792b(aVar, C9974e.C9975a.C9979d.f21967a)) {
            if (C19382n.m32706E0()) {
                etsyLensPresenter.f21944c.mo33166d(true);
                return;
            }
            ((C11750u) etsyLensPresenter.f21950i.getValue()).mo37993b(C17782b.m29865e0("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"), etsyLensPresenter.f21952k);
        } else if (C19383o.m32792b(aVar, C9974e.C9975a.C9984i.f21973a)) {
            ? r10 = etsyLensPresenter.f21948g;
            if (r10 != 0) {
                r10.dispose();
            }
            etsyLensPresenter.f21948g = SubscribersKt.m32502g(etsyLensPresenter.f21945d.f19640f.mo20640k(BackpressureStrategy.BUFFER), EtsyLensPresenter$handleEtsyLensEvent$2.INSTANCE, new EtsyLensPresenter$handleEtsyLensEvent$3(etsyLensPresenter));
            C8886e eVar = etsyLensPresenter.f21945d;
            TrackingBaseFragment trackingBaseFragment = etsyLensPresenter.f21943b;
            eVar.getClass();
            if (eVar.mo30480g(trackingBaseFragment.requireActivity())) {
                Intent e = eVar.mo30478e();
                if (e == null) {
                    eVar.f19642h.onNoAvailableActivities();
                    return;
                }
                try {
                    trackingBaseFragment.startActivityForResult(e, eVar.f19636b);
                } catch (ActivityNotFoundException unused) {
                    Context requireContext = trackingBaseFragment.requireContext();
                    if (requireContext != null) {
                        C8901g0.m17337c(requireContext, R.string.error_no_image_chooser_app_found);
                    }
                }
            }
        } else if (C19383o.m32792b(aVar, C9974e.C9975a.C9981f.f21970a)) {
            ? r102 = etsyLensPresenter.f21948g;
            if (r102 != 0) {
                r102.dispose();
            }
            etsyLensPresenter.f21948g = SubscribersKt.m32502g(etsyLensPresenter.f21945d.f19640f.mo20640k(BackpressureStrategy.BUFFER), EtsyLensPresenter$handleEtsyLensEvent$4.INSTANCE, new EtsyLensPresenter$handleEtsyLensEvent$5(etsyLensPresenter));
            C8886e eVar2 = etsyLensPresenter.f21945d;
            TrackingBaseFragment trackingBaseFragment2 = etsyLensPresenter.f21943b;
            eVar2.getClass();
            if (C19382n.m32706E0()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType("image/*");
                trackingBaseFragment2.startActivityForResult(intent, eVar2.f19636b);
            } else if (eVar2.mo30480g(trackingBaseFragment2.requireActivity())) {
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("image/*");
                trackingBaseFragment2.startActivityForResult(intent2, eVar2.f19636b);
            }
        } else if (aVar instanceof C9974e.C9975a.C9980e) {
            ? r1 = etsyLensPresenter.f21948g;
            if (r1 != 0) {
                r1.dispose();
            }
            C19089c cVar = new C19089c(new C9971b(aVar));
            etsyLensPresenter.f21946e.getClass();
            CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(cVar, C13461f.m21235b());
            etsyLensPresenter.f21946e.getClass();
            etsyLensPresenter.f21948g = (AtomicReference) SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new EtsyLensPresenter$handleEtsyLensEvent$7(etsyLensPresenter), new EtsyLensPresenter$handleEtsyLensEvent$8(etsyLensPresenter, aVar));
        } else if (aVar instanceof C9974e.C9975a.C9977b) {
            TrackingBaseFragment trackingBaseFragment3 = etsyLensPresenter.f21943b;
            String d = C12790b.m20432d(etsyLensPresenter.f21943b);
            String string = etsyLensPresenter.f21943b.getString(R.string.etsy_lens_page_title);
            C19383o.m32796f(string, "fragment.getString(R.string.etsy_lens_page_title)");
            C12790b.m20430b(trackingBaseFragment3, new LandingPageKey(d, new EtsyLensLandingPageLink(string, ((C9974e.C9975a.C9977b) aVar).f21965a), (Bundle) null, 4, (DefaultConstructorMarker) null));
        } else if (aVar instanceof C9974e.C9975a.C9983h) {
            Toast.makeText(etsyLensPresenter.f21943b.requireActivity(), ((C9974e.C9975a.C9983h) aVar).f21972a, 0).show();
        } else if (aVar instanceof C9974e.C9975a.C9976a) {
            etsyLensPresenter.f21943b.getAnalyticsContext().mo21333d(((C9974e.C9975a.C9976a) aVar).f21964a, (Map<? extends AnalyticsProperty, Object>) null);
        }
    }
}
