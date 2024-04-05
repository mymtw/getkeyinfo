package p318bg;

import androidx.appcompat.widget.C0326j;
import com.facebook.appevents.p332ml.ModelManager;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;

/* renamed from: bg.b */
public final class C8553b {

    /* renamed from: m */
    public static final HashMap f18623m = C19294b0.m32561r0(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    /* renamed from: n */
    public static final C8554a f18624n = new C8554a();

    /* renamed from: a */
    public final C8551a f18625a;

    /* renamed from: b */
    public final C8551a f18626b;

    /* renamed from: c */
    public final C8551a f18627c;

    /* renamed from: d */
    public final C8551a f18628d;

    /* renamed from: e */
    public final C8551a f18629e;

    /* renamed from: f */
    public final C8551a f18630f;

    /* renamed from: g */
    public final C8551a f18631g;

    /* renamed from: h */
    public final C8551a f18632h;

    /* renamed from: i */
    public final C8551a f18633i;

    /* renamed from: j */
    public final C8551a f18634j;

    /* renamed from: k */
    public final C8551a f18635k;

    /* renamed from: l */
    public final HashMap f18636l;

    /* renamed from: bg.b$a */
    public static final class C8554a {
    }

    public C8553b() {
        throw null;
    }

    public C8553b(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj != null) {
            this.f18625a = (C8551a) obj;
            Object obj2 = hashMap.get("convs.0.weight");
            if (obj2 != null) {
                this.f18626b = C8558f.m16965l((C8551a) obj2);
                Object obj3 = hashMap.get("convs.1.weight");
                if (obj3 != null) {
                    this.f18627c = C8558f.m16965l((C8551a) obj3);
                    Object obj4 = hashMap.get("convs.2.weight");
                    if (obj4 != null) {
                        this.f18628d = C8558f.m16965l((C8551a) obj4);
                        Object obj5 = hashMap.get("convs.0.bias");
                        if (obj5 != null) {
                            this.f18629e = (C8551a) obj5;
                            Object obj6 = hashMap.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f18630f = (C8551a) obj6;
                                Object obj7 = hashMap.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.f18631g = (C8551a) obj7;
                                    Object obj8 = hashMap.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.f18632h = C8558f.m16964k((C8551a) obj8);
                                        Object obj9 = hashMap.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.f18633i = C8558f.m16964k((C8551a) obj9);
                                            Object obj10 = hashMap.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.f18634j = (C8551a) obj10;
                                                Object obj11 = hashMap.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.f18635k = (C8551a) obj11;
                                                    this.f18636l = new HashMap();
                                                    for (String str : C19382n.m32704D0(ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey())) {
                                                        String i = C0326j.m864i(str, ".weight");
                                                        String i2 = C0326j.m864i(str, ".bias");
                                                        C8551a aVar = (C8551a) hashMap.get(i);
                                                        C8551a aVar2 = (C8551a) hashMap.get(i2);
                                                        if (aVar != null) {
                                                            this.f18636l.put(i, C8558f.m16964k(aVar));
                                                        }
                                                        if (aVar2 != null) {
                                                            this.f18636l.put(i2, aVar2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final C8551a mo21077a(C8551a aVar, String[] strArr, String str) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            C19383o.m32797g(str, "task");
            C8551a c = C8558f.m16956c(C8558f.m16958e(strArr, this.f18625a), this.f18626b);
            C8558f.m16954a(c, this.f18629e);
            C8558f.m16962i(c);
            C8551a c2 = C8558f.m16956c(c, this.f18627c);
            C8558f.m16954a(c2, this.f18630f);
            C8558f.m16962i(c2);
            C8551a g = C8558f.m16960g(c2, 2);
            C8551a c3 = C8558f.m16956c(g, this.f18628d);
            C8558f.m16954a(c3, this.f18631g);
            C8558f.m16962i(c3);
            C8551a g2 = C8558f.m16960g(c, c.f18622c[1]);
            C8551a g3 = C8558f.m16960g(g, g.f18622c[1]);
            C8551a g4 = C8558f.m16960g(c3, c3.f18622c[1]);
            C8558f.m16959f(g2);
            C8558f.m16959f(g3);
            C8558f.m16959f(g4);
            C8551a d = C8558f.m16957d(C8558f.m16955b(new C8551a[]{g2, g3, g4, aVar}), this.f18632h, this.f18634j);
            C8558f.m16962i(d);
            C8551a d2 = C8558f.m16957d(d, this.f18633i, this.f18635k);
            C8558f.m16962i(d2);
            HashMap hashMap = this.f18636l;
            C8551a aVar2 = (C8551a) hashMap.get(str + ".weight");
            HashMap hashMap2 = this.f18636l;
            C8551a aVar3 = (C8551a) hashMap2.get(str + ".bias");
            if (aVar2 != null) {
                if (aVar3 != null) {
                    C8551a d3 = C8558f.m16957d(d2, aVar2, aVar3);
                    C8558f.m16963j(d3);
                    return d3;
                }
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
