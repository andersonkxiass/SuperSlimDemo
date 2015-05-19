package br.com.acs.superslimsample.model;

public class AdapterRowPicture extends AdapterBaseRow {

    Picture image;

    public AdapterRowPicture(Picture image, int sectionFirstPosition, int id) {
        super( sectionFirstPosition, id);
        this.image = image;
    }

    public Picture getImage() {
        return image;
    }

    public void setImage(Picture image) {
        this.image = image;
    }
}
