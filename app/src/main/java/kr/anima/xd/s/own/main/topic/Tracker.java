package kr.anima.xd.s.own.main.topic;

import kr.anima.xd.s.own.R;

/**
 * Created by alfo6-10 on 8/25/2017.
 */

public class Tracker implements MyTopic {

    private String title;
    private int id;
    private long count;
    private int[] elements;

    public Tracker(String title, int[] elements) {
        this.title = title;
        this.elements=elements;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getIcon() {
        return R.drawable.ic_tracker;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public int[] getElements() {
        return elements;
    }

    @Override
    public void setElements(int[] elements) {
        this.elements = elements;
    }

    @Override
    public int getType() {
        return TYPE_TRACKER;
    }


}
