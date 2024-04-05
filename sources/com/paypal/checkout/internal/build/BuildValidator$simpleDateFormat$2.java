package com.paypal.checkout.internal.build;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BuildValidator$simpleDateFormat$2 extends Lambda implements C19846a<SimpleDateFormat> {
    public static final BuildValidator$simpleDateFormat$2 INSTANCE = new BuildValidator$simpleDateFormat$2();

    public BuildValidator$simpleDateFormat$2() {
        super(0);
    }

    public final SimpleDateFormat invoke() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.US);
    }
}
