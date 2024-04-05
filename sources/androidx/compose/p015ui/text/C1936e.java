package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.text.platform.AndroidParagraph;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p003a2.C0023f;
import p288y.C8345d;

/* renamed from: androidx.compose.ui.text.e */
public final class C1936e {

    /* renamed from: a */
    public final C1935d f4368a;

    /* renamed from: b */
    public final int f4369b;

    /* renamed from: c */
    public final int f4370c;

    /* renamed from: d */
    public int f4371d;

    /* renamed from: e */
    public int f4372e;

    /* renamed from: f */
    public float f4373f;

    /* renamed from: g */
    public float f4374g;

    public C1936e(AndroidParagraph androidParagraph, int i, int i2, int i3, int i4, float f, float f2) {
        this.f4368a = androidParagraph;
        this.f4369b = i;
        this.f4370c = i2;
        this.f4371d = i3;
        this.f4372e = i4;
        this.f4373f = f;
        this.f4374g = f2;
    }

    /* renamed from: a */
    public final C8345d mo7492a(C8345d dVar) {
        C19383o.m32797g(dVar, "<this>");
        return dVar.mo20930e(C19421p.m32952q(0.0f, this.f4373f));
    }

    /* renamed from: b */
    public final int mo7493b(int i) {
        return C19388s.m32833M(i, this.f4369b, this.f4370c) - this.f4369b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1936e)) {
            return false;
        }
        C1936e eVar = (C1936e) obj;
        return C19383o.m32792b(this.f4368a, eVar.f4368a) && this.f4369b == eVar.f4369b && this.f4370c == eVar.f4370c && this.f4371d == eVar.f4371d && this.f4372e == eVar.f4372e && C19383o.m32792b(Float.valueOf(this.f4373f), Float.valueOf(eVar.f4373f)) && C19383o.m32792b(Float.valueOf(this.f4374g), Float.valueOf(eVar.f4374g));
    }

    public final int hashCode() {
        return Float.hashCode(this.f4374g) + C0023f.m104c(this.f4373f, C0069a.m170a(this.f4372e, C0069a.m170a(this.f4371d, C0069a.m170a(this.f4370c, C0069a.m170a(this.f4369b, this.f4368a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ParagraphInfo(paragraph=");
        h.append(this.f4368a);
        h.append(", startIndex=");
        h.append(this.f4369b);
        h.append(", endIndex=");
        h.append(this.f4370c);
        h.append(", startLineIndex=");
        h.append(this.f4371d);
        h.append(", endLineIndex=");
        h.append(this.f4372e);
        h.append(", top=");
        h.append(this.f4373f);
        h.append(", bottom=");
        return C0388a.m1048d(h, this.f4374g, ')');
    }
}
