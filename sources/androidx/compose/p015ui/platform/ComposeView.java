package androidx.compose.p015ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.ComposeView */
public final class ComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    private final C1338j0<C19861p<C1302d, Integer, C19394m>> content;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public void Content(C1302d dVar, int i) {
        ComposerImpl h = dVar.mo5440h(420213850);
        C19861p value = this.content.getValue();
        if (value != null) {
            value.invoke(h, 0);
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ComposeView$Content$1(this, i);
        }
    }

    public CharSequence getAccessibilityClassName() {
        Class<ComposeView> cls = ComposeView.class;
        return "androidx.compose.ui.platform.ComposeView";
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(pVar);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.content = C0761x.m1751w0((Object) null, C1351n1.f2948a);
    }
}
