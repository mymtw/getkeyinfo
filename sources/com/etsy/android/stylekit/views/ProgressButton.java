package com.etsy.android.stylekit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435rb.C13350a;

public final class ProgressButton extends FrameLayout {
    public static final int $stable = 8;
    private final Button button;
    private final LoadingIndicatorView loadingIndicatorView;
    private String text;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProgressButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final String getText() {
        return this.text;
    }

    public final void hideLoading() {
        this.button.setEnabled(true);
        this.button.setText(this.text);
        this.button.setContentDescription(this.text);
        this.loadingIndicatorView.setVisibility(8);
        Button button2 = this.button;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2371g.m5249f(button2, 0);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.button.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.button.setOnClickListener(onClickListener);
    }

    public final void setText(String str) {
        this.text = str;
        this.button.setText(str);
    }

    public final void showLoading() {
        Button button2 = this.button;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2371g.m5249f(button2, 2);
        this.button.setEnabled(false);
        Button button3 = this.button;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        button3.setContentDescription(C13350a.m21016g(context, R.attr.clg_loading_content_description, new Object[0]));
        this.button.setText("");
        this.loadingIndicatorView.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0078 A[Catch:{ all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081 A[Catch:{ all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082 A[Catch:{ all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[Catch:{ all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e A[Catch:{ all -> 0x0097 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProgressButton(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r6.<init>(r7, r8, r9)
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r7)
            r0 = 2131624015(0x7f0e004f, float:1.8875198E38)
            r1 = 1
            r9.inflate(r0, r6, r1)
            r9 = 2131427623(0x7f0b0127, float:1.8476867E38)
            android.view.View r9 = r6.findViewById(r9)
            java.lang.String r0 = "findViewById(R.id.button)"
            kotlin.jvm.internal.C19383o.m32796f(r9, r0)
            android.widget.Button r9 = (android.widget.Button) r9
            r6.button = r9
            r0 = 2131427407(0x7f0b004f, float:1.847643E38)
            android.view.View r0 = r6.findViewById(r0)
            java.lang.String r2 = "findViewById(R.id.activity_indicator_view)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)
            com.etsy.android.stylekit.views.LoadingIndicatorView r0 = (com.etsy.android.stylekit.views.LoadingIndicatorView) r0
            r6.loadingIndicatorView = r0
            android.content.res.Resources$Theme r7 = r7.getTheme()
            int[] r2 = p388lb.C13006a.f28629A
            r3 = 0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r2, r3, r3)
            java.lang.String r8 = "context.theme.obtainStyl…ble.ProgressButton, 0, 0)"
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)
            r8 = 2
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x0097 }
            r6.setText((java.lang.String) r8)     // Catch:{ all -> 0x0097 }
            r8 = 2132018756(0x7f140644, float:1.9675828E38)
            int r2 = r7.getResourceId(r1, r8)     // Catch:{ all -> 0x0097 }
            boolean r4 = r6.isInEditMode()     // Catch:{ all -> 0x0097 }
            if (r4 != 0) goto L_0x005b
            p435rb.C13350a.m21010a(r9, r2)     // Catch:{ all -> 0x0097 }
        L_0x005b:
            r4 = -1
            int r5 = r7.getColor(r3, r4)     // Catch:{ all -> 0x0097 }
            if (r5 == r4) goto L_0x0069
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r5)     // Catch:{ all -> 0x0097 }
            r9.setBackgroundTintList(r4)     // Catch:{ all -> 0x0097 }
        L_0x0069:
            if (r2 != r8) goto L_0x006d
        L_0x006b:
            r8 = r1
            goto L_0x0074
        L_0x006d:
            r8 = 2132018762(0x7f14064a, float:1.967584E38)
            if (r2 != r8) goto L_0x0073
            goto L_0x006b
        L_0x0073:
            r8 = r3
        L_0x0074:
            if (r8 == 0) goto L_0x0078
        L_0x0076:
            r8 = r1
            goto L_0x007f
        L_0x0078:
            r8 = 2132018757(0x7f140645, float:1.967583E38)
            if (r2 != r8) goto L_0x007e
            goto L_0x0076
        L_0x007e:
            r8 = r3
        L_0x007f:
            if (r8 == 0) goto L_0x0082
            goto L_0x0089
        L_0x0082:
            r8 = 2132018759(0x7f140647, float:1.9675834E38)
            if (r2 != r8) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r1 = r3
        L_0x0089:
            if (r1 == 0) goto L_0x008e
            com.etsy.android.stylekit.views.LoadingIndicatorView$ColorScheme r8 = com.etsy.android.stylekit.views.LoadingIndicatorView.ColorScheme.INVERT     // Catch:{ all -> 0x0097 }
            goto L_0x0090
        L_0x008e:
            com.etsy.android.stylekit.views.LoadingIndicatorView$ColorScheme r8 = com.etsy.android.stylekit.views.LoadingIndicatorView.ColorScheme.NORMAL     // Catch:{ all -> 0x0097 }
        L_0x0090:
            r0.setColorScheme(r8)     // Catch:{ all -> 0x0097 }
            r7.recycle()
            return
        L_0x0097:
            r8 = move-exception
            r7.recycle()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.stylekit.views.ProgressButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }
}
