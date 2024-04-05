package com.etsy.android.lib.logger;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class LogCatKt$logcat$2 extends Lambda implements C19846a<C8694h> {
    public static final LogCatKt$logcat$2 INSTANCE = new LogCatKt$logcat$2();

    /* renamed from: com.etsy.android.lib.logger.LogCatKt$logcat$2$a */
    public static final class C8663a implements C8694h {
        /* renamed from: a */
        public final void mo21306a(String str) {
        }

        /* renamed from: b */
        public final void mo21307b(String str, Throwable th) {
        }

        /* renamed from: c */
        public final void mo21308c() {
        }

        /* renamed from: d */
        public final void mo21309d(String str, Throwable th) {
        }

        /* renamed from: e */
        public final void mo21310e(String str) {
        }

        public final void error(Throwable th) {
        }

        /* renamed from: f */
        public final void mo21312f(String str) {
        }

        /* renamed from: g */
        public final void mo21313g(String str) {
        }

        /* renamed from: h */
        public final void mo21314h(Throwable th) {
        }
    }

    /* renamed from: com.etsy.android.lib.logger.LogCatKt$logcat$2$b */
    public static final class C8664b implements C8694h {
        /* renamed from: a */
        public final void mo21306a(String str) {
        }

        /* renamed from: b */
        public final void mo21307b(String str, Throwable th) {
        }

        /* renamed from: c */
        public final void mo21308c() {
        }

        /* renamed from: d */
        public final void mo21309d(String str, Throwable th) {
        }

        /* renamed from: e */
        public final void mo21310e(String str) {
        }

        public final void error(Throwable th) {
        }

        /* renamed from: f */
        public final void mo21312f(String str) {
        }

        /* renamed from: g */
        public final void mo21313g(String str) {
        }

        /* renamed from: h */
        public final void mo21314h(Throwable th) {
        }
    }

    public LogCatKt$logcat$2() {
        super(0);
    }

    public final C8694h invoke() {
        if (!C0326j.m869n(BuildTarget.Companion)) {
            return new C8664b();
        }
        try {
            Class.forName("org.junit.Test");
            return new C8663a();
        } catch (ClassNotFoundException unused) {
            return new C8695i();
        }
    }
}
