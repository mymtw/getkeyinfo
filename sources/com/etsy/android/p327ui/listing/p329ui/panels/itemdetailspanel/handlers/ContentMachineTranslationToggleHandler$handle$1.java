package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10194a;
import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10408e;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.C10665x;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.ContentMachineTranslationToggleHandler$handle$1 */
public final class ContentMachineTranslationToggleHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ String $newAlternateLanguageCode;
    public final /* synthetic */ String $newAlternateLanguageDescription;
    public final /* synthetic */ String $newAlternateLanguageTitleText;
    public final /* synthetic */ String $newDescription;
    public final /* synthetic */ String $newDescriptionTitle;
    public final /* synthetic */ String $newLanguageCode;
    public final /* synthetic */ String $newTitleText;
    public final /* synthetic */ ListingViewState.C10092d $state;
    public final /* synthetic */ boolean $toggleTranslatedContent;
    public final /* synthetic */ ContentMachineTranslationToggleHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentMachineTranslationToggleHandler$handle$1(ListingViewState.C10092d dVar, ContentMachineTranslationToggleHandler contentMachineTranslationToggleHandler, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        super(1);
        this.$state = dVar;
        this.this$0 = contentMachineTranslationToggleHandler;
        this.$newTitleText = str;
        this.$newAlternateLanguageTitleText = str2;
        this.$newLanguageCode = str3;
        this.$newAlternateLanguageCode = str4;
        this.$newDescription = str5;
        this.$newAlternateLanguageDescription = str6;
        this.$newDescriptionTitle = str7;
        this.$toggleTranslatedContent = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final String str = this.$newTitleText;
        final String str2 = this.$newAlternateLanguageTitleText;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                final String str = str;
                final String str2 = str2;
                bVar.mo33565a(new C19857l<C10665x, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10665x) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10665x xVar) {
                        C19383o.m32797g(xVar, "$this$title");
                        String str = str;
                        C19383o.m32797g(str, "<set-?>");
                        xVar.f23483a = str;
                        xVar.f23484b = str2;
                    }
                });
            }
        });
        final String str3 = this.$newLanguageCode;
        final String str4 = this.$newAlternateLanguageCode;
        final String str5 = this.$newDescription;
        final String str6 = this.$newAlternateLanguageDescription;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final String str = str3;
                final String str2 = str4;
                final String str3 = str5;
                final String str4 = str6;
                rVar.mo34252b(new C19857l<C10408e, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10408e) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10408e eVar) {
                        C19383o.m32797g(eVar, "$this$itemDetailsPanel");
                        eVar.f22794l = str;
                        eVar.f22795m = str2;
                        eVar.f22786d = str3;
                        eVar.f22790h = str4;
                    }
                });
            }
        });
        if (C19383o.m32792b(this.$state.f22238f.f22803f.f22848f.f23014f, Boolean.FALSE) && this.this$0.f23048a.mo33537a()) {
            final String str7 = this.$newDescriptionTitle;
            final String str8 = this.$newDescription;
            final boolean z = this.$toggleTranslatedContent;
            gVar.mo33961a(new C19857l<C10194a, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C10194a) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(C10194a aVar) {
                    C19383o.m32797g(aVar, "$this$bottomSheetContent");
                    aVar.f22367a = str7;
                    aVar.f22369c = str8;
                    Boolean bool = Boolean.TRUE;
                    aVar.f22370d = bool;
                    aVar.f22371e = bool;
                    aVar.f22373g = z;
                }
            });
        }
    }
}
