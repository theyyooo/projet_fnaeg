package ModelTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.table.DefaultTableModel;

import DAO.Casier;

public class CasierModelTable extends DefaultTableModel {

		String[] names = {"Matricule", "CodeI", "NumAffaire"}; 
		List<Casier> casiers;

		public CasierModelTable(List<Casier> c){
			casiers = c;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			//return super.getColumnCount();
			return 5;
		}

		@Override
		public String getColumnName(int column) {
			// TODO Auto-generated method stub
			//return super.getColumnName(column);
			return names[column];
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			//return super.getRowCount();
			return 20;
		}

		@Override
		public Object getValueAt(int row, int column) {
			// TODO Auto-generated method stub
			//return super.getValueAt(row, column);
			Casier casier = casiers.get(row);
			Object val = null;
			switch (column) {
			case 0: 
				val = casier.getMatricule();
				break;
			
			case 1: 
				val = casier.getCodeI();
				break;
			
			case 2: 
				val = casier.getNumAffaire();
				break;

			
			default: 
				break;
			}
			return val;
			
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO Auto-generated method stub
			if (column != 0) {
				return super.isCellEditable(row, column);
			}
			return false;
		}


		@Override
		public Class<?> getColumnClass(int columnIndex) {
			switch (columnIndex) {
			case 0 :case 4: {
				return Integer.class;
			}
			case 1: case 2: case 3: {
				return String.class;
			}
			default: {
				return String.class;
			}
			}
			
		}

	}

	

