package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.layout.C1667b;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1 */
public final class OneDimensionalFocusSearchKt$generateAndSearchChildren$1 extends Lambda implements C19857l<C1667b.C1668a, Boolean> {
    public final /* synthetic */ int $direction;
    public final /* synthetic */ FocusModifier $focusedItem;
    public final /* synthetic */ C19857l<FocusModifier, Boolean> $onFound;
    public final /* synthetic */ FocusModifier $this_generateAndSearchChildren;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusModifier focusModifier, FocusModifier focusModifier2, int i, C19857l<? super FocusModifier, Boolean> lVar) {
        super(1);
        this.$this_generateAndSearchChildren = focusModifier;
        this.$focusedItem = focusModifier2;
        this.$direction = i;
        this.$onFound = lVar;
    }

    public final Boolean invoke(C1667b.C1668a aVar) {
        C19383o.m32797g(aVar, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.m3110e(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound));
        if (valueOf.booleanValue() || !aVar.mo4358a()) {
            return valueOf;
        }
        return null;
    }
}
