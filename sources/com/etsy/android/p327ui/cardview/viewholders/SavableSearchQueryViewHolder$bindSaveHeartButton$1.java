package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.widget.ImageView;
import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQuery;
import com.etsy.android.uikit.util.AnimationUtil;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SavableSearchQueryViewHolder$bindSaveHeartButton$1 */
final class SavableSearchQueryViewHolder$bindSaveHeartButton$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ String $notSavedContentDescription;
    public final /* synthetic */ int $notSavedIcon;
    public final /* synthetic */ SavableSearchQuery $savableSearchQuery;
    public final /* synthetic */ String $savedContentDescription;
    public final /* synthetic */ int $savedIcon;
    public final /* synthetic */ ImageView $this_bindSaveHeartButton;
    public final /* synthetic */ C9218u0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavableSearchQueryViewHolder$bindSaveHeartButton$1(SavableSearchQuery savableSearchQuery, ImageView imageView, int i, String str, int i2, String str2, C9218u0 u0Var) {
        super(1);
        this.$savableSearchQuery = savableSearchQuery;
        this.$this_bindSaveHeartButton = imageView;
        this.$savedIcon = i;
        this.$savedContentDescription = str;
        this.$notSavedIcon = i2;
        this.$notSavedContentDescription = str2;
        this.this$0 = u0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        if (!this.$savableSearchQuery.isFavorite()) {
            AnimationUtil.m19605a(this.$this_bindSaveHeartButton, this.$savedIcon);
            this.$this_bindSaveHeartButton.setContentDescription(this.$savedContentDescription);
        } else {
            this.$this_bindSaveHeartButton.setImageResource(this.$notSavedIcon);
            this.$this_bindSaveHeartButton.setContentDescription(this.$notSavedContentDescription);
        }
        this.this$0.f20353c.mo31330e(this.$savableSearchQuery.isFavorite(), this.$savableSearchQuery);
        SavableSearchQuery savableSearchQuery = this.$savableSearchQuery;
        savableSearchQuery.setFavorite(!savableSearchQuery.isFavorite());
    }
}
