/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import DAL.Punetori;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author MR-ROBOT
 */
public class PunetorComboBoxModel extends AbstractListModel<Punetori> implements ComboBoxModel<Punetori> {
          private List<Punetori> data;
    private Punetori selectedItem;

    public PunetorComboBoxModel(List<Punetori> data) {
        this.data = data;
    }

    public PunetorComboBoxModel() {
    }

    public void add(List<Punetori> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Punetori getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Punetori)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
