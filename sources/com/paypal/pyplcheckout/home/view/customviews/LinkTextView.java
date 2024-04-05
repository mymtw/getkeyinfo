package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import android.support.p013v4.media.C0070b;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.C9053d;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p260v0.C8184a;
import p568fn.C17782b;
import p753kq.C19846a;

public final class LinkTextView extends AppCompatTextView {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final List<C19846a<C19394m>> actions = new ArrayList();
    private boolean hasLoggedErrors;

    public static final class Span {
        private final int end;
        private final int start;

        public Span(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public static /* synthetic */ Span copy$default(Span span, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = span.start;
            }
            if ((i3 & 2) != 0) {
                i2 = span.end;
            }
            return span.copy(i, i2);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final Span copy(int i, int i2) {
            return new Span(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Span)) {
                return false;
            }
            Span span = (Span) obj;
            return this.start == span.start && this.end == span.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
        }

        public String toString() {
            return C0070b.m183e("Span(start=", this.start, ", end=", this.end, ")");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(attributeSet, "attributeSet");
    }

    private final void checkForMissingLinks(List<Span> list) {
        if (list.size() < this.actions.size()) {
            logMissingLinks(list);
            if (this.actions.size() == 1) {
                setOnClickListener(new C9053d(this, 7));
                return;
            }
            return;
        }
        setOnClickListener((View.OnClickListener) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: checkForMissingLinks$lambda-7  reason: not valid java name */
    public static final void m35286checkForMissingLinks$lambda7(LinkTextView linkTextView, View view) {
        C19383o.m32797g(linkTextView, "this$0");
        C19846a aVar = (C19846a) C19327t.m32640V0(linkTextView.actions);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final ClickableSpan getClickableSpan(int i) {
        C19846a aVar = (C19846a) C19327t.m32641W0(i, this.actions);
        if (aVar == null) {
            return null;
        }
        return new LinkTextView$getClickableSpan$1(aVar);
    }

    private final List<Span> getSpans(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object next : C19459m.m33056y1(str, new String[]{str2}, 0, 6)) {
            int i3 = i + 1;
            if (i >= 0) {
                String a1 = C19457k.m33023a1(C19457k.m33023a1((String) next, "#b", "", false), "#l", "", false);
                if (i % 2 != 0) {
                    arrayList.add(new Span(i2, a1.length() + i2));
                }
                i2 += a1.length();
                i = i3;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        return arrayList;
    }

    private final synchronized void logMissingLinks(List<Span> list) {
        synchronized (this) {
            if (!this.hasLoggedErrors) {
                Class<LinkTextView> cls = LinkTextView.class;
                PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
                PEnums.EventCode eventCode = PEnums.EventCode.E103;
                PLog.error$default(errorType, eventCode, "LinkTextView" + ": missing link in string. Expected " + this.actions.size() + ", got: " + list.size(), (String) null, (Throwable) null, PEnums.TransitionName.SHOW_LINK_TEXT, (PEnums.StateName) null, "spans: " + list, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1880, (Object) null);
                this.hasLoggedErrors = true;
            }
        }
    }

    private final C19846a<C19394m> toOpenUrlAction(String str) {
        return new LinkTextView$toOpenUrlAction$1(this, str);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final LinkTextView addActions(C19846a<C19394m>... aVarArr) {
        C19383o.m32797g(aVarArr, "newActions");
        C19324q.m32629K0(this.actions, aVarArr);
        update();
        return this;
    }

    public final LinkTextView addLinks(String... strArr) {
        C19383o.m32797g(strArr, "links");
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            arrayList.add(toOpenUrlAction(str));
        }
        this.actions.addAll(arrayList);
        update();
        return this;
    }

    public final void clearActions() {
        this.actions.clear();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        update();
    }

    public final void setActions(C19846a<C19394m>... aVarArr) {
        C19383o.m32797g(aVarArr, "newActions");
        clearActions();
        addActions((C19846a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public final synchronized void setLinkText(String str, String... strArr) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(strArr, "links");
        CharSequence text = getText();
        if (!C19383o.m32792b(text.toString(), C19457k.m33023a1(C19457k.m33023a1(str, "#b", "", false), "#l", "", false))) {
            setText(str);
            setLinks((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final void setLinks(String... strArr) {
        C19383o.m32797g(strArr, "links");
        clearActions();
        addLinks((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void update() {
        String obj = getText().toString();
        int i = 0;
        SpannableString spannableString = new SpannableString(C19457k.m33023a1(C19457k.m33023a1(obj, "#l", "", false), "#b", "", false));
        List<Span> spans = getSpans(obj, "#l");
        List<Span> spans2 = getSpans(obj, "#b");
        for (T next : spans) {
            int i2 = i + 1;
            if (i >= 0) {
                Span span = (Span) next;
                Context context = getContext();
                int i3 = C17165R.color.blue_color_600;
                Object obj2 = C8184a.f17966a;
                spannableString.setSpan(new ForegroundColorSpan(C8184a.C8188d.m16468a(context, i3)), span.getStart(), span.getEnd(), 17);
                ClickableSpan clickableSpan = getClickableSpan(i);
                if (clickableSpan != null) {
                    spannableString.setSpan(clickableSpan, span.getStart(), span.getEnd(), 17);
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        for (Span span2 : spans2) {
            spannableString.setSpan(new StyleSpan(1), span2.getStart(), span2.getEnd(), 17);
        }
        setText(spannableString);
        setMovementMethod(LinkMovementMethod.getInstance());
        checkForMissingLinks(spans);
    }
}
