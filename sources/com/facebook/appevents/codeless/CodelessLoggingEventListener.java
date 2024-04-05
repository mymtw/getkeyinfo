package com.facebook.appevents.codeless;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.appevents.codeless.internal.C12225d;
import com.facebook.appevents.codeless.internal.EventBinding;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;
import p453tf.C13418j;
import p461uf.C13511h;

public final class CodelessLoggingEventListener {

    /* renamed from: a */
    public static final CodelessLoggingEventListener f27254a = new CodelessLoggingEventListener();

    public static final class AutoLoggingOnClickListener implements View.OnClickListener {
        private View.OnClickListener existingOnClickListener;
        private WeakReference<View> hostView;
        private EventBinding mapping;
        private WeakReference<View> rootView;
        private boolean supportCodelessLogging = true;

        public AutoLoggingOnClickListener(EventBinding eventBinding, View view, View view2) {
            C19383o.m32797g(eventBinding, "mapping");
            C19383o.m32797g(view, "rootView");
            C19383o.m32797g(view2, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            this.existingOnClickListener = C12225d.m20057f(view2);
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        public void onClick(View view) {
            if (!C13080a.m20762b(this)) {
                try {
                    C19383o.m32797g(view, "view");
                    View.OnClickListener onClickListener = this.existingOnClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = this.rootView.get();
                    View view3 = this.hostView.get();
                    if (view2 != null && view3 != null) {
                        EventBinding eventBinding = this.mapping;
                        if (eventBinding != null) {
                            CodelessLoggingEventListener.m20039a(eventBinding, view2, view3);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }

        public final void setSupportCodelessLogging(boolean z) {
            this.supportCodelessLogging = z;
        }
    }

    public static final class AutoLoggingOnItemClickListener implements AdapterView.OnItemClickListener {
        private AdapterView.OnItemClickListener existingOnItemClickListener;
        private WeakReference<AdapterView<?>> hostView;
        private EventBinding mapping;
        private WeakReference<View> rootView;
        private boolean supportCodelessLogging = true;

        public AutoLoggingOnItemClickListener(EventBinding eventBinding, View view, AdapterView<?> adapterView) {
            C19383o.m32797g(eventBinding, "mapping");
            C19383o.m32797g(view, "rootView");
            C19383o.m32797g(adapterView, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(adapterView);
            this.rootView = new WeakReference<>(view);
            this.existingOnItemClickListener = adapterView.getOnItemClickListener();
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C19383o.m32797g(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.existingOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            View view2 = this.rootView.get();
            AdapterView adapterView2 = this.hostView.get();
            if (view2 != null && adapterView2 != null) {
                CodelessLoggingEventListener.m20039a(this.mapping, view2, adapterView2);
            }
        }

        public final void setSupportCodelessLogging(boolean z) {
            this.supportCodelessLogging = z;
        }
    }

    /* renamed from: com.facebook.appevents.codeless.CodelessLoggingEventListener$a */
    public static final class C12215a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f27255b;

        /* renamed from: c */
        public final /* synthetic */ Bundle f27256c;

        public C12215a(String str, Bundle bundle) {
            this.f27255b = str;
            this.f27256c = bundle;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    Context b = C13418j.m21106b();
                    C19383o.m32797g(b, ResponseConstants.CONTEXT);
                    new C13511h(b, (String) null).mo46168d(this.f27256c, this.f27255b);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m20039a(EventBinding eventBinding, View view, View view2) {
        Class<CodelessLoggingEventListener> cls = CodelessLoggingEventListener.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(eventBinding, "mapping");
                String str = eventBinding.f27268a;
                CodelessMatcher codelessMatcher = CodelessMatcher.f27257f;
                Bundle b = CodelessMatcher.C12217a.m20046b(eventBinding, view, view2);
                f27254a.mo39293b(b);
                C13418j.m21108d().execute(new C12215a(str, b));
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|9|(5:11|12|13|(2:17|18)|19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0059 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39293b(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "_valueToSum"
            boolean r1 = p401mg.C13080a.m20762b(r6)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = r7.getString(r0)     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x005c
            int r2 = p312ag.C8527d.f18569a     // Catch:{ all -> 0x0064 }
            r2 = 0
            java.lang.String r4 = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?"
            r5 = 8
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r5)     // Catch:{ ParseException -> 0x0059 }
            java.util.regex.Matcher r1 = r4.matcher(r1)     // Catch:{ ParseException -> 0x0059 }
            boolean r4 = r1.find()     // Catch:{ ParseException -> 0x0059 }
            if (r4 == 0) goto L_0x0059
            r4 = 0
            java.lang.String r1 = r1.group(r4)     // Catch:{ ParseException -> 0x0059 }
            int r4 = p365hg.C12869i0.f28368a     // Catch:{ ParseException -> 0x0059 }
            android.content.Context r4 = p453tf.C13418j.m21106b()     // Catch:{ Exception -> 0x0040 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ Exception -> 0x0040 }
            java.lang.String r5 = "FacebookSdk.getApplicationContext().resources"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)     // Catch:{ Exception -> 0x0040 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ Exception -> 0x0040 }
            java.util.Locale r4 = r4.locale     // Catch:{ Exception -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 == 0) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ ParseException -> 0x0059 }
            java.lang.String r5 = "Locale.getDefault()"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)     // Catch:{ ParseException -> 0x0059 }
        L_0x004d:
            java.text.NumberFormat r4 = java.text.NumberFormat.getNumberInstance(r4)     // Catch:{ ParseException -> 0x0059 }
            java.lang.Number r1 = r4.parse(r1)     // Catch:{ ParseException -> 0x0059 }
            double r2 = r1.doubleValue()     // Catch:{ ParseException -> 0x0059 }
        L_0x0059:
            r7.putDouble(r0, r2)     // Catch:{ all -> 0x0064 }
        L_0x005c:
            java.lang.String r0 = "_is_fb_codeless"
            java.lang.String r1 = "1"
            r7.putString(r0, r1)     // Catch:{ all -> 0x0064 }
            return
        L_0x0064:
            r7 = move-exception
            p401mg.C13080a.m20761a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.CodelessLoggingEventListener.mo39293b(android.os.Bundle):void");
    }
}
