package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SimpleCursorAdapter extends ResourceCursorAdapter {
    private C2409a mCursorToStringConverter;
    public int[] mFrom;
    public String[] mOriginalFrom;
    private int mStringConversionColumn = -1;
    public int[] mTo;
    private C2410b mViewBinder;

    /* renamed from: androidx.cursoradapter.widget.SimpleCursorAdapter$a */
    public interface C2409a {
        /* renamed from: a */
        CharSequence mo9149a();
    }

    /* renamed from: androidx.cursoradapter.widget.SimpleCursorAdapter$b */
    public interface C2410b {
        /* renamed from: a */
        boolean mo9150a();
    }

    @Deprecated
    public SimpleCursorAdapter(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }

    private void findColumns(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.mFrom;
            if (iArr == null || iArr.length != length) {
                this.mFrom = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.mFrom[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.mFrom = null;
    }

    public void bindView(View view, Context context, Cursor cursor) {
        boolean z;
        C2410b bVar = this.mViewBinder;
        int[] iArr = this.mTo;
        int length = iArr.length;
        int[] iArr2 = this.mFrom;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (bVar != null) {
                    int i2 = iArr2[i];
                    z = bVar.mo9150a();
                } else {
                    z = false;
                }
                if (z) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        setViewText((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        setViewImage((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    public void changeCursorAndColumns(Cursor cursor, String[] strArr, int[] iArr) {
        this.mOriginalFrom = strArr;
        this.mTo = iArr;
        findColumns(cursor, strArr);
        super.changeCursor(cursor);
    }

    public CharSequence convertToString(Cursor cursor) {
        C2409a aVar = this.mCursorToStringConverter;
        if (aVar != null) {
            return aVar.mo9149a();
        }
        int i = this.mStringConversionColumn;
        return i > -1 ? cursor.getString(i) : super.convertToString(cursor);
    }

    public C2409a getCursorToStringConverter() {
        return this.mCursorToStringConverter;
    }

    public int getStringConversionColumn() {
        return this.mStringConversionColumn;
    }

    public C2410b getViewBinder() {
        return this.mViewBinder;
    }

    public void setCursorToStringConverter(C2409a aVar) {
        this.mCursorToStringConverter = aVar;
    }

    public void setStringConversionColumn(int i) {
        this.mStringConversionColumn = i;
    }

    public void setViewBinder(C2410b bVar) {
        this.mViewBinder = bVar;
    }

    public void setViewImage(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void setViewText(TextView textView, String str) {
        textView.setText(str);
    }

    public Cursor swapCursor(Cursor cursor) {
        findColumns(cursor, this.mOriginalFrom);
        return super.swapCursor(cursor);
    }

    public SimpleCursorAdapter(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }
}
