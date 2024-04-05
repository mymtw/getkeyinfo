package androidx.compose.p015ui.graphics;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.Vertices$outOfBounds$1 */
final class Vertices$outOfBounds$1 extends Lambda implements C19857l<Integer, Boolean> {
    public final /* synthetic */ List<C8343c> $positions;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Vertices$outOfBounds$1(List<C8343c> list) {
        super(1);
        this.$positions = list;
    }

    public final Boolean invoke(int i) {
        return Boolean.valueOf(i < 0 || i >= this.$positions.size());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
