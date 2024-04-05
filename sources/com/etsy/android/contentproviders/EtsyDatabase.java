package com.etsy.android.contentproviders;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.p013v4.media.C0070b;
import com.etsy.android.lib.logger.C8694h;

public class EtsyDatabase extends SQLiteOpenHelper {
    private static final String DB_NAME = "etsy_data";
    private static final int DB_VERSION = 47;
    private static final int VERSION_BEFORE_LOCAL_HISTORY = 43;

    public EtsyDatabase(Context context) {
        super(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, 47);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE  TABLE listing (_id integer primary key autoincrement, listing_id text unique, title text  not  null , price text , shop_name text , currency text , favorite boolean not null, in_collection boolean not null, image_url text  not  null , full_width integer , full_height integer , is_portrait boolean , view_time integer , image_color integer  not  null , is_sold_out boolean );");
        sQLiteDatabase.execSQL("CREATE  TABLE shop (_id integer primary key autoincrement, shop_id text unique, user_id text  not  null , title text  not  null , item_id_list text , avatar_url text , favorite boolean not null, item_img_list text , item_img_color_list text , rating integer , review_count integer );");
        sQLiteDatabase.execSQL("CREATE  TABLE user (_id integer primary key autoincrement, user_id text unique, title text  not  null , followed boolean not null, item_id_list text , avatar_url text , item_img_list text , item_img_color_list text);");
        sQLiteDatabase.execSQL("CREATE  TABLE local_market_history (_id integer primary key autoincrement, local_market_id text  unique,view_time integer );");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C8694h.f19097a.mo21312f(C0070b.m183e("Upgrading database. Existing contents will be lost. [", i, "]->[", i2, "]"));
        if (i == 47) {
            return;
        }
        if (i != 43) {
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS local_market_history");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS listing");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS shop");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS user");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS shop_search");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS treasury");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS activity");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS activity_feed");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS segment");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS popular");
            sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS history");
            onCreate(sQLiteDatabase);
            return;
        }
        sQLiteDatabase.execSQL("DROP  TABLE  IF  EXISTS local_market_history");
        sQLiteDatabase.execSQL("CREATE  TABLE local_market_history (_id integer primary key autoincrement, local_market_id text  unique,view_time integer );");
    }
}
