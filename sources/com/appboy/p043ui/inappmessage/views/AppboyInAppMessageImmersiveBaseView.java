package com.appboy.p043ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.braze.p044ui.inappmessage.views.InAppMessageImmersiveBaseView;

@Deprecated
/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageImmersiveBaseView */
public abstract class AppboyInAppMessageImmersiveBaseView extends InAppMessageImmersiveBaseView {
    public AppboyInAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract /* synthetic */ View getMessageCloseButtonView();
}
