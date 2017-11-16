package Logica;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Entidades.ConsultaGenerica;

public class GestorUtilidades {
	public static void llenarTabla(JTable tabla, ArrayList<Object> list) throws Exception{
        try{
            DefaultTableModel tableModel = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                 }
             };
            if(list.get(0).getClass() == ConsultaGenerica.class){
                ArrayList<ConsultaGenerica> ls = (ArrayList<ConsultaGenerica>)(Object)list;
                tabla.setModel(tableModel);
                if(ls.size() > 0){
                    for(String campo: ls.get(0).getParametros()){
                        tableModel.addColumn(campo);
                    }
                    for(ConsultaGenerica t: ls){
                        Vector<String> rowData = new Vector<String>();
                        for(int i=0; i< tableModel.getColumnCount(); i++){
                            rowData.add(t.getValor(tableModel.getColumnName(i)));
                        }
                        tableModel.addRow(rowData);
                    }
                }
            }
            else{
                Class cl = list.get(0).getClass();
                tabla.setModel(tableModel);
                if(list.size() > 0){
                    for(Field campo: cl.getDeclaredFields()){
                        tableModel.addColumn(campo.getName());
                    }
                    for(int i=0; i<list.size(); i++){
                        Vector<Object> rowData = new Vector<Object>();
                        for(int j=0; j< tableModel.getColumnCount(); j++){
                            rowData.add((cl.getDeclaredFields()[j]).get(list.get(i)));
                        }
                        tableModel.addRow(rowData);
                    }
                }
            }
        }
        catch(Exception ex){
            throw ex;
        }
	}
}
