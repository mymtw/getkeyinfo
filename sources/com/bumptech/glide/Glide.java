package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C5951c;
import com.bumptech.glide.C5957d;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.C6030k;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import com.bumptech.glide.load.engine.bitmap_recycle.C5999e;
import com.bumptech.glide.load.engine.bitmap_recycle.C6004i;
import com.bumptech.glide.load.engine.bitmap_recycle.C6007j;
import com.bumptech.glide.load.resource.bitmap.C6088l;
import com.bumptech.glide.load.resource.bitmap.C6096q;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.request.C6127f;
import com.bumptech.glide.request.C6128g;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p036c5.C4422i;
import p036c5.C4426l;
import p168l4.C7255g;
import p168l4.C7256h;
import p168l4.C7257i;
import p168l4.C7259j;
import p178m4.C7322a;
import p188n4.C7448b;
import p188n4.C7450d;
import p273w4.C8234c;
import p273w4.C8236e;
import p284x4.C8318c;
import p284x4.C8320e;
import p302z4.C8448i;

public class Glide implements ComponentCallbacks2 {
    private static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
    private static final String TAG = "Glide";
    private static volatile Glide glide;
    private static volatile boolean isInitializing;
    private final C5996b arrayPool;
    private final C5998d bitmapPool;
    private C7448b bitmapPreFiller;
    private final C8234c connectivityMonitorFactory;
    private final C5941a defaultRequestOptionsFactory;
    private final C6030k engine;
    private final GlideContext glideContext;
    private final List<RequestManager> managers = new ArrayList();
    private final C7257i memoryCache;
    private MemoryCategory memoryCategory = MemoryCategory.NORMAL;
    private final Registry registry;
    private final RequestManagerRetriever requestManagerRetriever;

