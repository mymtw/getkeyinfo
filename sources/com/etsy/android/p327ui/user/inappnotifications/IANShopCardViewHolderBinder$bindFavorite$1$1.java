package com.etsy.android.p327ui.user.inappnotifications;

import android.content.Context;
import android.view.View;
import androidx.compose.p015ui.text.font.C1948d;
import com.etsy.android.p327ui.user.inappnotifications.C11580v;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANShopCardViewHolderBinder$bindFavorite$1$1 */
public final class IANShopCardViewHolderBinder$bindFavorite$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11557j $dependencies;
    public final /* synthetic */ boolean $isFavorite;
    public final /* synthetic */ String $shopName;
    public final /* synthetic */ View $shopView;
    public final /* synthetic */ CollageButton $this_apply;
    public final /* synthetic */ IANShopCardViewHolderBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IANShopCardViewHolderBinder$bindFavorite$1$1(boolean z, View view, IANShopCardViewHolderBinder iANShopCardViewHolderBinder, CollageButton collageButton, String str, C11557j jVar) {
        super(1);
        this.$isFavorite = z;
        this.$shopView = view;
        this.this$0 = iANShopCardViewHolderBinder;
        this.$this_apply = collageButton;
        this.$shopName = str;
        this.$dependencies = jVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        if (!this.$isFavorite) {
            Context context = this.$shopView.getContext();
            C19383o.m32796f(context, "shopView.context");
            C1948d.m4270b(context, 10);
        }
        IANShopCardViewHolderBinder iANShopCardViewHolderBinder = this.this$0;
        CollageButton collageButton = this.$this_apply;
        C19383o.m32796f(collageButton, "this");
        String str = this.$shopName;
        iANShopCardViewHolderBinder.getClass();
        IANShopCardViewHolderBinder.m19305d(collageButton, !this.$isFavorite, str);
        C11557j jVar = this.$dependencies;
        jVar.f25598d.invoke(new C11580v.C11581a(jVar.f25595a, jVar.f25597c, !this.$isFavorite));
    }
}
