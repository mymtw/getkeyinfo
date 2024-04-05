package com.etsy.android.p327ui.cardview.clickhandlers;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.lib.models.apiv3.cart.SavedCartListing;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.push.registration.C8840m;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.stylekit.views.C9056g;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8071s;
import p356ge.C12788a;
import p356ge.C12790b;
import p367ib.C12924b;
import p367ib.C12929d;
import p415of.C13171a;
import p415of.C13173c;
import p415of.C13180i;
import p456ua.C13461f;
import p672sk.C18519a;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.SavedCartClickHandler */
public class SavedCartClickHandler extends C13171a<SavedCart> implements C2857f {

    /* renamed from: d */
    public C13180i f20035d;

    /* renamed from: e */
    public C9323l f20036e;

    /* renamed from: f */
    public PublishSubject<String> f20037f;

    /* renamed from: g */
    public final C12929d f20038g;

    /* renamed from: h */
    public boolean f20039h = false;

    /* renamed from: i */
    public final C7091a f20040i = new C7091a();

    /* renamed from: j */
    public final C13461f f20041j;

    public SavedCartClickHandler(Fragment fragment, C8703p pVar, C13173c cVar, C9323l lVar, C12929d dVar, C13461f fVar) {
        super(fragment, pVar);
        this.f20035d = cVar;
        this.f20036e = lVar;
        this.f20037f = new PublishSubject<>();
        this.f20038g = dVar;
        this.f20041j = fVar;
        fragment.getLifecycle().mo10733a(this);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo31328c(Object obj) {
        SavedCart savedCart = (SavedCart) obj;
    }

    /* renamed from: d */
    public final void mo31332d(SavedCart savedCart, int i) {
        C9056g gVar = new C9056g(mo45889a().requireActivity());
        gVar.mo70023l(R.string.remove_item_confirm_msg);
        C18519a m = gVar.setPositiveButton(R.string.yes, new C9136q(this, savedCart, i)).setNegativeButton(R.string.no, new C9137r());
        C9138s sVar = new C9138s(this, savedCart, i);
        AlertController.C0130b bVar = m.f286a;
        bVar.f269k = bVar.f259a.getText(R.string.move_item_to_favorites);
        m.f286a.f270l = sVar;
        m.create().show();
    }

    /* renamed from: e */
    public final void mo31333e(SavedCart savedCart, int i) {
        mo31336h(new C12924b.C12926b(savedCart), i, mo45889a().getString(R.string.toast_move_to_favorites));
    }

    /* renamed from: f */
    public final void mo31334f(C12924b bVar, int i) {
        int i2;
        PublishSubject<String> publishSubject = this.f20037f;
        Resources resources = mo45889a().getResources();
        if (bVar instanceof C12924b.C12925a) {
            i2 = R.string.toast_saved_cart_error_move_to_cart;
        } else if (bVar instanceof C12924b.C12926b) {
            i2 = R.string.toast_saved_cart_error_favorites;
        } else if (bVar instanceof C12924b.C12927c) {
            i2 = R.string.toast_saved_cart_error_removing;
        } else {
            StringBuilder h = C0072d.m201h("Unsupported action ");
            h.append(bVar.getClass().getSimpleName());
            throw new IllegalStateException(h.toString());
        }
        publishSubject.onNext(resources.getString(i2));
        bVar.mo45691a().getViewState().setIsLoading(false);
        this.f20035d.mo31300i(i);
        this.f20039h = false;
    }

    /* renamed from: g */
    public final void mo31335g(SavedCartListing savedCartListing) {
        HashMap hashMap = new HashMap();
        hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, savedCartListing.getListingId().getId());
        this.f28980b.mo21333d("save_for_later_tapped_listing", hashMap);
        String d = C12790b.m20432d(mo45889a());
        EtsyId listingId = savedCartListing.getListingId();
        C19383o.m32797g(listingId, "listingId");
        C12788a.m20424c(mo45889a().getActivity(), new ListingKey(d, listingId, true, true, (Bundle) null));
    }

    /* renamed from: h */
    public final void mo31336h(C12924b bVar, int i, String str) {
        C8071s<C20145v<C19928a0>> sVar;
        if (this.f20039h) {
            this.f20037f.onNext(mo45889a().getResources().getString(R.string.toast_saved_cart_processing));
            return;
        }
        this.f20039h = true;
        bVar.mo45691a().getViewState().setIsLoading(true);
        this.f20035d.mo31300i(i);
        C12929d dVar = this.f20038g;
        dVar.getClass();
        String id = bVar.mo45691a().getId().getId();
        if (bVar instanceof C12924b.C12927c) {
            sVar = dVar.f28492a.mo45702b(id);
        } else if (bVar instanceof C12924b.C12925a) {
            sVar = dVar.f28492a.mo45703c(id);
        } else if (bVar instanceof C12924b.C12926b) {
            sVar = dVar.f28492a.mo45701a(id);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C8840m mVar = new C8840m(dVar, 2);
        sVar.getClass();
        this.f20040i.mo19403b(C0391c.m1056b(this.f20041j, C0326j.m860e(this.f20041j, new C19208j(sVar, mVar))).mo20658g(new C9139t(this, bVar, i, str), new C9140u(this, bVar, i)));
    }

    public final void onDestroy(C2887s sVar) {
        this.f20040i.mo19405d();
    }
}
