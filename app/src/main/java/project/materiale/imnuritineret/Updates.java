package project.materiale.imnuritineret;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static project.materiale.imnuritineret.MainActivity.closeDrawer;
import static project.materiale.imnuritineret.MainActivity.openDrawer;
import static project.materiale.imnuritineret.MainActivity.redirectActivity;

public class Updates extends AppCompatActivity {
    DrawerLayout drawerLayout;
    int background_of_rest_app,options_window,toolbar,titles,txt_for_imn_list_and_rest_of_app,txt_items_from_options_window;
    int rest_of_buttons,icons_right_window_options,d1;
    TextView txt,txt_title_updates,n1,n2,n3;
    LinearLayout toolbar1,nav_drawer;
    ImageView updates_icon,ic1,ic2,ic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updates);
        drawerLayout=findViewById(R.id.drawer_layout);
        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        txt=findViewById(R.id.text_updates);
        toolbar1=findViewById(R.id.toolbar_updates);
        txt_title_updates=findViewById(R.id.title_updates);
        updates_icon=findViewById(R.id.updatestes_icon);
        ic1=findViewById(R.id.icon_home);
        ic2=findViewById(R.id.icon_update);
        ic3=findViewById(R.id.icon_settings);
        n1=findViewById(R.id.text_home);
        n2=findViewById(R.id.text_update);
        n3=findViewById(R.id.text_settings);
        nav_drawer=findViewById(R.id.nav_drawer);


        background_of_rest_app=PrefConfig.load_saved_color2(this);
        options_window=PrefConfig.load_saved_color3(this);
        toolbar=PrefConfig.load_saved_color4(this);
        titles=PrefConfig.load_saved_color6(this);
        txt_for_imn_list_and_rest_of_app=PrefConfig.load_saved_color7(this);
        txt_items_from_options_window=PrefConfig.load_saved_color8(this);
        rest_of_buttons=PrefConfig.load_saved_color10(this);
        icons_right_window_options=PrefConfig.load_saved_color12(this);
        d1=PrefConfig.load_saved_d1(this);


            drawerLayout.setBackgroundColor(background_of_rest_app);
            txt.setTextColor(txt_for_imn_list_and_rest_of_app);
            toolbar1.setBackgroundColor(toolbar);
            txt_title_updates.setTextColor(titles);
            updates_icon.setColorFilter(rest_of_buttons);
            nav_drawer.setBackgroundColor(options_window);
            ic1.setColorFilter(icons_right_window_options);
            ic2.setColorFilter(icons_right_window_options);
            ic3.setColorFilter(icons_right_window_options);
            n1.setTextColor(txt_items_from_options_window);
            n2.setTextColor(txt_items_from_options_window);
            n3.setTextColor(txt_items_from_options_window);
    }
    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }
    public void ClickHome(View view){
        redirectActivity(this,MainActivity.class);
    }
    public void ClickUpdates(View view){
        recreate();
    }
    public void ClickSettings(View view){
        redirectActivity(this,Settings.class);
    }
    @Override
    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
}
