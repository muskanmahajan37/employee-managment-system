/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import DAL.TitulliPunetorit;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author MR-ROBOT
 */
public class TitulliComboBoxModel extends AbstractListModel<TitulliPunetorit> implements ComboBoxModel<TitulliPunetorit>{
        private List<TitulliPunetorit> data;
    private TitulliPunetorit selectedItem;

    public TitulliComboBoxModel(List<TitulliPunetorit> data) {
        this.data = data;
    }

    public TitulliComboBoxModel() {
    }

    public void add(List<TitulliPunetorit> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public TitulliPunetorit getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(TitulliPunetorit)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
