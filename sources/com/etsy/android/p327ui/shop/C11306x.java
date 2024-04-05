package com.etsy.android.p327ui.shop;

import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.p327ui.util.C11782j;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.subjects.PublishSubject;
import p400mf.C13074b;
import p400mf.C13079d;

/* renamed from: com.etsy.android.ui.shop.x */
public final /* synthetic */ class C11306x implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f24955b;

    /* renamed from: c */
    public final /* synthetic */ Object f24956c;

    /* renamed from: d */
    public final /* synthetic */ Object f24957d;

    public /* synthetic */ C11306x(int i, Object obj, Object obj2) {
        this.f24955b = i;
        this.f24956c = obj;
        this.f24957d = obj2;
    }

    public final void accept(Object obj) {
        switch (this.f24955b) {
            case 0:
                C11127a0 a0Var = (C11127a0) this.f24956c;
                C13074b bVar = (C13074b) this.f24957d;
                a0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    a0Var.notifyItemChanged(a0Var.getItems().indexOf(bVar));
                    return;
                }
                return;
            default:
                C11782j jVar = (C11782j) this.f24956c;
                C11780h hVar = (C11780h) this.f24957d;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(jVar, "$specs");
                C19383o.m32797g(hVar, "this$0");
                PublishSubject<C13074b> publishSubject = C13079d.f28754a;
                long idAsLongDeprecated = jVar.f26248a.getIdAsLongDeprecated();
                String str = jVar.f26249b;
                C19383o.m32797g(str, "shopName");
                C13079d.f28754a.onNext(new C13074b.C13077c(idAsLongDeprecated, str, !jVar.f26250c));
                hVar.mo38048b(jVar.f26248a, !jVar.f26250c);
                return;
        }
    }
}
