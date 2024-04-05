package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class SpannableBuilder extends SpannableStringBuilder {
    private final Class<?> mWatcherClass;
    private final List<C2657a> mWatchers = new ArrayList();

    /* renamed from: androidx.emoji2.text.SpannableBuilder$a */
    public static class C2657a implements TextWatcher, SpanWatcher {

        /* renamed from: b */
        public final Object f5999b;

        /* renamed from: c */
        public final AtomicInteger f6000c = new AtomicInteger(0);

        public C2657a(Object obj) {
            this.f5999b = obj;
        }

        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f5999b).afterTextChanged(editable);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f5999b).beforeTextChanged(charSequence, i, i2, i3);
        }

        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f6000c.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.f5999b).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f6000c.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.f5999b).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f6000c.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.f5999b).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f5999b).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public SpannableBuilder(Class<?> cls) {
        if (cls != null) {
            this.mWatcherClass = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    private void blockWatchers() {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).f6000c.incrementAndGet();
        }
    }

    public static SpannableBuilder create(Class<?> cls, CharSequence charSequence) {
        return new SpannableBuilder(cls, charSequence);
    }

    private void fireWatchers() {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    private C2657a getWatcherFor(Object obj) {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            C2657a aVar = this.mWatchers.get(i);
            if (aVar.f5999b == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean isWatcher(Object obj) {
        return obj != null && isWatcher(obj.getClass());
    }

    private void unblockwatchers() {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).f6000c.decrementAndGet();
        }
    }

    public void beginBatchEdit() {
        blockWatchers();
    }

    public void endBatchEdit() {
        unblockwatchers();
        fireWatchers();
    }

    public int getSpanEnd(Object obj) {
        C2657a watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        C2657a watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        C2657a watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!isWatcher((Class<?>) cls)) {
            return super.getSpans(i, i2, cls);
        }
        C2657a[] aVarArr = (C2657a[]) super.getSpans(i, i2, C2657a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f5999b;
        }
        return tArr;
    }

    public int nextSpanTransition(int i, int i2, Class<C2657a> cls) {
        if (cls == null || isWatcher((Class<?>) cls)) {
            cls = C2657a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        C2657a aVar;
        if (isWatcher(obj)) {
            aVar = getWatcherFor(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.mWatchers.remove(aVar);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (isWatcher(obj)) {
            C2657a aVar = new C2657a(obj);
            this.mWatchers.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new SpannableBuilder(this.mWatcherClass, this, i, i2);
    }

    private boolean isWatcher(Class<?> cls) {
        return this.mWatcherClass == cls;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        blockWatchers();
        super.replace(i, i2, charSequence);
        unblockwatchers();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public SpannableBuilder(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        if (cls != null) {
            this.mWatcherClass = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        blockWatchers();
        super.replace(i, i2, charSequence, i3, i4);
        unblockwatchers();
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableBuilder(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        if (cls != null) {
            this.mWatcherClass = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
