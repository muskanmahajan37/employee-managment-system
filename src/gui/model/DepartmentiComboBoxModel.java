/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import DAL.Departmenti;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author MR-ROBOT
 */
public class DepartmentiComboBoxModel  extends AbstractListModel<Departmenti> implements ComboBoxModel<Departmenti>{
       private List<Departmenti> data;
    private Departmenti selectedItem;

    public DepartmentiComboBoxModel(List<Departmenti> data) {
        this.data = data;
    }

    public DepartmentiComboBoxModel() {
    }

    public void add(List<Departmenti> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Departmenti getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Departmenti)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
