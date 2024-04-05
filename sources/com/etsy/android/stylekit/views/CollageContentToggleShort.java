package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import p388lb.C13006a;
import p435rb.C13350a;
import p435rb.C13351b;
import p753kq.C19846a;

public final class CollageContentToggleShort extends AppCompatButton {
    public static final int $stable = 8;
    public static final C9036a Companion = new C9036a();
    public static final int DEFAULT_MAX_CHARS = 115;
    private String contentText;
    private String expandText;
    private boolean isExpanded;
    private int maxChars;
    private C19846a<C19394m> onExpandListener;
    private boolean removeLineBreaksWhenCollapsed;

    /* renamed from: com.etsy.android.stylekit.views.CollageContentToggleShort$a */
    public static final class C9036a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageContentToggleShort(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageContentToggleShort(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageContentToggleShort(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setupClickListener() {
        setClickable(true);
        setFocusable(true);
        setOnClickListener(new C9055f(this, 0));
    }

    /* access modifiers changed from: private */
    /* renamed from: setupClickListener$lambda-3  reason: not valid java name */
    public static final void m34886setupClickListener$lambda3(CollageContentToggleShort collageContentToggleShort, View view) {
        C19383o.m32797g(collageContentToggleShort, "this$0");
        collageContentToggleShort.expand();
    }

    private final void updateText() {
        String str;
        String str2 = this.contentText;
        int length = str2 != null ? str2.length() : 0;
        int i = this.maxChars;
        if (length <= i) {
            setText(this.contentText);
            this.isExpanded = true;
            return;
        }
        C9036a aVar = Companion;
        String str3 = this.contentText;
        String str4 = this.expandText;
        boolean z = this.removeLineBreaksWhenCollapsed;
        aVar.getClass();
        C19383o.m32797g(str4, "expandText");
        String str5 = null;
        if (z) {
            str3 = str3 != null ? new Regex("\n+").replace((CharSequence) str3, " ") : null;
        }
        if (str3 != null) {
            String substring = str3.substring(0, Math.min(str3.length() - 1, i + 1));
            C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int h1 = C19459m.m33039h1(substring);
            while (true) {
                if (-1 >= h1) {
                    str = "";
                    break;
                } else if (!Character.isLetterOrDigit(substring.charAt(h1))) {
                    str = substring.substring(0, h1 + 1);
                    C19383o.m32796f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    break;
                } else {
                    h1--;
                }
            }
            int h12 = C19459m.m33039h1(str);
            while (true) {
                if (-1 >= h12) {
                    str5 = "";
                    break;
                } else if (!(!Character.isLetterOrDigit(str.charAt(h12)))) {
                    str5 = str.substring(0, h12 + 1);
                    C19383o.m32796f(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                    break;
                } else {
                    h12--;
                }
            }
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str5 + "… " + str4);
        int length2 = valueOf.length() - this.expandText.length();
        if (!isInEditMode()) {
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            valueOf.setSpan(new StyleKitSpan.BoldSpan(context), length2, valueOf.length(), 33);
        }
        setText(valueOf);
        this.isExpanded = false;
        setupClickListener();
    }

    public final void expand() {
        setText(this.contentText);
        C19846a<C19394m> aVar = this.onExpandListener;
        if (aVar != null) {
            aVar.invoke();
        }
        this.isExpanded = true;
        setContentDescription(this.contentText);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setContentText(CharSequence charSequence) {
        C19383o.m32797g(charSequence, ResponseConstants.CONTENT);
        this.contentText = charSequence.toString();
        updateText();
    }

    public final void setExpandText(String str) {
        C19383o.m32797g(str, "expandText");
        this.expandText = str;
        updateText();
    }

    public final void setMaxChars(int i) {
        this.maxChars = i;
        updateText();
    }

    public final void setOnExpandListener(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "function");
        this.onExpandListener = aVar;
    }

    public final void setSmall(boolean z) {
        C13351b.m21018b(this, z ? R.style.clg_text_body_small : R.style.clg_text_body);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageContentToggleShort(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.expandText = "";
        boolean z = true;
        this.removeLineBreaksWhenCollapsed = true;
        this.maxChars = 115;
        C13351b.m21018b(this, R.style.clg_text_body);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28643j, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…ContentToggleShort, 0, 0)");
            if (obtainStyledAttributes.getBoolean(3, false)) {
                C13351b.m21018b(this, R.style.clg_text_body_small);
            }
            String string = obtainStyledAttributes.getString(0);
            if (!(string == null || string.length() == 0)) {
                this.expandText = string;
                this.removeLineBreaksWhenCollapsed = obtainStyledAttributes.getBoolean(2, true);
                this.contentText = obtainStyledAttributes.getString(4);
                int i2 = obtainStyledAttributes.getInt(1, 115);
                if (i2 <= 0 ? false : z) {
                    setMaxChars(i2);
                    setTextColor(obtainStyledAttributes.getColor(5, C13350a.m21013d(context, R.attr.clg_color_text_primary)));
                    updateText();
                    obtainStyledAttributes.recycle();
                    return;
                }
                throw new IllegalArgumentException("maxChars must be greater than 0. It defaults to 115.".toString());
            }
            throw new IllegalArgumentException("expandText is required. It should be a value like `Read more` and be localized.".toString());
        }
    }

    public final void setContentText(int i) {
        String string = getContext().getString(i);
        C19383o.m32796f(string, "context.getString(contentRes)");
        setContentText((CharSequence) string);
    }

    public final void setExpandText(int i) {
        String string = getContext().getString(i);
        C19383o.m32796f(string, "context.getString(expandText)");
        setExpandText(string);
    }
}
