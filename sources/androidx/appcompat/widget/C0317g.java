package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.appcompat.widget.C0323i0;
import com.etsy.android.R;
import p260v0.C8184a;
import p289y0.C8351c;

/* renamed from: androidx.appcompat.widget.g */
public final class C0317g {

    /* renamed from: b */
    public static final PorterDuff.Mode f801b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C0317g f802c;

    /* renamed from: a */
    public C0323i0 f803a;

    /* renamed from: androidx.appcompat.widget.g$a */
    public class C0318a implements C0323i0.C0325b {

        /* renamed from: a */
        public final int[] f804a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f805b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f806c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f807d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f808e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f809f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        /* renamed from: a */
        public static boolean m825a(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static ColorStateList m826b(Context context, int i) {
            int c = C0334m0.m884c(context, R.attr.colorControlHighlight);
            int b = C0334m0.m883b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{C0334m0.f856b, C0334m0.f858d, C0334m0.f857c, C0334m0.f860f}, new int[]{b, C8351c.m16664f(c, i), C8351c.m16664f(c, i), i});
        }

        /* renamed from: c */
        public static LayerDrawable m827c(C0323i0 i0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable e = i0Var.mo3065e(context, R.drawable.abc_star_black_48dp);
            Drawable e2 = i0Var.mo3065e(context, R.drawable.abc_star_half_black_48dp);
            if ((e instanceof BitmapDrawable) && e.getIntrinsicWidth() == dimensionPixelSize && e.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) e;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((e2 instanceof BitmapDrawable) && e2.getIntrinsicWidth() == dimensionPixelSize && e2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) e2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: e */
        public static void m828e(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0359y.m994a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0317g.f801b;
            }
            drawable.setColorFilter(C0317g.m821c(i, mode));
        }

        /* renamed from: d */
        public final ColorStateList mo3052d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return C8184a.m16459b(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return C8184a.m16459b(context, R.color.abc_tint_switch_track);
            }
            if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d = C0334m0.m885d(context, R.attr.colorSwitchThumbNormal);
                if (d == null || !d.isStateful()) {
                    iArr[0] = C0334m0.f856b;
                    iArr2[0] = C0334m0.m883b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = C0334m0.f859e;
                    iArr2[1] = C0334m0.m884c(context, R.attr.colorControlActivated);
                    iArr[2] = C0334m0.f860f;
                    iArr2[2] = C0334m0.m884c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    int[] iArr3 = C0334m0.f856b;
                    iArr[0] = iArr3;
                    iArr2[0] = d.getColorForState(iArr3, 0);
                    iArr[1] = C0334m0.f859e;
                    iArr2[1] = C0334m0.m884c(context, R.attr.colorControlActivated);
                    iArr[2] = C0334m0.f860f;
                    iArr2[2] = d.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m826b(context, C0334m0.m884c(context, R.attr.colorButtonNormal));
            } else {
                if (i == R.drawable.abc_btn_borderless_material) {
                    return m826b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return m826b(context, C0334m0.m884c(context, R.attr.colorAccent));
                }
                if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    return C8184a.m16459b(context, R.color.abc_tint_spinner);
                }
                if (m825a(i, this.f805b)) {
                    return C0334m0.m885d(context, R.attr.colorControlNormal);
                }
                if (m825a(i, this.f808e)) {
                    return C8184a.m16459b(context, R.color.abc_tint_default);
                }
                if (m825a(i, this.f809f)) {
                    return C8184a.m16459b(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return C8184a.m16459b(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized C0317g m820a() {
        C0317g gVar;
        synchronized (C0317g.class) {
            if (f802c == null) {
                m822d();
            }
            gVar = f802c;
        }
        return gVar;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m821c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter g;
        synchronized (C0317g.class) {
            g = C0323i0.m849g(i, mode);
        }
        return g;
    }

    /* renamed from: d */
    public static synchronized void m822d() {
        synchronized (C0317g.class) {
            if (f802c == null) {
                C0317g gVar = new C0317g();
                f802c = gVar;
                gVar.f803a = C0323i0.m848c();
                C0323i0 i0Var = f802c.f803a;
                C0318a aVar = new C0318a();
                synchronized (i0Var) {
                    i0Var.f821e = aVar;
                }
            }
        }
    }

    /* renamed from: e */
    public static void m823e(Drawable drawable, C0336n0 n0Var, int[] iArr) {
        PorterDuff.Mode mode = C0323i0.f814f;
        if (!C0359y.m994a(drawable) || drawable.mutate() == drawable) {
            boolean z = n0Var.f865d;
            if (z || n0Var.f864c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? n0Var.f862a : null;
                PorterDuff.Mode mode2 = n0Var.f864c ? n0Var.f863b : C0323i0.f814f;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = C0323i0.m849g(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: b */
    public final synchronized Drawable mo3051b(Context context, int i) {
        return this.f803a.mo3065e(context, i);
    }
}
