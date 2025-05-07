package org.YeYintZin;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TableCalc extends Table {
    private Table table;
    private String columnName;

    public TableCalc(List<String> header, Map<Double, List<Double>> datas, Table table, String columnName) {
        super(header, datas);
        this.table = table;
        this.columnName = columnName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TableCalc tableCalc = (TableCalc) o;
        return Objects.equals(table, tableCalc.table) && Objects.equals(columnName, tableCalc.columnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), table, columnName);
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
