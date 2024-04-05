package com.etsy.android.p327ui.user.review;

import com.etsy.android.p327ui.user.review.C11719r;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19459m;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$showSubratingsStep$3$2 */
public final class CreateReviewActivity$showSubratingsStep$3$2 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$showSubratingsStep$3$2(CreateReviewActivity createReviewActivity) {
        super(1);
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        List<ReviewFlowWordCountDisplayOption> list;
        boolean z;
        Integer num;
        C19383o.m32797g(str, "text");
        CreateReviewViewModel viewModel = this.this$0.getViewModel();
        viewModel.getClass();
        ReviewCard f = viewModel.mo37848f();
        Integer num2 = null;
        ReviewFlowTextFieldControl reviewFlowTextFieldControl = f != null ? f.f25969k : null;
        if (reviewFlowTextFieldControl != null) {
            reviewFlowTextFieldControl.f26025c = str;
        }
        int size = viewModel.f25911C.split(C19459m.m33035H1(str).toString(), 0).size();
        if (reviewFlowTextFieldControl != null) {
            num2 = reviewFlowTextFieldControl.f26027e;
        }
        String str2 = "";
        if (str.length() == 0) {
            viewModel.f25930h.setValue(new C11719r.C11739t(str2));
            if (reviewFlowTextFieldControl != null) {
                reviewFlowTextFieldControl.f26029g = Boolean.FALSE;
            }
        } else {
            if (size < ((reviewFlowTextFieldControl == null || (num = reviewFlowTextFieldControl.f26026d) == null) ? 5 : num.intValue())) {
                if (!(reviewFlowTextFieldControl == null || (list = reviewFlowTextFieldControl.f26028f) == null)) {
                    for (ReviewFlowWordCountDisplayOption reviewFlowWordCountDisplayOption : list) {
                        Integer num3 = reviewFlowWordCountDisplayOption.f26030a;
                        if (num3 != null && num3.intValue() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            String str3 = reviewFlowWordCountDisplayOption.f26031b;
                            if (str3 != null) {
                                str2 = str3;
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                viewModel.f25930h.setValue(new C11719r.C11739t(str2));
                if (reviewFlowTextFieldControl != null) {
                    reviewFlowTextFieldControl.f26029g = Boolean.FALSE;
                }
            } else if (num2 == null || str.length() <= num2.intValue()) {
                viewModel.f25930h.setValue(new C11719r.C11739t(str2));
                if (reviewFlowTextFieldControl != null) {
                    reviewFlowTextFieldControl.f26029g = Boolean.TRUE;
                }
            } else {
                reviewFlowTextFieldControl.f26029g = Boolean.FALSE;
            }
        }
        ReviewCard f2 = viewModel.mo37848f();
        if (f2 == null) {
            viewModel.mo37857p(ReviewScreen.SUBRATINGS);
        } else {
            viewModel.f25938p.postValue(viewModel.mo37849g(f2));
        }
    }
}
