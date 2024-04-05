package com.etsy.android.exceptions;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19324q;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

public final class ThreeArmSweaterException extends Exception {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    private final Context context;
    private final String message;
    private final ArrayList<StackTraceElement> stack;

    public static final class Companion {
        /* renamed from: a */
        public static void m12856a(Context context) {
            C8591a aVar = C18263b.f40056T;
            if (aVar != null) {
                C15588c1.m25314Y(new ThreeArmSweaterException$Companion$logSampled$1(context), aVar.f18706f.mo21134d(C8592b.f18720A1));
                return;
            }
            C19383o.m32805o("etsyConfig");
            throw null;
        }
    }

    public ThreeArmSweaterException(Context context2) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.context = context2;
        ArrayList<StackTraceElement> arrayList = new ArrayList<>();
        this.stack = arrayList;
        try {
            if (context2 instanceof FragmentActivity) {
                arrayList.add(new StackTraceElement("State", ((FragmentActivity) context2).getLifecycle().mo10734b().name(), context2.getClass().getName(), 1));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Bundle extras = ((FragmentActivity) context2).getIntent().getExtras();
                if (extras != null) {
                    C15562d.m25165C(extras, "", linkedHashMap);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ArrayList<StackTraceElement> arrayList2 = this.stack;
                    arrayList2.add(new StackTraceElement("Extra", ((String) entry.getKey()) + " with value " + ((String) entry.getValue()), this.context.getClass().getName(), 1));
                }
                List<Fragment> H = ((FragmentActivity) this.context).getSupportFragmentManager().mo10358H();
                C19383o.m32796f(H, "context.supportFragmentManager.fragments");
                for (Fragment fragment : H) {
                    if (fragment.isVisible()) {
                        this.stack.add(new StackTraceElement("State", fragment.getLifecycle().mo10734b().name(), fragment.getClass().getName(), 1));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Bundle arguments = fragment.getArguments();
                        if (arguments != null) {
                            C15562d.m25165C(arguments, "", linkedHashMap2);
                        }
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            ArrayList<StackTraceElement> arrayList3 = this.stack;
                            arrayList3.add(new StackTraceElement("Arg", ((String) entry2.getKey()) + " with value " + ((String) entry2.getValue()), fragment.getClass().getName(), 1));
                        }
                    }
                }
            }
        } catch (Exception e) {
            ArrayList<StackTraceElement> arrayList4 = this.stack;
            StackTraceElement[] stackTrace = e.getStackTrace();
            C19383o.m32796f(stackTrace, "e.stackTrace");
            C19324q.m32629K0(arrayList4, stackTrace);
        }
        this.message = "Three Armed Sweater displayed";
    }

    public final Context getContext() {
        return this.context;
    }

    public String getLocalizedMessage() {
        return getMessage();
    }

    public String getMessage() {
        return this.message;
    }

    public final ArrayList<StackTraceElement> getStack() {
        return this.stack;
    }

    public StackTraceElement[] getStackTrace() {
        Object[] array = this.stack.toArray(new StackTraceElement[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (StackTraceElement[]) array;
    }
}
