package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.LocalTestingException;

/* renamed from: com.google.android.play.core.assetpacks.l1 */
public final /* synthetic */ class C15624l1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C15632n1 f35233b;

    /* renamed from: c */
    public final /* synthetic */ int f35234c;

    /* renamed from: d */
    public final /* synthetic */ String f35235d;

    public /* synthetic */ C15624l1(C15632n1 n1Var, int i, String str) {
        this.f35233b = n1Var;
        this.f35234c = i;
        this.f35235d = str;
    }

    public final void run() {
        C15632n1 n1Var = this.f35233b;
        int i = this.f35234c;
        String str = this.f35235d;
        n1Var.getClass();
        try {
            n1Var.mo55471i(i, 4, str);
        } catch (LocalTestingException e) {
            C15632n1.f35252i.mo52246f("notifyModuleCompleted failed", e);
        }
    }
}
