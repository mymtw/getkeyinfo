package com.reddit.indicatorfastscroll;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C2322o0;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.reddit.indicatorfastscroll.C17346a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C19322o;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C19410j;
import kotlinx.coroutines.C19543e0;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;
import p764pq.C20056h;
import p764pq.C20057i;

public final class FastScrollerView extends LinearLayout {
    public static final /* synthetic */ C19410j[] $$delegatedProperties;
    public static final C17342a Companion = new C17342a();
    private static final int[] MOTIONEVENT_STOP_ACTIONS = {1, 3};
    /* access modifiers changed from: private */
    public RecyclerView.Adapter<?> adapter;
    private final RecyclerView.C3091i adapterDataObserver;
    private C19857l<? super Integer, ? extends C17346a> getItemIndicator;
    private final C17351d iconColor$delegate;
    /* access modifiers changed from: private */
    public boolean isUpdateItemIndicatorsPosted;
    private final List<C17343b> itemIndicatorSelectedCallbacks;
    private C17350c itemIndicatorsBuilder;
    private final List<Pair<C17346a, Integer>> itemIndicatorsWithPositions;
    private Integer lastSelectedPosition;
    private C19857l<? super Boolean, C19394m> onItemIndicatorTouched;
    /* access modifiers changed from: private */
    public RecyclerView recyclerView;
    private final C17351d showIndicator$delegate;
    private final C17351d textAppearanceRes$delegate;
    private final C17351d textColor$delegate;
    private final C17351d textPadding$delegate;
    private boolean useDefaultScroller;

    /* renamed from: com.reddit.indicatorfastscroll.FastScrollerView$a */
    public static final class C17342a {
    }

    /* renamed from: com.reddit.indicatorfastscroll.FastScrollerView$b */
    public interface C17343b {
        void onItemIndicatorSelected(C17346a aVar, int i, int i2);
    }

    /* renamed from: com.reddit.indicatorfastscroll.FastScrollerView$c */
    public static final class C17344c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ FastScrollerView f37875b;

        public C17344c(FastScrollerView fastScrollerView) {
            this.f37875b = fastScrollerView;
        }

