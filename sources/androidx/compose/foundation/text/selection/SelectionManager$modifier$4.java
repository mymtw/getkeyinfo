package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.p015ui.input.key.C1612b;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SelectionManager$modifier$4 extends Lambda implements C19857l<C1612b, Boolean> {
    public final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$4(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m34724invokeZmokQxo(((C1612b) obj).f3587a);
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m34724invokeZmokQxo(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "it");
        return false;
    }
}
