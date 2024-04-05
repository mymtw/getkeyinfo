package com.etsy.android.p327ui.conversation.compose;

import com.etsy.android.lib.models.apiv3.User;
import com.etsy.android.lib.requests.apiv3.UserEndpoint;
import com.squareup.moshi.C17414y;
import kotlin.jvm.internal.C19383o;
import p341ec.C12681d;

/* renamed from: com.etsy.android.ui.conversation.compose.a */
public final class C9452a {

    /* renamed from: a */
    public final UserEndpoint f20954a;

    /* renamed from: b */
    public final C12681d f20955b;

    /* renamed from: c */
    public final C17414y f20956c;

    /* renamed from: com.etsy.android.ui.conversation.compose.a$a */
    public static abstract class C9453a {

        /* renamed from: com.etsy.android.ui.conversation.compose.a$a$a */
        public static final class C9454a extends C9453a {

            /* renamed from: a */
            public static final C9454a f20957a = new C9454a();
        }

        /* renamed from: com.etsy.android.ui.conversation.compose.a$a$b */
        public static final class C9455b extends C9453a {

            /* renamed from: a */
            public final User f20958a;

            public C9455b(User user) {
                this.f20958a = user;
            }
        }
    }

    public C9452a(UserEndpoint userEndpoint, C12681d dVar, C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.f20954a = userEndpoint;
        this.f20955b = dVar;
        this.f20956c = yVar;
    }
}
