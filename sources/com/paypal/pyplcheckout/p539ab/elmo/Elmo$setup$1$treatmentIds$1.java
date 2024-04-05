package com.paypal.pyplcheckout.p539ab.elmo;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.Elmo$setup$1$treatmentIds$1 */
public final class Elmo$setup$1$treatmentIds$1 extends Lambda implements C19857l<Treatment, CharSequence> {
    public static final Elmo$setup$1$treatmentIds$1 INSTANCE = new Elmo$setup$1$treatmentIds$1();

    public Elmo$setup$1$treatmentIds$1() {
        super(1);
    }

    public final CharSequence invoke(Treatment treatment) {
        C19383o.m32797g(treatment, "it");
        return treatment.getTreatmentId();
    }
}
