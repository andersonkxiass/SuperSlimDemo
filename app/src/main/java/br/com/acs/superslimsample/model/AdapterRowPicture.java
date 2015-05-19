package br.com.acs.superslimsample.model;

public class AdapterRowPicture extends AdapterBaseRow {

    Picture image;

    public AdapterRowPicture(Picture image, int firstSectionPosition) {
        super(firstSectionPosition);
        this.image = image;
    }

    public Picture getImage() {
        return image;
    }

    public void setImage(Picture image) {
        this.image = image;
    }
}
