package com.etsy.android.stylekit.accessibility.capabilities;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p568fn.C17782b;

public final class AccessibilityCapabilities {

    /* renamed from: a */
    public static final List<String> f19885a = C17782b.m29864d0("com.etsy.android.soe");

    /* renamed from: b */
    public static final List<String> f19886b = C17782b.m29865e0("exo_", "design_bottom_navigation_item", "navigation_bar_item_icon_view", "fast_scroller_thumb_view");

    public static final class Companion {

        public enum AssistiveTools {
            GENERIC_SCREEN_READER(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE),
            GENERIC_BRAILLE("32"),
            TALKBACK("com.google.android.marvin.talkback/.TalkBackService"),
            SELECT_TO_SPEAK("com.google.android.marvin.talkback/com.google.android.accessibility.selecttospeak.SelectToSpeakService"),
            SWITCH_ACCESS("com.google.android.marvin.talkback/com.android.switchaccess.SwitchAccessService"),
            ANY("");
            
            public static final C9016a Companion = null;

            /* renamed from: id */
            private final String f19887id;

            /* renamed from: com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities$Companion$AssistiveTools$a */
            public static final class C9016a {
            }

            /* access modifiers changed from: public */
            static {
                Companion = new C9016a();
            }

            private AssistiveTools(String str) {
                this.f19887id = str;
            }

            public final String getId() {
                return this.f19887id;
            }

            public final boolean isGenericTool() {
                return C19457k.m33025c1(name(), "GENERIC_", false);
            }
        }

