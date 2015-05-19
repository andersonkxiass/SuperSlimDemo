package br.com.acs.superslimsample.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.acs.superslimsample.R;
import br.com.acs.superslimsample.model.AdapterBaseRow;
import br.com.acs.superslimsample.model.AdapterRowHeader;
import br.com.acs.superslimsample.model.AdapterRowPicture;
import br.com.acs.superslimsample.model.Picture;
import br.com.acs.superslimsample.model.User;

public class Data {

    public  List<AdapterBaseRow> getData(){

        int firstSectionPosition = 0; //Header index

        List<AdapterBaseRow> adapterBaseRows = new ArrayList<>();

        //Header
        adapterBaseRows.add(new AdapterRowHeader(new User("Google I/O 2013"), firstSectionPosition));

        //items
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picturea_1), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_4), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_5), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_2), firstSectionPosition));

        firstSectionPosition = 6; //Header index

        //Header
        adapterBaseRows.add(new AdapterRowHeader(new User("Google I/O 2014"), firstSectionPosition));

        //items
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_5), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_4), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_2), firstSectionPosition));

        firstSectionPosition = 12; //Header index

        //Header
        adapterBaseRows.add(new AdapterRowHeader(new User("Google I/O 2015"), firstSectionPosition));

        //items
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_5), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_4), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), firstSectionPosition));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_2), firstSectionPosition));

        return adapterBaseRows;
    }
}