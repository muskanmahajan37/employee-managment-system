/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import DAL.Perdoruesi;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author MR-ROBOT
 */
public class PerdoruesiComboBoxModel extends AbstractListModel<Perdoruesi> implements ComboBoxModel<Perdoruesi> {
              private List<Perdoruesi> data;
    private Perdoruesi selectedItem;

    public PerdoruesiComboBoxModel(List<Perdoruesi> data) {
        this.data = data;
    }

    public PerdoruesiComboBoxModel() {
    }

    public void add(List<Perdoruesi> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Perdoruesi getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Perdoruesi)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
