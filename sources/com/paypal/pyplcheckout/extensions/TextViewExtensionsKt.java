package com.paypal.pyplcheckout.extensions;

import android.content.Context;
import android.widget.TextView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class TextViewExtensionsKt {
    public static final void setAppearance(TextView textView, int i, Context context) {
        C19383o.m32797g(textView, "<this>");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        textView.setTextAppearance(i);
    }
}
