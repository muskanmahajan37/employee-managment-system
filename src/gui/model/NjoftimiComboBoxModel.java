/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import DAL.NjoftimiLloji;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author MR-ROBOT
 */
public class NjoftimiComboBoxModel extends AbstractListModel<NjoftimiLloji> implements ComboBoxModel<NjoftimiLloji>{
    private List<NjoftimiLloji> data;
    private NjoftimiLloji selectedItem;

    public NjoftimiComboBoxModel(List<NjoftimiLloji> data) {
        this.data = data;
    }

    public NjoftimiComboBoxModel() {
    }

    public void add(List<NjoftimiLloji> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public NjoftimiLloji getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(NjoftimiLloji)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
