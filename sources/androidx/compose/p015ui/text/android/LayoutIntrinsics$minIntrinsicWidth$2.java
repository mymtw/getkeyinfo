package androidx.compose.p015ui.text.android;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsics$minIntrinsicWidth$2 */
final class LayoutIntrinsics$minIntrinsicWidth$2 extends Lambda implements C19846a<Float> {
    public final /* synthetic */ CharSequence $charSequence;
    public final /* synthetic */ TextPaint $textPaint;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$minIntrinsicWidth$2(CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.$charSequence = charSequence;
        this.$textPaint = textPaint;
    }

    public final Float invoke() {
        CharSequence charSequence = this.$charSequence;
        TextPaint textPaint = this.$textPaint;
        C19383o.m32797g(charSequence, "text");
        C19383o.m32797g(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new C1917a(charSequence.length(), charSequence));
        int i = 0;
        PriorityQueue priorityQueue = new PriorityQueue(10, new C1921d(0));
        int next = lineInstance.next();
        while (true) {
            int i2 = i;
            i = next;
            int i3 = i2;
            if (i == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i3), Integer.valueOf(i)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < i - i3) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i3), Integer.valueOf(i)));
                }
            }
            next = lineInstance.next();
        }
        float f = 0.0f;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue(), textPaint));
        }
        return Float.valueOf(f);
    }
}
