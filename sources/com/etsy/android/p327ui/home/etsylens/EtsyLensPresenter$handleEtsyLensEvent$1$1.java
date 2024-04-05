package com.etsy.android.p327ui.home.etsylens;

import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensPresenter$handleEtsyLensEvent$1$1 */
final class EtsyLensPresenter$handleEtsyLensEvent$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ EtsyLensPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLensPresenter$handleEtsyLensEvent$1$1(EtsyLensPresenter etsyLensPresenter) {
        super(0);
        this.this$0 = etsyLensPresenter;
    }

    public final void invoke() {
        CameraOrFileBottomSheetDialogFragment cameraOrFileBottomSheetDialogFragment = this.this$0.f21947f;
        if (cameraOrFileBottomSheetDialogFragment != null) {
            cameraOrFileBottomSheetDialogFragment.dismiss();
        }
        EtsyLensPresenter etsyLensPresenter = this.this$0;
        etsyLensPresenter.f21947f = null;
        C9974e eVar = etsyLensPresenter.f21944c;
        C12060q.m19871b(eVar.f21962d, new C9974e.C9975a.C9976a("image_search_take_photo"));
        C12060q.m19871b(eVar.f21962d, C9974e.C9975a.C9978c.f21966a);
    }
}
