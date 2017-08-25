package kr.anima.xd.s.own.main.topic;


import kr.anima.xd.s.own.R;

/**
 * Created by alfo6-10 on 8/24/2017.
 */
// TODO :: object - > objective
public class Object implements MyTopic {

    private String title;
    private int id;
    private long count;
    private int color;
    private int[] elements;

    public Object(String title, int color, int[] elements) {
        this.title = title;
        this.color = color;
        this.elements = elements;
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
    public int[] getElements() {
        return elements;
    }

    @Override
    public void setElements(int[] elements) {
        this.elements=elements;
    }

    @Override
    public int getType() {
        return TYPE_OBJECTIVE;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getIcon() {
        return R.drawable.ic_object;
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
    public int getColor() {
        return color;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }


}
