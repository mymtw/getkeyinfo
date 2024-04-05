package com.etsy.android.p327ui.favorites.createalist;

import android.content.Context;
import android.content.res.Resources;
import android.support.p013v4.media.C0072d;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.lib.util.C8916o;
import com.etsy.android.p327ui.favorites.createalist.C9810f;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p409o9.C13127g;
import p415of.C13181j;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListPresenter */
public final class CreateAListPresenter implements C13181j {

    /* renamed from: i */
    public static int f21665i;

    /* renamed from: b */
    public final CreateAListFragment f21666b;

    /* renamed from: c */
    public final C9815g f21667c;

    /* renamed from: d */
    public final C13461f f21668d;

    /* renamed from: e */
    public final C9816h f21669e;

    /* renamed from: f */
    public final C8916o f21670f;

    /* renamed from: g */
    public C9799a f21671g;

    /* renamed from: h */
    public C7091a f21672h;

    public CreateAListPresenter(CreateAListFragment createAListFragment, C9815g gVar, C13461f fVar, C9816h hVar, C8916o oVar) {
        C19383o.m32797g(createAListFragment, "fragment");
        this.f21666b = createAListFragment;
        this.f21667c = gVar;
        this.f21668d = fVar;
        this.f21669e = hVar;
        this.f21670f = oVar;
        Resources resources = createAListFragment.getResources();
        C19383o.m32796f(resources, "fragment.resources");
        f21665i = resources.getDimensionPixelSize(R.dimen.clg_space_2);
    }

    /* renamed from: a */
    public final void mo32807a(List<ListingCard> list) {
        ViewExtensions.m12860d((LoadingIndicatorView) this.f21666b._$_findCachedViewById(R.id.favorites_create_list_loading));
        ViewExtensions.m12869m((TextView) this.f21666b._$_findCachedViewById(R.id.favorites_create_list_title));
        ViewExtensions.m12869m((Button) this.f21666b._$_findCachedViewById(R.id.favorites_create_list_skip));
        ViewExtensions.m12869m((ImageButton) this.f21666b._$_findCachedViewById(R.id.favorites_create_list_exit));
        FavoritesAdapter favoritesAdapter = (FavoritesAdapter) ((RecyclerView) this.f21666b._$_findCachedViewById(R.id.favorites_create_list_recyclerview)).getAdapter();
        if (favoritesAdapter == null) {
            Context context = this.f21666b.getContext();
            C19383o.m32795e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            favoritesAdapter = new FavoritesAdapter((FragmentActivity) context, this.f21669e);
            favoritesAdapter.f26308b = this;
            ((RecyclerView) this.f21666b._$_findCachedViewById(R.id.favorites_create_list_recyclerview)).setAdapter(favoritesAdapter);
            ViewExtensions.m12869m((RecyclerView) this.f21666b._$_findCachedViewById(R.id.favorites_create_list_recyclerview));
            PublishSubject<C9819k> publishSubject = favoritesAdapter.f21674d;
            C19172m c = C0472h.m1242c(publishSubject, publishSubject);
            this.f21668d.getClass();
            SubscribersKt.m32501f(c.mo20635e(C13461f.m21236c()), CreateAListPresenter$observeAdapter$1.INSTANCE, new CreateAListPresenter$observeAdapter$2(this), 2);
        }
        favoritesAdapter.addItems(list);
    }

    /* renamed from: b */
    public final void mo32808b() {
        C19394m mVar;
        C7091a aVar = this.f21672h;
        if (aVar != null) {
            aVar.mo19405d();
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            this.f21672h = new C7091a();
        }
        C9815g gVar = this.f21667c;
        if (!gVar.f21711i) {
            gVar.f21709g.onNext(C9810f.C9814d.f21703a);
            gVar.f21710h.mo19405d();
            C11780h hVar = gVar.f21704b;
            String etsyId = gVar.f21706d.mo45958c().toString();
            int i = gVar.f21707e;
            hVar.getClass();
            C19383o.m32797g(etsyId, "userId");
            SingleSubscribeOn f = C0072d.m199f(gVar.f21705c, hVar.f26247b.mo38053e(etsyId, i, 24));
            gVar.f21705c.getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(new C19208j(f.mo20657f(C13461f.m21235b()), new C13127g(gVar, 3)), new CreateAListViewModel$getFavorites$2(gVar), new CreateAListViewModel$getFavorites$3(gVar));
            C7091a aVar2 = gVar.f21710h;
            C19383o.m32798h(aVar2, "compositeDisposable");
            aVar2.mo19403b(e);
        }
        C19254a<C9810f> aVar3 = gVar.f21709g;
        C19172m b = C0472h.m1241b(aVar3, aVar3);
        this.f21668d.getClass();
        ObservableSubscribeOn i2 = b.mo20639i(C13461f.m21235b());
        this.f21668d.getClass();
        LambdaObserver f2 = SubscribersKt.m32501f(i2.mo20635e(C13461f.m21236c()), CreateAListPresenter$getUserFavorites$2.INSTANCE, new CreateAListPresenter$getUserFavorites$3(this), 2);
        C7091a aVar4 = this.f21672h;
        C19383o.m32794d(aVar4);
        aVar4.mo19403b(f2);
    }

    public final int getLoadTriggerPosition() {
        return 12;
    }

    public final void onScrolledToLoadTrigger() {
        mo32808b();
    }
}
