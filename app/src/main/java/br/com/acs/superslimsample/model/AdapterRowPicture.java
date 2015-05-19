package br.com.acs.superslimsample.model;

public class AdapterRowPicture extends AdapterBaseRow {

    Picture image;

    public int indexHeader;

    public AdapterRowPicture(Picture image, int sectionFirstPosition, int id,  int indexHeader) {
        super( sectionFirstPosition, id);
        this.image = image;
        this.indexHeader = indexHeader;
    }

    public int getIndexHeader() {
        return indexHeader;
    }

    public Picture getImage() {
        return image;
    }

    public void setImage(Picture image) {
        this.image = image;
    }
}
