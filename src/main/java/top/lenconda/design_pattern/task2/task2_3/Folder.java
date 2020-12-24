package top.lenconda.design_pattern.task2.task2_3;

import java.util.ArrayList;

public class Folder extends AntiVirus {
    private final ArrayList<AntiVirus> list = new ArrayList<AntiVirus>();

    public void add(AntiVirus antiVirus) {
        list.add(antiVirus);
    }

    public void remove(AntiVirus antiVirus) {
        list.remove(antiVirus);
    }

    public void killVirus() {
        for (Object object:list) {
            ((AntiVirus) object).killVirus();
        }
    }
}
