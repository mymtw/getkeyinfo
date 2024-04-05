package p453tf;

import android.os.Handler;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p365hg.C12879l0;

/* renamed from: tf.p */
public final class C13426p extends AbstractList<GraphRequest> {

    /* renamed from: f */
    public static final AtomicInteger f29410f = new AtomicInteger();

    /* renamed from: b */
    public Handler f29411b;

    /* renamed from: c */
    public final String f29412c;

    /* renamed from: d */
    public ArrayList f29413d;

    /* renamed from: e */
    public ArrayList f29414e;

    /* renamed from: tf.p$a */
    public interface C13427a {
        /* renamed from: a */
        void mo39759a(C13426p pVar);
    }

    /* renamed from: tf.p$b */
    public interface C13428b extends C13427a {
        /* renamed from: b */
        void mo46105b();
    }

    public C13426p() {
        this.f29412c = String.valueOf(f29410f.incrementAndGet());
        this.f29414e = new ArrayList();
        this.f29413d = new ArrayList();
    }

    /* renamed from: a */
    public final boolean add(GraphRequest graphRequest) {
        C19383o.m32797g(graphRequest, "element");
        return this.f29413d.add(graphRequest);
    }

    public final void add(int i, Object obj) {
        GraphRequest graphRequest = (GraphRequest) obj;
        C19383o.m32797g(graphRequest, "element");
        this.f29413d.add(i, graphRequest);
    }

    /* renamed from: c */
    public final void mo46094c(C13427a aVar) {
        if (!this.f29414e.contains(aVar)) {
            this.f29414e.add(aVar);
        }
    }

    public final void clear() {
        this.f29413d.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return super.contains((GraphRequest) obj);
        }
        return false;
    }

    /* renamed from: e */
    public final void mo46097e() {
        GraphRequest.f27224o.getClass();
        C12879l0.m20600d(this);
        new GraphRequestAsyncTask(this).executeOnExecutor(C13418j.m21108d(), new Void[0]);
    }

    public final Object get(int i) {
        return (GraphRequest) this.f29413d.get(i);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return super.indexOf((GraphRequest) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return super.lastIndexOf((GraphRequest) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return super.remove((GraphRequest) obj);
        }
        return false;
    }

    public final Object set(int i, Object obj) {
        GraphRequest graphRequest = (GraphRequest) obj;
        C19383o.m32797g(graphRequest, "element");
        return (GraphRequest) this.f29413d.set(i, graphRequest);
    }

    public final int size() {
        return this.f29413d.size();
    }

    public final Object remove(int i) {
        return (GraphRequest) this.f29413d.remove(i);
    }

    public C13426p(Collection<GraphRequest> collection) {
        C19383o.m32797g(collection, "requests");
        this.f29412c = String.valueOf(f29410f.incrementAndGet());
        this.f29414e = new ArrayList();
        this.f29413d = new ArrayList(collection);
    }

    public C13426p(GraphRequest... graphRequestArr) {
        C19383o.m32797g(graphRequestArr, "requests");
        this.f29412c = String.valueOf(f29410f.incrementAndGet());
        this.f29414e = new ArrayList();
        this.f29413d = new ArrayList(C19318k.m32599Q0(graphRequestArr));
    }
}
