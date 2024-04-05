package androidx.compose.p015ui.window;

import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1 */
public final class AndroidDialog_androidKt$Dialog$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ DialogWrapper $dialog;

    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$a */
    public static final class C2076a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ DialogWrapper f4703a;

        public C2076a(DialogWrapper dialogWrapper) {
            this.f4703a = dialogWrapper;
        }

        public final void dispose() {
            this.f4703a.dismiss();
            this.f4703a.f4720e.disposeComposition();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$1(DialogWrapper dialogWrapper) {
        super(1);
        this.$dialog = dialogWrapper;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        this.$dialog.show();
        return new C2076a(this.$dialog);
    }
}