        /* renamed from: a */
        public static boolean m17418a(Context context, String str) {
            int i;
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                return false;
            }
            try {
                i = Settings.Secure.getInt(contentResolver, str);
            } catch (Settings.SettingNotFoundException e) {
                e.printStackTrace();
                i = 0;
            }
            return i == 1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
            if (r5.size() > 0) goto L_0x015c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0157, code lost:
            if (r4.size() > 0) goto L_0x015c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0127 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x018b A[LOOP:0: B:8:0x0025->B:84:0x018b, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x018f A[EDGE_INSN: B:88:0x018f->B:85:0x018f ?: BREAK  , SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m17419b(android.content.Context r14, com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.Companion.AssistiveTools... r15) {
            /*
                int r0 = r15.length
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r2
            L_0x0008:
                if (r0 != 0) goto L_0x000b
                goto L_0x000c
            L_0x000b:
                r15 = 0
            L_0x000c:
                if (r15 == 0) goto L_0x0190
                java.util.List<java.lang.String> r0 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.f19885a
                java.lang.String r0 = "accessibility"
                java.lang.Object r14 = r14.getSystemService(r0)
                java.lang.String r0 = "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"
                kotlin.jvm.internal.C19383o.m32795e(r14, r0)
                android.view.accessibility.AccessibilityManager r14 = (android.view.accessibility.AccessibilityManager) r14
                r0 = -1
                java.util.List r14 = r14.getEnabledAccessibilityServiceList(r0)
                int r0 = r15.length
                r3 = r2
                r4 = r3
            L_0x0025:
                if (r3 >= r0) goto L_0x018f
                r4 = r15[r3]
                boolean r5 = r4.isGenericTool()
                java.lang.String r6 = "tools"
                if (r5 == 0) goto L_0x0067
                kotlin.jvm.internal.C19383o.m32796f(r14, r6)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r6 = r14.iterator()
            L_0x003d:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x005f
                java.lang.Object r7 = r6.next()
                r8 = r7
                android.accessibilityservice.AccessibilityServiceInfo r8 = (android.accessibilityservice.AccessibilityServiceInfo) r8
                java.lang.String r9 = r4.getId()
                int r9 = java.lang.Integer.parseInt(r9)
                int r8 = r8.feedbackType
                if (r9 > r8) goto L_0x0058
                r8 = r1
                goto L_0x0059
            L_0x0058:
                r8 = r2
            L_0x0059:
                if (r8 == 0) goto L_0x003d
                r5.add(r7)
                goto L_0x003d
            L_0x005f:
                int r4 = r5.size()
                if (r4 <= 0) goto L_0x015a
                goto L_0x015c
            L_0x0067:
                com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities$Companion$AssistiveTools r5 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.Companion.AssistiveTools.ANY
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L_0x015e
                kotlin.jvm.internal.C19383o.m32796f(r14, r6)
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r5 = r14.iterator()
            L_0x007b:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x00d1
                java.lang.Object r6 = r5.next()
                r7 = r6
                android.accessibilityservice.AccessibilityServiceInfo r7 = (android.accessibilityservice.AccessibilityServiceInfo) r7
                com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities$Companion$AssistiveTools$a r8 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.Companion.AssistiveTools.Companion
                int r7 = r7.feedbackType
                r8.getClass()
                com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities$Companion$AssistiveTools[] r8 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.Companion.AssistiveTools.values()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                int r10 = r8.length
                r11 = r2
            L_0x009a:
                if (r11 >= r10) goto L_0x00aa
                r12 = r8[r11]
                boolean r13 = r12.isGenericTool()
                if (r13 == 0) goto L_0x00a7
                r9.add(r12)
            L_0x00a7:
                int r11 = r11 + 1
                goto L_0x009a
            L_0x00aa:
                r8 = 16
                if (r7 == r8) goto L_0x00ca
                java.util.Iterator r8 = r9.iterator()
            L_0x00b2:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x00ca
                java.lang.Object r9 = r8.next()
                com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities$Companion$AssistiveTools r9 = (com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.Companion.AssistiveTools) r9
                java.lang.String r9 = r9.getId()
                int r9 = java.lang.Integer.parseInt(r9)
                if (r9 > r7) goto L_0x00b2
                r7 = r1
                goto L_0x00cb
            L_0x00ca:
                r7 = r2
            L_0x00cb:
                if (r7 == 0) goto L_0x007b
                r4.add(r6)
                goto L_0x007b
            L_0x00d1:
                int r4 = r4.size()
                if (r4 > 0) goto L_0x015c
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r5 = r14.iterator()
            L_0x00e0:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0153
                java.lang.Object r6 = r5.next()
                r7 = r6
                android.accessibilityservice.AccessibilityServiceInfo r7 = (android.accessibilityservice.AccessibilityServiceInfo) r7
                com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities$Companion$AssistiveTools$a r8 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.Companion.AssistiveTools.Companion
                java.lang.String r7 = r7.getId()
                java.lang.String r9 = "it.id"
                kotlin.jvm.internal.C19383o.m32796f(r7, r9)
                r8.getClass()
                com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities$Companion$AssistiveTools[] r8 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.Companion.AssistiveTools.values()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                int r10 = r8.length
                r11 = r2
            L_0x0106:
                if (r11 >= r10) goto L_0x012a
                r12 = r8[r11]
                boolean r13 = r12.isGenericTool()
                if (r13 != 0) goto L_0x0121
                java.lang.String r13 = r12.getId()
                int r13 = r13.length()
                if (r13 <= 0) goto L_0x011c
                r13 = r1
                goto L_0x011d
            L_0x011c:
                r13 = r2
            L_0x011d:
                if (r13 == 0) goto L_0x0121
                r13 = r1
                goto L_0x0122
            L_0x0121:
                r13 = r2
            L_0x0122:
                if (r13 == 0) goto L_0x0127
                r9.add(r12)
            L_0x0127:
                int r11 = r11 + 1
                goto L_0x0106
            L_0x012a:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r9 = r9.iterator()
            L_0x0133:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0149
                java.lang.Object r10 = r9.next()
                com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities$Companion$AssistiveTools r10 = (com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.Companion.AssistiveTools) r10
                java.lang.String r10 = r10.getId()
                if (r10 == 0) goto L_0x0133
                r8.add(r10)
                goto L_0x0133
            L_0x0149:
                boolean r7 = r8.contains(r7)
                if (r7 == 0) goto L_0x00e0
                r4.add(r6)
                goto L_0x00e0
            L_0x0153:
                int r4 = r4.size()
                if (r4 <= 0) goto L_0x015a
                goto L_0x015c
            L_0x015a:
                r4 = r2
                goto L_0x0188
            L_0x015c:
                r4 = r1
                goto L_0x0188
            L_0x015e:
                kotlin.jvm.internal.C19383o.m32796f(r14, r6)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r6 = r14.iterator()
            L_0x016a:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x0180
                java.lang.Object r7 = r6.next()
                android.accessibilityservice.AccessibilityServiceInfo r7 = (android.accessibilityservice.AccessibilityServiceInfo) r7
                java.lang.String r7 = r7.getId()
                if (r7 == 0) goto L_0x016a
                r5.add(r7)
                goto L_0x016a
            L_0x0180:
                java.lang.String r4 = r4.getId()
                boolean r4 = r5.contains(r4)
            L_0x0188:
                if (r4 == 0) goto L_0x018b
                goto L_0x018f
            L_0x018b:
                int r3 = r3 + 1
                goto L_0x0025
            L_0x018f:
                return r4
            L_0x0190:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.String r15 = "AccessibilityCapabilities.isAssistiveToolEnabled() requires at least 1 AssistiveTools enum value as second vararg parameter"
                r14.<init>(r15)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.Companion.m17419b(android.content.Context, com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities$Companion$AssistiveTools[]):boolean");
        }
    }
}
