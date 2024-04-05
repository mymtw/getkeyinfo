package kotlin.text;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class StringsKt___StringsKt$windowedSequence$2 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ int $size;
    public final /* synthetic */ CharSequence $this_windowedSequence;
    public final /* synthetic */ C19857l<CharSequence, Object> $transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt___StringsKt$windowedSequence$2(int i, CharSequence charSequence, C19857l<? super CharSequence, Object> lVar) {
        super(1);
        this.$size = i;
        this.$this_windowedSequence = charSequence;
        this.$transform = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        int i2 = this.$size + i;
        if (i2 < 0 || i2 > this.$this_windowedSequence.length()) {
            i2 = this.$this_windowedSequence.length();
        }
        return this.$transform.invoke(this.$this_windowedSequence.subSequence(i, i2));
    }
}