    /* renamed from: com.bumptech.glide.Glide$a */
    public interface C5941a {
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f0  */
    public Glide(android.content.Context r28, com.bumptech.glide.load.engine.C6030k r29, p168l4.C7257i r30, com.bumptech.glide.load.engine.bitmap_recycle.C5998d r31, com.bumptech.glide.load.engine.bitmap_recycle.C5996b r32, com.bumptech.glide.manager.RequestManagerRetriever r33, p273w4.C8234c r34, int r35, com.bumptech.glide.Glide.C5941a r36, java.util.Map<java.lang.Class<?>, com.bumptech.glide.C5961f<?, ?>> r37, java.util.List<com.bumptech.glide.request.C6127f<java.lang.Object>> r38, com.bumptech.glide.C5957d r39) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r31
            r4 = r32
            r11 = r39
            java.lang.Class<i4.a> r3 = p138i4.C6987a.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Class<byte[]> r7 = byte[].class
            r27.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.managers = r8
            com.bumptech.glide.MemoryCategory r8 = com.bumptech.glide.MemoryCategory.NORMAL
            r1.memoryCategory = r8
            r10 = r29
            r1.engine = r10
            r1.bitmapPool = r2
            r1.arrayPool = r4
            r8 = r30
            r1.memoryCache = r8
            r8 = r33
            r1.requestManagerRetriever = r8
            r8 = r34
            r1.connectivityMonitorFactory = r8
            r8 = r36
            r1.defaultRequestOptionsFactory = r8
            android.content.res.Resources r9 = r28.getResources()
            com.bumptech.glide.Registry r12 = new com.bumptech.glide.Registry
            r12.<init>()
            r1.registry = r12
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser r13 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser
            r13.<init>()
            e0.a r14 = r12.f12731g
            monitor-enter(r14)
            java.lang.Object r15 = r14.f14744b     // Catch:{ all -> 0x0427 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ all -> 0x0427 }
            r15.add(r13)     // Catch:{ all -> 0x0427 }
            monitor-exit(r14)
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 27
            if (r13 < r14) goto L_0x006d
            com.bumptech.glide.load.resource.bitmap.o r14 = new com.bumptech.glide.load.resource.bitmap.o
            r14.<init>()
            e0.a r15 = r12.f12731g
            monitor-enter(r15)
            java.lang.Object r8 = r15.f14744b     // Catch:{ all -> 0x006a }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x006a }
            r8.add(r14)     // Catch:{ all -> 0x006a }
            monitor-exit(r15)
            goto L_0x006d
        L_0x006a:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x006d:
            java.util.List r8 = r12.mo16764d()
            u4.a r14 = new u4.a
            r14.<init>(r0, r8, r2, r4)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r15 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$g r10 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$g
            r10.<init>()
            r15.<init>(r2, r10)
            com.bumptech.glide.load.resource.bitmap.l r10 = new com.bumptech.glide.load.resource.bitmap.l
            java.util.List r1 = r12.mo16764d()
            r16 = r7
            android.util.DisplayMetrics r7 = r9.getDisplayMetrics()
            r10.<init>(r1, r7, r2, r4)
            r1 = 28
            if (r13 < r1) goto L_0x00a8
            java.lang.Class<com.bumptech.glide.c$c> r7 = com.bumptech.glide.C5951c.C5954c.class
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r11.f12754a
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L_0x00a8
            com.bumptech.glide.load.resource.bitmap.s r1 = new com.bumptech.glide.load.resource.bitmap.s
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.h r7 = new com.bumptech.glide.load.resource.bitmap.h
            r7.<init>()
            goto L_0x00b2
        L_0x00a8:
            com.bumptech.glide.load.resource.bitmap.g r7 = new com.bumptech.glide.load.resource.bitmap.g
            r7.<init>(r10)
            com.bumptech.glide.load.resource.bitmap.x r1 = new com.bumptech.glide.load.resource.bitmap.x
            r1.<init>(r10, r4)
        L_0x00b2:
            r17 = r5
            java.lang.String r5 = "Animation"
            r18 = r6
            r6 = 28
            if (r13 < r6) goto L_0x00f0
            java.lang.Class<com.bumptech.glide.c$b> r6 = com.bumptech.glide.C5951c.C5953b.class
            r30 = r13
            java.util.Map<java.lang.Class<?>, java.lang.Object> r13 = r11.f12754a
            boolean r6 = r13.containsKey(r6)
            if (r6 == 0) goto L_0x00ed
            java.lang.Class<java.io.InputStream> r6 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.Drawable> r13 = android.graphics.drawable.Drawable.class
            s4.a$c r11 = new s4.a$c
            r19 = r3
            s4.a r3 = new s4.a
            r3.<init>(r8, r4)
            r11.<init>(r3)
            r12.mo16761a(r11, r6, r13, r5)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.Drawable> r6 = android.graphics.drawable.Drawable.class
            s4.a$b r11 = new s4.a$b
            s4.a r13 = new s4.a
            r13.<init>(r8, r4)
            r11.<init>(r13)
            r12.mo16761a(r11, r3, r6, r5)
            goto L_0x00f4
        L_0x00ed:
            r19 = r3
            goto L_0x00f4
        L_0x00f0:
            r19 = r3
            r30 = r13
        L_0x00f4:
            s4.e r3 = new s4.e
            r3.<init>(r0)
            o4.s$c r6 = new o4.s$c
            r6.<init>(r9)
            o4.s$d r11 = new o4.s$d
            r11.<init>(r9)
            o4.s$b r13 = new o4.s$b
            r13.<init>(r9)
            o4.s$a r0 = new o4.s$a
            r0.<init>(r9)
            r33 = r0
            com.bumptech.glide.load.resource.bitmap.c r0 = new com.bumptech.glide.load.resource.bitmap.c
            r0.<init>(r4)
            r34 = r11
            v4.a r11 = new v4.a
            r11.<init>()
            r20 = r11
            kotlin.reflect.p r11 = new kotlin.reflect.p
            r11.<init>()
            r21 = r11
            android.content.ContentResolver r11 = r28.getContentResolver()
            r22 = r11
            java.lang.Class<java.nio.ByteBuffer> r11 = java.nio.ByteBuffer.class
            r23 = r13
            com.google.android.play.core.assetpacks.c1 r13 = new com.google.android.play.core.assetpacks.c1
            r13.<init>()
            r24 = r6
            y4.a r6 = r12.f12726b
            monitor-enter(r6)
            r25 = r3
            java.util.ArrayList r3 = r6.f18389a     // Catch:{ all -> 0x0422 }
            r26 = r5
            y4.a$a r5 = new y4.a$a     // Catch:{ all -> 0x0422 }
            r5.<init>(r11, r13)     // Catch:{ all -> 0x0422 }
            r3.add(r5)     // Catch:{ all -> 0x0422 }
            monitor-exit(r6)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c r5 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
            r5.<init>((java.lang.Object) r4)
            y4.a r6 = r12.f12726b
            monitor-enter(r6)
            java.util.ArrayList r11 = r6.f18389a     // Catch:{ all -> 0x041d }
            y4.a$a r13 = new y4.a$a     // Catch:{ all -> 0x041d }
            r13.<init>(r3, r5)     // Catch:{ all -> 0x041d }
            r11.add(r13)     // Catch:{ all -> 0x041d }
            monitor-exit(r6)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            java.lang.String r6 = "Bitmap"
            r12.mo16761a(r7, r3, r5, r6)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r12.mo16761a(r1, r3, r5, r6)
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            com.bumptech.glide.load.resource.bitmap.u r11 = new com.bumptech.glide.load.resource.bitmap.u
            r11.<init>(r10)
            r12.mo16761a(r11, r3, r5, r6)
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r12.mo16761a(r15, r3, r5, r6)
            java.lang.Class<android.content.res.AssetFileDescriptor> r3 = android.content.res.AssetFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r10 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$c r11 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$c
            r11.<init>()
            r10.<init>(r2, r11)
            r12.mo16761a(r10, r3, r5, r6)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            o4.u$a<?> r10 = p197o4.C7609u.C7610a.f16886a
            r12.mo16763c(r3, r5, r10)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            com.bumptech.glide.load.resource.bitmap.z r11 = new com.bumptech.glide.load.resource.bitmap.z
            r11.<init>()
            r12.mo16761a(r11, r3, r5, r6)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            r12.mo16762b(r3, r0)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.a r11 = new com.bumptech.glide.load.resource.bitmap.a
            r11.<init>(r9, r7)
            java.lang.String r7 = "BitmapDrawable"
            r12.mo16761a(r11, r3, r5, r7)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.a r11 = new com.bumptech.glide.load.resource.bitmap.a
            r11.<init>(r9, r1)
            r12.mo16761a(r11, r3, r5, r7)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r3 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.a r5 = new com.bumptech.glide.load.resource.bitmap.a
            r5.<init>(r9, r15)
            r12.mo16761a(r5, r1, r3, r7)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.b r3 = new com.bumptech.glide.load.resource.bitmap.b
            r3.<init>(r2, r0)
            r12.mo16762b(r1, r3)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r1 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            u4.g r3 = new u4.g
            r3.<init>(r8, r14, r4)
            r5 = r26
            r12.mo16761a(r3, r0, r1, r5)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r1 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            r12.mo16761a(r14, r0, r1, r5)
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.google.android.gms.measurement.internal.u r1 = new com.google.android.gms.measurement.internal.u
            r1.<init>()
            r12.mo16762b(r0, r1)
            r0 = r19
            r12.mo16763c(r0, r0, r10)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            u4.e r3 = new u4.e
            r3.<init>(r2)
            r12.mo16761a(r3, r0, r1, r6)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            java.lang.String r3 = "legacy_append"
            r5 = r25
            r12.mo16761a(r5, r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            com.bumptech.glide.load.resource.bitmap.v r6 = new com.bumptech.glide.load.resource.bitmap.v
            r6.<init>(r5, r2)
            r12.mo16761a(r6, r0, r1, r3)
            r4.a$a r0 = new r4.a$a
            r0.<init>()
            r12.mo16767g(r0)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            o4.c$b r5 = new o4.c$b
            r5.<init>()
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            o4.e$e r5 = new o4.e$e
            r5.<init>()
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            t4.a r5 = new t4.a
            r5.<init>()
            r12.mo16761a(r5, r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            o4.e$b r5 = new o4.e$b
            r5.<init>()
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r12.mo16763c(r0, r1, r10)
            com.bumptech.glide.load.data.k$a r0 = new com.bumptech.glide.load.data.k$a
            r0.<init>(r4)
            r12.mo16767g(r0)
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r12.mo16767g(r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r5 = r24
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r6 = r23
            r12.mo16763c(r0, r1, r6)
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r7 = r18
            r12.mo16763c(r7, r1, r5)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r12.mo16763c(r7, r1, r6)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5 = r34
            r12.mo16763c(r7, r1, r5)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r6 = r33
            r12.mo16763c(r0, r1, r6)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r12.mo16763c(r7, r1, r6)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            o4.d$c r1 = new o4.d$c
            r1.<init>()
            r5 = r17
            r12.mo16763c(r5, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            o4.d$c r6 = new o4.d$c
            r6.<init>()
            r12.mo16763c(r0, r1, r6)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            o4.t$c r1 = new o4.t$c
            r1.<init>()
            r12.mo16763c(r5, r0, r1)
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            o4.t$b r1 = new o4.t$b
            r1.<init>()
            r12.mo16763c(r5, r0, r1)
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            o4.t$a r1 = new o4.t$a
            r1.<init>()
            r12.mo16763c(r5, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            o4.a$c r5 = new o4.a$c
            android.content.res.AssetManager r6 = r28.getAssets()
            r5.<init>(r6)
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            o4.a$b r5 = new o4.a$b
            android.content.res.AssetManager r6 = r28.getAssets()
            r5.<init>(r6)
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            p4.b$a r5 = new p4.b$a
            r6 = r28
            r5.<init>(r6)
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            p4.c$a r5 = new p4.c$a
            r5.<init>(r6)
            r12.mo16763c(r0, r1, r5)
            r0 = 29
            r1 = r30
            if (r1 < r0) goto L_0x0330
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            p4.d$c r5 = new p4.d$c
            r5.<init>(r6)
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            p4.d$b r5 = new p4.d$b
            r5.<init>(r6)
            r12.mo16763c(r0, r1, r5)
        L_0x0330:
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            o4.v$d r5 = new o4.v$d
            r7 = r22
            r5.<init>(r7)
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            o4.v$b r5 = new o4.v$b
            r5.<init>(r7)
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            o4.v$a r5 = new o4.v$a
            r5.<init>(r7)
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            o4.w$a r5 = new o4.w$a
            r5.<init>()
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<java.net.URL> r0 = java.net.URL.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            p4.e$a r5 = new p4.e$a
            r5.<init>()
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            o4.j$a r5 = new o4.j$a
            r5.<init>(r6)
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<o4.f> r0 = p197o4.C7575f.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            p4.a$a r5 = new p4.a$a
            r5.<init>()
            r12.mo16763c(r0, r1, r5)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            o4.b$a r1 = new o4.b$a
            r1.<init>()
            r5 = r16
            r12.mo16763c(r5, r0, r1)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            o4.b$d r1 = new o4.b$d
            r1.<init>()
            r12.mo16763c(r5, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r12.mo16763c(r0, r1, r10)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r12.mo16763c(r0, r1, r10)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            s4.f r7 = new s4.f
            r7.<init>()
            r12.mo16761a(r7, r0, r1, r3)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            n2.x r3 = new n2.x
            r3.<init>(r9)
            r12.mo16768h(r0, r1, r3)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            r1 = r20
            r12.mo16768h(r0, r5, r1)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            v4.b r3 = new v4.b
            r7 = r21
            r3.<init>(r2, r1, r7)
            r12.mo16768h(r0, r5, r3)
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            r12.mo16768h(r0, r5, r7)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$d r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$d
            r1.<init>()
            r0.<init>(r2, r1)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.String r3 = "legacy_append"
            r12.mo16761a(r0, r1, r2, r3)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r2 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.a r3 = new com.bumptech.glide.load.resource.bitmap.a
            r3.<init>(r9, r0)
            java.lang.String r0 = "legacy_append"
            r12.mo16761a(r3, r1, r2, r0)
            z4.g r0 = new z4.g
            r0.<init>()
            com.bumptech.glide.GlideContext r1 = new com.bumptech.glide.GlideContext
            r2 = r1
            r3 = r28
            r4 = r32
            r5 = r12
            r6 = r0
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r29
            r11 = r39
            r12 = r35
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r27
            r2.glideContext = r1
            return
        L_0x041d:
            r0 = move-exception
            r2 = r27
            monitor-exit(r6)
            throw r0
        L_0x0422:
            r0 = move-exception
            r2 = r27
            monitor-exit(r6)
            throw r0
        L_0x0427:
            r0 = move-exception
            r2 = r1
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Glide.<init>(android.content.Context, com.bumptech.glide.load.engine.k, l4.i, com.bumptech.glide.load.engine.bitmap_recycle.d, com.bumptech.glide.load.engine.bitmap_recycle.b, com.bumptech.glide.manager.RequestManagerRetriever, w4.c, int, com.bumptech.glide.Glide$a, java.util.Map, java.util.List, com.bumptech.glide.d):void");
    }

    private static void checkAndInitializeGlide(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!isInitializing) {
            isInitializing = true;
            initializeGlide(context, generatedAppGlideModule);
            isInitializing = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static void enableHardwareBitmaps() {
        C6096q a = C6096q.m12102a();
        a.getClass();
        C4426l.m10127a();
        a.f13113f.set(true);
    }

    public static Glide get(Context context) {
        if (glide == null) {
            GeneratedAppGlideModule annotationGeneratedGlideModules = getAnnotationGeneratedGlideModules(context.getApplicationContext());
            synchronized (Glide.class) {
                if (glide == null) {
                    checkAndInitializeGlide(context, annotationGeneratedGlideModules);
                }
            }
        }
        return glide;
    }

    private static GeneratedAppGlideModule getAnnotationGeneratedGlideModules(Context context) {
        try {
            return GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e) {
            throwIncorrectGlideModule(e);
        } catch (IllegalAccessException e2) {
            throwIncorrectGlideModule(e2);
        } catch (NoSuchMethodException e3) {
            throwIncorrectGlideModule(e3);
        } catch (InvocationTargetException e4) {
            throwIncorrectGlideModule(e4);
        }
        return null;
    }

    public static File getPhotoCacheDir(Context context) {
        return getPhotoCacheDir(context, DEFAULT_DISK_CACHE_DIR);
    }

    private static RequestManagerRetriever getRetriever(Context context) {
        if (context != null) {
            return get(context).getRequestManagerRetriever();
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    @Deprecated
    public static synchronized void init(Glide glide2) {
        synchronized (Glide.class) {
            if (glide != null) {
                tearDown();
            }
            glide = glide2;
        }
    }

    private static void initializeGlide(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        initializeGlide(context, new C5951c(), generatedAppGlideModule);
    }

    public static void tearDown() {
        synchronized (Glide.class) {
            if (glide != null) {
                glide.getContext().getApplicationContext().unregisterComponentCallbacks(glide);
                glide.engine.mo16972e();
            }
            glide = null;
        }
    }

    private static void throwIncorrectGlideModule(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static RequestManager with(Context context) {
        return getRetriever(context).get(context);
    }

    public void clearDiskCache() {
        if (C4426l.m10134h()) {
            this.engine.f12937f.mo16975a().clear();
            return;
        }
        throw new IllegalArgumentException("You must call this method on a background thread");
    }

    public void clearMemory() {
        C4426l.m10127a();
        ((C4422i) this.memoryCache).mo14377e(0);
        this.bitmapPool.mo16921b();
        this.arrayPool.mo16913b();
    }

    public C5996b getArrayPool() {
        return this.arrayPool;
    }

    public C5998d getBitmapPool() {
        return this.bitmapPool;
    }

    public C8234c getConnectivityMonitorFactory() {
        return this.connectivityMonitorFactory;
    }

    public Context getContext() {
        return this.glideContext.getBaseContext();
    }

    public GlideContext getGlideContext() {
        return this.glideContext;
    }

    public Registry getRegistry() {
        return this.registry;
    }

    public RequestManagerRetriever getRequestManagerRetriever() {
        return this.requestManagerRetriever;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        clearMemory();
    }

    public void onTrimMemory(int i) {
        trimMemory(i);
    }

    public synchronized void preFillBitmapPool(C7450d.C7451a... aVarArr) {
        if (this.bitmapPreFiller == null) {
            ((C5951c.C5952a) this.defaultRequestOptionsFactory).getClass();
            this.bitmapPreFiller = new C7448b(this.memoryCache, this.bitmapPool, (DecodeFormat) new C6128g().f13212r.mo19443c(C6088l.f13086f));
        }
        this.bitmapPreFiller.mo19820a(aVarArr);
    }

    public void registerRequestManager(RequestManager requestManager) {
        synchronized (this.managers) {
            if (!this.managers.contains(requestManager)) {
                this.managers.add(requestManager);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public boolean removeFromManagers(C8448i<?> iVar) {
        synchronized (this.managers) {
            for (RequestManager untrack : this.managers) {
                if (untrack.untrack(iVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public MemoryCategory setMemoryCategory(MemoryCategory memoryCategory2) {
        C4426l.m10127a();
        C7257i iVar = this.memoryCache;
        float multiplier = memoryCategory2.getMultiplier();
        C4422i iVar2 = (C4422i) iVar;
        synchronized (iVar2) {
            if (multiplier >= 0.0f) {
                long round = (long) Math.round(((float) iVar2.f9701b) * multiplier);
                iVar2.f9702c = round;
                iVar2.mo14377e(round);
            } else {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
        }
        this.bitmapPool.mo16922c(memoryCategory2.getMultiplier());
        MemoryCategory memoryCategory3 = this.memoryCategory;
        this.memoryCategory = memoryCategory2;
        return memoryCategory3;
    }

    public void trimMemory(int i) {
        long j;
        C4426l.m10127a();
        synchronized (this.managers) {
            for (RequestManager onTrimMemory : this.managers) {
                onTrimMemory.onTrimMemory(i);
            }
        }
        C7256h hVar = (C7256h) this.memoryCache;
        if (i >= 40) {
            hVar.mo14377e(0);
        } else if (i >= 20 || i == 15) {
            synchronized (hVar) {
                j = hVar.f9702c;
            }
            hVar.mo14377e(j / 2);
        } else {
            hVar.getClass();
        }
        this.bitmapPool.mo16920a(i);
        this.arrayPool.mo16912a(i);
    }

    public void unregisterRequestManager(RequestManager requestManager) {
        synchronized (this.managers) {
            if (this.managers.contains(requestManager)) {
                this.managers.remove(requestManager);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public static File getPhotoCacheDir(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.isDirectory() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        if (Log.isLoggable(TAG, 6)) {
            Log.e(TAG, "default disk cache dir is null");
        }
        return null;
    }

    private static void initializeGlide(Context context, C5951c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        List<C8318c> list;
        C5951c cVar2 = cVar;
        GeneratedAppGlideModule generatedAppGlideModule2 = generatedAppGlideModule;
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule2 == null || generatedAppGlideModule.mo16716c()) {
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            arrayList.add(C8320e.m16615a(next));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + next);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                list = arrayList;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        } else {
            list = emptyList;
        }
        if (generatedAppGlideModule2 != null && !generatedAppGlideModule.mo16712d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.mo16712d();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C8318c cVar3 = (C8318c) it.next();
                if (d.contains(cVar3.getClass())) {
                    if (Log.isLoggable(TAG, 3)) {
                        Log.d(TAG, "AppGlideModule excludes manifest GlideModule: " + cVar3);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(TAG, 3)) {
            for (C8318c cVar4 : list) {
                StringBuilder h = C0072d.m201h("Discovered GlideModule from manifest: ");
                h.append(cVar4.getClass());
                Log.d(TAG, h.toString());
            }
        }
        RequestManagerRetriever.C6119b bVar = null;
        if (generatedAppGlideModule2 != null) {
            bVar = generatedAppGlideModule.mo16713e();
        }
        cVar2.f12751n = bVar;
        for (C8318c a : list) {
            a.mo16714a(applicationContext, cVar2);
        }
        if (generatedAppGlideModule2 != null) {
            generatedAppGlideModule2.mo16714a(applicationContext, cVar2);
        }
        if (cVar2.f12744g == null) {
            C7322a.C7323a aVar = new C7322a.C7323a();
            if (C7322a.f16235d == 0) {
                C7322a.f16235d = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = C7322a.f16235d;
            if (!TextUtils.isEmpty("source")) {
                ThreadPoolExecutor threadPoolExecutor = r7;
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C7322a.C7325b(aVar, "source", false));
                cVar2.f12744g = new C7322a(threadPoolExecutor);
            } else {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
        }
        if (cVar2.f12745h == null) {
            int i2 = C7322a.f16235d;
            C7322a.C7323a aVar2 = new C7322a.C7323a();
            if (!TextUtils.isEmpty("disk-cache")) {
                cVar2.f12745h = new C7322a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C7322a.C7325b(aVar2, "disk-cache", true)));
            } else {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
        }
        if (cVar2.f12752o == null) {
            if (C7322a.f16235d == 0) {
                C7322a.f16235d = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i3 = C7322a.f16235d >= 4 ? 2 : 1;
            C7322a.C7323a aVar3 = new C7322a.C7323a();
            if (!TextUtils.isEmpty(ResponseConstants.ANIMATION)) {
                cVar2.f12752o = new C7322a(new ThreadPoolExecutor(i3, i3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C7322a.C7325b(aVar3, ResponseConstants.ANIMATION, true)));
            } else {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
        }
        if (cVar2.f12747j == null) {
            cVar2.f12747j = new C7259j(new C7259j.C7260a(applicationContext));
        }
        if (cVar2.f12748k == null) {
            cVar2.f12748k = new C8236e();
        }
        if (cVar2.f12741d == null) {
            int i4 = cVar2.f12747j.f16108a;
            if (i4 > 0) {
                cVar2.f12741d = new C6007j((long) i4);
            } else {
                cVar2.f12741d = new C5999e();
            }
        }
        if (cVar2.f12742e == null) {
            cVar2.f12742e = new C6004i(cVar2.f12747j.f16110c);
        }
        if (cVar2.f12743f == null) {
            cVar2.f12743f = new C7256h((long) cVar2.f12747j.f16109b);
        }
        if (cVar2.f12746i == null) {
            cVar2.f12746i = new C7255g(applicationContext, 262144000);
        }
        if (cVar2.f12740c == null) {
            cVar2.f12740c = new C6030k(cVar2.f12743f, cVar2.f12746i, cVar2.f12745h, cVar2.f12744g, new C7322a(new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, C7322a.f16234c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C7322a.C7325b(new C7322a.C7323a(), "source-unlimited", false))), cVar2.f12752o);
        }
        List<C6127f<Object>> list2 = cVar2.f12753p;
        if (list2 == null) {
            cVar2.f12753p = Collections.emptyList();
        } else {
            cVar2.f12753p = Collections.unmodifiableList(list2);
        }
        C5957d.C5958a aVar4 = cVar2.f12739b;
        aVar4.getClass();
        C5957d dVar = new C5957d(aVar4);
        Glide glide2 = r2;
        Glide glide3 = new Glide(applicationContext, cVar2.f12740c, cVar2.f12743f, cVar2.f12741d, cVar2.f12742e, new RequestManagerRetriever(cVar2.f12751n, dVar), cVar2.f12748k, cVar2.f12749l, cVar2.f12750m, cVar2.f12738a, cVar2.f12753p, dVar);
        for (C8318c cVar5 : list) {
            try {
                cVar5.mo16715b();
            } catch (AbstractMethodError e2) {
                StringBuilder h2 = C0072d.m201h("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                h2.append(cVar5.getClass().getName());
                throw new IllegalStateException(h2.toString(), e2);
            }
        }
        if (generatedAppGlideModule2 != null) {
            generatedAppGlideModule.mo16715b();
        }
        Glide glide4 = glide2;
        applicationContext.registerComponentCallbacks(glide4);
        glide = glide4;
    }

    public static RequestManager with(Activity activity) {
        return getRetriever(activity).get(activity);
    }

    public static RequestManager with(FragmentActivity fragmentActivity) {
        return getRetriever(fragmentActivity).get(fragmentActivity);
    }

    public static RequestManager with(Fragment fragment) {
        return getRetriever(fragment.getContext()).get(fragment);
    }

    public static void init(Context context, C5951c cVar) {
        GeneratedAppGlideModule annotationGeneratedGlideModules = getAnnotationGeneratedGlideModules(context);
        synchronized (Glide.class) {
            if (glide != null) {
                tearDown();
            }
            initializeGlide(context, cVar, annotationGeneratedGlideModules);
        }
    }

    @Deprecated
    public static RequestManager with(android.app.Fragment fragment) {
        return getRetriever(fragment.getActivity()).get(fragment);
    }

    public static RequestManager with(View view) {
        return getRetriever(view.getContext()).get(view);
    }
}
