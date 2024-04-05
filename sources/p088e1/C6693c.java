package p088e1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: e1.c */
public class C6693c {

    /* renamed from: a */
    public final Object f14784a;

    /* renamed from: e1.c$a */
    public static class C6694a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C6693c f14785a;

        public C6694a(C6693c cVar) {
            this.f14785a = cVar;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C6689b a = this.f14785a.mo18879a(i);
            if (a == null) {
                return null;
            }
            return a.f14759a;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f14785a.getClass();
            return null;
        }

        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f14785a.mo18881c(i, i2, bundle);
        }
    }

    /* renamed from: e1.c$b */
    public static class C6695b extends C6694a {
        public C6695b(C6693c cVar) {
            super(cVar);
        }

        public final AccessibilityNodeInfo findFocus(int i) {
            C6689b b = this.f14785a.mo18880b(i);
            if (b == null) {
                return null;
            }
            return b.f14759a;
        }
    }

    /* renamed from: e1.c$c */
    public static class C6696c extends C6695b {
        public C6696c(C6693c cVar) {
            super(cVar);
        }

        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f14785a.getClass();
        }
    }

    public C6693c() {
        this.f14784a = new C6696c(this);
    }

    /* renamed from: a */
    public C6689b mo18879a(int i) {
        return null;
    }

    /* renamed from: b */
    public C6689b mo18880b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo18881c(int i, int i2, Bundle bundle) {
        return false;
    }

    public C6693c(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f14784a = accessibilityNodeProvider;
    }
}
