package com.google.android.play.core.ktx;

import com.google.android.play.core.appupdate.C15559a;
import com.google.android.play.core.appupdate.C15560b;
import com.google.android.play.core.install.InstallState;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.google.android.play.core.ktx.b */
public abstract class C15729b {

    /* renamed from: com.google.android.play.core.ktx.b$a */
    public static final class C15730a extends C15729b {

        /* renamed from: a */
        public final C15560b f35514a;

        public C15730a(C15560b bVar, C15559a aVar) {
            C19383o.m32798h(bVar, "appUpdateManager");
            C19383o.m32798h(aVar, "updateInfo");
            this.f35514a = bVar;
        }
    }

    /* renamed from: com.google.android.play.core.ktx.b$b */
    public static final class C15731b extends C15729b {

        /* renamed from: a */
        public final C15560b f35515a;

        public C15731b(C15560b bVar) {
            C19383o.m32798h(bVar, "appUpdateManager");
            this.f35515a = bVar;
        }
    }

    /* renamed from: com.google.android.play.core.ktx.b$c */
    public static final class C15732c extends C15729b {
        public C15732c(InstallState installState) {
            C19383o.m32798h(installState, "installState");
        }
    }

    /* renamed from: com.google.android.play.core.ktx.b$d */
    public static final class C15733d extends C15729b {

        /* renamed from: a */
        public static final C15733d f35516a = new C15733d();
    }
}
