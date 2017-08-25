package kr.anima.xd.s.own.entries.purpose.item;

import android.view.View;


/**
 * Created by alfo6-10 on 8/24/2017.
 */

public interface PurposeRow {



//    void setObject(Object object);
//
//    Object getObject();

    // Task ? Object Title?
    void setContent(String content);

    String getContent();

    View getView();

    int getType();

    void setEditMode(boolean isEditMode);

    void setPosition(int position);

    int getPosition();




}
