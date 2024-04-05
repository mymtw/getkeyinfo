package com.etsy.android.p327ui.user.addresses;

import android.view.View;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import com.etsy.android.p327ui.user.addresses.C11381a0;
import com.etsy.android.p327ui.user.addresses.C11410f0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.PublishSubject;
import p456ua.C13461f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListFragment$onCreateView$1 */
public final class AddressListFragment$onCreateView$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ AddressListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressListFragment$onCreateView$1(AddressListFragment addressListFragment) {
        super(1);
        this.this$0 = addressListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        AddressListPresenter presenter = this.this$0.getPresenter();
        C11460w wVar = presenter.f25094c;
        if (wVar != null) {
            wVar.f25296h.onNext(C11410f0.C11412b.f25151a);
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(wVar.f25290b, C0326j.m860e(wVar.f25290b, wVar.f25291c.mo37264a(C11381a0.C11385d.f25113a))), new AddressListViewModel$loadCountries$1(wVar), new AddressListViewModel$loadCountries$2(wVar));
            C7091a aVar = wVar.f25294f;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
            PublishSubject<C11410f0> publishSubject = wVar.f25296h;
            C19172m c = C0472h.m1242c(publishSubject, publishSubject);
            presenter.f25092a.getClass();
            ObservableSubscribeOn i = c.mo20639i(C13461f.m21235b());
            presenter.f25092a.getClass();
            LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), new AddressListPresenter$findEtsyCountryForLocale$1(presenter), new AddressListPresenter$findEtsyCountryForLocale$2(presenter), 2);
            C7091a aVar2 = presenter.f25095d;
            C19383o.m32798h(aVar2, "compositeDisposable");
            aVar2.mo19403b(f);
        }
    }
}
