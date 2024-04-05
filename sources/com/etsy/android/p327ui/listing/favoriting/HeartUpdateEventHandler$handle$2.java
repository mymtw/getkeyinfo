package com.etsy.android.p327ui.listing.favoriting;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10407d;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10448m;
import com.etsy.android.p327ui.listing.p329ui.C10458n;
import com.etsy.android.p327ui.listing.p329ui.C10666y;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p400mf.C13074b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.favoriting.HeartUpdateEventHandler$handle$2 */
final class HeartUpdateEventHandler$handle$2 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ ListingViewState.C10092d $state;
    public final /* synthetic */ C13074b $update;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeartUpdateEventHandler$handle$2(ListingViewState.C10092d dVar, C13074b bVar) {
        super(1);
        this.$state = dVar;
        this.$update = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final ListingViewState.C10092d dVar = this.$state;
        final C13074b bVar = this.$update;
        gVar.mo33965e(new C19857l<C10666y, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10666y) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10666y yVar) {
                C19383o.m32797g(yVar, "$this$topPanel");
                long f = dVar.mo33477f();
                final C13074b bVar = bVar;
                if (f == ((C13074b.C13076b) bVar).f28749a) {
                    yVar.mo34352a(new C19857l<C10407d, C19394m>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((C10407d) obj);
                            return C19394m.f43287a;
                        }

                        public final void invoke(C10407d dVar) {
                            C19383o.m32797g(dVar, "$this$favoriteInfo");
                            dVar.f22779a = ((C13074b.C13076b) bVar).f28750b;
                        }
                    });
                }
            }
        });
        final C13074b bVar2 = this.$update;
        gVar.mo33963c(new C19857l<C10448m, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10448m) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10448m mVar) {
                C19383o.m32797g(mVar, "$this$moreFromShop");
                final C13074b bVar = bVar2;
                mVar.mo33984a(((C13074b.C13076b) bVar).f28749a, new C19857l<C10458n, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10458n) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10458n nVar) {
                        C19383o.m32797g(nVar, "$this$updateListingWithId");
                        nVar.f22959b = ((C13074b.C13076b) bVar).f28750b;
                    }
                });
            }
        });
    }
}
