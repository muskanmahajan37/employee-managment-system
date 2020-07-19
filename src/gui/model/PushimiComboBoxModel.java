/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import DAL.Pushimi;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author rilin
 */
public class PushimiComboBoxModel extends AbstractListModel<Pushimi> implements ComboBoxModel<Pushimi>{
       private List<Pushimi> data;
    private Pushimi selectedItem;

    public PushimiComboBoxModel(List<Pushimi> data) {
        this.data = data;
    }

    public PushimiComboBoxModel() {
    }

    public void add(List<Pushimi> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Pushimi getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Pushimi)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
