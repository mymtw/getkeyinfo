package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.lifecycle.C2887s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class BackHandlerKt$BackHandler$2 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C0108b $backCallback;
    public final /* synthetic */ OnBackPressedDispatcher $backDispatcher;
    public final /* synthetic */ C2887s $lifecycleOwner;

    /* renamed from: androidx.activity.compose.BackHandlerKt$BackHandler$2$a */
    public static final class C0105a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C0108b f152a;

        public C0105a(C0108b bVar) {
            this.f152a = bVar;
        }

        public final void dispose() {
            this.f152a.mo1125b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$2(OnBackPressedDispatcher onBackPressedDispatcher, C2887s sVar, C0108b bVar) {
        super(1);
        this.$backDispatcher = onBackPressedDispatcher;
        this.$lifecycleOwner = sVar;
        this.$backCallback = bVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        this.$backDispatcher.mo1104a(this.$lifecycleOwner, this.$backCallback);
        return new C0105a(this.$backCallback);
    }
}
