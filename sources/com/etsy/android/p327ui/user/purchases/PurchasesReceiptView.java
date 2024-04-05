package com.etsy.android.p327ui.user.purchases;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.bumptech.glide.load.resource.bitmap.C6087k;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.user.purchases.PurchasesReceiptView */
public final class PurchasesReceiptView extends MaterialCardView {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PurchasesReceiptView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PurchasesReceiptView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesReceiptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
    }

    private final void setReceiptClickListeners(long j, C11628a aVar) {
        ViewExtensions.m12866j(this, new PurchasesReceiptView$setReceiptClickListeners$1(aVar, j));
    }

    private final void setShopClickListeners(String str, C11628a aVar) {
        if (str != null) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.avatar_image);
            C19383o.m32796f(imageView, "avatar_image");
            ViewExtensions.m12866j(imageView, new PurchasesReceiptView$setShopClickListeners$1$1(aVar, str));
            CollageHeadingTextView collageHeadingTextView = (CollageHeadingTextView) _$_findCachedViewById(R.id.name);
            C19383o.m32796f(collageHeadingTextView, "name");
            ViewExtensions.m12866j(collageHeadingTextView, new PurchasesReceiptView$setShopClickListeners$1$2(aVar, str));
        }
    }

    private final void setTransactions(List<C11681w> list, C11677s sVar) {
        ((LinearLayout) _$_findCachedViewById(R.id.transaction_holder)).removeAllViews();
        if (list != null) {
            for (C11681w viewState : list) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.list_item_purchases_transaction, (LinearLayout) _$_findCachedViewById(R.id.transaction_holder), false);
                C19383o.m32795e(inflate, "null cannot be cast to non-null type com.etsy.android.ui.user.purchases.PurchasesTransactionView");
                PurchasesTransactionView purchasesTransactionView = (PurchasesTransactionView) inflate;
                ((LinearLayout) _$_findCachedViewById(R.id.transaction_holder)).addView(purchasesTransactionView);
                purchasesTransactionView.setViewState(viewState, sVar);
            }
        }
    }

    private final void setUserAvatarUrl(String str) {
        C0114h.m270B0(getContext()).load(str).mo17139B(new C6087k()).mo16816M((ImageView) _$_findCachedViewById(R.id.avatar_image));
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setViewState(C11677s sVar) {
        C19383o.m32797g(sVar, "state");
        ((CollageHeadingTextView) _$_findCachedViewById(R.id.name)).setText(sVar.f25869d);
        CollageHeadingTextView collageHeadingTextView = (CollageHeadingTextView) _$_findCachedViewById(R.id.name);
        C19383o.m32796f(collageHeadingTextView, "name");
        ViewsExtensionsKt.m17423b(collageHeadingTextView, AccessibilityClassNames.BUTTON);
        setUserAvatarUrl(sVar.f25870e);
        ((TextView) _$_findCachedViewById(R.id.price)).setText(sVar.f25871f);
        ((CollageHeadingTextView) _$_findCachedViewById(R.id.date)).setText(sVar.f25872g);
        ((TextView) _$_findCachedViewById(R.id.multi_shop_note)).setVisibility(sVar.f25873h);
        ((TextView) _$_findCachedViewById(R.id.multi_shop_note)).setText(sVar.f25874i);
        ((TextView) _$_findCachedViewById(R.id.status)).setText(sVar.f25875j);
        setTransactions(sVar.f25876k, sVar);
        setReceiptClickListeners(sVar.f25868c, sVar.f25867b);
        setShopClickListeners(sVar.f25869d, sVar.f25867b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PurchasesReceiptView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
