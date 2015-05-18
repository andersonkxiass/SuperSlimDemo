package br.com.acs.superslimsample.model;

public class AdapterRowPicture extends AdapterBaseRow {

    public Picture getImage() {
        return image;
    }

    public void setImage(Picture image) {
        this.image = image;
    }

    Picture image;

    public int indexHeader;

    public AdapterRowPicture(Picture image, int sectionManager, int sectionFirstPosition, int id,  int indexHeader) {
        super(sectionManager, sectionFirstPosition, id);
        this.image = image;
        this.indexHeader = indexHeader;
    }

    public int getIndexHeader() {
        return indexHeader;
    }
}
