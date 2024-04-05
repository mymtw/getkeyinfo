package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import com.etsy.android.extensions.UnexpectedResultException;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.user.addresses.C11381a0;
import com.etsy.android.p327ui.user.addresses.C11463z;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p287xp.C8339g;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$fetchSuggestedAddresses$1 */
public final class AddressDetailViewModel$fetchSuggestedAddresses$1 extends Lambda implements C19861p<String, C19857l<? super List<? extends PostalCodeSuggestion>, ? extends C19394m>, C19394m> {
    public final /* synthetic */ AddressDetailViewModel this$0;

    /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$fetchSuggestedAddresses$1$a */
    public static final class C11375a<T, R> implements C8339g {

        /* renamed from: b */
        public static final C11375a<T, R> f25071b = new C11375a<>();

        public final R apply(Object obj) {
            C19383o.m32797g(obj, "item");
            R r = (C11463z.C11471h) (!(obj instanceof C11463z.C11471h) ? null : obj);
            if (r != null) {
                return r;
            }
            StringBuilder h = C0072d.m201h("Expected value of type ");
            h.append(C11463z.C11471h.class.getSimpleName());
            h.append(", but it was ");
            h.append(obj.getClass().getSimpleName());
            throw new UnexpectedResultException(h.toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressDetailViewModel$fetchSuggestedAddresses$1(AddressDetailViewModel addressDetailViewModel) {
        super(2);
        this.this$0 = addressDetailViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (C19857l<? super List<PostalCodeSuggestion>, C19394m>) (C19857l) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, final C19857l<? super List<PostalCodeSuggestion>, C19394m> lVar) {
        C19383o.m32797g(str, "inputString");
        C19383o.m32797g(lVar, "callback");
        C19208j jVar = new C19208j(C0391c.m1056b(this.this$0.f25050b, C0326j.m860e(this.this$0.f25050b, this.this$0.f25051c.mo37264a(new C11381a0.C11388g(str)))), C11375a.f25071b);
        final AddressDetailViewModel addressDetailViewModel = this.this$0;
        ConsumerSingleObserver e = SubscribersKt.m32500e(jVar, new C19857l<Throwable, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C19394m.f43287a;
            }

            public final void invoke(Throwable th) {
                C19383o.m32797g(th, "it");
                LogCatKt.m17045a().mo21309d("Problem getting suggestions", th);
                addressDetailViewModel.f25052d.mo45474a("addresses_suggestions_failure.android");
            }
        }, new C19857l<C11463z.C11471h, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C11463z.C11471h) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C11463z.C11471h hVar) {
                C19383o.m32797g(hVar, "it");
                lVar.invoke(hVar.f25318a);
            }
        });
        C7091a aVar = this.this$0.f25053e;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }
}
