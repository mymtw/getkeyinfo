package com.google.common.util.concurrent;

import androidx.appcompat.widget.C0326j;
import com.google.common.base.C15784e;
import com.google.common.cache.LocalCache;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.C16379g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.util.concurrent.b */
public abstract class C16372b<I, O, F, T> extends C16379g.C16380a<O> implements Runnable {

    /* renamed from: k */
    public static final /* synthetic */ int f36486k = 0;
    @NullableDecl

    /* renamed from: i */
    public C16388l<? extends I> f36487i;
    @NullableDecl

    /* renamed from: j */
    public F f36488j;

    /* renamed from: com.google.common.util.concurrent.b$a */
    public static final class C16373a<I, O> extends C16372b<I, O, C15784e<? super I, ? extends O>, O> {
        public C16373a(C16388l lVar, LocalCache.C15843k.C15844a aVar) {
            super(lVar, aVar);
        }
    }

    public C16372b(C16388l lVar, LocalCache.C15843k.C15844a aVar) {
        this.f36487i = lVar;
        this.f36488j = aVar;
    }

    /* renamed from: c */
    public final void mo58309c() {
        C16388l<? extends I> lVar = this.f36487i;
        boolean z = true;
        if ((lVar != null) && isCancelled()) {
            Object obj = this.f36449b;
            if (!(obj instanceof AbstractFuture.C16345b) || !((AbstractFuture.C16345b) obj).f36456a) {
                z = false;
            }
            lVar.cancel(z);
        }
        this.f36487i = null;
        this.f36488j = null;
    }

    /* renamed from: i */
    public final String mo58313i() {
        String str;
        C16388l<? extends I> lVar = this.f36487i;
        F f = this.f36488j;
        String i = super.mo58313i();
        if (lVar != null) {
            str = "inputFuture=[" + lVar + "], ";
        } else {
            str = "";
        }
        if (f != null) {
            return str + "function=[" + f + "]";
        } else if (i != null) {
            return C0326j.m864i(str, i);
        } else {
            return null;
        }
    }

    public final void run() {
        AbstractFuture.C16348e eVar;
        AbstractFuture.Failure failure;
        C16388l<? extends I> lVar = this.f36487i;
        F f = this.f36488j;
        boolean z = true;
        boolean z2 = (this.f36449b instanceof AbstractFuture.C16345b) | (lVar == null);
        if (f != null) {
            z = false;
        }
        if (!z2 && !z) {
            this.f36487i = null;
            if (lVar.isCancelled()) {
                Object obj = this.f36449b;
                if (obj == null) {
                    if (lVar.isDone()) {
                        if (AbstractFuture.f36447g.mo58321b(this, (Object) null, AbstractFuture.m26471h(lVar))) {
                            AbstractFuture.m26468d(this);
                            return;
                        }
                        return;
                    }
                    eVar = new AbstractFuture.C16348e(this, lVar);
                    if (AbstractFuture.f36447g.mo58321b(this, (Object) null, eVar)) {
                        try {
                            lVar.mo7981e(eVar, DirectExecutor.INSTANCE);
                            return;
                        } catch (Throwable unused) {
                            failure = AbstractFuture.Failure.f36452b;
                        }
                    } else {
                        obj = this.f36449b;
                    }
                }
                if (obj instanceof AbstractFuture.C16345b) {
                    lVar.cancel(((AbstractFuture.C16345b) obj).f36456a);
                    return;
                }
                return;
            }
            try {
                try {
                    Object apply = ((C15784e) f).apply(C16381h.m26507u0(lVar));
                    this.f36488j = null;
                    C16373a aVar = (C16373a) this;
                    if (apply == null) {
                        apply = AbstractFuture.f36448h;
                    }
                    if (AbstractFuture.f36447g.mo58321b(aVar, (Object) null, apply)) {
                        AbstractFuture.m26468d(aVar);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    this.f36488j = null;
                    throw th;
                }
            } catch (CancellationException unused2) {
                cancel(false);
                return;
            } catch (ExecutionException e) {
                mo58317k(e.getCause());
                return;
            } catch (RuntimeException e2) {
                mo58317k(e2);
                return;
            } catch (Error e3) {
                mo58317k(e3);
                return;
            }
        } else {
            return;
        }
        AbstractFuture.f36447g.mo58321b(this, eVar, failure);
    }
}
