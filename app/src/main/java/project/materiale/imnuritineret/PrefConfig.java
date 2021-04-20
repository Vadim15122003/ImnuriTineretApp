package project.materiale.imnuritineret;

import android.content.Context;
import android.content.SharedPreferences;


public class PrefConfig {
    private static final String MY_PREFERENCE_NAME = "project.materiale.imnuritineret";
    private static final String PROGRESS_SAVE ="progress_save";
    public static void SaveSBprogress(Context context, int sb_progress) {
        SharedPreferences pref=context.getSharedPreferences(MY_PREFERENCE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(PROGRESS_SAVE,sb_progress);
        editor.apply();
    }
    public static int load_saved_progress(Context context){
        SharedPreferences pref=context.getSharedPreferences(MY_PREFERENCE_NAME,Context.MODE_PRIVATE);
        return pref.getInt(PROGRESS_SAVE,30);
    }


    private static final String STROKE_REFREN = "project.materiale.imnuritineret";
    private static final String REFREN_STROKE ="refren_stroke";
    public static void SaveRefrenStroke(Context context, int i) {
        SharedPreferences pref=context.getSharedPreferences(STROKE_REFREN,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(REFREN_STROKE,i);
        editor.apply();
    }
    public static int load_saved_refren_stroke_data(Context context){
        SharedPreferences pref=context.getSharedPreferences(STROKE_REFREN,Context.MODE_PRIVATE);
        return pref.getInt(REFREN_STROKE,1);
    }


    private static final String C1 = "project.materiale.imnuritineret";
    private static final String C1C ="background_imn";
    public static void SaveC1(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C1,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C1C,color);
        editor.apply();
    }
    public static int load_saved_color1(Context context){
        SharedPreferences pref=context.getSharedPreferences(C1,Context.MODE_PRIVATE);
        return pref.getInt(C1C,0);
    }


    private static final String C2 = "project.materiale.imnuritineret";
    private static final String C2C ="c2";
    public static void SaveC2(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C2,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C2C,color);
        editor.apply();
    }
    public static int load_saved_color2(Context context){
        SharedPreferences pref=context.getSharedPreferences(C2,Context.MODE_PRIVATE);
        return pref.getInt(C2C,0);
    }


    private static final String C3 = "project.materiale.imnuritineret";
    private static final String C3C ="c3";
    public static void SaveC3(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C3,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C3C,color);
        editor.apply();
    }
    public static int load_saved_color3(Context context){
        SharedPreferences pref=context.getSharedPreferences(C3,Context.MODE_PRIVATE);
        return pref.getInt(C3C,0);
    }


    private static final String C4 = "project.materiale.imnuritineret";
    private static final String C4C ="c4";
    public static void SaveC4(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C4,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C4C,color);
        editor.apply();
    }
    public static int load_saved_color4(Context context){
        SharedPreferences pref=context.getSharedPreferences(C4,Context.MODE_PRIVATE);
        return pref.getInt(C4C,0);
    }


    private static final String C5 = "project.materiale.imnuritineret";
    private static final String C5C ="c5";
    public static void SaveC5(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C5,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C5C,color);
        editor.apply();
    }
    public static int load_saved_color5(Context context){
        SharedPreferences pref=context.getSharedPreferences(C5,Context.MODE_PRIVATE);
        return pref.getInt(C5C,0);
    }


    private static final String C6 = "project.materiale.imnuritineret";
    private static final String C6C ="c6";
    public static void SaveC6(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C6,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C6C,color);
        editor.apply();
    }
    public static int load_saved_color6(Context context){
        SharedPreferences pref=context.getSharedPreferences(C6,Context.MODE_PRIVATE);
        return pref.getInt(C6C,0);
    }


    private static final String C7 = "project.materiale.imnuritineret";
    private static final String C7C ="c7";
    public static void SaveC7(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C7,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C7C,color);
        editor.apply();
    }
    public static int load_saved_color7(Context context){
        SharedPreferences pref=context.getSharedPreferences(C7,Context.MODE_PRIVATE);
        return pref.getInt(C7C,0);
    }


    private static final String C8 = "project.materiale.imnuritineret";
    private static final String C8C ="c8";
    public static void SaveC8(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C8,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C8C,color);
        editor.apply();
    }
    public static int load_saved_color8(Context context){
        SharedPreferences pref=context.getSharedPreferences(C8,Context.MODE_PRIVATE);
        return pref.getInt(C8C,0);
    }


    private static final String C9 = "project.materiale.imnuritineret";
    private static final String C9C ="c9";
    public static void SaveC9(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C9,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C9C,color);
        editor.apply();
    }
    public static int load_saved_color9(Context context){
        SharedPreferences pref=context.getSharedPreferences(C9,Context.MODE_PRIVATE);
        return pref.getInt(C9C,0);
    }


    private static final String C10 = "project.materiale.imnuritineret";
    private static final String C10C ="c10";
    public static void SaveC10(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C10,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C10C,color);
        editor.apply();
    }
    public static int load_saved_color10(Context context){
        SharedPreferences pref=context.getSharedPreferences(C10,Context.MODE_PRIVATE);
        return pref.getInt(C10C,0);
    }


    private static final String C11 = "project.materiale.imnuritineret";
    private static final String C11C ="c11";
    public static void SaveC11(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C11,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C11C,color);
        editor.apply();
    }
    public static int load_saved_color11(Context context){
        SharedPreferences pref=context.getSharedPreferences(C11,Context.MODE_PRIVATE);
        return pref.getInt(C11C,0);
    }


    private static final String C12 = "project.materiale.imnuritineret";
    private static final String C12C ="c12";
    public static void SaveC12(Context context, int color) {
        SharedPreferences pref=context.getSharedPreferences(C12,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(C12C,color);
        editor.apply();
    }
    public static int load_saved_color12(Context context){
        SharedPreferences pref=context.getSharedPreferences(C12,Context.MODE_PRIVATE);
        return pref.getInt(C12C,0);
    }


    private static final String D1 = "project.materiale.imnuritineret";
    private static final String D1D ="d1";
    public static void Saved1(Context context, int d) {
        SharedPreferences pref=context.getSharedPreferences(D1,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(D1D,d);
        editor.apply();
    }
    public static int load_saved_d1(Context context){
        SharedPreferences pref=context.getSharedPreferences(D1,Context.MODE_PRIVATE);
        return pref.getInt(D1D,1);
    }


    private static final String FIRST = "project.materiale.imnuritineret";
    private static final String FIIRST ="first";
    public static void SaveFirst(Context context, int d) {
        SharedPreferences pref=context.getSharedPreferences(FIRST,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(FIIRST,d);
        editor.apply();
    }
    public static int load_saved_first(Context context){
        SharedPreferences pref=context.getSharedPreferences(FIRST,Context.MODE_PRIVATE);
        return pref.getInt(FIIRST,1);
    }


    private static final String LISTCOLOR = "project.materiale.imnuritineret";
    private static final String COLORLIST ="colorlist";
    public static void Savelistcolor(Context context, int m) {
        SharedPreferences pref=context.getSharedPreferences(LISTCOLOR,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(COLORLIST,m);
        editor.apply();
    }
    public static int load_saved_list_color(Context context){
        SharedPreferences pref=context.getSharedPreferences(LISTCOLOR,Context.MODE_PRIVATE);
        return pref.getInt(COLORLIST,1);
    }
}//
