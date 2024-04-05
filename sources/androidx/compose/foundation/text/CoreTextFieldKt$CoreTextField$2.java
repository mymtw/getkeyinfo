package androidx.compose.foundation.text;

import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class CoreTextFieldKt$CoreTextField$2 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ TextFieldState $state;

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$a */
    public static final class C0898a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ TextFieldState f1910a;

        public C0898a(TextFieldState textFieldState) {
            this.f1910a = textFieldState;
        }

        public final void dispose() {
            if (this.f1910a.mo4561b()) {
                CoreTextFieldKt.m1961e(this.f1910a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2(TextFieldState textFieldState) {
        super(1);
        this.$state = textFieldState;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C0898a(this.$state);
    }
}
