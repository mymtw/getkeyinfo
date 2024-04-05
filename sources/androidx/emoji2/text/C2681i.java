package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.C2665e;
import androidx.emoji2.text.C2689l;
import androidx.emoji2.text.flatbuffer.C2676a;
import p289y0.C8353e;

/* renamed from: androidx.emoji2.text.i */
public final class C2681i {

    /* renamed from: a */
    public final C2665e.C2674i f6037a;

    /* renamed from: b */
    public final C2689l f6038b;

    /* renamed from: c */
    public C2665e.C2669d f6039c;

    /* renamed from: androidx.emoji2.text.i$a */
    public static class C2682a implements C2665e.C2669d {

        /* renamed from: b */
        public static final ThreadLocal<StringBuilder> f6040b = new ThreadLocal<>();

        /* renamed from: a */
        public final TextPaint f6041a;

        public C2682a() {
            TextPaint textPaint = new TextPaint();
            this.f6041a = textPaint;
            textPaint.setTextSize(10.0f);
        }
    }

    /* renamed from: androidx.emoji2.text.i$b */
    public static final class C2683b {

        /* renamed from: a */
        public int f6042a = 1;

        /* renamed from: b */
        public final C2689l.C2690a f6043b;

        /* renamed from: c */
        public C2689l.C2690a f6044c;

        /* renamed from: d */
        public C2689l.C2690a f6045d;

        /* renamed from: e */
        public int f6046e;

        /* renamed from: f */
        public int f6047f;

        public C2683b(C2689l.C2690a aVar) {
            this.f6043b = aVar;
            this.f6044c = aVar;
        }

        /* renamed from: a */
        public final int mo10080a(int i) {
            SparseArray<C2689l.C2690a> sparseArray = this.f6044c.f6062a;
            C2689l.C2690a aVar = sparseArray == null ? null : sparseArray.get(i);
            int i2 = 3;
            if (this.f6042a != 2) {
                if (aVar == null) {
                    mo10081b();
                    i2 = 1;
                    this.f6046e = i;
                    return i2;
                }
                this.f6042a = 2;
                this.f6044c = aVar;
                this.f6047f = 1;
            } else if (aVar != null) {
                this.f6044c = aVar;
                this.f6047f++;
            } else {
                boolean z = false;
                if (i == 65038) {
                    mo10081b();
                } else {
                    if (i == 65039) {
                        z = true;
                    }
                    if (!z) {
                        C2689l.C2690a aVar2 = this.f6044c;
                        if (aVar2.f6063b != null) {
                            if (this.f6047f != 1) {
                                this.f6045d = aVar2;
                                mo10081b();
                            } else if (mo10082c()) {
                                this.f6045d = this.f6044c;
                                mo10081b();
                            } else {
                                mo10081b();
                            }
                            this.f6046e = i;
                            return i2;
                        }
                        mo10081b();
                    }
                }
                i2 = 1;
                this.f6046e = i;
                return i2;
            }
            i2 = 2;
            this.f6046e = i;
            return i2;
        }

        /* renamed from: b */
        public final void mo10081b() {
            this.f6042a = 1;
            this.f6044c = this.f6043b;
            this.f6047f = 0;
        }

        /* renamed from: c */
        public final boolean mo10082c() {
            C2676a d = this.f6044c.f6063b.mo10077d();
            int a = d.mo10072a(6);
            if ((a == 0 || d.f6028b.get(a + d.f6027a) == 0) ? false : true) {
                return true;
            }
            return this.f6046e == 65039;
        }
    }

    public C2681i(C2689l lVar, C2665e.C2674i iVar, C2682a aVar) {
        this.f6037a = iVar;
        this.f6038b = lVar;
        this.f6039c = aVar;
    }

    /* renamed from: a */
    public static boolean m6434a(Editable editable, KeyEvent keyEvent, boolean z) {
        EmojiSpan[] emojiSpanArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            int length = emojiSpanArr.length;
            int i = 0;
            while (i < length) {
                EmojiSpan emojiSpan = emojiSpanArr[i];
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo10079b(CharSequence charSequence, int i, int i2, C2680h hVar) {
        if (hVar.f6036c == 0) {
            C2665e.C2669d dVar = this.f6039c;
            C2676a d = hVar.mo10077d();
            int a = d.mo10072a(8);
            if (a != 0) {
                d.f6028b.getShort(a + d.f6027a);
            }
            C2682a aVar = (C2682a) dVar;
            aVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = C2682a.f6040b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = aVar.f6041a;
            String sb2 = sb.toString();
            int i3 = C8353e.f18324a;
            hVar.f6036c = textPaint.hasGlyph(sb2) ? 2 : 1;
        }
        return hVar.f6036c == 2;
    }
}
