package kr.anima.xd.s.own.entries.purpose.object;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;

import kr.anima.xd.s.own.R;
import kr.anima.xd.s.own.shared.ScreenHelper;

/**
 * Created by alfo6-10 on 8/24/2017.
 */

public class TaskItem implements ObjectRow {

    private EditText etTask;
    private int position;

    public TaskItem(Context context){
        createEditText(context);
        setEditMode(true);
    }

    private void createEditText(Context context){
        etTask=new EditText(context);
        etTask.setTextColor(context.getResources().getColor(R.color.myColorGreyText, null));
        etTask.setBackgroundColor(Color.TRANSPARENT);
        etTask.setGravity(Gravity.TOP|Gravity.LEFT);
        int padding= ScreenHelper.dpToPixel(context.getResources(), 4);
        etTask.setPadding(padding, padding, padding, padding); //4dp

    }

    public void insertText(String text){
        etTask.getText().insert(etTask.getText().length(), text);
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void setTitle(String title) {
        // TODO :: ??
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public View getView() {
        return etTask;
    }

    @Override
    public int getType() {
        return TYPE_TASK;
    }

    @Override
    public void setEditMode(boolean isEditMode) {
        if (isEditMode) {
            etTask.setFocusable(true);
            etTask.setFocusableInTouchMode(true);
            etTask.setClickable(true);
            etTask.setEnabled(true);
        } else {
            etTask.setFocusable(false);
            etTask.setFocusableInTouchMode(false);
            etTask.setClickable(false);
            etTask.setEnabled(false);
        }
    }

    @Override
    public void setPosition(int position) {
        this.position=position;
    }

}
