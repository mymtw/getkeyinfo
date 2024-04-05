package com.etsy.android.p327ui.favorites.createalist;

import android.view.View;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0472h;
import com.etsy.android.R;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.apiv3.listing.LightWeightListingLike;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.favorites.add.C9783r;
import com.etsy.android.p327ui.favorites.createalist.C9827p;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.Set;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p456ua.C13461f;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListPresenter$setListeners$2 */
final class NameAListPresenter$setListeners$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ NameAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListPresenter$setListeners$2(NameAListPresenter nameAListPresenter) {
        super(1);
        this.this$0 = nameAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        CollageTextInput collageTextInput;
        CollageTextInput collageTextInput2;
        CollageTextInput collageTextInput3;
        View view2 = this.this$0.f21676a.getView();
        if (!(view2 == null || (collageTextInput3 = (CollageTextInput) view2.findViewById(R.id.name_input)) == null)) {
            C15588c1.m25340p0(collageTextInput3);
        }
        View view3 = this.this$0.f21676a.getView();
        String str = null;
        if (!(view3 == null || (collageTextInput2 = (CollageTextInput) view3.findViewById(R.id.name_input)) == null)) {
            collageTextInput2.setErrorText((String) null);
        }
        boolean z = false;
        this.this$0.mo32836a(false);
        NameAListPresenter nameAListPresenter = this.this$0;
        View view4 = nameAListPresenter.f21676a.getView();
        if (!(view4 == null || (collageTextInput = (CollageTextInput) view4.findViewById(R.id.name_input)) == null)) {
            str = collageTextInput.getText();
        }
        String valueOf = String.valueOf(str);
        if (!C18263b.m30837c0(valueOf)) {
            String string = nameAListPresenter.f21676a.getString(R.string.create_collection_missing_name);
            C19383o.m32796f(string, "fragment.getString(R.str…_collection_missing_name)");
            nameAListPresenter.mo32837b(string);
            return;
        }
        nameAListPresenter.f21679d.getClass();
        Set<ListingCard> a = C9816h.m18087a();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(a));
        for (ListingCard listingCard : a) {
            Long listingId = listingCard.getListingId();
            long j = 0;
            EtsyId etsyId = new EtsyId(listingId != null ? listingId.longValue() : 0);
            String title = listingCard.getTitle();
            String url = listingCard.getUrl();
            String shopName = listingCard.getShopName();
            Long shopId = listingCard.getShopId();
            if (shopId != null) {
                j = shopId.longValue();
            }
            EtsyId etsyId2 = new EtsyId(j);
            Boolean isFavorite = listingCard.isFavorite();
            boolean booleanValue = isFavorite != null ? isFavorite.booleanValue() : z;
            Boolean isInCollections = listingCard.isInCollections();
            if (isInCollections != null) {
                z = isInCollections.booleanValue();
            }
            LightWeightListingLike lightWeightListingLike = r7;
            LightWeightListingLike lightWeightListingLike2 = new LightWeightListingLike(etsyId, title, (EtsyMoney) null, url, (ListingImage) null, shopName, etsyId2, booleanValue, z);
            arrayList.add(lightWeightListingLike);
            z = false;
        }
        nameAListPresenter.f21679d.getClass();
        Set<ListingCard> a2 = C9816h.m18087a();
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(a2));
        for (ListingCard listingId2 : a2) {
            arrayList2.add(listingId2.getListingId());
        }
        C9783r rVar = new C9783r(valueOf, C19327t.m32660p1(arrayList2), arrayList, nameAListPresenter.f21683h);
        nameAListPresenter.f21682g.mo19405d();
        nameAListPresenter.f21682g = new C7091a();
        C9831q qVar = nameAListPresenter.f21677b;
        qVar.getClass();
        qVar.f21730e.onNext(C9827p.C9830c.f21726a);
        SingleSubscribeOn e = C0326j.m860e(qVar.f21728c, qVar.f21727b.mo32720a(rVar));
        qVar.f21728c.getClass();
        ConsumerSingleObserver e2 = SubscribersKt.m32500e(e.mo20657f(C13461f.m21235b()), new NameAListViewModel$createList$1(qVar), new NameAListViewModel$createList$2(qVar));
        C7091a aVar = qVar.f21729d;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e2);
        C19254a<C9827p> aVar2 = qVar.f21730e;
        C19172m b = C0472h.m1241b(aVar2, aVar2);
        nameAListPresenter.f21678c.getClass();
        ObservableSubscribeOn i = b.mo20639i(C13461f.m21235b());
        nameAListPresenter.f21678c.getClass();
        LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), new NameAListPresenter$createList$1(nameAListPresenter), new NameAListPresenter$createList$2(nameAListPresenter), 2);
        C7091a aVar3 = nameAListPresenter.f21682g;
        C19383o.m32798h(aVar3, "compositeDisposable");
        aVar3.mo19403b(f);
    }
}
