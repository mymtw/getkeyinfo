package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class CoreTextFieldKt$CoreTextField$3 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ TextFieldSelectionManager $manager;

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$a */
    public static final class C0899a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ TextFieldSelectionManager f1911a;

        public C0899a(TextFieldSelectionManager textFieldSelectionManager) {
            this.f1911a = textFieldSelectionManager;
        }

        public final void dispose() {
            this.f1911a.mo4652k();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$3(TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.$manager = textFieldSelectionManager;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C0899a(this.$manager);
    }
}
