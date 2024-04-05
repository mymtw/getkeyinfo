package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.b0 */
public abstract class C11544b0 {

    /* renamed from: com.etsy.android.ui.user.inappnotifications.b0$a */
    public static final class C11545a extends C11544b0 {

        /* renamed from: a */
        public static final C11545a f25542a = new C11545a();
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.b0$b */
    public static final class C11546b extends C11544b0 {

        /* renamed from: a */
        public final List<InAppNotification> f25543a;

        public C11546b(List<? extends InAppNotification> list) {
            C19383o.m32797g(list, "updates");
            this.f25543a = list;
        }
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.b0$c */
    public static final class C11547c extends C11544b0 {
    }
}
