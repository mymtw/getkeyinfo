package com.etsy.android.p327ui.user.privacy;

import com.etsy.android.lib.session.PrivacySetting;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.operators.completable.C19090d;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8061n;
import p402n9.C13094n;
import p418pa.C13198d;
import p456ua.C13461f;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.privacy.PrivacyFragment$onCreateView$1 */
public final class PrivacyFragment$onCreateView$1 extends Lambda implements C19861p<String, Boolean, C19394m> {
    public final /* synthetic */ PrivacyFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrivacyFragment$onCreateView$1(PrivacyFragment privacyFragment) {
        super(2);
        this.this$0 = privacyFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, ((Boolean) obj2).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(String str, boolean z) {
        C19383o.m32797g(str, "key");
        C11622b access$getViewModel = this.this$0.getViewModel();
        access$getViewModel.getClass();
        C13198d dVar = access$getViewModel.f25724b;
        dVar.getClass();
        C8061n<PrivacySetting> a = dVar.f29031a.mo45905a(str, z);
        C13094n nVar = new C13094n(dVar, 1);
        a.getClass();
        C19090d dVar2 = new C19090d(new C19179q(a, nVar));
        access$getViewModel.f25725c.getClass();
        CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(dVar2, C13461f.m21235b());
        access$getViewModel.f25725c.getClass();
        Disposable d = SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new PrivacyViewModel$onPrivacySettingChanged$1(access$getViewModel, str, z), PrivacyViewModel$onPrivacySettingChanged$2.INSTANCE);
        C7091a aVar = access$getViewModel.f25727e;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(d);
    }
}
