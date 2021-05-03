package project.materiale.imnuritineret;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    SearchView sv;
    ListView lv;
    ListViewAdapter adapter;
    String[] listImns;
    ArrayList<Model> arrayList=new ArrayList<Model>();
    LinearLayout nav_drawer;
    int background_of_rest_app,options_window,toolbar,txt_for_imn_list_and_rest_of_app,txt_items_from_options_window;
    int rest_of_buttons,icons_right_window_options,d1,first;
    RelativeLayout toolbar_main;
    TextView n1,n2,n3;
    ImageView icon1,ic1,ic2,ic3;
    int m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        first=PrefConfig.load_saved_first(this);
        if (first==1){
            m=1;
            int imn_background = getColor(R.color.deafult_background_main);
            background_of_rest_app=getColor(R.color.deafult_background_main);
            options_window=getColor(R.color.deafult_options_window);
            toolbar=getColor(R.color.deafult_toolbar);
            int imns_txt=getColor(R.color.deafult_txt);
            int titles=getColor(R.color.deafult_text_title_color);
            txt_for_imn_list_and_rest_of_app=getColor(R.color.deafult_txt);
            txt_items_from_options_window=getColor(R.color.deafult_txt);
           int  btns_for_audio=getColor(R.color.deafult_audio_buttons);
            rest_of_buttons=getColor(R.color.deafult_rest_buttons);
            icons_right_window_options=getColor(R.color.deafult_icons_right_window_options);
           int background_for_audio_who_dont_exist=getColor(R.color.deafult_background_for_audio_not_exist);
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
            first=0;
            PrefConfig.SaveFirst(getApplicationContext(),first);
        }


        background_of_rest_app=PrefConfig.load_saved_color2(this);
        options_window=PrefConfig.load_saved_color3(this);
        toolbar=PrefConfig.load_saved_color4(this);
        txt_for_imn_list_and_rest_of_app=PrefConfig.load_saved_color7(this);
        txt_items_from_options_window=PrefConfig.load_saved_color8(this);
        rest_of_buttons=PrefConfig.load_saved_color10(this);
        icons_right_window_options=PrefConfig.load_saved_color12(this);
        d1=PrefConfig.load_saved_d1(this);
        m=PrefConfig.load_saved_list_color(this);


        drawerLayout=findViewById(R.id.drawer_layout);
        sv = findViewById(R.id.search);
        lv = findViewById(R.id.list);
        listImns =getResources().getStringArray(R.array.imn_name);
        for (int i = 0; i < listImns.length; i++) {
            Model model = new Model(listImns[i]);
            arrayList.add(model);
        }

        adapter = new ListViewAdapter(this, arrayList);
        lv.setAdapter(adapter);

        nav_drawer=findViewById(R.id.nav_drawer);
        toolbar_main=findViewById(R.id.main_toolbar);
        icon1=findViewById(R.id.icon_menu);
        nav_drawer=findViewById(R.id.nav_drawer);
        ic1=findViewById(R.id.icon_home);
        ic2=findViewById(R.id.icon_update);
        ic3=findViewById(R.id.icon_settings);
        n1=findViewById(R.id.text_home);
        n2=findViewById(R.id.text_update);
        n3=findViewById(R.id.text_settings);


        drawerLayout.setBackgroundColor(background_of_rest_app);
        toolbar_main.setBackgroundColor(toolbar);
        icon1.setColorFilter(rest_of_buttons);
        nav_drawer.setBackgroundColor(options_window);
        ic1.setColorFilter(icons_right_window_options);
        ic2.setColorFilter(icons_right_window_options);
        ic3.setColorFilter(icons_right_window_options);
        n1.setTextColor(txt_items_from_options_window);
        n2.setTextColor(txt_items_from_options_window);
        n3.setTextColor(txt_items_from_options_window);


        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;}
            @Override
            public boolean onQueryTextChange(String s) {
                if(TextUtils.isEmpty(s)){
                    adapter.filter("");
                    lv.clearTextFilter();
                }
                else{
                    adapter.filter(s);
                }
                return true;
            }
        });
        lv.setOverScrollMode(View.OVER_SCROLL_NEVER);


    }//protected void main
    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }
    public static void openDrawer(DrawerLayout drawerLayout) {
 drawerLayout.openDrawer(GravityCompat.START);
    }
    public static void closeDrawer(DrawerLayout drawerLayout){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
public void ClickHome(View view){
        recreate();
}
    public void ClickUpdates(View view){
        redirectActivity(this,Updates.class);
    }
    public void ClickSettings(View view){
        redirectActivity(this,Settings.class);
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent= new Intent(activity,aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        }
    @Override
    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
}
