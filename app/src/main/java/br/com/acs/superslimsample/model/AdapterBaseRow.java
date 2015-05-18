package br.com.acs.superslimsample.model;

public class AdapterBaseRow {

    public int id;
    public int sectionFirstPosition;
    public int sectionManager;

    public AdapterBaseRow(int sectionManager, int sectionFirstPosition, int id) {
        this.sectionManager = sectionManager;
        this.sectionFirstPosition = sectionFirstPosition;
        this.id = id;
    }

    public int getId() {
        return id;
    }
}