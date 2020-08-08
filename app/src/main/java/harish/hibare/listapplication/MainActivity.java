package harish.hibare.listapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    public static String string_titel_selected;
    String[] items_list = {
            "Learn Android From Scratch",
            "Build very nice Web Apps",
            "Learn Android From Scratch",
            "Build Very Nice Web Apps",
            "Start New Job Path as a Web Hacker",
            "Build Very Nice Personality and Learn More",
            "Build Very Nice ios Apps",
            "Design Very Nice Web Apps",
            "Design Android Apps in photocopy",
            "use the most poplar App Development Framework to build you apps",
            "How to market your website in the Internet",
            "Download any types of video's with one click",
            "How to write very clear code for android"
    };

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_views);
        listView.setBackground(getDrawable(android.R.drawable.alert_light_frame));
        ArrayList<OneComponentBindingItem> items = new ArrayList<>();
        items.add(new OneComponentBindingItem("Android Development", "Learn Android From Scratch", R.drawable.child3));
        items.add(new OneComponentBindingItem("Web Development", "Build very nice Web Apps", R.drawable.englisone));
        items.add(new OneComponentBindingItem("Android Development", "Learn Android From Scrath", R.drawable.img4));
        items.add(new OneComponentBindingItem("Web Development", "Build Very Nice Web Apps", R.drawable.img3));
        items.add(new OneComponentBindingItem("Web Hacking", "Start New Job Path as a Web Hacker", R.drawable.englishtwo));
        items.add(new OneComponentBindingItem("Human Development", "Build Very Nice Personality and Learn More ", R.drawable.englisone));
        items.add(new OneComponentBindingItem("ios Development", "Build Very Nice ios Apps", R.drawable.img2));
        items.add(new OneComponentBindingItem("Web Design", "Design Very Nice Web Apps", R.drawable.englisone));
        items.add(new OneComponentBindingItem("Android App Design", "Design Android Apps in photoshop", R.drawable.englisone));
        items.add(new OneComponentBindingItem("Andriod Fraemwork", "use the most puoplar App Development Fraemwork to build you apps", R.drawable.englisone));
        items.add(new OneComponentBindingItem("Web Markting", "How to markte youe website in the Internet", R.drawable.englisone));
        items.add(new OneComponentBindingItem("Videos Download", "Download any tyes of viedos with one click", R.drawable.englisone));
        items.add(new OneComponentBindingItem("Learn to Code", "How to write very clear code for android", R.drawable.englisone));

        final CustomAdapter customAdapter = new CustomAdapter(this,items);

        listView.setAdapter(customAdapter);
        listView.setDivider(null);
        listView.setDividerHeight(20);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final Dialog dialog = new Dialog(MainActivity.this);
                //dialog.setTitle("My Custom Dialog");
                dialog.setContentView(R.layout.custom_alert);
                Button button_done=dialog.findViewById(R.id.hide_btn);
                TextView textView=dialog.findViewById(R.id.alert_text_view);
                textView.setText(string_titel_selected);
                button_done.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });


    }
}