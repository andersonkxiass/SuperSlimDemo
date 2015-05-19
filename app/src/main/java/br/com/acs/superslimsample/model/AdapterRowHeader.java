package br.com.acs.superslimsample.model;


public class AdapterRowHeader extends AdapterBaseRow {

    private User user;

    public AdapterRowHeader(User user, int firstSectionPosition) {
        super(firstSectionPosition);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
