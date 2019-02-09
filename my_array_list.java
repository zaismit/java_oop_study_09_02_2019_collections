/**
 * Created by ZAISMIT - EVYNET
 **/
public class my_array_list extends facade_file {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String s) {
        array[size] = s;
        size = size + 1;
        if (size == array.length) {
            String[] new_array = new String[array.length * 2];
            for (int i = 0; i < array.length; i = i + 1) {
                new_array[i] = array[i];
            }
            array = new_array;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i = i + 1) {
                array[i] = array[i + 1];
            }
            size = size - 1;
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i = i + 1) {
            if (s.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "element not found";
        }
    }
}
