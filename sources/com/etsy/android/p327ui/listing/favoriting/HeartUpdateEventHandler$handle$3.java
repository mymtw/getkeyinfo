package com.etsy.android.p327ui.listing.favoriting;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10662u;
import com.etsy.android.p327ui.listing.p329ui.C10663v;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.C10635b;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10639c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p400mf.C13074b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.favoriting.HeartUpdateEventHandler$handle$3 */
final class HeartUpdateEventHandler$handle$3 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13074b $update;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeartUpdateEventHandler$handle$3(C13074b bVar) {
        super(1);
        this.$update = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C10635b bVar;
        C10419g gVar2 = gVar;
        C19383o.m32797g(gVar2, "$this$updateAsStateChange");
        final C13074b bVar2 = this.$update;
        C101161 r1 = new C19857l<C10663v, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10663v) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10663v vVar) {
                C19383o.m32797g(vVar, "$this$sellerInfo");
                C10639c cVar = vVar.f23462j;
                boolean z = false;
                if (cVar != null && cVar.f23373b == ((C13074b.C13077c) bVar2).f28752a) {
                    z = true;
                }
                if (z) {
                    final C13074b bVar = bVar2;
                    C101171 r0 = new C19857l<C10662u, C19394m>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((C10662u) obj);
                            return C19394m.f43287a;
                        }

                        public final void invoke(C10662u uVar) {
                            C19383o.m32797g(uVar, "$this$favoriteInfo");
                            uVar.f23449a = ((C13074b.C13077c) bVar).f28753b;
                        }
                    };
                    C10639c cVar2 = vVar.f23462j;
                    if (cVar2 != null) {
                        C10662u uVar = new C10662u(cVar2);
                        r0.invoke(uVar);
                        vVar.f23462j = new C10639c(uVar.f23449a, uVar.f23450b, uVar.f23451c, uVar.f23452d);
                    }
                }
            }
        };
        C10635b bVar3 = gVar2.f22867h;
        if (bVar3 != null) {
            C10663v vVar = r4;
            C10663v vVar2 = new C10663v(bVar3.f23349a, bVar3.f23350b, bVar3.f23351c, bVar3.f23352d, bVar3.f23353e, bVar3.f23354f, bVar3.f23355g, bVar3.f23356h, bVar3.f23357i, bVar3.f23358j);
            r1.invoke(vVar);
            bVar = new C10635b(vVar.f23453a, vVar.f23454b, vVar.f23455c, vVar.f23456d, vVar.f23457e, vVar.f23458f, vVar.f23459g, vVar.f23460h, vVar.f23461i, vVar.f23462j, (int) RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
        } else {
            bVar = null;
        }
        gVar2.f22867h = bVar;
    }
}
