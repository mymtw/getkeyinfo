package com.etsy.android.p327ui.sdl;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.core.HttpMethod;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.vespa.PositionList;
import java.lang.ref.WeakReference;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p415of.C13182k;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.sdl.ServerDrivenActionDelegate */
public final class ServerDrivenActionDelegate implements C13182k {

    /* renamed from: b */
    public final C10722e f23628b;

    /* renamed from: c */
    public final C13461f f23629c;

    /* renamed from: d */
    public final WeakReference<Fragment> f23630d;

    /* renamed from: com.etsy.android.ui.sdl.ServerDrivenActionDelegate$a */
    public static final class C10714a {

        /* renamed from: a */
        public final C10722e f23631a;

        /* renamed from: b */
        public final C13461f f23632b;

        public C10714a(C10722e eVar, C13461f fVar, C8618c cVar) {
            C19383o.m32797g(eVar, "serverDrivenActionEndpoint");
            C19383o.m32797g(fVar, "rxSchedulers");
            C19383o.m32797g(cVar, "configMap");
            this.f23631a = eVar;
            this.f23632b = fVar;
        }
    }

    public ServerDrivenActionDelegate(C10722e eVar, C13461f fVar, Fragment fragment) {
        this.f23628b = eVar;
        this.f23629c = fVar;
        this.f23630d = new WeakReference<>(fragment);
    }

    public final void performAction(PositionList positionList, IServerDrivenAction iServerDrivenAction) {
        C19383o.m32797g(iServerDrivenAction, ResponseConstants.ACTION);
        if (C19383o.m32792b(iServerDrivenAction.getRequestMethod(), HttpMethod.GET.name())) {
            SubscribersKt.m32500e(C0391c.m1056b(this.f23629c, C0072d.m199f(this.f23629c, this.f23628b.mo35632a(iServerDrivenAction.getPath(), C19294b0.m32559p0()))), new ServerDrivenActionDelegate$performAction$1(this), new ServerDrivenActionDelegate$performAction$2(this));
        }
    }
}
