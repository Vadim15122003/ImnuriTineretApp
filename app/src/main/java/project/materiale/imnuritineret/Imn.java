package project.materiale.imnuritineret;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;

import java.util.concurrent.TimeUnit;

import project.materiale.imnuritineret.R.color;

import static project.materiale.imnuritineret.MainActivity.redirectActivity;

public class Imn extends AppCompatActivity {
    TextView textView,title_text,txt_right1,txt_right2,txt_right3;
    SeekBar seekBar;
    int seekValue,o,c;
    int minsbprogress=10;
    int i=0;
    Dialog dialog;
    SwitchCompat switchCompat;
    TextView playerPosition,playerDuration,playerPosition1,playerDuration1,x;
    SeekBar playerTrack,playerTrack1;
    ImageView btPlay,btPause,btPlay1,btPause1,btRew,btFf,btRew1,btFf1,icon_imn,right_options;
    MediaPlayer mediaPlayer,mediaPlayer1;
    Handler handler=new Handler();
    Handler handler1=new Handler();
    Runnable runnable,runnable1;
    String imn,imn_acorduri;
    LinearLayout layout_c1,layout_c2,layout_o1,layout_o2,toolbar_lay;
    RelativeLayout imn_background_color,right_corner_options;
    int imn_background,toolbar,imns_txt,titles,btns_for_audio,rest_of_buttons,background_for_audio_who_dont_exist,options_window,txt_items_from_options_window,d1;
    int refren_stroke;
    ScrollView scroll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imn);
        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        dialog=new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.right_corner_options);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window=dialog.getWindow();
        WindowManager.LayoutParams wlp=window.getAttributes();
        wlp.gravity= Gravity.TOP|Gravity.RIGHT;
        wlp.y=0;
        wlp.x=0;
        window.setAttributes(wlp);
        TextView btnclose=(TextView)dialog.findViewById(R.id.btnclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


        imn_background=PrefConfig.load_saved_color1(this);
        toolbar=PrefConfig.load_saved_color4(this);
        imns_txt=PrefConfig.load_saved_color5(this);
        titles=PrefConfig.load_saved_color6(this);
        btns_for_audio=PrefConfig.load_saved_color9(this);
        rest_of_buttons=PrefConfig.load_saved_color10(this);
        background_for_audio_who_dont_exist=PrefConfig.load_saved_color11(this);
        d1=PrefConfig.load_saved_d1(this);
        txt_items_from_options_window=PrefConfig.load_saved_color8(this);
        options_window=PrefConfig.load_saved_color3(this);


        playerPosition=dialog.findViewById(R.id.player_position);
        playerDuration=dialog.findViewById(R.id.player_duration);
        playerTrack=dialog.findViewById(R.id.player_track);
        btPlay=dialog.findViewById(R.id.player_btn);
        btPause=dialog.findViewById(R.id.player_btn_pause);
        playerPosition1=dialog.findViewById(R.id.player_position1);
        playerDuration1=dialog.findViewById(R.id.player_duration1);
        playerTrack1=dialog.findViewById(R.id.player_track1);
        btPlay1=dialog.findViewById(R.id.player_btn1);
        btPause1=dialog.findViewById(R.id.player_btn_pause1);
        textView=(TextView) findViewById(R.id.text);
        seekBar=(SeekBar)findViewById(R.id.seekbar);
        switchCompat=dialog.findViewById(R.id.switch1);
        layout_c1=dialog.findViewById(R.id.linear5);
        layout_c2=dialog.findViewById(R.id.linear7);
        layout_o1=dialog.findViewById(R.id.linear2);
        layout_o2=dialog.findViewById(R.id.linear3);
        btFf=dialog.findViewById(R.id.fast_forward);
        btRew=dialog.findViewById(R.id.fast_rewind);
        btFf1=dialog.findViewById(R.id.fast_forward1);
        btRew1=dialog.findViewById(R.id.fast_rewind1);
        imn_background_color=findViewById(R.id.imn_background);
        toolbar_lay=findViewById(R.id.toolbar);
        icon_imn=findViewById(R.id.icon);
        right_options=findViewById(R.id.right_options);
        title_text=findViewById(R.id.txt);
        x=dialog.findViewById(R.id.btnclose);
        right_corner_options=dialog.findViewById(R.id.right_corner_options);
        txt_right1=dialog.findViewById(R.id.txt_right1);
        txt_right2=dialog.findViewById(R.id.txt_right2);
        txt_right3=dialog.findViewById(R.id.txt_right3);
        scroll=findViewById(R.id.scroll);   scroll.setOverScrollMode(View.OVER_SCROLL_NEVER);


            imn_background_color.setBackgroundColor(imn_background);
            toolbar_lay.setBackgroundColor(toolbar);
            icon_imn.setColorFilter(rest_of_buttons);
            right_options.setColorFilter(rest_of_buttons);
            title_text.setTextColor(titles);
            x.setTextColor(txt_items_from_options_window);
            switchCompat.setTextColor(txt_items_from_options_window);
            right_corner_options.setBackgroundColor(options_window);
            btRew.setColorFilter(btns_for_audio);
            btRew1.setColorFilter(btns_for_audio);
            btFf.setColorFilter(btns_for_audio);
            btFf1.setColorFilter(btns_for_audio);
            btPlay.setColorFilter(btns_for_audio);
            btPlay1.setColorFilter(btns_for_audio);
            btPause.setColorFilter(btns_for_audio);
            btPause1.setColorFilter(btns_for_audio);
            txt_right1.setTextColor(txt_items_from_options_window);
            txt_right2.setTextColor(txt_items_from_options_window);
            txt_right3.setTextColor(txt_items_from_options_window);
            textView.setTextColor(imns_txt);

        refren_stroke=PrefConfig.load_saved_refren_stroke_data(this);
        seekValue=PrefConfig.load_saved_progress(this);
        imn=getString(R.string.imn_erorr);
        imn_acorduri=getString(R.string.imn_error_acorduri_activated);
        o=1;
        c=1;
        final int imn_number=getIntent().getExtras().getInt("imn_number");
        if(imn_number==1) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn1);
            if (refren_stroke==1){
            imn=getString(R.string.imn1_stroke_1)+getString(R.string.imn1_refren_1)
                    +getString(R.string.imn1_stroke_2)+getString(R.string.imn1_refren_2);
            imn_acorduri=getString(R.string.imn1_acorduri_stroke_1)+getString(R.string.imn1_acorduri_refren_1)
                    +getString(R.string.imn1_acorduri_stroke_2)+getString(R.string.imn1_acorduri_refren_2);}
            if (refren_stroke==0){
                imn=getString(R.string.imn1_stroke_1)+getString(R.string.imn1_refren_1)
                        +getString(R.string.imn1_stroke_2)+getString(R.string.imn1_refren_2);
                imn_acorduri=getString(R.string.imn1_acorduri_stroke_1)+getString(R.string.imn1_acorduri_refren_1)
                        +getString(R.string.imn1_acorduri_stroke_2)+getString(R.string.imn1_acorduri_refren_2);}
            title_text.setText(getString(R.string.imn1_title));
        }
        if(imn_number==2) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn2);
            if (refren_stroke==1){
                imn=getString(R.string.imn2_stroke_1)+getString(R.string.imn2_refren_1)
                        +getString(R.string.imn2_stroke_2)+getString(R.string.imn2_refren_2);
                imn_acorduri=getString(R.string.imn2_acorduri_stroke_1)+getString(R.string.imn2_acorduri_refren_1)
                        +getString(R.string.imn2_acorduri_stroke_2)+getString(R.string.imn2_acorduri_refren_2);}
            if (refren_stroke==0){
                imn=getString(R.string.imn2_stroke_1)+getString(R.string.imn2_refren_1)
                        +getString(R.string.imn2_stroke_2)+getString(R.string.imn2_refren_2);
                imn_acorduri=getString(R.string.imn2_acorduri_stroke_1)+getString(R.string.imn2_acorduri_refren_1)
                        +getString(R.string.imn2_acorduri_stroke_2)+getString(R.string.imn2_acorduri_refren_2);}
            title_text.setText(getString(R.string.imn2_title));
        }
        if(imn_number==3) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn3);
            if (refren_stroke==1){
                imn=getString(R.string.imn3_stroke_1)+getString(R.string.imn3_refren)
                        +getString(R.string.imn3_stroke_2)+getString(R.string.imn3_refren)+getString(R.string.imn3_stroke_3)
                        +getString(R.string.imn3_refren);
                imn_acorduri=getString(R.string.imn3_acorduri_stroke_1)+getString(R.string.imn3_acorduri_refren)
                        +getString(R.string.imn3_acorduri_stroke_2)+getString(R.string.imn3_acorduri_refren)+getString(R.string.imn3_acorduri_stroke_3)
                        +getString(R.string.imn3_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn3_stroke_1)+getString(R.string.imn3_refren)
                        +getString(R.string.imn3_stroke_2)+getString(R.string.imn3_stroke_3);
                imn_acorduri=getString(R.string.imn3_acorduri_stroke_1)+getString(R.string.imn3_acorduri_refren)
                        +getString(R.string.imn3_acorduri_stroke_2)+getString(R.string.imn3_acorduri_stroke_3);}
            title_text.setText(getString(R.string.imn3_title));
        }
        if(imn_number==4) {
            o=1;
            c=1;
            if (refren_stroke==1){
                imn=getString(R.string.imn4_stroke_1)+getString(R.string.imn4_stroke_2)
                        +getString(R.string.imn4_stroke_3)+getString(R.string.imn4_stroke_4);
                imn_acorduri=getString(R.string.imn4_acorduri_stroke_1)+getString(R.string.imn4_acorduri_stroke_2)
                        +getString(R.string.imn4_acorduri_stroke_3)+getString(R.string.imn4_acorduri_stroke_4);}
            if (refren_stroke==0){
                imn=getString(R.string.imn4_stroke_1)+getString(R.string.imn4_stroke_2)
                        +getString(R.string.imn4_stroke_3)+getString(R.string.imn4_stroke_4);
                imn_acorduri=getString(R.string.imn4_acorduri_stroke_1)+getString(R.string.imn4_acorduri_stroke_2)
                        +getString(R.string.imn4_acorduri_stroke_3)+getString(R.string.imn4_acorduri_stroke_4);}
            title_text.setText(getString(R.string.imn4_title));
        }
        if(imn_number==5) {
            o=1;
            c=1;
            if (refren_stroke==1){
                imn=getString(R.string.imn5_stroke_1)+getString(R.string.imn5_stroke_2)
                        +getString(R.string.imn5_refren)+getString(R.string.imn5_stroke_3)+getString(R.string.imn5_stroke_4)
                        +getString(R.string.imn5_refren)+getString(R.string.imn5_stroke_5)+getString(R.string.imn5_stroke_6)
                        +getString(R.string.imn5_refren);
                imn_acorduri=getString(R.string.imn5_acorduri_stroke_1)+getString(R.string.imn5_acorduri_stroke_2)
                        +getString(R.string.imn5_acorduri_refren)+getString(R.string.imn5_acorduri_stroke_3)+getString(R.string.imn5_acorduri_stroke_4)
                        +getString(R.string.imn5_acorduri_refren)+getString(R.string.imn5_acorduri_stroke_5)+getString(R.string.imn5_acorduri_stroke_6)
                        +getString(R.string.imn5_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn5_stroke_1)+getString(R.string.imn5_stroke_2)
                        +getString(R.string.imn5_refren)+getString(R.string.imn5_stroke_3)+getString(R.string.imn5_stroke_4)
                        +getString(R.string.imn5_stroke_5)+getString(R.string.imn5_stroke_6);
                imn_acorduri=getString(R.string.imn5_acorduri_stroke_1)+getString(R.string.imn5_acorduri_stroke_2)
                        +getString(R.string.imn5_acorduri_refren)+getString(R.string.imn5_acorduri_stroke_3)+getString(R.string.imn5_acorduri_stroke_4)
                        +getString(R.string.imn5_acorduri_stroke_5)+getString(R.string.imn5_acorduri_stroke_6);}
            title_text.setText(getString(R.string.imn5_title));
        }
        if(imn_number==6) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn6);
            if (refren_stroke==1){
                imn=getString(R.string.imn6_stroke_1)+getString(R.string.imn6_stroke_2)
                        +getString(R.string.imn6_stroke_3);
                imn_acorduri=getString(R.string.imn6_acorduri_stroke_1)+getString(R.string.imn6_acorduri_stroke_2)
                        +getString(R.string.imn6_acorduri_stroke_3);}
            if (refren_stroke==0){
                imn=getString(R.string.imn6_stroke_1)+getString(R.string.imn6_stroke_2)
                        +getString(R.string.imn6_stroke_3);
                imn_acorduri=getString(R.string.imn6_acorduri_stroke_1)+getString(R.string.imn6_acorduri_stroke_2)
                        +getString(R.string.imn6_acorduri_stroke_3);}
            title_text.setText(getString(R.string.imn6_title));
        }
        if(imn_number==7) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn7);
            if (refren_stroke==1){
                imn=getString(R.string.imn7_stroke_1)+getString(R.string.imn7_stroke_2)
                        +getString(R.string.imn7_stroke_3)+getString(R.string.imn7_stroke_4);
                imn_acorduri=getString(R.string.imn7_acorduri_stroke_1)+getString(R.string.imn7_acorduri_stroke_2)
                        +getString(R.string.imn7_acorduri_stroke_3)+getString(R.string.imn7_acorduri_stroke_4);}
            if (refren_stroke==0){
                imn=getString(R.string.imn7_stroke_1)+getString(R.string.imn7_stroke_2)
                        +getString(R.string.imn7_stroke_3)+getString(R.string.imn7_stroke_4);
                imn_acorduri=getString(R.string.imn7_acorduri_stroke_1)+getString(R.string.imn7_acorduri_stroke_2)
                        +getString(R.string.imn7_acorduri_stroke_3)+getString(R.string.imn7_acorduri_stroke_4);}
            title_text.setText(getString(R.string.imn7_title));
        }
        if(imn_number==8) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn8);
            if (refren_stroke==1){
                imn=getString(R.string.imn8_stroke_1)+getString(R.string.imn8_refren);
                imn_acorduri=getString(R.string.imn8_acorduri_stroke_1)+getString(R.string.imn8_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn8_stroke_1)+getString(R.string.imn8_refren);
                imn_acorduri=getString(R.string.imn8_acorduri_stroke_1)+getString(R.string.imn8_acorduri_refren);}
            title_text.setText(getString(R.string.imn8_title));
        }
        if(imn_number==9) {
            o=1;
            c=1;
            if (refren_stroke==1){
                imn=getString(R.string.imn9_stroke_1)+getString(R.string.imn9_refren)+getString(R.string.imn9_stroke_2)+getString(R.string.imn9_refren);
                imn_acorduri=getString(R.string.imn9_acorduri_stroke_1)+getString(R.string.imn9_acorduri_refren)+getString(R.string.imn9_acorduri_stroke_2)+getString(R.string.imn9_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn9_stroke_1)+getString(R.string.imn9_refren)+getString(R.string.imn9_stroke_2);
                imn_acorduri=getString(R.string.imn9_acorduri_stroke_1)+getString(R.string.imn9_acorduri_refren)+getString(R.string.imn9_acorduri_stroke_2);}
            title_text.setText(getString(R.string.imn9_title));
        }
        if(imn_number==10) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn10);
            if (refren_stroke==1){
                imn=getString(R.string.imn10_stroke_1)+getString(R.string.imn10_refren)+getString(R.string.imn10_stroke_2)+getString(R.string.imn10_refren);
                imn_acorduri=getString(R.string.imn10_acorduri_stroke_1)+getString(R.string.imn10_acorduri_refren)+getString(R.string.imn10_acorduri_stroke_2)+getString(R.string.imn10_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn10_stroke_1)+getString(R.string.imn10_refren)+getString(R.string.imn10_stroke_2);
                imn_acorduri=getString(R.string.imn10_acorduri_stroke_1)+getString(R.string.imn10_acorduri_refren)+getString(R.string.imn10_acorduri_stroke_2);}
            title_text.setText(getString(R.string.imn10_title));
        }
        if(imn_number==11) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn35);
            if (refren_stroke==1){
                imn=getString(R.string.imn11_refren)+getString(R.string.imn11_stroke_1)+getString(R.string.imn11_refren)
                        +getString(R.string.imn11_stroke_2)+getString(R.string.imn11_refren)+getString(R.string.imn11_stroke_3)
                        +getString(R.string.imn11_refren);
                imn_acorduri=getString(R.string.imn11_acorduri_refren)+getString(R.string.imn11_acorduri_stroke_1)+getString(R.string.imn11_acorduri_refren)
                        +getString(R.string.imn11_acorduri_stroke_2)+getString(R.string.imn11_acorduri_refren)+getString(R.string.imn11_acorduri_stroke_3)
                        +getString(R.string.imn11_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn11_refren)+getString(R.string.imn11_stroke_1)
                        +getString(R.string.imn11_stroke_2)+getString(R.string.imn11_stroke_3);
                imn_acorduri=getString(R.string.imn11_acorduri_refren)+getString(R.string.imn11_acorduri_stroke_1)
                        +getString(R.string.imn11_acorduri_stroke_2)+getString(R.string.imn11_acorduri_stroke_3);}
            title_text.setText(getString(R.string.imn11_title));
        }
        if(imn_number==12) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn12);
            if (refren_stroke==1){
                imn=getString(R.string.imn12_stroke_1)+getString(R.string.imn12_refren)
                        +getString(R.string.imn12_stroke_2)+getString(R.string.imn12_refren)+getString(R.string.imn12_stroke_3)
                        +getString(R.string.imn12_refren);
                imn_acorduri=getString(R.string.imn12_acorduri_stroke_1)+getString(R.string.imn12_acorduri_refren)
                        +getString(R.string.imn12_acorduri_stroke_2)+getString(R.string.imn12_acorduri_refren)+getString(R.string.imn12_acorduri_stroke_3)
                        +getString(R.string.imn12_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn12_stroke_1)+getString(R.string.imn12_refren)
                        +getString(R.string.imn12_stroke_2)+getString(R.string.imn12_stroke_3);
                imn_acorduri=getString(R.string.imn12_acorduri_stroke_1)+getString(R.string.imn12_acorduri_refren)
                        +getString(R.string.imn12_acorduri_stroke_2)+getString(R.string.imn12_acorduri_stroke_3);}
            title_text.setText(getString(R.string.imn12_title));
        }
        if(imn_number==13) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn24);
            if (refren_stroke==1){
                imn=getString(R.string.imn13_stroke_1)+getString(R.string.imn13_refren)+getString(R.string.imn13_stroke_2)+getString(R.string.imn13_refren);
                imn_acorduri=getString(R.string.imn13_acorduri_stroke_1)+getString(R.string.imn13_acorduri_refren)+getString(R.string.imn13_acorduri_stroke_2)+getString(R.string.imn13_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn13_stroke_1)+getString(R.string.imn13_refren)+getString(R.string.imn13_stroke_2);
                imn_acorduri=getString(R.string.imn13_acorduri_stroke_1)+getString(R.string.imn13_acorduri_refren)+getString(R.string.imn13_acorduri_stroke_2);}
            title_text.setText(getString(R.string.imn13_title));
        }
        if(imn_number==14) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn14);
            if (refren_stroke==1){
                imn=getString(R.string.imn14_stroke_1)+getString(R.string.imn14_refren_1)
                        +getString(R.string.imn14_stroke_2)+getString(R.string.imn14_refren_2);
                imn_acorduri=getString(R.string.imn14_acorduri_stroke_1)+getString(R.string.imn14_acorduri_refren_1)
                        +getString(R.string.imn14_acorduri_stroke_2)+getString(R.string.imn14_acorduri_refren_2);}
            if (refren_stroke==0){
                imn=getString(R.string.imn14_stroke_1)+getString(R.string.imn14_refren_1)
                        +getString(R.string.imn14_stroke_2)+getString(R.string.imn14_refren_2);
                imn_acorduri=getString(R.string.imn14_acorduri_stroke_1)+getString(R.string.imn14_acorduri_refren_1)
                        +getString(R.string.imn14_acorduri_stroke_2)+getString(R.string.imn14_acorduri_refren_2);}
            title_text.setText(getString(R.string.imn14_title));
        }
        if(imn_number==15) {
            o=1;
            c=1;
            if (refren_stroke==1){
                imn=getString(R.string.imn15_stroke_1)+getString(R.string.imn15_stroke_2)
                        +getString(R.string.imn15_stroke_3)+getString(R.string.imn15_stroke_4)
                        +getString(R.string.imn15_stroke_5);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            if (refren_stroke==0){
                imn=getString(R.string.imn15_stroke_1)+getString(R.string.imn15_stroke_2)
                        +getString(R.string.imn15_stroke_3)+getString(R.string.imn15_stroke_4)
                        +getString(R.string.imn15_stroke_5);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            title_text.setText(getString(R.string.imn15_title));
        }
        if(imn_number==16) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn16);
            if (refren_stroke==1){
                imn=getString(R.string.imn16_stroke_1)+getString(R.string.imn16_refren)
                        +getString(R.string.imn16_stroke_2)+getString(R.string.imn16_refren)+getString(R.string.imn16_stroke_3)
                        +getString(R.string.imn16_refren);
                imn_acorduri=getString(R.string.imn16_acorduri_stroke_1)+getString(R.string.imn16_acorduri_refren)
                        +getString(R.string.imn16_acorduri_stroke_2)+getString(R.string.imn16_acorduri_refren)+getString(R.string.imn16_acorduri_stroke_3)
                        +getString(R.string.imn16_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn16_stroke_1)+getString(R.string.imn16_refren)
                        +getString(R.string.imn16_stroke_2)+getString(R.string.imn16_stroke_3);
                imn_acorduri=getString(R.string.imn16_acorduri_stroke_1)+getString(R.string.imn16_acorduri_refren)
                        +getString(R.string.imn16_acorduri_stroke_2)+getString(R.string.imn16_acorduri_stroke_3);}
            title_text.setText(getString(R.string.imn16_title));
        }
        if(imn_number==17) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn17);
            if (refren_stroke==1){
                imn=getString(R.string.imn17_stroke_1)+getString(R.string.imn17_stroke_2)
                        +getString(R.string.imn17_stroke_3)+getString(R.string.imn17_stroke_4)
                        +getString(R.string.imn17_stroke_5)+getString(R.string.imn17_stroke_6);
                imn_acorduri=getString(R.string.imn17_acorduri_stroke_1)+getString(R.string.imn17_acorduri_stroke_2)
                        +getString(R.string.imn17_acorduri_stroke_3)+getString(R.string.imn17_acorduri_stroke_4)
                        +getString(R.string.imn17_acorduri_stroke_5)+getString(R.string.imn17_acorduri_stroke_6);}
            if (refren_stroke==0){
                imn=getString(R.string.imn17_stroke_1)+getString(R.string.imn17_stroke_2)
                        +getString(R.string.imn17_stroke_3)+getString(R.string.imn17_stroke_4)
                        +getString(R.string.imn17_stroke_5)+getString(R.string.imn17_stroke_6);
                imn_acorduri=getString(R.string.imn17_acorduri_stroke_1)+getString(R.string.imn17_acorduri_stroke_2)
                        +getString(R.string.imn17_acorduri_stroke_3)+getString(R.string.imn17_acorduri_stroke_4)
                        +getString(R.string.imn17_acorduri_stroke_5)+getString(R.string.imn17_acorduri_stroke_6);}
            title_text.setText(getString(R.string.imn17_title));
        }
        if(imn_number==18) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn18);
            if (refren_stroke==1){
                imn=getString(R.string.imn18_stroke_1)+getString(R.string.imn18_refren)+getString(R.string.imn18_stroke_2)+getString(R.string.imn18_refren);
                imn_acorduri=getString(R.string.imn18_acorduri_stroke_1)+getString(R.string.imn18_acorduri_refren)+getString(R.string.imn18_acorduri_stroke_2)+getString(R.string.imn18_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn18_stroke_1)+getString(R.string.imn18_refren)+getString(R.string.imn18_stroke_2);
                imn_acorduri=getString(R.string.imn18_acorduri_stroke_1)+getString(R.string.imn18_acorduri_refren)+getString(R.string.imn18_acorduri_stroke_2);}
            title_text.setText(getString(R.string.imn18_title));
        }
        if(imn_number==19) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn19);
            if (refren_stroke==1){
                imn=getString(R.string.imn19_stroke_1)+getString(R.string.imn19_refren_1)
                        +getString(R.string.imn19_stroke_2)+getString(R.string.imn19_refren_1)+getString(R.string.imn19_stroke_3)
                        +getString(R.string.imn19_refren_1)+getString(R.string.imn19_refren_2);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            if (refren_stroke==0){
                imn=getString(R.string.imn19_stroke_1)+getString(R.string.imn19_refren_1)
                        +getString(R.string.imn19_stroke_2)+getString(R.string.imn19_stroke_3)+getString(R.string.imn19_refren_2);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            title_text.setText(getString(R.string.imn19_title));
        }
        if(imn_number==20) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn20);
            if (refren_stroke==1){
                imn=getString(R.string.imn20_stroke_1)+getString(R.string.imn20_refren_1)
                        +getString(R.string.imn20_stroke_2)+getString(R.string.imn20_refren_2)
                        +getString(R.string.imn20_stroke_3)+getString(R.string.imn20_refren_3);
                imn_acorduri=getString(R.string.imn20_acorduri_stroke_1)+getString(R.string.imn20_acorduri_refren_1)
                        +getString(R.string.imn20_acorduri_stroke_2)+getString(R.string.imn20_acorduri_refren_2)
                        +getString(R.string.imn20_acorduri_stroke_3)+getString(R.string.imn20_acorduri_refren_3);}
            if (refren_stroke==0){
                imn=getString(R.string.imn20_stroke_1)+getString(R.string.imn20_refren_1)
                        +getString(R.string.imn20_stroke_2)+getString(R.string.imn20_refren_2)
                        +getString(R.string.imn20_stroke_3)+getString(R.string.imn20_refren_3);
                imn_acorduri=getString(R.string.imn20_acorduri_stroke_1)+getString(R.string.imn20_acorduri_refren_1)
                        +getString(R.string.imn20_acorduri_stroke_2)+getString(R.string.imn20_acorduri_refren_2)
                        +getString(R.string.imn20_acorduri_stroke_3)+getString(R.string.imn20_acorduri_refren_3);}
            title_text.setText(getString(R.string.imn20_title));
        }
        if(imn_number==21) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn21);
            if (refren_stroke==1){
                imn=getString(R.string.imn21_stroke_1)+getString(R.string.imn21_refren)
                        +getString(R.string.imn21_stroke_2)+getString(R.string.imn21_refren)+getString(R.string.imn21_stroke_3)
                        +getString(R.string.imn21_refren)+getString(R.string.imn21_stroke_4)+getString(R.string.imn21_refren);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            if (refren_stroke==0){
                imn=getString(R.string.imn21_stroke_1)+getString(R.string.imn21_refren)
                        +getString(R.string.imn21_stroke_2)+getString(R.string.imn21_stroke_3)+getString(R.string.imn21_stroke_4);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            title_text.setText(getString(R.string.imn21_title));
        }
        if(imn_number==22) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn22);
            if (refren_stroke==1){
                imn=getString(R.string.imn22_stroke_1)+getString(R.string.imn22_refren)
                        +getString(R.string.imn22_stroke_2)+getString(R.string.imn22_refren)+getString(R.string.imn22_stroke_3)
                        +getString(R.string.imn22_refren);
                imn_acorduri=getString(R.string.imn22_acorduri_stroke_1)+getString(R.string.imn22_acorduri_refren)
                        +getString(R.string.imn22_acorduri_stroke_2)+getString(R.string.imn22_acorduri_refren)+getString(R.string.imn22_acorduri_stroke_3)
                        +getString(R.string.imn22_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn22_refren)+getString(R.string.imn22_stroke_1)
                        +getString(R.string.imn22_stroke_2)+getString(R.string.imn22_stroke_3);
                imn_acorduri=getString(R.string.imn22_acorduri_refren)+getString(R.string.imn22_acorduri_stroke_1)
                        +getString(R.string.imn22_acorduri_stroke_2)+getString(R.string.imn22_acorduri_stroke_3);}
            title_text.setText(getString(R.string.imn22_title));
        }
        if(imn_number==23) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn23);
            if (refren_stroke==1){
                imn=getString(R.string.imn23_stroke_1)+getString(R.string.imn23_refren_1)
                        +getString(R.string.imn23_stroke_2)+getString(R.string.imn23_refren_2)
                        +getString(R.string.imn23_stroke_3)+getString(R.string.imn23_refren_3);
                imn_acorduri=getString(R.string.imn23_acorduri_stroke_1)+getString(R.string.imn23_acorduri_refren_1)
                        +getString(R.string.imn23_acorduri_stroke_2)+getString(R.string.imn23_acorduri_refren_2)
                        +getString(R.string.imn23_acorduri_stroke_3)+getString(R.string.imn23_acorduri_refren_3);}
            if (refren_stroke==0){
                imn=getString(R.string.imn23_stroke_1)+getString(R.string.imn23_refren_1)
                        +getString(R.string.imn23_stroke_2)+getString(R.string.imn23_refren_2)
                        +getString(R.string.imn23_stroke_3)+getString(R.string.imn23_refren_3);
                imn_acorduri=getString(R.string.imn23_acorduri_stroke_1)+getString(R.string.imn23_acorduri_refren_1)
                        +getString(R.string.imn23_acorduri_stroke_2)+getString(R.string.imn23_acorduri_refren_2)
                        +getString(R.string.imn23_acorduri_stroke_3)+getString(R.string.imn23_acorduri_refren_3);}
            title_text.setText(getString(R.string.imn23_title));
        }
        if(imn_number==25-1) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn25);
            if (refren_stroke==1){
                imn=getString(R.string.imn25_stroke_1)+getString(R.string.imn25_refren_1)
                        +getString(R.string.imn25_stroke_2)+getString(R.string.imn25_refren_2);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            if (refren_stroke==0){
                imn=getString(R.string.imn25_stroke_1)+getString(R.string.imn25_refren_1)
                        +getString(R.string.imn25_stroke_2)+getString(R.string.imn25_refren_2);
                imn_acorduri=imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            title_text.setText(getString(R.string.imn25_title));
        }
        if(imn_number==26-1) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn26);
            if (refren_stroke==1){
                imn=getString(R.string.imn26_stroke_1)+getString(R.string.imn26_refren_1)
                        +getString(R.string.imn26_stroke_2)+getString(R.string.imn26_refren_2);
                imn_acorduri=getString(R.string.imn26_acorduri_stroke_1)+getString(R.string.imn26_acorduri_refren_1)
                        +getString(R.string.imn26_acorduri_stroke_2)+getString(R.string.imn26_acorduri_refren_2);}
            if (refren_stroke==0){
                imn=getString(R.string.imn26_stroke_1)+getString(R.string.imn26_refren_1)
                        +getString(R.string.imn26_stroke_2)+getString(R.string.imn26_refren_2);
                imn_acorduri=getString(R.string.imn26_acorduri_stroke_1)+getString(R.string.imn26_acorduri_refren_1)
                        +getString(R.string.imn26_acorduri_stroke_2)+getString(R.string.imn26_acorduri_refren_2);}
            title_text.setText(getString(R.string.imn26_title));
        }
        if(imn_number==27-1) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn27);
            if (refren_stroke==1){
                imn=getString(R.string.imn27_stroke_1)+getString(R.string.imn27_refren_1)
                        +getString(R.string.imn27_stroke_2)+getString(R.string.imn27_refren_2);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            if (refren_stroke==0){
                imn=getString(R.string.imn27_stroke_1)+getString(R.string.imn27_refren_1)
                        +getString(R.string.imn27_stroke_2)+getString(R.string.imn27_refren_2);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            title_text.setText(getString(R.string.imn27_title));
        }
        if(imn_number==29-2) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn29);
            if (refren_stroke==1){
                imn=getString(R.string.imn29_stroke_1)+getString(R.string.imn29_stroke_2)
                        +getString(R.string.imn29_stroke_3);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            if (refren_stroke==0){
                imn=getString(R.string.imn29_stroke_1)+getString(R.string.imn29_stroke_2)
                        +getString(R.string.imn29_stroke_3);
                imn_acorduri=getString(R.string.imn_acorduri_indisponibile);}
            title_text.setText(getString(R.string.imn29_title));
        }
        if(imn_number==31-3) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn31);
            if (refren_stroke==1){
                imn=getString(R.string.imn31_stroke_1)+getString(R.string.imn31_refren)
                        +getString(R.string.imn31_stroke_2)+getString(R.string.imn31_refren)+getString(R.string.imn31_stroke_3)
                        +getString(R.string.imn31_refren);
                imn_acorduri=getString(R.string.imn31_acorduri_stroke_1)+getString(R.string.imn31_acorduri_refren)
                        +getString(R.string.imn31_acorduri_stroke_2)+getString(R.string.imn31_acorduri_refren)+getString(R.string.imn31_acorduri_stroke_3)
                        +getString(R.string.imn31_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn31_stroke_1)+getString(R.string.imn31_refren)
                        +getString(R.string.imn31_stroke_2)+getString(R.string.imn31_stroke_3);
                imn_acorduri=getString(R.string.imn31_acorduri_stroke_1)+getString(R.string.imn31_acorduri_refren)
                        +getString(R.string.imn31_acorduri_stroke_2)+getString(R.string.imn31_acorduri_stroke_3);}
            title_text.setText(getString(R.string.imn31_title));
        }
        if(imn_number==32-3) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn32);
            if (refren_stroke==1){
                imn=getString(R.string.imn32_stroke_1)+getString(R.string.imn32_refren)+getString(R.string.imn32_stroke_2)+getString(R.string.imn32_refren);
                imn_acorduri=getString(R.string.imn32_acorduri_stroke_1)+getString(R.string.imn32_acorduri_refren)+getString(R.string.imn32_acorduri_stroke_2)+getString(R.string.imn32_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn32_stroke_1)+getString(R.string.imn32_refren)+getString(R.string.imn32_stroke_2);
                imn_acorduri=getString(R.string.imn32_acorduri_stroke_1)+getString(R.string.imn32_acorduri_refren)+getString(R.string.imn32_acorduri_stroke_2);}
            title_text.setText(getString(R.string.imn32_title));
        }
        if(imn_number==33-3) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn33);
            if (refren_stroke==1){
                imn=getString(R.string.imn33_stroke_1)+getString(R.string.imn33_refren)+getString(R.string.imn33_stroke_2)+getString(R.string.imn33_refren);
                imn_acorduri=getString(R.string.imn33_acorduri_stroke_1)+getString(R.string.imn33_acorduri_refren)+getString(R.string.imn33_acorduri_stroke_2)+getString(R.string.imn33_acorduri_refren);}
            if (refren_stroke==0){
                imn=getString(R.string.imn33_stroke_1)+getString(R.string.imn33_refren)+getString(R.string.imn33_stroke_2);
                imn_acorduri=getString(R.string.imn33_acorduri_stroke_1)+getString(R.string.imn33_acorduri_refren)+getString(R.string.imn33_acorduri_stroke_2);}
            title_text.setText(getString(R.string.imn33_title));
        }
        if(imn_number==34-3) {
            o=0;
            c=1;
            mediaPlayer=MediaPlayer.create(this,R.raw.imn34);
            if (refren_stroke==1){
                imn=getString(R.string.imn34_stroke_1)+getString(R.string.imn34_refren_1)
                        +getString(R.string.imn34_stroke_2)+getString(R.string.imn34_refren_2)+getString(R.string.imn34_refren_1);
                imn_acorduri=getString(R.string.imn34_acorduri_stroke_1)+getString(R.string.imn34_acorduri_refren_1)
                        +getString(R.string.imn34_acorduri_stroke_2)+getString(R.string.imn34_acorduri_refren_2)+getString(R.string.imn34_acorduri_refren_1);}
            if (refren_stroke==0){
                imn=getString(R.string.imn34_stroke_1)+getString(R.string.imn34_refren_1)
                        +getString(R.string.imn34_stroke_2)+getString(R.string.imn34_refren_2);
                imn_acorduri=getString(R.string.imn34_acorduri_stroke_1)+getString(R.string.imn34_acorduri_refren_1)
                        +getString(R.string.imn34_acorduri_stroke_2)+getString(R.string.imn34_acorduri_refren_2);}
            title_text.setText(getString(R.string.imn34_title));
        }


        textView.setText(imn);
        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchCompat.isChecked()){
                    textView.setText(imn_acorduri);
                }
                else{
                    textView.setText(imn);
                }
            }
        });
        textView.setTextSize(seekValue);
        seekBar.setProgress(seekValue);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekValue=progress;
                textView.setTextSize(seekValue);
                if(seekValue<minsbprogress){seekValue=minsbprogress;}
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textView.setTextSize(seekValue);
                if(seekValue<minsbprogress){seekValue=minsbprogress;}
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView.setTextSize(seekValue);
                if(seekValue<minsbprogress){seekValue=minsbprogress;}
                PrefConfig.SaveSBprogress(getApplicationContext(),seekValue);
            }
        });


        if(o==0) {
            btPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    Handler handler2=new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if(i==1){
                                Toast.makeText(Imn.this, "Apăsați de două ori pentru a reda", Toast.LENGTH_SHORT).show();
                            }
                            else if (i==2){
                                btPlay.setVisibility(View.GONE);
                                btPause.setVisibility(View.VISIBLE);
                                mediaPlayer.start();
                                playerTrack.setMax(mediaPlayer.getDuration());
                                handler.postDelayed(runnable, 0);
                                }
                            i=0;  }
                    },400);
                }
            });
            btPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btPause.setVisibility(View.GONE);
                    btPlay.setVisibility(View.VISIBLE);
                    mediaPlayer.pause();
                    handler.removeCallbacks(runnable);
                }
            });
            runnable = new Runnable() {
                @Override
                public void run() {
                    playerTrack.setProgress(mediaPlayer.getCurrentPosition());
                    handler.postDelayed(this, 500);
                }
            };
            int duration = mediaPlayer.getDuration();
            String sDuration = convertFormat(duration);
            playerDuration.setText(sDuration);
            playerTrack.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer.seekTo(progress);
                    }
                    playerPosition.setText(convertFormat(mediaPlayer.getCurrentPosition()));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
            btFf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int curentPosition=mediaPlayer.getCurrentPosition();
                    int duration=mediaPlayer.getDuration();
                    if (curentPosition+5000<duration){
                        curentPosition=curentPosition+5000;
                        playerTrack.setProgress(curentPosition);
                        playerPosition.setText(convertFormat(curentPosition));
                        mediaPlayer.seekTo(curentPosition);
                    }
                    else{
                        curentPosition=duration;
                        playerTrack.setProgress(curentPosition);
                        playerPosition.setText(convertFormat(curentPosition));
                        mediaPlayer.seekTo(curentPosition);
                    }
                }
            });
            btRew.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int curentPosition=mediaPlayer.getCurrentPosition();
                    if (curentPosition>5000){
                        curentPosition=curentPosition-5000;
                        playerTrack.setProgress(curentPosition);
                        playerPosition.setText(convertFormat(curentPosition));
                        mediaPlayer.seekTo(curentPosition);
                    }
                    else{
                        curentPosition=0;
                        playerTrack.setProgress(curentPosition);
                        playerPosition.setText(convertFormat(curentPosition));
                        mediaPlayer.seekTo(curentPosition);
                    }
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    btPause.setVisibility(View.GONE);
                    btPlay.setVisibility(View.VISIBLE);
                    mediaPlayer.seekTo(0);
                }
            });
        }
        if(o==1) {
            if (d1==5){
                layout_o1.setBackgroundColor(background_for_audio_who_dont_exist);
                layout_o2.setBackgroundColor(background_for_audio_who_dont_exist);
            }
            else{
            layout_o1.setBackgroundColor(ContextCompat.getColor(this, color.deafult_background_for_audio_not_exist));
            layout_o2.setBackgroundColor(ContextCompat.getColor(this, color.deafult_background_for_audio_not_exist));}
            playerTrack.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if(fromUser==true){
                        playerTrack.setProgress(0);
                    }
                }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    playerTrack.setProgress(0);
                }
                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });
        }
        if(c==0) {
            btPlay1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    Handler handler3=new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if(i==1){
                                Toast.makeText(Imn.this, "Apăsați de două ori pentru a reda", Toast.LENGTH_SHORT).show();
                            }
                            else if (i==2){
                                btPlay1.setVisibility(View.GONE);
                                btPause1.setVisibility(View.VISIBLE);
                                mediaPlayer1.start();
                                playerTrack1.setMax(mediaPlayer1.getDuration());
                                handler1.postDelayed(runnable1, 0);
                            }
                            i=0;  }
                    },400);
                }
            });
            btPause1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btPause1.setVisibility(View.GONE);
                    btPlay1.setVisibility(View.VISIBLE);
                    mediaPlayer1.pause();
                    handler1.removeCallbacks(runnable1);
                }
            });
            runnable1 = new Runnable() {
                @Override
                public void run() {
                    playerTrack1.setProgress(mediaPlayer1.getCurrentPosition());
                    handler1.postDelayed(this, 500);
                }
            };
            btFf1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int curentPosition=mediaPlayer1.getCurrentPosition();
                    int duration=mediaPlayer1.getDuration();
                    if (curentPosition+5000<duration){
                        curentPosition=curentPosition+5000;
                        mediaPlayer1.seekTo(curentPosition);
                        playerTrack1.setProgress(curentPosition);
                        playerPosition1.setText(convertFormat(curentPosition));
                    }
                    else{
                        curentPosition=duration;
                        playerTrack1.setProgress(curentPosition);
                        playerPosition1.setText(convertFormat(curentPosition));
                        mediaPlayer1.seekTo(curentPosition);
                    }
                }
            });
            btRew1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int curentPosition=mediaPlayer1.getCurrentPosition();
                    if (curentPosition>5000){
                        curentPosition=curentPosition-5000;
                        playerPosition1.setText(convertFormat(curentPosition));
                        mediaPlayer1.seekTo(curentPosition);
                        playerTrack1.setProgress(curentPosition);
                    }
                    else {
                        curentPosition=0;
                        playerPosition1.setText(convertFormat(curentPosition));
                        mediaPlayer1.seekTo(curentPosition);
                        playerTrack1.setProgress(curentPosition);
                    }
                }
            });
            int duration = mediaPlayer1.getDuration();
            String sDuration = convertFormat(duration);
            playerDuration1.setText(sDuration);
            playerTrack1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if (fromUser) {
                        mediaPlayer1.seekTo(progress);
                    }
                    playerPosition1.setText(convertFormat(mediaPlayer1.getCurrentPosition()));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
            mediaPlayer1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    btPause1.setVisibility(View.GONE);
                    btPlay1.setVisibility(View.VISIBLE);
                    mediaPlayer1.seekTo(0);
                }
            });
        }
        if(c==1) {
            if (d1==5){
                layout_c1.setBackgroundColor(background_for_audio_who_dont_exist);
                layout_c2.setBackgroundColor(background_for_audio_who_dont_exist);
            }
            else{
            layout_c1.setBackgroundColor(ContextCompat.getColor(this, color.deafult_background_for_audio_not_exist));
            layout_c2.setBackgroundColor(ContextCompat.getColor(this, color.deafult_background_for_audio_not_exist));}
            playerTrack1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if(fromUser==true){
                        playerTrack1.setProgress(0);
                    }
                }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    playerTrack1.setProgress(0);
                }
                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });
        }


    }//protected void main


    @SuppressLint("DefaultLocale")
    private String convertFormat(int duration) {
        return String.format("%02d:%02d"
        , TimeUnit.MILLISECONDS.toMinutes(duration),
                TimeUnit.MILLISECONDS.toSeconds(duration)-
                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
    }


    public void ClickRight_options(View view){
        dialog.show();
    }

    public void ClickBack(View view){
        redirectActivity(this,MainActivity.class);
        if (o==0) {
        mediaPlayer.seekTo(0);
        mediaPlayer.stop();
        }
        if (c==0) {
            mediaPlayer1.seekTo(0);
            mediaPlayer1.stop();
        }
    }
    @Override
    public void onBackPressed(){
        redirectActivity(this,MainActivity.class);
        if (o==0) {
            mediaPlayer.seekTo(0);
            mediaPlayer.stop();
        }
        if (c==0) {
            mediaPlayer1.seekTo(0);
            mediaPlayer1.stop();
        }
    }
}
