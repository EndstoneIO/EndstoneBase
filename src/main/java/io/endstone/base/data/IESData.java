package io.endstone.base.data;

public interface IESData {
    enum dataType {
        STR, INT, FLT, BOL, OBJ, ARR
    }
    dataType type();
    Object val();
    void val(Object obj);
}
