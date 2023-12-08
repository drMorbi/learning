package edu.javacours.studentorder.domain.register;

import java.util.ArrayList;
import java.util.List;

public class AnswerCityReg {

    private List<AnswerCityRegItem> items;

    public void addItems(AnswerCityRegItem item) {
        if (items == null) {
            items = new ArrayList<>(10);
        }items.add(item);
    }

    public List<AnswerCityRegItem> getItems() {
        return items;
    }
}
