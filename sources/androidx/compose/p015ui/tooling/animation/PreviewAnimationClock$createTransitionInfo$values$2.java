package androidx.compose.p015ui.tooling.animation;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.core.C0431i0;
import androidx.compose.animation.core.C0432j;
import androidx.compose.animation.core.Transition;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.ClassUtils;
import p003a2.C0015b;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.tooling.animation.PreviewAnimationClock$createTransitionInfo$values$2 */
final class PreviewAnimationClock$createTransitionInfo$values$2 extends Lambda implements C19846a<Map<Long, Object>> {
    public final /* synthetic */ long $endTimeMs;
    public final /* synthetic */ C19285c<Long> $startTimeMs$delegate;
    public final /* synthetic */ long $stepMs;
    public final /* synthetic */ Transition<Object>.d<Object, C0432j> $this_createTransitionInfo;
    public final /* synthetic */ C2052c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClock$createTransitionInfo$values$2(Transition<Object>.d<Object, C0432j> dVar, C2052c cVar, long j, long j2, C19285c<Long> cVar2) {
        super(0);
        this.$this_createTransitionInfo = dVar;
        this.this$0 = cVar;
        this.$endTimeMs = j;
        this.$stepMs = j2;
        this.$startTimeMs$delegate = cVar2;
    }

    public final Map<Long, Object> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long valueOf = Long.valueOf(this.$startTimeMs$delegate.getValue().longValue());
        C0431i0<Object, C0432j> d = this.$this_createTransitionInfo.mo3423d();
        C2052c cVar = this.this$0;
        long longValue = this.$startTimeMs$delegate.getValue().longValue();
        cVar.getClass();
        linkedHashMap.put(valueOf, d.mo3468f(longValue * 1000000));
        Long valueOf2 = Long.valueOf(this.$endTimeMs);
        C0431i0<Object, C0432j> d2 = this.$this_createTransitionInfo.mo3423d();
        C2052c cVar2 = this.this$0;
        long j = this.$endTimeMs;
        cVar2.getClass();
        linkedHashMap.put(valueOf2, d2.mo3468f(j * 1000000));
        long longValue2 = this.$startTimeMs$delegate.getValue().longValue();
        long j2 = this.$stepMs;
        if (j2 > 0) {
            long I = C1993m.m4348I(longValue2, this.$endTimeMs, j2);
            if (longValue2 <= I) {
                while (true) {
                    Long valueOf3 = Long.valueOf(longValue2);
                    C0431i0<Object, C0432j> d3 = this.$this_createTransitionInfo.mo3423d();
                    this.this$0.getClass();
                    linkedHashMap.put(valueOf3, d3.mo3468f(longValue2 * 1000000));
                    if (longValue2 == I) {
                        break;
                    }
                    longValue2 += this.$stepMs;
                }
            }
            return linkedHashMap;
        }
        throw new IllegalArgumentException(C0015b.m91j(C0072d.m201h("Step must be positive, was: "), this.$stepMs, ClassUtils.PACKAGE_SEPARATOR_CHAR));
    }
}