        public final void run() {
            RecyclerView access$getRecyclerView$p = this.f37875b.recyclerView;
            if (access$getRecyclerView$p != null) {
                if (access$getRecyclerView$p.isAttachedToWindow() && access$getRecyclerView$p.getAdapter() != null) {
                    this.f37875b.updateItemIndicators();
                }
                this.f37875b.isUpdateItemIndicatorsPosted = false;
                return;
            }
            C19383o.m32803m();
            throw null;
        }
    }

    /* renamed from: com.reddit.indicatorfastscroll.FastScrollerView$d */
    public static final class C17345d implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final /* synthetic */ FastScrollerView f37876b;

        /* renamed from: c */
        public final /* synthetic */ RecyclerView f37877c;

        public C17345d(FastScrollerView fastScrollerView, RecyclerView recyclerView) {
            this.f37876b = fastScrollerView;
            this.f37877c = recyclerView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f37877c.getAdapter() != this.f37876b.adapter) {
                this.f37876b.setAdapter(this.f37877c.getAdapter());
            }
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C19386q.m32807a(FastScrollerView.class), "iconColor", "getIconColor()Landroid/content/res/ColorStateList;");
        C19386q.f43269a.getClass();
        $$delegatedProperties = new C19410j[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(C19386q.m32807a(FastScrollerView.class), "textAppearanceRes", "getTextAppearanceRes()I"), new MutablePropertyReference1Impl(C19386q.m32807a(FastScrollerView.class), "textColor", "getTextColor()Landroid/content/res/ColorStateList;"), new MutablePropertyReference1Impl(C19386q.m32807a(FastScrollerView.class), "textPadding", "getTextPadding()F"), new MutablePropertyReference1Impl(C19386q.m32807a(FastScrollerView.class), "showIndicator", "getShowIndicator()Lkotlin/jvm/functions/Function3;")};
    }

    public FastScrollerView(Context context) {
        this(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
    }

    public FastScrollerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (DefaultConstructorMarker) null);
    }

    public FastScrollerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FastScrollerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.indicatorFastScrollerStyle : i, (i3 & 8) != 0 ? 2132018415 : i2);
    }

    /* access modifiers changed from: private */
    public final void bindItemIndicatorViews() {
        removeAllViews();
        if (!this.itemIndicatorsWithPositions.isEmpty()) {
            FastScrollerView$bindItemIndicatorViews$1 fastScrollerView$bindItemIndicatorViews$1 = new FastScrollerView$bindItemIndicatorViews$1(this);
            FastScrollerView$bindItemIndicatorViews$2 fastScrollerView$bindItemIndicatorViews$2 = new FastScrollerView$bindItemIndicatorViews$2(this);
            ArrayList<C19846a> arrayList = new ArrayList<>();
            List<C17346a> itemIndicators = getItemIndicators();
            int i = 0;
            while (i <= C17782b.m29859Y(itemIndicators)) {
                List<C17346a> subList = itemIndicators.subList(i, itemIndicators.size());
                ArrayList arrayList2 = new ArrayList();
                for (T next : subList) {
                    if (!(((C17346a) next) instanceof C17346a.C17348b)) {
                        break;
                    }
                    arrayList2.add(next);
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new FastScrollerView$bindItemIndicatorViews$$inlined$run$lambda$1(arrayList2, arrayList, fastScrollerView$bindItemIndicatorViews$2, fastScrollerView$bindItemIndicatorViews$1));
                    i = arrayList2.size() + i;
                } else {
                    C17346a aVar = itemIndicators.get(i);
                    if (aVar instanceof C17346a.C17347a) {
                        arrayList.add(new FastScrollerView$bindItemIndicatorViews$$inlined$run$lambda$2(aVar, arrayList, fastScrollerView$bindItemIndicatorViews$2, fastScrollerView$bindItemIndicatorViews$1));
                    } else if (aVar instanceof C17346a.C17348b) {
                        throw new IllegalStateException("Text indicator wasn't batched");
                    }
                    i++;
                }
            }
            for (C19846a invoke : arrayList) {
                addView((View) invoke.invoke());
            }
        }
    }

    private final boolean isSetup() {
        return this.recyclerView != null;
    }

    /* access modifiers changed from: private */
    public final void postUpdateItemIndicators() {
        if (!this.isUpdateItemIndicatorsPosted) {
            this.isUpdateItemIndicatorsPosted = true;
            post(new C17344c(this));
        }
    }

    private final void scrollToPosition(int i) {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.stopScroll();
            recyclerView2.smoothScrollToPosition(i);
            return;
        }
        C19383o.m32803m();
        throw null;
    }

    private final void selectItemIndicator(C17346a aVar, int i) {
        for (Pair pair : this.itemIndicatorsWithPositions) {
            if (C19383o.m32792b((C17346a) pair.getFirst(), aVar)) {
                int intValue = ((Number) pair.getSecond()).intValue();
                Integer num = this.lastSelectedPosition;
                if (num == null || intValue != num.intValue()) {
                    this.lastSelectedPosition = Integer.valueOf(intValue);
                    if (this.useDefaultScroller) {
                        scrollToPosition(intValue);
                    }
                    performHapticFeedback(Build.VERSION.SDK_INT >= 27 ? 9 : 3);
                    for (C17343b onItemIndicatorSelected : this.itemIndicatorSelectedCallbacks) {
                        onItemIndicatorSelected.onItemIndicatorSelected(aVar, i, intValue);
                    }
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* access modifiers changed from: private */
    public final void setAdapter(RecyclerView.Adapter<?> adapter2) {
        RecyclerView.Adapter<?> adapter3 = this.adapter;
        if (adapter3 != null) {
            adapter3.unregisterAdapterDataObserver(this.adapterDataObserver);
        }
        this.adapter = adapter2;
        if (adapter2 != null) {
            adapter2.registerAdapterDataObserver(this.adapterDataObserver);
            postUpdateItemIndicators();
        }
    }

    public static /* synthetic */ void setupWithRecyclerView$default(FastScrollerView fastScrollerView, RecyclerView recyclerView2, C19857l lVar, C19862q qVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            qVar = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        fastScrollerView.setupWithRecyclerView(recyclerView2, lVar, qVar, z);
    }

    /* access modifiers changed from: private */
    public final void updateItemIndicators() {
        this.itemIndicatorsWithPositions.clear();
        C17350c cVar = this.itemIndicatorsBuilder;
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            C19857l<? super Integer, ? extends C17346a> lVar = this.getItemIndicator;
            if (lVar != null) {
                C19862q<C17346a, Integer, Integer, Boolean> showIndicator = getShowIndicator();
                cVar.getClass();
                RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
                if (adapter2 != null) {
                    int i = 0;
                    C20057i D0 = C19388s.m32816D0(0, adapter2.getItemCount());
                    ArrayList arrayList = new ArrayList();
                    C20056h l = D0.iterator();
                    while (l.f44419d) {
                        int nextInt = l.nextInt();
                        C17346a aVar = (C17346a) lVar.invoke(Integer.valueOf(nextInt));
                        Pair pair = aVar != null ? new Pair(aVar, Integer.valueOf(nextInt)) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (hashSet.add(((Pair) next).getFirst())) {
                            arrayList2.add(next);
                        }
                    }
                    if (showIndicator != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                if (showIndicator.invoke((C17346a) ((Pair) next2).component1(), Integer.valueOf(i), Integer.valueOf(arrayList2.size())).booleanValue()) {
                                    arrayList3.add(next2);
                                }
                                i = i2;
                            } else {
                                C17782b.m29877o0();
                                throw null;
                            }
                        }
                        arrayList2 = arrayList3;
                    }
                    C19327t.m32658n1(arrayList2, this.itemIndicatorsWithPositions);
                    bindItemIndicatorViews();
                    return;
                }
                C19383o.m32803m();
                throw null;
            }
            C19383o.m32805o("getItemIndicator");
            throw null;
        }
        C19383o.m32803m();
        throw null;
    }

    public final ColorStateList getIconColor() {
        return (ColorStateList) this.iconColor$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final List<C17343b> getItemIndicatorSelectedCallbacks() {
        return this.itemIndicatorSelectedCallbacks;
    }

    public final List<C17346a> getItemIndicators() {
        List<Pair<C17346a, Integer>> list = this.itemIndicatorsWithPositions;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (Pair first : list) {
            arrayList.add(first.getFirst());
        }
        return arrayList;
    }

    public final C17350c getItemIndicatorsBuilder$indicator_fast_scroll_release() {
        return this.itemIndicatorsBuilder;
    }

    public final C19857l<Boolean, C19394m> getOnItemIndicatorTouched$indicator_fast_scroll_release() {
        return this.onItemIndicatorTouched;
    }

    public final C19862q<C17346a, Integer, Integer, Boolean> getShowIndicator() {
        return (C19862q) this.showIndicator$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final int getTextAppearanceRes() {
        return ((Number) this.textAppearanceRes$delegate.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final ColorStateList getTextColor() {
        return (ColorStateList) this.textColor$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final float getTextPadding() {
        return ((Number) this.textPadding$delegate.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final boolean getUseDefaultScroller() {
        return this.useDefaultScroller;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C19383o.m32798h(motionEvent, "event");
        int[] iArr = MOTIONEVENT_STOP_ACTIONS;
        int action = motionEvent.getAction();
        C19383o.m32797g(iArr, "<this>");
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (action == iArr[i]) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            setPressed(false);
            this.lastSelectedPosition = null;
            C19857l<? super Boolean, C19394m> lVar = this.onItemIndicatorTouched;
            if (lVar != null) {
                C19394m invoke = lVar.invoke(Boolean.FALSE);
            }
            return false;
        }
        int y = (int) motionEvent.getY();
        Iterator<View> it = C19543e0.m33298O(this).iterator();
        while (true) {
            C2322o0 o0Var = (C2322o0) it;
            if (o0Var.hasNext()) {
                View view = (View) o0Var.next();
                if (FastScrollerView$onTouchEvent$1.INSTANCE.invoke(view, y)) {
                    if (view instanceof ImageView) {
                        ImageView imageView = (ImageView) view;
                        Object tag = imageView.getTag();
                        if (tag != null) {
                            selectItemIndicator((C17346a.C17347a) tag, (imageView.getHeight() / 2) + ((int) imageView.getY()));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.reddit.indicatorfastscroll.FastScrollItemIndicator.Icon");
                        }
                    } else if (!(view instanceof TextView)) {
                        continue;
                    } else {
                        TextView textView = (TextView) view;
                        Object tag2 = textView.getTag();
                        if (tag2 != null) {
                            List list = (List) tag2;
                            int height = textView.getHeight() / list.size();
                            int min = Math.min((y - textView.getTop()) / height, C17782b.m29859Y(list));
                            selectItemIndicator((C17346a.C17348b) list.get(min), (min * height) + (height / 2) + ((int) textView.getY()));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.reddit.indicatorfastscroll.FastScrollItemIndicator.Text>");
                        }
                    }
                    z = true;
                }
            } else {
                setPressed(z);
                C19857l<? super Boolean, C19394m> lVar2 = this.onItemIndicatorTouched;
                if (lVar2 != null) {
                    C19394m invoke2 = lVar2.invoke(Boolean.valueOf(z));
                }
                return z;
            }
        }
    }

    public final void setIconColor(ColorStateList colorStateList) {
        this.iconColor$delegate.mo68379a(this, $$delegatedProperties[0], colorStateList);
    }

    public final void setItemIndicatorsBuilder$indicator_fast_scroll_release(C17350c cVar) {
        C19383o.m32798h(cVar, "<set-?>");
        this.itemIndicatorsBuilder = cVar;
    }

    public final void setOnItemIndicatorTouched$indicator_fast_scroll_release(C19857l<? super Boolean, C19394m> lVar) {
        this.onItemIndicatorTouched = lVar;
    }

    public final void setShowIndicator(C19862q<? super C17346a, ? super Integer, ? super Integer, Boolean> qVar) {
        this.showIndicator$delegate.mo68379a(this, $$delegatedProperties[4], qVar);
    }

    public final void setTextAppearanceRes(int i) {
        this.textAppearanceRes$delegate.mo68379a(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.textColor$delegate.mo68379a(this, $$delegatedProperties[2], colorStateList);
    }

    public final void setTextPadding(float f) {
        this.textPadding$delegate.mo68379a(this, $$delegatedProperties[3], Float.valueOf(f));
    }

    public final void setUseDefaultScroller(boolean z) {
        this.useDefaultScroller = z;
    }

    public final void setupWithRecyclerView(RecyclerView recyclerView2, C19857l<? super Integer, ? extends C17346a> lVar) {
        setupWithRecyclerView$default(this, recyclerView2, lVar, (C19862q) null, false, 12, (Object) null);
    }

    public final void setupWithRecyclerView(RecyclerView recyclerView2, C19857l<? super Integer, ? extends C17346a> lVar, C19862q<? super C17346a, ? super Integer, ? super Integer, Boolean> qVar) {
        setupWithRecyclerView$default(this, recyclerView2, lVar, qVar, false, 8, (Object) null);
    }

    public final void setupWithRecyclerView(RecyclerView recyclerView2, C19857l<? super Integer, ? extends C17346a> lVar, C19862q<? super C17346a, ? super Integer, ? super Integer, Boolean> qVar, boolean z) {
        C19383o.m32798h(recyclerView2, "recyclerView");
        C19383o.m32798h(lVar, "getItemIndicator");
        if (!isSetup()) {
            this.recyclerView = recyclerView2;
            this.getItemIndicator = lVar;
            setShowIndicator(qVar);
            this.useDefaultScroller = z;
            RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                updateItemIndicators();
            }
            setAdapter(adapter2);
            recyclerView2.addOnLayoutChangeListener(new C17345d(this, recyclerView2));
            return;
        }
        throw new IllegalStateException("Only set this view's RecyclerView once!".toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C19383o.m32798h(context, ResponseConstants.CONTEXT);
        this.iconColor$delegate = new C17351d(new FastScrollerView$iconColor$2(this));
        this.textAppearanceRes$delegate = new C17351d(new FastScrollerView$textAppearanceRes$2(this));
        this.textColor$delegate = new C17351d(new FastScrollerView$textColor$2(this));
        this.textPadding$delegate = new C17351d(new FastScrollerView$textPadding$2(this));
        this.itemIndicatorsBuilder = new C17350c();
        this.itemIndicatorSelectedCallbacks = new ArrayList();
        Companion.getClass();
        this.adapterDataObserver = new C17349b(this);
        this.showIndicator$delegate = new C17351d(new FastScrollerView$showIndicator$2(this));
        this.useDefaultScroller = true;
        ArrayList arrayList = new ArrayList();
        this.itemIndicatorsWithPositions = arrayList;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C18263b.f40073k0, i, i2);
        C19383o.m32793c(obtainStyledAttributes, "context.theme.obtainStyl…,\n      defStyleRes\n    )");
        C17782b.m29876n0(this, 2132018415, new FastScrollerView$$special$$inlined$use$lambda$1(obtainStyledAttributes, this));
        C19394m mVar = C19394m.f43287a;
        obtainStyledAttributes.recycle();
        setFocusableInTouchMode(true);
        setClickable(true);
        setOrientation(1);
        setGravity(17);
        if (isInEditMode()) {
            C19324q.m32628J0(C17782b.m29865e0(new Pair(new C17346a.C17348b("A"), 0), new Pair(new C17346a.C17348b("B"), 1), new Pair(new C17346a.C17348b("C"), 2), new Pair(new C17346a.C17348b("D"), 3), new Pair(new C17346a.C17348b("E"), 4)), arrayList);
            bindItemIndicatorViews();
        }
    }
}
