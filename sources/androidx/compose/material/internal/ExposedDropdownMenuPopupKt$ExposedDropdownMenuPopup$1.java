package androidx.compose.material.internal;

import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import com.etsy.android.R;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ LayoutDirection $layoutDirection;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ PopupLayout $popupLayout;
    public final /* synthetic */ String $testTag;

    /* renamed from: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1$a */
    public static final class C1194a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ PopupLayout f2483a;

        public C1194a(PopupLayout popupLayout) {
            this.f2483a = popupLayout;
        }

        public final void dispose() {
            this.f2483a.disposeComposition();
            PopupLayout popupLayout = this.f2483a;
            popupLayout.setTag(R.id.view_tree_lifecycle_owner, (Object) null);
            popupLayout.f2489c.getViewTreeObserver().removeOnGlobalLayoutListener(popupLayout);
            popupLayout.f2490d.removeViewImmediate(popupLayout);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1(PopupLayout popupLayout, C19846a<C19394m> aVar, String str, LayoutDirection layoutDirection) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        PopupLayout popupLayout = this.$popupLayout;
        popupLayout.f2490d.addView(popupLayout, popupLayout.f2491e);
        this.$popupLayout.mo5276a(this.$onDismissRequest, this.$testTag, this.$layoutDirection);
        return new C1194a(this.$popupLayout);
    }
}
