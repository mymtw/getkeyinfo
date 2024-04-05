package androidx.compose.p015ui.platform;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1320f;
import androidx.compose.runtime.C1330i;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.WrappedComposition */
final class WrappedComposition implements C1320f, C2885q {

    /* renamed from: b */
    public final AndroidComposeView f4059b;

    /* renamed from: c */
    public final C1320f f4060c;

    /* renamed from: d */
    public boolean f4061d;

    /* renamed from: e */
    public Lifecycle f4062e;

    /* renamed from: f */
    public C19861p<? super C1302d, ? super Integer, C19394m> f4063f = ComposableSingletons$Wrapper_androidKt.f4014a;

    public WrappedComposition(AndroidComposeView androidComposeView, C1330i iVar) {
        this.f4059b = androidComposeView;
        this.f4060c = iVar;
    }

    public final void dispose() {
        if (!this.f4061d) {
            this.f4061d = true;
            this.f4059b.getView().setTag(R.id.wrapped_composition_tag, (Object) null);
            Lifecycle lifecycle = this.f4062e;
            if (lifecycle != null) {
                lifecycle.mo10735c(this);
            }
        }
        this.f4060c.dispose();
    }

    /* renamed from: f */
    public final void mo5795f(C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        this.f4059b.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, pVar));
    }

    public final boolean isDisposed() {
        return this.f4060c.isDisposed();
    }

    /* renamed from: n */
    public final boolean mo5797n() {
        return this.f4060c.mo5797n();
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event == Lifecycle.Event.ON_CREATE && !this.f4061d) {
            mo5795f(this.f4063f);
        }
    }
}
