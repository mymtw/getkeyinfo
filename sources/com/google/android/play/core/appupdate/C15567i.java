package com.google.android.play.core.appupdate;

import com.google.android.play.core.assetpacks.C15583b0;
import com.google.android.play.core.assetpacks.C15633n2;
import com.google.android.play.core.internal.C15686c0;
import java.util.Vector;
import kotlin.jvm.internal.C19383o;
import p244t5.C7984h1;

/* renamed from: com.google.android.play.core.appupdate.i */
public final class C15567i implements C15686c0 {

    /* renamed from: b */
    public final /* synthetic */ int f35036b;

    /* renamed from: c */
    public final Object f35037c;

    public /* synthetic */ C15567i(Object obj, int i) {
        this.f35036b = i;
        this.f35037c = obj;
    }

    /* renamed from: a */
    public final C7984h1 mo55342a(int i) {
        return (C7984h1) ((Vector) this.f35037c).elementAt(i);
    }

    /* renamed from: b */
    public final void mo55343b(C7984h1 h1Var) {
        ((Vector) this.f35037c).addElement(h1Var);
    }

    /* renamed from: c */
    public final int mo55344c() {
        return ((Vector) this.f35037c).size();
    }

    /* renamed from: d */
    public final void mo55345d(Object obj, String str) {
        C19383o.m32798h(obj, "value");
        ((StringBuilder) this.f35037c).append(str + '=' + obj);
        ((StringBuilder) this.f35037c).append("\n");
    }

    public final String toString() {
        switch (this.f35036b) {
            case 1:
                String sb = ((StringBuilder) this.f35037c).toString();
                C19383o.m32793c(sb, "sb.toString()");
                return sb;
            default:
                return super.toString();
        }
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new C15633n2((C15583b0) ((C15686c0) this.f35037c).zza());
    }

    public C15567i(int i) {
        this.f35036b = i;
        if (i != 2) {
            this.f35037c = new StringBuilder();
        } else {
            this.f35037c = new Vector();
        }
    }
}
