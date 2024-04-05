package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SelectionContainerKt$SelectionContainer$4 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ SelectionManager $manager;

    /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$a */
    public static final class C0975a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ SelectionManager f2058a;

        public C0975a(SelectionManager selectionManager) {
            this.f2058a = selectionManager;
        }

        public final void dispose() {
            this.f2058a.mo4613e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$4(SelectionManager selectionManager) {
        super(1);
        this.$manager = selectionManager;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C0975a(this.$manager);
    }
}
