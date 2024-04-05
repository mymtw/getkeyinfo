package androidx.compose.p015ui.platform.accessibility;

import androidx.compose.p015ui.semantics.C1895b;
import androidx.compose.p015ui.semantics.C1896c;
import androidx.compose.p015ui.semantics.C1903j;
import androidx.compose.p015ui.semantics.C1909p;
import androidx.compose.p015ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p015ui.semantics.SemanticsNode;
import androidx.compose.p015ui.semantics.SemanticsProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p088e1.C6689b;

/* renamed from: androidx.compose.ui.platform.accessibility.a */
public final class C1815a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m3959a(java.util.ArrayList r11) {
        /*
            int r0 = r11.size()
            r1 = 1
            r2 = 2
            if (r0 >= r2) goto L_0x0009
            return r1
        L_0x0009:
            int r0 = r11.size()
            r2 = 0
            if (r0 == 0) goto L_0x007a
            int r0 = r11.size()
            if (r0 != r1) goto L_0x0017
            goto L_0x007a
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r3 = r11.get(r2)
            int r4 = p568fn.C17782b.m29859Y(r11)
            r5 = r2
        L_0x0025:
            if (r5 >= r4) goto L_0x007c
            int r5 = r5 + 1
            java.lang.Object r6 = r11.get(r5)
            r7 = r6
            androidx.compose.ui.semantics.SemanticsNode r7 = (androidx.compose.p015ui.semantics.SemanticsNode) r7
            androidx.compose.ui.semantics.SemanticsNode r3 = (androidx.compose.p015ui.semantics.SemanticsNode) r3
            y.d r8 = r3.mo7305d()
            long r8 = r8.mo20927b()
            float r8 = p288y.C8343c.m16642c(r8)
            y.d r9 = r7.mo7305d()
            long r9 = r9.mo20927b()
            float r9 = p288y.C8343c.m16642c(r9)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            y.d r3 = r3.mo7305d()
            long r9 = r3.mo20927b()
            float r3 = p288y.C8343c.m16643d(r9)
            y.d r7 = r7.mo7305d()
            long r9 = r7.mo20927b()
            float r7 = p288y.C8343c.m16643d(r9)
            float r3 = r3 - r7
            float r3 = java.lang.Math.abs(r3)
            long r7 = kotlin.reflect.C19421p.m32952q(r8, r3)
            y.c r3 = new y.c
            r3.<init>(r7)
            r0.add(r3)
            r3 = r6
            goto L_0x0025
        L_0x007a:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
        L_0x007c:
            int r11 = r0.size()
            if (r11 != r1) goto L_0x008b
            java.lang.Object r11 = kotlin.collections.C19327t.m32638T0(r0)
            y.c r11 = (p288y.C8343c) r11
            long r3 = r11.f18299a
            goto L_0x00ba
        L_0x008b:
            boolean r11 = r0.isEmpty()
            if (r11 != 0) goto L_0x00c9
            java.lang.Object r11 = kotlin.collections.C19327t.m32638T0(r0)
            int r3 = p568fn.C17782b.m29859Y(r0)
            if (r1 > r3) goto L_0x00b6
            r4 = r1
        L_0x009c:
            java.lang.Object r5 = r0.get(r4)
            y.c r5 = (p288y.C8343c) r5
            long r5 = r5.f18299a
            y.c r11 = (p288y.C8343c) r11
            long r7 = r11.f18299a
            long r5 = p288y.C8343c.m16645f(r7, r5)
            y.c r11 = new y.c
            r11.<init>(r5)
            if (r4 == r3) goto L_0x00b6
            int r4 = r4 + 1
            goto L_0x009c
        L_0x00b6:
            y.c r11 = (p288y.C8343c) r11
            long r3 = r11.f18299a
        L_0x00ba:
            float r11 = p288y.C8343c.m16642c(r3)
            float r0 = p288y.C8343c.m16643d(r3)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r1 = r2
        L_0x00c8:
            return r1
        L_0x00c9:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Empty collection can't be reduced."
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.accessibility.C1815a.m3959a(java.util.ArrayList):boolean");
    }

    /* renamed from: b */
    public static final boolean m3960b(SemanticsNode semanticsNode) {
        return (SemanticsConfigurationKt.m4173a(semanticsNode.mo7307f(), SemanticsProperties.f4195f) == null && SemanticsConfigurationKt.m4173a(semanticsNode.mo7307f(), SemanticsProperties.f4194e) == null) ? false : true;
    }

