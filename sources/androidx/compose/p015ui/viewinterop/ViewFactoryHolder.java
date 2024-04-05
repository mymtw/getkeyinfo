package androidx.compose.p015ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.platform.AbstractComposeView;
import androidx.compose.runtime.C1324g;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {
    private C19857l<? super Context, ? extends T> factory;
    private T typedView;
    private C19857l<? super T, C19394m> updateBlock;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewFactoryHolder(Context context, C1324g gVar, NestedScrollDispatcher nestedScrollDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : gVar, (i & 4) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher);
    }

    public final C19857l<Context, T> getFactory() {
        return this.factory;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final T getTypedView$ui_release() {
        return this.typedView;
    }

    public final C19857l<T, C19394m> getUpdateBlock() {
        return this.updateBlock;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setFactory(C19857l<? super Context, ? extends T> lVar) {
        this.factory = lVar;
        if (lVar != null) {
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            T t = (View) lVar.invoke(context);
            this.typedView = t;
            setView$ui_release(t);
        }
    }

    public final void setTypedView$ui_release(T t) {
        this.typedView = t;
    }

    public final void setUpdateBlock(C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(lVar, "value");
        this.updateBlock = lVar;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(Context context, C1324g gVar, NestedScrollDispatcher nestedScrollDispatcher) {
        super(context, gVar, nestedScrollDispatcher);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(nestedScrollDispatcher, "dispatcher");
        this.updateBlock = AndroidView_androidKt.f4698a;
    }
}
