package com.etsy.android.p327ui.favorites.editlist;

import android.content.DialogInterface;
import com.etsy.android.p327ui.favorites.C9852g;
import com.etsy.android.p327ui.favorites.editlist.EditCollectionViewModel;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8048a;
import p248tp.C8066r;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.favorites.editlist.b */
public final /* synthetic */ class C9846b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ EditCollectionBottomSheetFragment f21749b;

    public /* synthetic */ C9846b(EditCollectionBottomSheetFragment editCollectionBottomSheetFragment) {
        this.f21749b = editCollectionBottomSheetFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditCollectionBottomSheetFragment editCollectionBottomSheetFragment = this.f21749b;
        C19383o.m32797g(editCollectionBottomSheetFragment, "this$0");
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
        EditCollectionViewModel access$getViewModel$p = editCollectionBottomSheetFragment.viewModel;
        if (access$getViewModel$p != null) {
            String key = editCollectionBottomSheetFragment.getCollection().getKey();
            C19383o.m32796f(key, "collection.key");
            access$getViewModel$p.f21739f.postValue(EditCollectionViewModel.C9838a.C9841c.f21743a);
            C9852g gVar = access$getViewModel$p.f21735b;
            gVar.getClass();
            C8048a a = gVar.f21756a.mo32910a(key);
            access$getViewModel$p.f21737d.getClass();
            C8066r b = C13461f.m21235b();
            a.getClass();
            CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(a, b);
            access$getViewModel$p.f21737d.getClass();
            Disposable d = SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new EditCollectionViewModel$delete$1(access$getViewModel$p), new EditCollectionViewModel$delete$2(access$getViewModel$p));
            C7091a aVar = access$getViewModel$p.f21740g;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(d);
            return;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }
}
