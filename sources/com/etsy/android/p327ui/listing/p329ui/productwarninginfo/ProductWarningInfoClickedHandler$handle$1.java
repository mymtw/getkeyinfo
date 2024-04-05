package com.etsy.android.p327ui.listing.p329ui.productwarninginfo;

import com.etsy.android.lib.models.apiv3.listing.ProductSafetyNoticeMessage;
import com.etsy.android.p327ui.listing.p329ui.C10194a;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.productwarninginfo.ProductWarningInfoClickedHandler$handle$1 */
public final class ProductWarningInfoClickedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13748v2 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductWarningInfoClickedHandler$handle$1(C13597g.C13748v2 v2Var) {
        super(1);
        this.$event = v2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13748v2 v2Var = this.$event;
        gVar.mo33961a(new C19857l<C10194a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10194a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10194a aVar) {
                boolean z;
                C19383o.m32797g(aVar, "$this$bottomSheetContent");
                C13597g.C13748v2 v2Var = v2Var;
                aVar.f22367a = v2Var.f30275a;
                aVar.f22369c = C19327t.m32644Z0(v2Var.f30276b, "<br/><br/>", (String) null, (String) null, C106201.INSTANCE, 30);
                aVar.f22370d = Boolean.TRUE;
                List<ProductSafetyNoticeMessage> list = v2Var.f30276b;
                boolean z2 = true;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((ProductSafetyNoticeMessage) it.next()).getType() == ProductSafetyNoticeMessage.ProductSafetyNoticeType.WARNING) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    aVar.f22374h = z2;
                }
                z2 = false;
                aVar.f22374h = z2;
            }
        });
    }
}
