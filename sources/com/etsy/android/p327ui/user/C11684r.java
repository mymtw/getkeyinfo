package com.etsy.android.p327ui.user;

import com.etsy.android.lib.models.apiv3.inappnotifications.IANTooltip;
import com.etsy.android.p327ui.C9111b0;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.r */
public final class C11684r {

    /* renamed from: a */
    public final C9111b0 f25902a;

    /* renamed from: com.etsy.android.ui.user.r$a */
    public static abstract class C11685a {

        /* renamed from: com.etsy.android.ui.user.r$a$a */
        public static final class C11686a extends C11685a {
        }

        /* renamed from: com.etsy.android.ui.user.r$a$b */
        public static final class C11687b extends C11685a {

            /* renamed from: a */
            public final List<IANTooltip> f25903a;

            public C11687b(List<IANTooltip> list) {
                C19383o.m32797g(list, "tooltips");
                this.f25903a = list;
            }
        }
    }

    public C11684r(C9111b0 b0Var) {
        C19383o.m32797g(b0Var, "endpoint");
        this.f25902a = b0Var;
    }
}
