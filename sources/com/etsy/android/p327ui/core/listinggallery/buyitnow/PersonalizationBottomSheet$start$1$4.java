package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.view.View;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.PersonalizationBottomSheet$start$1$4 */
final class PersonalizationBottomSheet$start$1$4 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ boolean $isRequired;
    public final /* synthetic */ int $maxLength;
    public final /* synthetic */ C19857l<String, C19394m> $onPersonalizationEntered;
    public final /* synthetic */ CollageTextInput $textInputPersonalization;
    public final /* synthetic */ C9671l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizationBottomSheet$start$1$4(C9671l lVar, CollageTextInput collageTextInput, boolean z, int i, C19857l<? super String, C19394m> lVar2) {
        super(1);
        this.this$0 = lVar;
        this.$textInputPersonalization = collageTextInput;
        this.$isRequired = z;
        this.$maxLength = i;
        this.$onPersonalizationEntered = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.mo32391b(this.$textInputPersonalization, this.$isRequired, this.$maxLength, this.$onPersonalizationEntered);
    }
}
