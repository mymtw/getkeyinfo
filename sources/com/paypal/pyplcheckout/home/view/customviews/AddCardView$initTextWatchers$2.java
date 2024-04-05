package com.paypal.pyplcheckout.home.view.customviews;

import com.google.android.material.textfield.TextInputEditText;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19459m;
import p753kq.C19863r;

public final class AddCardView$initTextWatchers$2 extends Lambda implements C19863r<CharSequence, Integer, Integer, Integer, C19394m> {
    public final /* synthetic */ AddCardView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardView$initTextWatchers$2(AddCardView addCardView) {
        super(4);
        this.this$0 = addCardView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (!(charSequence != null && charSequence.length() == 2)) {
            if (charSequence != null && charSequence.length() == 5) {
                z = true;
            }
            if (z) {
                TextInputEditText access$getCscEditText$p = this.this$0.cscEditText;
                if (access$getCscEditText$p != null) {
                    access$getCscEditText$p.requestFocus();
                } else {
                    C19383o.m32805o("cscEditText");
                    throw null;
                }
            }
        } else if (i == 2 && i2 == 1 && !C19459m.m33036e1(charSequence.toString(), "/", false)) {
            sb.append("");
            sb.append(charSequence.toString().charAt(0));
            TextInputEditText access$getExpEditText$p = this.this$0.expEditText;
            if (access$getExpEditText$p != null) {
                access$getExpEditText$p.setText(sb.toString());
                TextInputEditText access$getExpEditText$p2 = this.this$0.expEditText;
                if (access$getExpEditText$p2 != null) {
                    access$getExpEditText$p2.setSelection(1);
                } else {
                    C19383o.m32805o("expEditText");
                    throw null;
                }
            } else {
                C19383o.m32805o("expEditText");
                throw null;
            }
        } else {
            sb.append(charSequence);
            sb.append("/");
            TextInputEditText access$getExpEditText$p3 = this.this$0.expEditText;
            if (access$getExpEditText$p3 != null) {
                access$getExpEditText$p3.setText(sb.toString());
                TextInputEditText access$getExpEditText$p4 = this.this$0.expEditText;
                if (access$getExpEditText$p4 != null) {
                    access$getExpEditText$p4.setSelection(3);
                } else {
                    C19383o.m32805o("expEditText");
                    throw null;
                }
            } else {
                C19383o.m32805o("expEditText");
                throw null;
            }
        }
    }
}
