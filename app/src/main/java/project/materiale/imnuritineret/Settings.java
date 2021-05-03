package project.materiale.imnuritineret;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import yuku.ambilwarna.AmbilWarnaDialog;

import static project.materiale.imnuritineret.MainActivity.closeDrawer;
import static project.materiale.imnuritineret.MainActivity.openDrawer;
import static project.materiale.imnuritineret.MainActivity.redirectActivity;

public class Settings extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    DrawerLayout drawerLayout;
    int imn_background,background_of_rest_app,options_window,toolbar,imns_txt,titles,txt_for_imn_list_and_rest_of_app;
    int txt_items_from_options_window,btns_for_audio,rest_of_buttons,background_for_audio_who_dont_exist,icons_right_window_options;
    int d1;
    SwitchCompat swich1;
    int refre_stroke;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    LinearLayout settings_toolbar,nav_drawer;
    TextView txt_toolbar,t0,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,n1,n2,n3;
    ImageView buton_menu,ic1,ic2,ic3;
    ScrollView scroll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        drawerLayout=findViewById(R.id.drawer_layout);
        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        swich1=findViewById(R.id.switch1);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);
        settings_toolbar=findViewById(R.id.toolbar_settings);
        txt_toolbar=findViewById(R.id.txt_toolbar_settings);
        buton_menu=findViewById(R.id.meniu_settings);
        t1=findViewById(R.id.title_colors_settings);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        t9=findViewById(R.id.t9);
        t10=findViewById(R.id.t10);
        t11=findViewById(R.id.t11);
        t12=findViewById(R.id.t12);
        t13=findViewById(R.id.t13);
        nav_drawer=findViewById(R.id.nav_drawer);
        ic1=findViewById(R.id.icon_home);
        ic2=findViewById(R.id.icon_update);
        ic3=findViewById(R.id.icon_settings);
        n1=findViewById(R.id.text_home);
        n2=findViewById(R.id.text_update);
        n3=findViewById(R.id.text_settings);
        scroll=findViewById(R.id.scroll);   scroll.setOverScrollMode(View.OVER_SCROLL_NEVER);


        imn_background=PrefConfig.load_saved_color1(this);
        background_of_rest_app=PrefConfig.load_saved_color2(this);
        options_window=PrefConfig.load_saved_color3(this);
        toolbar=PrefConfig.load_saved_color4(this);
        imns_txt=PrefConfig.load_saved_color5(this);
        titles=PrefConfig.load_saved_color6(this);
        txt_for_imn_list_and_rest_of_app=PrefConfig.load_saved_color7(this);
        txt_items_from_options_window=PrefConfig.load_saved_color8(this);
        btns_for_audio=PrefConfig.load_saved_color9(this);
        rest_of_buttons=PrefConfig.load_saved_color10(this);
        background_for_audio_who_dont_exist=PrefConfig.load_saved_color11(this);
        icons_right_window_options=PrefConfig.load_saved_color12(this);

        d1=PrefConfig.load_saved_d1(this);


            b1.setBackgroundColor(imn_background);
            b2.setBackgroundColor(background_of_rest_app);
            b3.setBackgroundColor(options_window);
            b4.setBackgroundColor(toolbar);
            b5.setBackgroundColor(imns_txt);
            b6.setBackgroundColor(titles);
            b7.setBackgroundColor(txt_for_imn_list_and_rest_of_app);
            b8.setBackgroundColor(txt_items_from_options_window);
            b9.setBackgroundColor(btns_for_audio);
            b10.setBackgroundColor(rest_of_buttons);
            b11.setBackgroundColor(background_for_audio_who_dont_exist);
            b12.setBackgroundColor(icons_right_window_options);
            drawerLayout.setBackgroundColor(background_of_rest_app);
            settings_toolbar.setBackgroundColor(toolbar);
            txt_toolbar.setTextColor(titles);
            buton_menu.setColorFilter(rest_of_buttons);
            b13.setBackgroundColor(background_of_rest_app);
            swich1.setTextColor(txt_for_imn_list_and_rest_of_app);
            t1.setTextColor(txt_for_imn_list_and_rest_of_app);
            t2.setTextColor(txt_for_imn_list_and_rest_of_app);
            t3.setTextColor(txt_for_imn_list_and_rest_of_app);
            t4.setTextColor(txt_for_imn_list_and_rest_of_app);
            t5.setTextColor(txt_for_imn_list_and_rest_of_app);
            t6.setTextColor(txt_for_imn_list_and_rest_of_app);
            t7.setTextColor(txt_for_imn_list_and_rest_of_app);
            t8.setTextColor(txt_for_imn_list_and_rest_of_app);
            t9.setTextColor(txt_for_imn_list_and_rest_of_app);
            t10.setTextColor(txt_for_imn_list_and_rest_of_app);
            t11.setTextColor(txt_for_imn_list_and_rest_of_app);
            t12.setTextColor(txt_for_imn_list_and_rest_of_app);
            t13.setTextColor(txt_for_imn_list_and_rest_of_app);
            b13.setTextColor(txt_for_imn_list_and_rest_of_app);
            nav_drawer.setBackgroundColor(options_window);
            ic1.setColorFilter(icons_right_window_options);
            ic2.setColorFilter(icons_right_window_options);
            ic3.setColorFilter(icons_right_window_options);
            n1.setTextColor(txt_items_from_options_window);
            n2.setTextColor(txt_items_from_options_window);
            n3.setTextColor(txt_items_from_options_window);


        refre_stroke=PrefConfig.load_saved_refren_stroke_data(this);


        if (refre_stroke==1){
            swich1.setChecked(true);
        }
        if (refre_stroke==0){
            swich1.setChecked(false);
        }
        swich1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swich1.isChecked()){
                    refre_stroke=1;
                    PrefConfig.SaveRefrenStroke(getApplicationContext(),refre_stroke);
                }
                else{
                    refre_stroke=0;
                    PrefConfig.SaveRefrenStroke(getApplicationContext(),refre_stroke);
                }
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_imns_background();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_background_of_rest_app();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_options_window();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_toolbar();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_imns_txt();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_titles();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_txt_for_imn_list_and_rest_of_app();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_txt_items_from_options_window();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_btns_for_audio();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_rest_of_buttons();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_background_of_audio_who_dont_exist();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker_for_icons_right_window_options();
            }
        });


        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int m=1;
                d1=1;
                imn_background=getColor(R.color.deafult_background_main);
                background_of_rest_app=getColor(R.color.deafult_background_main);
                options_window=getColor(R.color.deafult_options_window);
                toolbar=getColor(R.color.deafult_toolbar);
                imns_txt=getColor(R.color.deafult_txt);
                titles=getColor(R.color.deafult_text_title_color);
                txt_for_imn_list_and_rest_of_app=getColor(R.color.deafult_txt);
                txt_items_from_options_window=getColor(R.color.deafult_txt);
                btns_for_audio=getColor(R.color.deafult_audio_buttons);
                rest_of_buttons=getColor(R.color.deafult_rest_buttons);
                background_for_audio_who_dont_exist=getColor(R.color.deafult_background_for_audio_not_exist);
                icons_right_window_options=getColor(R.color.deafult_icons_right_window_options);
                PrefConfig.SaveC1(getApplicationContext(),imn_background);
                PrefConfig.SaveC2(getApplicationContext(),background_of_rest_app);
                PrefConfig.SaveC3(getApplicationContext(),options_window);
                PrefConfig.SaveC4(getApplicationContext(),toolbar);
                PrefConfig.SaveC5(getApplicationContext(),imns_txt);
                PrefConfig.SaveC6(getApplicationContext(),titles);
                PrefConfig.SaveC7(getApplicationContext(),txt_for_imn_list_and_rest_of_app);
                PrefConfig.SaveC8(getApplicationContext(),txt_items_from_options_window);
                PrefConfig.SaveC9(getApplicationContext(),btns_for_audio);
                PrefConfig.SaveC10(getApplicationContext(),rest_of_buttons);
                PrefConfig.SaveC11(getApplicationContext(),background_for_audio_who_dont_exist);
                PrefConfig.SaveC12(getApplicationContext(),icons_right_window_options);
                PrefConfig.Savelistcolor(getApplicationContext(),m);
                b1.setBackgroundColor(imn_background);
                b2.setBackgroundColor(background_of_rest_app);
                b3.setBackgroundColor(options_window);
                b4.setBackgroundColor(toolbar);
                b5.setBackgroundColor(imns_txt);
                b6.setBackgroundColor(titles);
                b7.setBackgroundColor(txt_for_imn_list_and_rest_of_app);
                b8.setBackgroundColor(txt_items_from_options_window);
                b9.setBackgroundColor(btns_for_audio);
                b10.setBackgroundColor(rest_of_buttons);
                b11.setBackgroundColor(background_for_audio_who_dont_exist);
                b12.setBackgroundColor(icons_right_window_options);
                drawerLayout.setBackgroundColor(background_of_rest_app);
                settings_toolbar.setBackgroundColor(toolbar);
                txt_toolbar.setTextColor(titles);
                buton_menu.setColorFilter(rest_of_buttons);
                b13.setBackgroundColor(background_of_rest_app);
                swich1.setTextColor(txt_for_imn_list_and_rest_of_app);
                t1.setTextColor(txt_for_imn_list_and_rest_of_app);
                t2.setTextColor(txt_for_imn_list_and_rest_of_app);
                t3.setTextColor(txt_for_imn_list_and_rest_of_app);
                t4.setTextColor(txt_for_imn_list_and_rest_of_app);
                t5.setTextColor(txt_for_imn_list_and_rest_of_app);
                t6.setTextColor(txt_for_imn_list_and_rest_of_app);
                t7.setTextColor(txt_for_imn_list_and_rest_of_app);
                t8.setTextColor(txt_for_imn_list_and_rest_of_app);
                t9.setTextColor(txt_for_imn_list_and_rest_of_app);
                t10.setTextColor(txt_for_imn_list_and_rest_of_app);
                t11.setTextColor(txt_for_imn_list_and_rest_of_app);
                t12.setTextColor(txt_for_imn_list_and_rest_of_app);
                t13.setTextColor(txt_for_imn_list_and_rest_of_app);
                b13.setTextColor(txt_for_imn_list_and_rest_of_app);
                nav_drawer.setBackgroundColor(options_window);
                ic1.setColorFilter(icons_right_window_options);
                ic2.setColorFilter(icons_right_window_options);
                ic3.setColorFilter(icons_right_window_options);
                n1.setTextColor(txt_items_from_options_window);
                n2.setTextColor(txt_items_from_options_window);
                n3.setTextColor(txt_items_from_options_window);
            }
        });


    }//
    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }
    public void ClickHome(View view){
        redirectActivity(this,MainActivity.class);
    }
    public void ClickUpdates(View view){
        redirectActivity(this,Updates.class);
    }
    public void ClickSettings(View view){
        recreate();
    }
    @Override
    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
    public void openColorPicker_for_imns_background() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, imn_background, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                imn_background=color;
                b1.setBackgroundColor(imn_background);
                PrefConfig.SaveC1(getApplicationContext(),imn_background);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_background_of_rest_app() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, background_of_rest_app, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                background_of_rest_app=color;
                b2.setBackgroundColor(background_of_rest_app);
                drawerLayout.setBackgroundColor(background_of_rest_app);
                b13.setBackgroundColor(background_of_rest_app);
                PrefConfig.SaveC2(getApplicationContext(),background_of_rest_app);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_options_window() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, options_window, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                options_window=color;
                b3.setBackgroundColor(options_window);
                nav_drawer.setBackgroundColor(options_window);
                PrefConfig.SaveC3(getApplicationContext(),options_window);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_toolbar() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, toolbar, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                toolbar=color;
                b4.setBackgroundColor(toolbar);
                settings_toolbar.setBackgroundColor(toolbar);
                PrefConfig.SaveC4(getApplicationContext(),toolbar);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_imns_txt() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, imns_txt, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                imns_txt=color;
                b5.setBackgroundColor(imns_txt);
                PrefConfig.SaveC5(getApplicationContext(),imns_txt);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_titles() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, titles, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                titles=color;
                txt_toolbar.setTextColor(titles);
                b6.setBackgroundColor(titles);
                PrefConfig.SaveC6(getApplicationContext(),titles);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_txt_for_imn_list_and_rest_of_app() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, txt_for_imn_list_and_rest_of_app, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                txt_for_imn_list_and_rest_of_app=color;
                b7.setBackgroundColor(txt_for_imn_list_and_rest_of_app);
                swich1.setTextColor(txt_for_imn_list_and_rest_of_app);
                t1.setTextColor(txt_for_imn_list_and_rest_of_app);
                t2.setTextColor(txt_for_imn_list_and_rest_of_app);
                t3.setTextColor(txt_for_imn_list_and_rest_of_app);
                t4.setTextColor(txt_for_imn_list_and_rest_of_app);
                t5.setTextColor(txt_for_imn_list_and_rest_of_app);
                t6.setTextColor(txt_for_imn_list_and_rest_of_app);
                t7.setTextColor(txt_for_imn_list_and_rest_of_app);
                t8.setTextColor(txt_for_imn_list_and_rest_of_app);
                t9.setTextColor(txt_for_imn_list_and_rest_of_app);
                t10.setTextColor(txt_for_imn_list_and_rest_of_app);
                t11.setTextColor(txt_for_imn_list_and_rest_of_app);
                t12.setTextColor(txt_for_imn_list_and_rest_of_app);
                t13.setTextColor(txt_for_imn_list_and_rest_of_app);
                b13.setTextColor(txt_for_imn_list_and_rest_of_app);
                PrefConfig.SaveC7(getApplicationContext(),txt_for_imn_list_and_rest_of_app);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_txt_items_from_options_window() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, txt_items_from_options_window, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                txt_items_from_options_window=color;
                b8.setBackgroundColor(txt_items_from_options_window);
                n1.setTextColor(txt_items_from_options_window);
                n2.setTextColor(txt_items_from_options_window);
                n3.setTextColor(txt_items_from_options_window);
                PrefConfig.SaveC8(getApplicationContext(),txt_items_from_options_window);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_btns_for_audio() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, btns_for_audio, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                btns_for_audio=color;
                b9.setBackgroundColor(btns_for_audio);
                PrefConfig.SaveC9(getApplicationContext(),btns_for_audio);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_rest_of_buttons() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, rest_of_buttons, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                rest_of_buttons=color;
                b10.setBackgroundColor(rest_of_buttons);
                buton_menu.setColorFilter(rest_of_buttons);
                PrefConfig.SaveC10(getApplicationContext(),rest_of_buttons);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_background_of_audio_who_dont_exist() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, background_for_audio_who_dont_exist, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                background_for_audio_who_dont_exist=color;
                b11.setBackgroundColor(background_for_audio_who_dont_exist);
                PrefConfig.SaveC11(getApplicationContext(),background_for_audio_who_dont_exist);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }
    public void openColorPicker_for_icons_right_window_options() {
        AmbilWarnaDialog colorpicker = new AmbilWarnaDialog(this, icons_right_window_options, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                icons_right_window_options=color;
                b12.setBackgroundColor(icons_right_window_options);
                ic1.setColorFilter(icons_right_window_options);
                ic2.setColorFilter(icons_right_window_options);
                ic3.setColorFilter(icons_right_window_options);
                PrefConfig.SaveC12(getApplicationContext(),icons_right_window_options);
                d1=5;
                PrefConfig.Saved1(getApplicationContext(),d1);
            }
        });
        colorpicker.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position==1||position==2||position==3){
        PrefConfig.Savelistcolor(getApplicationContext(),position);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
