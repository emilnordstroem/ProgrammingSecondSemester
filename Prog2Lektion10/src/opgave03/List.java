package opgave03;

public class List implements RecentlyUsedList {
    private int capacity = 10;
    private int size = 0;
    private String[] list = new String[capacity];

    public List() {}

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public String[] getList() {
        return list;
    }

    @Override
    public void add(String element) {
        boolean found = false;
        int foundAtIndex = 0;

        for(int index = 0; index < list.length; index++){
            if(list[index] == element){
                found = true;
                foundAtIndex = index;
                break;
            }
        }

        if(found){
            String temp = list[0];
            list[0] = list[foundAtIndex];
            list[foundAtIndex] = temp;
        } else {
            if(size < capacity) {
                for (int index = size; index > 0; index--) {
                    list[index] = list[index - 1];
                }
                list[0] = element;
                size++;
            } else {
                throw new IllegalStateException("Cannot add element because list is full");
            }
        }
    }

    @Override
    public String remove(int index) {
        try{
            String removedElement = list[index];
            String temp = list[size];
            list[index] = temp;
            size--;
            return removedElement;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Cannot access out of bound index");
        }
    }

    @Override
    public String[] getRecentlyUsed() {
        String[] recentlyUsed = new String[5];
        for(int index = 0; index < 5; index++){
            if(index < size){
                recentlyUsed[index] = list[index];
            } else {
                // if list is less than 5 elements, use null to represent empty elements
                recentlyUsed[index] = null;
            }
        }
        return recentlyUsed;
    }
}
