package harish.hibare.listapplication;

import android.widget.ImageView;
import android.widget.TextView;

public class OneComponentBindingItem {
    int image_res;
    String textViewtitle,desc;

    public OneComponentBindingItem(String textViewtitle, String desc,int image_res) {
        this.image_res = image_res;
        this.textViewtitle = textViewtitle;
        this.desc = desc;
    }

    public int getImage_res() {
        return image_res;
    }

    public void setImage_res(int image_res) {
        this.image_res = image_res;
    }

    public String getTextViewtitle() {
        return textViewtitle;
    }

    public void setTextViewtitle(String textViewtitle) {
        this.textViewtitle = textViewtitle;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
