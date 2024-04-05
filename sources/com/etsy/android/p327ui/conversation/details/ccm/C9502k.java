package com.etsy.android.p327ui.conversation.details.ccm;

import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p354gc.C12778k;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.k */
public abstract class C9502k {

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.k$a */
    public static final class C9503a extends C9502k {

        /* renamed from: a */
        public final String f21072a;

        public C9503a(String str) {
            C19383o.m32797g(str, "otherUserDisplayName");
            this.f21072a = str;
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.k$b */
    public static final class C9504b extends C9502k {

        /* renamed from: a */
        public final String f21073a;

        /* renamed from: b */
        public final String f21074b;

        /* renamed from: c */
        public final String f21075c;

        /* renamed from: d */
        public final C19846a<C19394m> f21076d;

        public C9504b(String str, String str2, String str3, C19846a<C19394m> aVar) {
            this.f21073a = str;
            this.f21074b = str2;
            this.f21075c = str3;
            this.f21076d = aVar;
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.k$c */
    public static final class C9505c extends C9502k {

        /* renamed from: a */
        public static final C9505c f21077a = new C9505c();
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.k$d */
    public static final class C9506d extends C9502k {

        /* renamed from: a */
        public final String f21078a;

        /* renamed from: b */
        public final List<C12778k> f21079b;

        public C9506d(String str, List<? extends C12778k> list) {
            C19383o.m32797g(str, "otherUserDisplayName");
            C19383o.m32797g(list, "listItems");
            this.f21078a = str;
            this.f21079b = list;
        }
    }
}
