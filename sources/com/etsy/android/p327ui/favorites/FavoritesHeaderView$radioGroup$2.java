package com.etsy.android.p327ui.favorites;

import android.widget.RadioGroup;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.FavoritesHeaderView$radioGroup$2 */
public final class FavoritesHeaderView$radioGroup$2 extends Lambda implements C19846a<RadioGroup> {
    public final /* synthetic */ FavoritesHeaderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesHeaderView$radioGroup$2(FavoritesHeaderView favoritesHeaderView) {
        super(0);
        this.this$0 = favoritesHeaderView;
    }

    public final RadioGroup invoke() {
        return (RadioGroup) this.this$0.findViewById(R.id.radio_group);
    }
}
