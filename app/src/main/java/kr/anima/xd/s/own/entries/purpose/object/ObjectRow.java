package kr.anima.xd.s.own.entries.purpose.object;

import android.view.View;

/**
 * Created by alfo6-10 on 8/24/2017.
 */

public interface ObjectRow {

    int TYPE_SCHEDULE=0;
    int TYPE_TASK=1;
    int TYPE_TRACKER=3;

    int REPEAT_CUSTOM=0; // 지정 일수

    int REPEAT_DAILY=1; // 매일
    int REPEAT_WEEKLY=2; // 매주
    int REPEAT_MONTH=3;  // 매달
    int REPEAT_YEAR=4; // 매년

    int REPEAT_DAY_OF_WEEK=5; // 매주 같은 요일
    int REPEAT_DAY_OF_MONTH=6; // 달의 첫번째 요일
    int REPEAT_MONTH_OF_YEAR=7; // 지정 월

    int ALARM_OFF=0;
    int ALARM_ON=1;

    int ALARM_MIN=1;
    int ALARM_HALF_HOUR=2;
    int ALARM_HOUR=3;
    int ALARM_DAY=4;
    int ALARM_WEEK=5;



    void setTitle(String title);

    String getTitle();

    View getView();

    int getType();

    void setRepeat(int repeatType);

    int getRepeat();

    void setAlarm(int alarm);

    int getAlarm();

    void setEditMode(boolean isEditMode);

    void setPosition(int position);

    int getPosition();

}
