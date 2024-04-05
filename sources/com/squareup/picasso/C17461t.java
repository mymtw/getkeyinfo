package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import com.squareup.picasso.C17452n;
import com.squareup.picasso.C17459s;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.t */
public final class C17461t {

    /* renamed from: e */
    public static final AtomicInteger f38172e = new AtomicInteger();

    /* renamed from: a */
    public final Picasso f38173a;

    /* renamed from: b */
    public final C17459s.C17460a f38174b;

    /* renamed from: c */
    public boolean f38175c;

    /* renamed from: d */
    public int f38176d;

    public C17461t(Picasso picasso, Uri uri, int i) {
        picasso.getClass();
        this.f38173a = picasso;
        this.f38174b = new C17459s.C17460a(uri, i, picasso.f38049j);
    }

    /* renamed from: a */
    public final void mo68635a(ImageView imageView, C17439e eVar) {
        ImageView imageView2 = imageView;
        C17439e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        StringBuilder sb = C17427a0.f38069a;
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        } else if (imageView2 != null) {
            C17459s.C17460a aVar = this.f38174b;
            if (!((aVar.f38165a == null && aVar.f38166b == 0) ? false : true)) {
                this.f38173a.mo68569a(imageView2);
                int i = this.f38176d;
                C17456q.m29312b(imageView2, i != 0 ? this.f38173a.f38042c.getDrawable(i) : null);
                return;
            }
            if (this.f38175c) {
                if (!((aVar.f38167c == 0 && aVar.f38168d == 0) ? false : true)) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        int i2 = this.f38176d;
                        C17456q.m29312b(imageView2, i2 != 0 ? this.f38173a.f38042c.getDrawable(i2) : null);
                        Picasso picasso = this.f38173a;
                        C17442h hVar = new C17442h(this, imageView2, eVar2);
                        if (picasso.f38047h.containsKey(imageView2)) {
                            picasso.mo68569a(imageView2);
                        }
                        picasso.f38047h.put(imageView2, hVar);
                        return;
                    }
                    this.f38174b.mo68634a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            int andIncrement = f38172e.getAndIncrement();
            C17459s.C17460a aVar2 = this.f38174b;
            if (aVar2.f38171g == null) {
                aVar2.f38171g = Picasso.Priority.NORMAL;
            }
            Uri uri = aVar2.f38165a;
            int i3 = aVar2.f38166b;
            int i4 = i3;
            Uri uri2 = uri;
            C17459s sVar = new C17459s(uri, i3, aVar2.f38169e, aVar2.f38167c, aVar2.f38168d, aVar2.f38170f, aVar2.f38171g);
            sVar.f38147a = andIncrement;
            sVar.f38148b = nanoTime;
            if (this.f38173a.f38051l) {
                C17427a0.m29282e("Main", "created", sVar.mo68632d(), sVar.toString());
            }
            ((Picasso.C17423d.C17424a) this.f38173a.f38040a).getClass();
            StringBuilder sb2 = C17427a0.f38069a;
            if (uri2 != null) {
                String uri3 = uri2.toString();
                sb2.ensureCapacity(uri3.length() + 50);
                sb2.append(uri3);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(i4);
            }
            sb2.append(10);
            if (0.0f != 0.0f) {
                sb2.append("rotation:");
                sb2.append(0.0f);
                sb2.append(10);
            }
            if (sVar.mo68629a()) {
                sb2.append("resize:");
                sb2.append(sVar.f38152f);
                sb2.append('x');
                sb2.append(sVar.f38153g);
                sb2.append(10);
            }
            List<C17469y> list = sVar.f38151e;
            if (list != null) {
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    sb2.append(sVar.f38151e.get(i5).key());
                    sb2.append(10);
                }
            }
            String sb3 = sb2.toString();
            C17427a0.f38069a.setLength(0);
            if (MemoryPolicy.shouldReadFromMemoryCache(0)) {
                Picasso picasso2 = this.f38173a;
                C17452n.C17453a aVar3 = (C17452n.C17453a) ((C17452n) picasso2.f38044e).f38126a.get(sb3);
                Bitmap bitmap = aVar3 != null ? aVar3.f38127a : null;
                if (bitmap != null) {
                    picasso2.f38045f.f38183b.sendEmptyMessage(0);
                } else {
                    picasso2.f38045f.f38183b.sendEmptyMessage(1);
                }
                if (bitmap != null) {
                    this.f38173a.mo68569a(imageView2);
                    Picasso picasso3 = this.f38173a;
                    Context context = picasso3.f38042c;
                    Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
                    C17456q.m29311a(imageView, context, bitmap, loadedFrom, false, picasso3.f38050k);
                    if (this.f38173a.f38051l) {
                        C17427a0.m29282e("Main", "completed", sVar.mo68632d(), "from " + loadedFrom);
                    }
                    if (eVar2 != null) {
                        eVar.onSuccess();
                        return;
                    }
                    return;
                }
            }
            int i6 = this.f38176d;
            C17456q.m29312b(imageView2, i6 != 0 ? this.f38173a.f38042c.getDrawable(i6) : null);
            this.f38173a.mo68571c(new C17450l(this.f38173a, imageView, sVar, sb3, eVar));
        } else {
            throw new IllegalArgumentException("Target must not be null.");
        }
    }
}
