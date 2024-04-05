package com.etsy.android.lib.models.apiv3.vespa;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class SizeableTextPadding {
    public static final int $stable = 8;
    private int value;

    public SizeableTextPadding(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final int inDP(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return (int) ((((float) this.value) * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void setValue(int i) {
        this.value = i;
    }

    public SizeableTextPadding() {
        this(0);
    }
}
