package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10194a;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.GiftWrapAvailableClickedHandler$handle$1 */
public final class GiftWrapAvailableClickedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13600a1 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftWrapAvailableClickedHandler$handle$1(C13597g.C13600a1 a1Var) {
        super(1);
        this.$event = a1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13600a1 a1Var = this.$event;
        gVar.mo33961a(new C19857l<C10194a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10194a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10194a aVar) {
                C19383o.m32797g(aVar, "$this$bottomSheetContent");
                C10564g gVar = a1Var.f30070a;
                String str = gVar.f23170d;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                aVar.f22369c = str;
                String str3 = gVar.f23167a;
                if (str3 != null) {
                    str2 = str3;
                }
                aVar.f22367a = str2;
                aVar.f22368b = gVar.f23171e;
            }
        });
    }
}