    /* renamed from: c */
    public static final void m3961c(C6689b bVar, SemanticsNode semanticsNode) {
        C6689b bVar2 = bVar;
        if (((C1896c) SemanticsConfigurationKt.m4173a(semanticsNode.mo7307f(), SemanticsProperties.f4196g)) != null) {
            C1903j f = semanticsNode.mo7307f();
            C1909p<Boolean> pVar = SemanticsProperties.f4212w;
            CollectionInfoKt$toAccessibilityCollectionItemInfo$1 collectionInfoKt$toAccessibilityCollectionItemInfo$1 = CollectionInfoKt$toAccessibilityCollectionItemInfo$1.INSTANCE;
            f.getClass();
            C19383o.m32797g(pVar, "key");
            C19383o.m32797g(collectionInfoKt$toAccessibilityCollectionItemInfo$1, "defaultValue");
            Object obj = f.f4246b.get(pVar);
            if (obj == null) {
                obj = collectionInfoKt$toAccessibilityCollectionItemInfo$1.invoke();
            }
            bVar2.mo18869s(C6689b.C6692c.m13082a(0, 0, 0, 0, false, ((Boolean) obj).booleanValue()));
        }
        SemanticsNode g = semanticsNode.mo7308g();
        if (g != null && SemanticsConfigurationKt.m4173a(g.mo7307f(), SemanticsProperties.f4194e) != null) {
            C1895b bVar3 = (C1895b) SemanticsConfigurationKt.m4173a(g.mo7307f(), SemanticsProperties.f4195f);
            if (bVar3 != null) {
                if (bVar3.f4219a < 0 || bVar3.f4220b < 0) {
                    return;
                }
            }
            if (semanticsNode.mo7307f().mo7343c(SemanticsProperties.f4212w)) {
                ArrayList arrayList = new ArrayList();
                List e = g.mo7306e(false);
                int size = e.size();
                for (int i = 0; i < size; i++) {
                    SemanticsNode semanticsNode2 = (SemanticsNode) e.get(i);
                    if (semanticsNode2.mo7307f().mo7343c(SemanticsProperties.f4212w)) {
                        arrayList.add(semanticsNode2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a = m3959a(arrayList);
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        SemanticsNode semanticsNode3 = (SemanticsNode) arrayList.get(i2);
                        if (semanticsNode3.f4187f == semanticsNode.f4187f) {
                            int i3 = a ? 0 : i2;
                            int i4 = a ? i2 : 0;
                            C1903j f2 = semanticsNode3.mo7307f();
                            C1909p<Boolean> pVar2 = SemanticsProperties.f4212w;
                            CollectionInfoKt$setCollectionItemInfo$2$itemInfo$1 collectionInfoKt$setCollectionItemInfo$2$itemInfo$1 = CollectionInfoKt$setCollectionItemInfo$2$itemInfo$1.INSTANCE;
                            f2.getClass();
                            C19383o.m32797g(pVar2, "key");
                            C19383o.m32797g(collectionInfoKt$setCollectionItemInfo$2$itemInfo$1, "defaultValue");
                            Object obj2 = f2.f4246b.get(pVar2);
                            if (obj2 == null) {
                                obj2 = collectionInfoKt$setCollectionItemInfo$2$itemInfo$1.invoke();
                            }
                            bVar2.mo18869s(C6689b.C6692c.m13082a(i3, 1, i4, 1, false, ((Boolean) obj2).booleanValue()));
                        }
                    }
                }
            }
        }
    }
}
