package p279x;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: x.d */
public final class C8280d {

    /* renamed from: a */
    public static final C8280d f18147a = new C8280d();

    /* renamed from: a */
    public final AutofillId mo20878a(ViewStructure viewStructure) {
        C19383o.m32797g(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    /* renamed from: b */
    public final boolean mo20879b(AutofillValue autofillValue) {
        C19383o.m32797g(autofillValue, "value");
        return autofillValue.isDate();
    }

    /* renamed from: c */
    public final boolean mo20880c(AutofillValue autofillValue) {
        C19383o.m32797g(autofillValue, "value");
        return autofillValue.isList();
    }

    /* renamed from: d */
    public final boolean mo20881d(AutofillValue autofillValue) {
        C19383o.m32797g(autofillValue, "value");
        return autofillValue.isText();
    }

    /* renamed from: e */
    public final boolean mo20882e(AutofillValue autofillValue) {
        C19383o.m32797g(autofillValue, "value");
        return autofillValue.isToggle();
    }

    /* renamed from: f */
    public final void mo20883f(ViewStructure viewStructure, String[] strArr) {
        C19383o.m32797g(viewStructure, "structure");
        C19383o.m32797g(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    /* renamed from: g */
    public final void mo20884g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        C19383o.m32797g(viewStructure, "structure");
        C19383o.m32797g(autofillId, ResponseConstants.PARENT);
        viewStructure.setAutofillId(autofillId, i);
    }

    /* renamed from: h */
    public final void mo20885h(ViewStructure viewStructure, int i) {
        C19383o.m32797g(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    /* renamed from: i */
    public final CharSequence mo20886i(AutofillValue autofillValue) {
        C19383o.m32797g(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        C19383o.m32796f(textValue, "value.textValue");
        return textValue;
    }
}
