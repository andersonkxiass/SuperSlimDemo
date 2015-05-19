package br.com.acs.superslimsample.model;

public abstract class AdapterBaseRow {

    public int id;
    public int sectionFirstPosition;

    public AdapterBaseRow( int sectionFirstPosition, int id) {
        this.sectionFirstPosition = sectionFirstPosition;
        this.id = id;
    }

    public int getId() {
        return id;
    }
}