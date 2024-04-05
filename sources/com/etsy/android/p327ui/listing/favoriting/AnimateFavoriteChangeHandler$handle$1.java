package com.etsy.android.p327ui.listing.favoriting;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10407d;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10448m;
import com.etsy.android.p327ui.listing.p329ui.C10458n;
import com.etsy.android.p327ui.listing.p329ui.C10666y;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10457d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.favoriting.AnimateFavoriteChangeHandler$handle$1 */
public final class AnimateFavoriteChangeHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13640g $event;
    public final /* synthetic */ ListingViewState.C10092d $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateFavoriteChangeHandler$handle$1(ListingViewState.C10092d dVar, C13597g.C13640g gVar) {
        super(1);
        this.$state = dVar;
        this.$event = gVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        long f = this.$state.mo33477f();
        final C13597g.C13640g gVar2 = this.$event;
        if (f == gVar2.f30120a) {
            gVar.mo33965e(new C19857l<C10666y, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C10666y) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(C10666y yVar) {
                    C19383o.m32797g(yVar, "$this$topPanel");
                    final C13597g.C13640g gVar = gVar2;
                    yVar.mo34352a(new C19857l<C10407d, C19394m>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((C10407d) obj);
                            return C19394m.f43287a;
                        }

                        public final void invoke(C10407d dVar) {
                            C19383o.m32797g(dVar, "$this$favoriteInfo");
                            dVar.f22781c = new C10457d(gVar.f30121b);
                        }
                    });
                }
            });
        }
        final C13597g.C13640g gVar3 = this.$event;
        gVar.mo33963c(new C19857l<C10448m, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10448m) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10448m mVar) {
                C19383o.m32797g(mVar, "$this$moreFromShop");
                final C13597g.C13640g gVar = gVar3;
                mVar.mo33984a(gVar.f30120a, new C19857l<C10458n, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10458n) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10458n nVar) {
                        C19383o.m32797g(nVar, "$this$updateListingWithId");
                        nVar.f22970m = new C10457d(gVar.f30121b);
                    }
                });
            }
        });
    }
}
